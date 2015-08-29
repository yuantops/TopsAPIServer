package com.yuantops.tv.dao;

import com.yuantops.tv.bean.Video;
import com.yuantops.tv.junit.SpringJunitTest;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yuantops(yuan.tops@gmail.com) on 2015/8/27.
 */
public class VideoDaoTest extends SpringJunitTest{

//    @Resource
    @Autowired
    private VideoDao videoDao;

    @Test
    public void testGetOnlineVideoList() throws Exception {
        List<Video> videoList = videoDao.getOnlineVideoList(10);
        Assert.assertTrue(videoList.size() >= 1);
//        Assert.assertEquals(1, videoList.size());
   }

    @Test
    public void testGetVideoById() throws Exception {
        Video video = videoDao.getVideoById(1);
        Assert.assertEquals("dahua", video.getVideoNameEn());
        Assert.assertEquals("大话西游", video.getVideoNameCn());
        Assert.assertEquals("星爷电影", video.getIntroduction());
        Assert.assertEquals("1995-01-21", video.getReleaseDate());
        Assert.assertEquals("2", video.getRuntime());
        Assert.assertEquals("comedy", video.getGenre());
        Assert.assertEquals(1, video.getPlayedTimes());
        Assert.assertEquals("http://poster_url", video.getPosterUrl());
        Assert.assertEquals("http://high_defi_url", video.getHighDefiUrl());
        Assert.assertEquals("http://std_defi_url", video.getStandardDefiUrl());
        Assert.assertEquals("http://super_defi_url", video.getSuperDefiUrl());
        Assert.assertEquals("http://broadcast_url", video.getBroadcastUrl());
    }
}