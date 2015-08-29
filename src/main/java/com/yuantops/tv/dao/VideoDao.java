package com.yuantops.tv.dao;

import com.yuantops.tv.bean.Video;

import java.util.List;

/**
 * Created by yuantops(yuan.tops@gmail.com) on 2015/8/27.
 */
public interface VideoDao {
    public List<Video> getOnlineVideoList(int limit);
    public Video       getVideoById(int id);
}
