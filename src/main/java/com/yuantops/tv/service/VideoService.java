package com.yuantops.tv.service;

import com.yuantops.tv.bean.Video;

import java.util.List;

/**
 * Created by yy102317 on 2015/8/27.
 */
public interface VideoService {
    public List<Video> getVideoList(int limit);
    public List<Video> getListByGenre(String genre, int limit);
}
