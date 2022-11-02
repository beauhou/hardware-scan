package com.hardware.scan.service;

import com.hardware.scan.model.MemoryInfo;
import com.hardware.scan.utils.UnitTransUtils;
import com.sun.management.OperatingSystemMXBean;
import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;

/**
 *获取操作系统
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
@Service
public class MemoryInfoService {

    /**
     * 获取操作系统内存使用情况
     */
    public void getMemoryInfo() {
        OperatingSystemMXBean mem = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        // 获取内存总容量
        long totalMemorySize = mem.getTotalPhysicalMemorySize();
        // 获取可用内存容量
        long freeMemorySize = mem.getFreePhysicalMemorySize();
        MemoryInfo memoryInfo = new MemoryInfo();
        memoryInfo.setTotalMemorySize(UnitTransUtils.transformation(totalMemorySize));
        memoryInfo.setFreeMemorySize(UnitTransUtils.transformation(freeMemorySize));
    }
}
