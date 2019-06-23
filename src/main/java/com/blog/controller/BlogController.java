package com.blog.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.blog.pojo.PojoVO;
import com.blog.pojo.bean.Blog;
import com.blog.pojo.bean.HF;
import com.blog.pojo.bean.User;
import com.blog.service.BlogService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName BlogController
 * @Author 秃头的JJ
 * Date 2019/6/22 0022 17:16
 * Version 1.0
 */

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    private final Logger LOGGER = LogManager.getLogger(BlogController.class);

    @GetMapping(value = "/get", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String getBlog(HttpSession session) throws Exception {
        // 获取所有博客
        List<Blog> blogs = blogService.getAllBlog();

        JSONArray datas = new JSONArray();
        //查询博客的回复
        for (Blog blog:blogs
             ) {
            JSONObject data = new JSONObject();
            JSONArray hs = new JSONArray();
            data.put("mainBlog", blog);
            List<HF>  hfs = blogService.getHFByBlogId(blog.getId());
            for (HF hf:hfs) {
                hs.add(hf);
            }
            data.put("hf", hs);
            datas.add(data);
        }

        //json 转化
        JSONObject json = new JSONObject();
        json.put("blog", datas);
        return json.toJSONString();
    }


    // 添加blog 数据
    @PostMapping("/add")
    public String addBlog(String text, Integer blogid, Integer userid) throws Exception {
        LOGGER.info("{text:"+text+";\n" +
                "blogid:"+blogid+";\n" +
                "userid:"+userid+"}\n");
        HF hf = new HF();
        hf.setText(text);
        hf.setToblogid(blogid);
        hf.setUserid(userid);
        blogService.addHF(new PojoVO(hf));
        return "user";
    }



}
