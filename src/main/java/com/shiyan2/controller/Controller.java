package com.shiyan2.controller;

import com.spring.annotation.AutoWired;
import com.spring.annotation.RequestMapping;
import com.spring.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@com.spring.annotation.Controller
public class Controller {
    @AutoWired
    MyService myService;


    @RequestMapping("/upload")
    public String upoadFile(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");
        myService.uploadFile(req, resp);
        return "/upload.jsp";
    }
}