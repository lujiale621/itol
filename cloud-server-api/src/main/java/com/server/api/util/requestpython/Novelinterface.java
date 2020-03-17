package com.server.api.util.requestpython;

import com.server.api.bean.*;

public interface Novelinterface {
    String  NovelSearchBookTask = "NovelSearchBookTask";
    String   NovelSearchBookDetailTask = "NovelSearchBookDetailTask";
    String   NovelSearchBookContentTask = "NovelSearchBookContentTask";
    String  NovelSearchBookSort = "NovelSearchBookSort";
    String  NovelSearchBookRank1 = "NovelSearchBookRank1";
    String  NovelSearchBookRank2 = "NovelSearchBookRank2";
    public abstract int getport();
    public abstract void setport(int port);
    abstract BookSearchRes searchbook(String msg);
    abstract BookDetailRes bookdetail(String msg);
    abstract BookContentRes bookcontent(String msg);
    abstract BookSortRes booksort(String msg);
    abstract Bookrank1Res book_rank(String msg);
    abstract Bookrank2Res book_rank2(String msg);
}
