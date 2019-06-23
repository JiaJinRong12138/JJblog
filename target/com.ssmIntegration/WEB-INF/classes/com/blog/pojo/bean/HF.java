package com.blog.pojo.bean;

/**
 * @ClassName HF
 * @Author 秃头的JJ
 * Date 2019/6/22 0022 23:11
 * Version 1.0
 */
public class HF {

    private Integer id;
    private String text;
    private Integer userid;
    private Integer toblogid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getToblogid() {
        return toblogid;
    }

    public void setToblogid(Integer toblogid) {
        this.toblogid = toblogid;
    }

    @Override
    public String toString() {
        return "HF{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", userid=" + userid +
                ", toblogid=" + toblogid +
                '}';
    }
}
