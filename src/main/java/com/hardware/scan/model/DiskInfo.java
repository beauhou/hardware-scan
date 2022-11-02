package com.hardware.scan.model;

/**
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
public class DiskInfo {

    /**
     * 磁盘名称
     */
    private String diskName;

    /**
     * 总空间
     */
    private String totalSize;

    /**
     * 使用空间
     */
    private String useSize;

    /**
     * 可用空间
     */
    private String freeSize;

    /**
     * 使用率
     */
    private String utilizationRate;


    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    public String getUseSize() {
        return useSize;
    }

    public void setUseSize(String useSize) {
        this.useSize = useSize;
    }

    public String getFreeSize() {
        return freeSize;
    }

    public void setFreeSize(String freeSize) {
        this.freeSize = freeSize;
    }

    public String getUtilizationRate() {
        return utilizationRate;
    }

    public void setUtilizationRate(String utilizationRate) {
        this.utilizationRate = utilizationRate;
    }
}
