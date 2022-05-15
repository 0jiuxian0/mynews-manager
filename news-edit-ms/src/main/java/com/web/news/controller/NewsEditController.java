package com.web.news.controller;

import com.web.news.service.NewsEditService;
import com.web.news.pojo.News;
import com.web.news.pojo.RespBean;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewsEditController {
    @Autowired
    private NewsEditService newsEditService;

    @PutMapping("/updateNews")
    public RespBean updateNews(@RequestBody News news){
        System.out.println(news);

        try{
            newsEditService.updateNews(news);
            return RespBean.ok("修改成功",news);
        }catch (Exception e){
            e.printStackTrace();
            return RespBean.error("修改失败");
        }
    }

    @PostMapping("/addNews")
    public RespBean addNews(@RequestBody News news){
        System.out.println(news);
        try {
            newsEditService.addNews(news);
            return RespBean.ok("添加成功",news);
        }catch (Exception e){
            e.printStackTrace();
            return RespBean.error("添加失败");
        }
    }

    @DeleteMapping("/deleteNews/{id}")
    public RespBean deleteNews(@PathVariable int id){
        try {
            newsEditService.deleteNews(id);
            return RespBean.ok("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return RespBean.error("删除失败");
        }
    }
}
