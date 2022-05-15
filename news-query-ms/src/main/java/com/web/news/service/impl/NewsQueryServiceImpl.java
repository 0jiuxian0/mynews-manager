package com.web.news.service.impl;

import com.web.news.mapper.CategoryMapper;
import com.web.news.mapper.NewsMapper;
import com.web.news.pojo.Category;
import com.web.news.pojo.News;
import com.web.news.pojo.NewsExample;
import com.web.news.service.NewsQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsQueryServiceImpl implements NewsQueryService {
    @Autowired
    private NewsMapper newsMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<News> queryNews() {
        return newsMapper.selectByExample(null);
    }

    @Override
    public List<News> queryNews(News news) {
        return newsMapper.selectByExample(null);
    }

    @Override
    public List<Category> findAllCategory() {
        return categoryMapper.selectByExample(null);
    }

    @Override
    public News findNewsById(int id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
