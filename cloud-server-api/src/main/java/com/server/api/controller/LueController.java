package com.server.api.controller;


import com.server.api.util.requestpython.AnimImpl;
import com.server.api.util.requestpython.ManhuaImpl;
import com.server.api.util.requestpython.MovieImpl;
import com.server.api.util.requestpython.NovelImpl;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;
@RestController
public class LueController {
    private Process process;
    private NovelImpl novelImpl1=new NovelImpl(40001,1);
    private NovelImpl novelImpl2=new NovelImpl(40001,2);
    private NovelImpl novelImpl3=new NovelImpl(40001,3);
    private AnimImpl animImpl1=new AnimImpl(40001,1);
    private AnimImpl animImpl2=new AnimImpl(40001,2);
    private AnimImpl animImpl3=new AnimImpl(40001,3);
    private ManhuaImpl manhua1=new ManhuaImpl(40001,1);
    private ManhuaImpl manhua2=new ManhuaImpl(40001,2);
    private ManhuaImpl manhua3=new ManhuaImpl(40001,3);
    private MovieImpl movie1 = new MovieImpl(40001,1);
    private MovieImpl movie2 = new MovieImpl(40001,2);
    private MovieImpl movie3 = new MovieImpl(40001,3);

    @ApiOperation(value = "小说查询入口1")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "xsname",value = "查询小说名",required = false,dataType = "String"),
            @ApiImplicitParam(name = "xsmore",value = "详细信息",required = false,dataType = "String"),
            @ApiImplicitParam(name = "xsdetail",value = "链接列表",required = false,dataType = "String"),
            @ApiImplicitParam(name = "xscontent",value = "小说内容",required = false,dataType = "String"),
            @ApiImplicitParam(name = "xsrecom",value = "热门推荐",required = false,dataType = "String"),
            @ApiImplicitParam(name = "xshot",value = "推荐好看的小说",required = false,dataType = "String"),
            @ApiImplicitParam(name = "xsreaderrecom",value = "人气最高的小说",required = false,dataType = "String"),
            @ApiImplicitParam(name = "mostpopularnovel",value = "书友推荐",required = false,dataType = "String"),

    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "ok",response = NovelImpl.class),
    }
    )
    @GetMapping(value = "/novel1")
    public String novel1(String xsname, String xsmore, String xsdetail, String xscontent, String xsrecom, String xshot, String xsreaderrecom,String mostpopularnovel) {
        if (xsname != null) return novelImpl1.getbooklist(xsname);
        if (xsmore != null) return novelImpl1.getbookmorelist(xsmore);
        if (xsdetail != null) return novelImpl1.getbookdetail(xsdetail);
        if (xscontent != null) return novelImpl1.getbookcontent(xscontent);
        if (xsrecom != null) return novelImpl1.poprecommendation(xsrecom);
        if (xshot != null) return novelImpl1.recommendgoodnovels(xshot);
        if(xsreaderrecom!=null) return novelImpl1.bookfriendrecommed(xsreaderrecom);
        if(mostpopularnovel!=null) return novelImpl1.mostpopularnovel(mostpopularnovel);
        return "null";
    }

    @ApiOperation(value = "小说分类查询入口1")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type",value = "type:1 玄幻 type:2 武侠 type:3 都市 type:4 历史 type:5 网游 type:6 科幻 type:7 灵异 type:8 其他 ",required = false,dataType = "String"),
            @ApiImplicitParam(name = "page",value = "页数",required = false,dataType = "String")
    })
    @GetMapping(value = "/novel1/assort")
    public String nover1_assort(String type, String page){
        if (type==null||page==null){return "参数不能为空";}
        else {return novelImpl1.getsort("list/"+type+"_"+page+".html");}
    }
    @ResponseBody
    @ApiOperation(value = "漫画分类查询入口1")
    @GetMapping(value = "/manhua1/assort")
    public String manhua1_assort(String type, String page){
        if (type==null||page==null){return "参数不能为空";}
        else {return manhua1.getManhuasortlinklist(type+page+".html");}
    }

    @ApiOperation(value = "漫画分类查询入口2")
    @GetMapping(value = "/manhua2/assort")
    public String manhua2_assort(String type, String page){
        if (type==null||page==null){return "参数不能为空";}
        else {return manhua2.getManhuasortlinklist(type+page+".html");}
    }

    @ApiOperation(value = "小说查询入口2")
    @GetMapping(value = "/novel2")
    public String novel2(String xsname, String xsmore, String xsdetail, String xscontent) {
        if (xsname != null) {
            return novelImpl2.getbooklist(xsname);
        }
        if (xsmore != null) {
            return novelImpl2.getbookmorelist(xsmore);
        }
        if (xsdetail != null) {
            return novelImpl2.getbookdetail(xsdetail);
        }
        if (xscontent != null) {
            return novelImpl2.getbookcontent(xscontent);
        }
        return "null";
    }

    @ApiOperation(value = "小说查询入口3")
    @GetMapping(value = "/novel3")
    public String novel3(String xsname, String xsmore, String xsdetail, String xscontent) {
        if (xsname != null) {
            return novelImpl3.getbooklist(xsname);
        }
        if (xsmore != null) {
            return novelImpl3.getbookmorelist(xsmore);
        }
        if (xsdetail != null) {
            return novelImpl3.getbookdetail(xsdetail);
        }
        if (xscontent != null) {
            return novelImpl3.getbookcontent(xscontent);
        }
        return "null";
    }

    @ApiOperation(value = "动漫查询入口1")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "amname",value = "查询动漫名",required = false,dataType = "String"),
            @ApiImplicitParam(name = "amdetail",value = "详细信息",required = false,dataType = "String"),
            @ApiImplicitParam(name = "amcontent",value = "播放资源",required = false,dataType = "String"),
    })
    @GetMapping(value = "/anim1")
    public String anim1(String amname,String amdetail,String amcontent) {
        if (amname != null) {
            return animImpl1.getanimlist(amname);
        }
        if (amdetail != null) {
            return animImpl1.getanimdetail(amdetail);
        }
        if (amcontent != null) {
            return animImpl1.getanimcontentlist(amcontent);
        }
        return "null";
    }

    @ApiOperation(value = "动漫查询入口2")
    @GetMapping(value = "/anim2")
    public String anim2(String amname,String amdetail,String amcontent) {
        if (amname != null) {
            return animImpl2.getanimlist(amname);
        }
        if (amdetail != null) {
            return animImpl2.getanimdetail(amdetail);
        }
        if (amcontent != null) {
            return animImpl2.getanimcontentlist(amcontent);
        }
        return "null";
    }

    @ApiOperation(value = "动漫查询入口3")
    @GetMapping(value = "/anim3")
    public String anim3(String amname,String amdetail,String amcontent) {
        if (amname != null) {
            return animImpl3.getanimlist(amname);
        }
        if (amdetail != null) {
            return animImpl1.getanimdetail(amdetail);
        }
        if (amcontent != null) {
            return animImpl3.getanimcontentlist(amcontent);
        }
        return "null";
    }

    @ApiOperation(value = "漫画查询入口1")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mhname",value = "查询漫画名",required = false,dataType = "String"),
            @ApiImplicitParam(name = "mhdetail",value = "详细信息",required = false,dataType = "String"),
            @ApiImplicitParam(name = "mhcontent",value = "图片资源",required = false,dataType = "String"),

    })
    @GetMapping(value = "/manhua1")
    public String manhua1(String mhname,String mhdetail ,String mhcontent) {
        if (mhname != null) {
            return manhua1.getManhualist(mhname);
        }
        if (mhdetail != null) {
            return manhua1.getManhualinklist(mhdetail);
        }
        if (mhcontent != null) {
            return manhua1.getManhuacontlinklist(mhcontent);
        }
        return "null";
    }

    @ApiOperation(value = "漫画查询入口2")
    @GetMapping(value = "/manhua2")
    public String manhua2(String mhname,String mhdetail ,String mhcontent) {
        if (mhname != null) {
            return manhua2.getManhualist(mhname);
        }
        if (mhdetail != null) {
            return manhua2.getManhualinklist(mhdetail);
        }
        if (mhcontent != null) {
            return manhua2.getManhuacontlinklist(mhcontent);
        }
        return "null";
    }

    @ApiOperation(value = "漫画查询入口3")
    @GetMapping(value = "/manhua3")
    public String manhua3(String mhname,String mhdetail ,String mhcontent) {
        if (mhname != null) {
            return manhua3.getManhualist(mhname);
        }
        if (mhdetail != null) {
            return manhua3.getManhualinklist(mhdetail);
        }
        if (mhcontent != null) {
            return manhua3.getManhuacontlinklist(mhcontent);
        }
        return "null";
    }

    @ApiOperation(value = "电影查询入口1")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "mvname",value = "电影搜索",required = false,dataType = "String"),
        @ApiImplicitParam(name = "mvdetail",value = "详细信息",required = false,dataType = "String"),
        @ApiImplicitParam(name = "mvcontent",value = "电影资源",required = false,dataType = "String"),
    })
    @GetMapping(value = "/movie1")
    public String movie1(String mvname,String mvdetail,String mvcontent) {
        if (mvname != null) {
            return movie1.getMovielist(mvname);
        }
        if (mvdetail != null) {
            return movie1.getMovieDetaillist(mvdetail);
        }
        if (mvcontent != null) {
            return movie1.getMoviecontlinklist(mvcontent);
        }
        return "null";
    }

    @ApiOperation(value = "电影查询入口2")
    @GetMapping(value = "/movie2")
    public String movie2(String mvname,String mvdetail,String mvcontent) {
        if (mvname != null) {
            return movie2.getMovielist(mvname);
        }
        if (mvdetail != null) {
            return movie2.getMovieDetaillist(mvdetail);
        }
        if (mvcontent != null) {
            return movie2.getMoviecontlinklist(mvcontent);
        }
        return "null";
    }

    @ApiOperation(value = "电影查询入口3")
    @GetMapping(value = "/movie3")
    public String movie3(String mvname,String mvdetail,String mvcontent) {
        if (mvname != null) {
            return movie3.getMovielist(mvname);
        }
        if (mvdetail != null) {
            return movie3.getMovieDetaillist(mvdetail);
        }
        if (mvcontent != null) {
            return movie3.getMoviecontlinklist(mvcontent);
        }
        return "null";
    }
}
