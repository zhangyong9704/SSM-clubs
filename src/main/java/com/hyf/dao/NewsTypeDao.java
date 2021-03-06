package com.hyf.dao;

import com.hyf.entity.News;
import com.hyf.entity.NewsType;

import java.util.List;

/**
 * Created by Administrator on 2016/12/17 0017.
 */
public interface NewsTypeDao {

    List<NewsType> selectByNewsType(News news);

    NewsType selectByNewsTypeId(News news);

    NewsType getNesTypeById(NewsType newsType);

    void save(NewsType newsType);

    void updateByNewsTypeId(NewsType newsType);

    List<NewsType> selectAll();

    int deleteNewsTypeById(NewsType newsType);
}
