package com.hardware.scan.controller;

import com.hardware.scan.service.DiskInfoService;
import com.hardware.scan.service.MemoryInfoService;
import com.hardware.scan.service.SystemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
@RestController
@RequestMapping("hardware")
public class HardwareController {

    @Autowired
    private SystemInfoService systemInfoService;

    @Autowired
    private MemoryInfoService memoryInfoService;

    @Autowired
    private DiskInfoService diskInfoService;

    public void systemInfo(){

    }

    public void memoryInfo(){

    }

    public void diskInfo(){

    }

}
