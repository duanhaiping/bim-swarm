package com.cormen.bim.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: cormen
 * @Description: XXX Service
 * @DateTime: 2021/8/8 23:20
 **/


@Controller
@Api(tags = "自定义表单", description = "设备保养维护问题")
@RequestMapping("/equ-task-issue")
public class UserDesignedFormController {
}
