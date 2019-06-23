package com.blog.dao;

import com.blog.pojo.PojoVO;
import com.blog.pojo.bean.Blog;
import com.blog.pojo.bean.HF;
import com.blog.pojo.bean.User;

import java.util.List;

/**
 * @InterfaceName BlogMapper
 * @Author 秃头的JJ
 * Date 2019/6/21 0021 23:34
 */
public interface BlogMapper {

    User getUserById(PojoVO pojoVO) throws Exception;

    User getUserByUsernameAndPassword(PojoVO pojoVO) throws Exception;

    List<Blog> getAllBlog() throws Exception;

    List<Blog> getBlogByUserId(PojoVO pojoVO) throws Exception;

    Blog getBlogById(int id) throws Exception;

    List<HF>  getHFByBlogId(Integer blogId) throws Exception;

    int addHF(PojoVO pojoVO) throws Exception;
}
