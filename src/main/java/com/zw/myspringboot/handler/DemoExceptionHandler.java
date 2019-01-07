package com.zw.myspringboot.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@Slf4j
public class DemoExceptionHandler {

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public Map defaultHandler(HttpServletRequest request, Exception ex) {
        Map map = new HashMap();
        map.put("status", 500);
        map.put("message", ex.getMessage());
        log.error("抓住异常啦："+map);
        return map;
    }


}
