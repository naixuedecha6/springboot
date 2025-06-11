package com.blog.weblogweb.controller;

import com.blog.weblogmodulecommon.enums.ResponseCodeEnum;
import com.blog.weblogmodulecommon.exception.BizException;
import com.blog.weblogmodulecommon.utils.JsonUtil;
import com.blog.weblogmodulecommon.utils.Response;
import com.blog.weblogweb.model.User;
import com.blog.weblogmodulecommon.aspect.ApiOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;


@RestController
@Slf4j
public class TestController {

    @PostMapping("/admin/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user){
        // 打印入参
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        return Response.success(user);
    }

}
