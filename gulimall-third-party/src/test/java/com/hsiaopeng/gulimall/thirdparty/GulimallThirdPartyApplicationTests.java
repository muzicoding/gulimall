package com.hsiaopeng.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
//        String endpoint = "oss-cn-beijing.aliyuncs.com";

//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        FileInputStream inputStream = new FileInputStream("E:\\Java\\guli\\课件和文档\\基础篇\\资料\\pics\\1f15cdbcf9e1273c.jpg");

        ossClient.putObject("gulimall-hsiaopeng", "ha.jpg", inputStream);

        ossClient.shutdown();

        System.out.println("上传完成");
    }

}
