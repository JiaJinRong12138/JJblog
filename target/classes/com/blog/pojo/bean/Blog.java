package com.blog.pojo.bean;

/**
 * @ClassName Blog
 * @Author 秃头的JJ
 * Date 2019/6/21 0021 23:31
 * Version 1.0
 */
public class Blog {

    private Integer id;
    private String title;
    private String text;
    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", userid=" + userid +
                '}';
    }
}
