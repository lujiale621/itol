package com.server.api.util.requestpython;

import com.alibaba.fastjson.JSON;
import com.server.api.bean.*;

public class NovelImpl implements Novelinterface {
    int PORT=40001;
    int NovelinterfaceNumber=0;
    public String task(String msg,String task){
        String commend=task+"@"+msg+"!"+NovelinterfaceNumber;
        String s = Templer.sendcomment(commend,getport());
        return s;
    }
    public NovelImpl(int PORT, int novelinterfaceNumber) {
        this.PORT = PORT;
        NovelinterfaceNumber = novelinterfaceNumber;
    }
    @Override
    public int getport() {
        return PORT;
    }
    @Override
    public void setport(int port) {
        this.PORT=port;
    }

    @Override
    public BookSearchRes searchbook(String msg) {

        BookSearchRes t = JSON.parseObject(task(msg,NovelSearchBookTask), BookSearchRes.class);
        return t;
    }

    @Override
    public BookDetailRes bookdetail(String msg) {
        BookDetailRes t = JSON.parseObject(task(msg,NovelSearchBookDetailTask), BookDetailRes.class);
        return t;
    }

    @Override
    public BookContentRes bookcontent(String msg) {
        BookContentRes t = JSON.parseObject(task(msg, NovelSearchBookContentTask), BookContentRes.class);
        return t;
    }

    @Override
    public BookSortRes booksort(String msg) {
        BookSortRes bookSortRes=JSON.parseObject(task(msg,NovelSearchBookSort), BookSortRes.class);
        return bookSortRes;
    }

    @Override
    public Bookrank1Res book_rank(String msg) {
        Bookrank1Res t = JSON.parseObject(task(msg,NovelSearchBookRank1),Bookrank1Res.class);
        return t;
    }

    @Override
    public Bookrank2Res book_rank2(String msg) {
        Bookrank2Res t = JSON.parseObject(task(msg,NovelSearchBookRank2),Bookrank2Res.class);
        return t;
    }
}
