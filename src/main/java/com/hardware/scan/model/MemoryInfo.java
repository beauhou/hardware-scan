package com.hardware.scan.model;

/**
 * 内存信息
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
public class MemoryInfo {

    private String  totalMemorySize;

    private String freeMemorySize;


    public String getTotalMemorySize() {
        return totalMemorySize;
    }

    public void setTotalMemorySize(String totalMemorySize) {
        this.totalMemorySize = totalMemorySize;
    }

    public String getFreeMemorySize() {
        return freeMemorySize;
    }

    public void setFreeMemorySize(String freeMemorySize) {
        this.freeMemorySize = freeMemorySize;
    }
}
