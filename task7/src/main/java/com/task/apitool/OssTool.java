package com.task.apitool;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.GetObjectRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.File;
import java.net.URL;
import java.util.Date;

/**
 * @author admin
 */
@Component
public class OssTool {

    private static final Logger logger = Logger.getLogger(OssTool.class);

    private static String endpoint = "oss-cn-beijing.aliyuncs.com";
    private static String accessKeyId = "xxxxxxxxxxxxxxxxxxx";
    private static String accessKeySecret = "xxxxxxxxxxxxxxxxxxx";
    private static String bucketName = "zzzz";
    private static String folder = "test/";

    // 1 新建OSSClient
     public static OSS getOSSClient(){
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        return ossClient;
    }


    // 2 上传本地文件
    public static String uploadImg(File file) {
        OSS ossClient = getOSSClient();
        String fileName = file.getName();
        fileName = random()+"_"+fileName;
        ossClient.putObject(bucketName, folder+fileName, file);
        return folder+fileName;
    }

    // 3 下载文件到本地
    // 下载OSS文件到本地文件。如果指定的本地文件存在会覆盖，不存在则新建。

    public static void downLoading(String objectName,String url){
        OSS ossClient = getOSSClient();
        File file = new File(url);
        String fileName = file.getName();
        logger.info("filename:"+fileName);
        ossClient.getObject(new GetObjectRequest(bucketName, objectName), file);
    }


    // 4 获取图片url
    public static String getUrl(String objectName) {
        OSS ossClient = getOSSClient();
        // 指定过期时间为两个月
        Date expiration = new Date(System.currentTimeMillis() + 60 * 60 * 24 * 60 );
        URL url = ossClient.generatePresignedUrl(bucketName, objectName, expiration);
        return url.toString();
    }

    public static String random() {
        String code = "";
        for (int i = 0; i < 4; i++) {
            code = code + (int) (Math.random() * 9);
        }
        return code;
    }
}
