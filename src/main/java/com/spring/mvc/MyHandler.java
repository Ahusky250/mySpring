package com.spring.mvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyHandler {
    private String url;
    private Object controller;
    private Method method;
}
