package com.yuantops.tv.impl;

import com.yuantops.tv.bean.Video;
import com.yuantops.tv.dao.VideoDao;
import com.yuantops.tv.junit.SpringJunitTest;
import com.yuantops.tv.service.VideoService;
import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yuantops(yuan.tops@gmail.com) on 2015/8/27.
 */
public class VideoServiceImplTest extends SpringJunitTest {

    @Autowired
    private VideoService videoService;

    @Test
    public void testGetVideoList() throws Exception {
        List<Video> videoList = videoService.getVideoList("10");
        Assert.assertTrue(videoList.size() >= 1);
    }

}