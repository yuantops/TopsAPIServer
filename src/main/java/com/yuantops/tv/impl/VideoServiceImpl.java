package com.yuantops.tv.impl;

import com.yuantops.tv.bean.Video;
import com.yuantops.tv.dao.VideoDao;
import com.yuantops.tv.service.VideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yy102317 on 2015/8/27.
 */
@Service
public class VideoServiceImpl implements VideoService {
    @Resource
    private VideoDao videoDao;

    public List<Video> getVideoList(int limit) {
        if (limit > 0) {
            return videoDao.getOnlineVideoList(limit);
        }
        return null;
    }

    public List<Video> getListByGenre(String genre, int limit) {
        return null;
    }
}
