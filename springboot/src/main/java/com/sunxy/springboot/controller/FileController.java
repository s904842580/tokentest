package com.sunxy.springboot.controller;

import cn.hutool.core.io.FileUtil;
import com.sunxy.springboot.common.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * 功能：
 * 作者：夏瑾溪
 * 日期：2023/11/2 9:51
 */

@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();//文件的原始名称
        String mainName = FileUtil.mainName(originalFilename);
        String extName = FileUtil.extName("文件的后缀");
        String projectPath = System.getProperty("user.dir");//E:\projects\tokentest\vue
        String filesPath = projectPath + "\\files";//文件存储目录
        String fileName = originalFilename;
        String fileRealPath = filesPath + "\\" + fileName;
        File saveFile = new File(fileRealPath);
        if(!saveFile.getParentFile().exists()){
            saveFile.getParentFile().mkdirs();//如果当前文件的父级目录不存在，就创建
        }
        if(saveFile.exists()){//如果当前上传的文件已经存在了，那么这个时候我就要重命名一个文件名称
            fileRealPath = System.currentTimeMillis() + mainName + "." + extName;
            saveFile = new File(fileRealPath);
        }
        file.transferTo(saveFile);//存储文件到本地的磁盘里面去
        String url = "http://localhost:9090/file/download" + fileRealPath;
        return Result.success("");//返回文件的链接，这个链接就是文件的下载地址，这个下载地址就是我的后台提供出来的
    }

    @GetMapping("/download/{fileName}")
    public void download(@PathVariable String fileName, HttpServletResponse response) throws IOException {
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(new byte[1024]);//数组是一个字符数组，也就是文件的字节流数组
    }
}