package com.yuantops.tv.service;

import com.yuantops.tv.bean.Video;

import java.util.List;

/**
 * Created by yuantops(yuan.tops@gmail.com) on 2015/8/27.
 */
public interface VideoService {
    public List<Video> getVideoList(String limitStr);
    public List<Video> getListByGenre(String genre, String limitStr);
}
