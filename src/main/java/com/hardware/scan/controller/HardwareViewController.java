package com.hardware.scan.controller;

import com.hardware.scan.service.DiskInfoService;
import com.hardware.scan.service.MemoryInfoService;
import com.hardware.scan.service.SystemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
@Controller
public class HardwareViewController {


    /**
     * 主页
     *
     * @return
     */
    @GetMapping
    public String index() {
        return "index";
    }


}
