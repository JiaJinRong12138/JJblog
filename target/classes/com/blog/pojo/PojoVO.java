package com.blog.pojo;

import com.blog.pojo.bean.Blog;
import com.blog.pojo.bean.HF;
import com.blog.pojo.bean.User;

/**
 * @ClassName PojoVO
 * @Author 秃头的JJ
 * Date 2019/6/21 0021 23:30
 * Version 1.0
 */
public class PojoVO {

    private Blog blog;
    private User user;
    private HF hf;

    public PojoVO(Blog blog) {
        this.blog = blog;
    }

    public PojoVO(User user) {
        this.user = user;
    }

    public PojoVO(HF hf) {
        this.hf = hf;
    }

    public PojoVO(Blog blog, User user, HF hf) {
        this.blog = blog;
        this.user = user;
        this.hf = hf;
    }

    public PojoVO() {
    }

    public HF getHf() {
        return hf;
    }

    public void setHf(HF hf) {
        this.hf = hf;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
