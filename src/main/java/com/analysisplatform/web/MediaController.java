package com.analysisplatform.web;

import com.analysisplatform.web.Handler.MediaHttpRequestHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping(value ="/media")
public class MediaController {
    @Autowired
    private MediaHttpRequestHandler handler;

    @GetMapping("/video")
    public void getPlayResource(HttpServletRequest request,
                                HttpServletResponse response) throws Exception {
        String path = "D:/test.mp4";
//        File file = new File(path);
//        if (file.exists()) {
//            request.setAttribute(MediaHttpRequestHandler.ATTR_FILE, path);
//            handler.handleRequest(request, response);
//        } else {
//            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
//            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
//        }


        //sourcePath 是获取编译后 resources 文件夹的绝对地址，获得的原始 sourcePath 以/开头，所以要用 substring(1) 去掉第一个字符/
        //realPath 即视频所在的完整地址
//        String sourcePath = this.getClass().getClassLoader().getResource("").getPath().substring(1);
//        String realPath = sourcePath +"static/video/1.mp4";
        Path filePath = Paths.get(path);
        if (Files.exists(filePath)) {
            // 利用 Files.probeContentType 获取文件类型
            String mimeType = Files.probeContentType(filePath);
            if (!StringUtils.isEmpty(mimeType)) {
                // 设置 response
                response.setContentType(mimeType);
            }
            request.setAttribute(MediaHttpRequestHandler.ATTR_FILE, filePath);
            // 利用 ResourceHttpRequestHandler.handlerRequest() 实现返回视频流
            handler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }

    @GetMapping("/video1")
    public void getPlayResource1(HttpServletRequest request,
                                HttpServletResponse response) throws Exception {
        String path = "D:/test01.mp4";
        Path filePath = Paths.get(path);
        if (Files.exists(filePath)) {
            String mimeType = Files.probeContentType(filePath);
            if (!StringUtils.isEmpty(mimeType)) {
                response.setContentType(mimeType);
            }
            request.setAttribute(MediaHttpRequestHandler.ATTR_FILE, filePath);
            handler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }

    @GetMapping("/video2")
    public void getPlayResource2(HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        String path = "D:/test02.mp4";
        Path filePath = Paths.get(path);
        if (Files.exists(filePath)) {
            String mimeType = Files.probeContentType(filePath);
            if (!StringUtils.isEmpty(mimeType)) {
                response.setContentType(mimeType);
            }
            request.setAttribute(MediaHttpRequestHandler.ATTR_FILE, filePath);
            handler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }
}