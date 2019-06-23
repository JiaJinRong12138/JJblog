package com.blog.service.impl;

import com.blog.dao.BlogMapper;
import com.blog.pojo.PojoVO;
import com.blog.pojo.bean.Blog;
import com.blog.pojo.bean.HF;
import com.blog.pojo.bean.User;
import com.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName BlogServiceImpl
 * @Author 秃头的JJ
 * Date 2019/6/21 0021 23:37
 * Version 1.0
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public User getUserById(PojoVO pojoVO) throws Exception {
        return blogMapper.getUserById(pojoVO);
    }

    @Override
    public User getUserByUsernameAndPassword(PojoVO pojoVO) throws Exception {
        return blogMapper.getUserByUsernameAndPassword(pojoVO);
    }

    @Override
    public List<Blog> getAllBlog() throws Exception {
        return blogMapper.getAllBlog();
    }

    @Override
    public List<Blog> getBlogByUserId(PojoVO pojoVO) throws Exception {
        return blogMapper.getBlogByUserId(pojoVO);
    }

    @Override
    public Blog getBlogById(int id) throws Exception {
        return blogMapper.getBlogById(id);
    }

    @Override
    public List<HF>  getHFByBlogId(Integer blogId) throws Exception {
        return blogMapper.getHFByBlogId(blogId);
    }

    @Override
    public int addHF(PojoVO pojoVO) throws Exception {
        return blogMapper.addHF(pojoVO);
    }
}
