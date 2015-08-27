package com.yuantops.tv.controller;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.yuantops.exception.AppException;
import com.yuantops.tv.service.VideoService;
import com.yuantops.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by yy102317 on 2015/8/27.
 */
@Controller
@RequestMapping("/video")
public class VideoController {
    private static final String VIEW_TEMPLATE_NAME = "result";

    @Autowired
    private VideoService videoService;

    /**
     *
     * @param methodName
     * @param paramsMap
     * @return
     */
    private String videoFactory(String methodName, Map<String, Object> paramsMap) {
        return null;
    }

    @RequestMapping("/List/{id}")
    public String getVideoList(@RequestParam(value = "id", required = false) String id,
                               Model model) {
        String resultStr = null;
        try {
            //todo
            throw new AppException();

        } catch (AppException e) {

        }
        model.addAttribute("", resultStr);
        return VIEW_TEMPLATE_NAME;
    }
}
