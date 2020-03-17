package com.server.api.controller;


import com.server.api.bean.*;
import com.server.api.util.requestpython.NovelImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api(description = "小说API接口")
@RestController
public class LueController {
    private NovelImpl novelImpl1=new NovelImpl(40001,1);
    final String DES_SORT="请求参数 -- 类型\n" +
            "yanqing -- 言情女生\n" +
            "xuanhuan -- 玄幻奇幻\n" +
            "dushi -- 都市青春\n" +
            "wuxia -- 武侠仙侠\n" +
            "danmei -- 唯美纯爱\n" +
            "kehuan -- 科幻灵异\n" +
            "lightnovel -- 轻小说\n" +
            "lishi -- 历史军事";
    final String DES_RANK1="返回值索引 -- 类型\n" +
            "1 -- 言情女生\n" +
            "2 -- 玄幻奇幻\n" +
            "3 -- 都市青春\n" +
            "4 -- 武侠仙侠\n" +
            "5 -- 唯美纯爱\n" +
            "6 -- 科幻灵异\n" +
            "7 -- 轻小说\n" +
            "8 -- 历史军事";
    final String DES_RANK2="返回值索引 -- 类型\n" +
            "1 -- 点击排行榜\n" +
            "2 -- 推荐排行榜\n" +
            "3 --收藏排行榜\n";
    @ApiImplicitParam(name = "xsname", value = "小说名",required = true)
    @ApiOperation(value="搜索小说入口1", notes="无", produces="application/json")
    @RequestMapping(value = "e1searchbook",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public BookSearchRes Entrance1searchbook(@RequestParam(value = "xsname",required = true) String xsname){
        return novelImpl1.searchbook(xsname);
    }
    @ApiImplicitParam(name = "xsdetail", value = "e1searchbook的返回值url作为参数",required = true)
    @ApiOperation(value ="获取小说详细信息入口1",notes = "无", produces="application/json")
    @RequestMapping(value = "e1bookdetail",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public BookDetailRes Entrance1bookdetail(@RequestParam(value = "xsdetail",required = true) String xsdetail){
        return novelImpl1.bookdetail(xsdetail);
    }
    @ApiImplicitParam(name = "xscontent", value = "e1bookdetail的返回值url作为参数",required = true)
    @ApiOperation(value ="获取小说内容入口1",notes = "无", produces="application/json")
    @RequestMapping(value = "e1bookcontent",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public BookContentRes Entrance1bookcontent(@RequestParam(value = "xscontent",required = true) String xscontent){
        return novelImpl1.bookcontent(xscontent);
    }
    @ApiImplicitParams({
            @ApiImplicitParam(name = "xsfenlei", value = "类型",required = true),
            @ApiImplicitParam(name = "page", value = "请求页数",required = true)
    })
    @ApiOperation(value ="获取小说分类入口1",notes = DES_SORT, produces="application/json")
    @RequestMapping(value = "e1booksort",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public BookSortRes Entrance1booksort(@RequestParam(value = "xsfenlei",required = true) String xsfenlei, @RequestParam(value = "page",required = true) String page){
        return novelImpl1.booksort("/"+xsfenlei+"/"+page+"/");
    }
    @ApiOperation(value ="获取小说排行榜1入口1",notes = DES_RANK1, produces="application/json")
    @RequestMapping(value = "e1bookrank1",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Bookrank1Res Entrance1bookrank1(){
        return novelImpl1.book_rank("null");
    }
    @ApiOperation(value ="获取小说排行榜2入口1",notes = DES_RANK2, produces="application/json")
    @RequestMapping(value = "e1bookrank2",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public Bookrank2Res Entrance1bookrank2(){
        return novelImpl1.book_rank2("null");
    }




}
