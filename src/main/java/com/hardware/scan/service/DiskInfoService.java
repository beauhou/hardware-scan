package com.hardware.scan.service;

import com.hardware.scan.model.DiskInfo;
import com.hardware.scan.utils.UnitTransUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: BeauHou
 * @Date: 2022/11/2
 * @Description:
 */
@Service
public class DiskInfoService {

    /**
     * 获取系统各个硬盘的总容量、已经使用的容量、剩余容量和使用率
     *
     * @return 磁盘信息
     * @throws IOException
     */
    public List<DiskInfo> getDiskInfo() throws IOException {
        DecimalFormat df = new DecimalFormat("#0.00");
        File[] disks = File.listRoots();
        List<DiskInfo> diskInfos = new ArrayList<>();
        for (File file : disks) {
            // 获取总容量
            long totalSpace = file.getTotalSpace();
            // 获取剩余容量
            long usableSpace = file.getUsableSpace();
            // 获取已经使用的容量
            long freeSpace = totalSpace - usableSpace;
            DiskInfo diskInfo = new DiskInfo();
            diskInfo.setDiskName(file.getCanonicalPath());
            diskInfo.setTotalSize(UnitTransUtils.transformation(totalSpace));
            diskInfo.setUseSize(UnitTransUtils.transformation(usableSpace));
            diskInfo.setFreeSize(UnitTransUtils.transformation(freeSpace));
            diskInfos.add(diskInfo);
        }
        return diskInfos;
    }
}
