package com.yuantops.tv.impl;

import com.yuantops.tv.bean.Video;
import com.yuantops.tv.dao.VideoDao;
import com.yuantops.tv.service.VideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yuantops(yuan.tops@gmail.com) on 2015/8/27.
 */
@Service
public class VideoServiceImpl implements VideoService {
    private static final int DEFAULT_LIST_LIMIT = 10;
    @Resource
    private VideoDao videoDao;

    public List<Video> getVideoList(String limitStr) {
        int limit;
        if (limitStr == null) {
            limit = DEFAULT_LIST_LIMIT;
        } else {
            limit = Integer.valueOf(limitStr);
        }
        if (limit > 0) {
            return videoDao.getOnlineVideoList(limit);
        }
        return null;
    }

    public List<Video> getListByGenre(String genre, String limitStr) {
        return null;
    }
}
