package com.yuantops.tv.controller;

import com.yuantops.tv.bean.Video;
import com.yuantops.tv.service.VideoService;
import com.yuantops.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by yuantops(yuan.tops@gmail.com) on 2015/8/27.
 */
@Controller
@RequestMapping("/video")
public class VideoController {
    private static final String VIEW_TEMPLATE_NAME = "jsonResult";
    private static final String MODEL_ATTR_NAME    = "resultStr";

    @Autowired
    private VideoService videoService;

    @RequestMapping("/list")
    public String getVideoList(@RequestParam(value = "limit", required = false) String limit,
                               Model model) {
        List<Video> videoList = videoService.getVideoList(limit);
        model.addAttribute(MODEL_ATTR_NAME, StringUtils.getJsonStringFromObject(videoList));
        return VIEW_TEMPLATE_NAME;
    }
}
