package com.hardware.scan.service;

import com.hardware.scan.model.SystemInfo;
import org.springframework.stereotype.Service;

import java.util.concurrent.ScheduledExecutorService;

/**
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
@Service
public class SystemInfoService {

    /**
     * 获取系统信息
     * @return
     */
    public SystemInfo getSystemInfo(){
        SystemInfo systemInfo=new SystemInfo();
        systemInfo.setOsName(System.getProperty("os.name"));
        systemInfo.setOsArch(System.getProperty("os.arch"));
        systemInfo.setOsVersion(System.getProperty("os.version"));
        systemInfo.setAvailableProcessors(Runtime.getRuntime().availableProcessors());
        return systemInfo;
    }
}
