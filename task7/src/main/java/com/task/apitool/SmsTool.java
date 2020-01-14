package com.task.apitool;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.0.3</version>
</dependency>
*/
//阿里云短信工具api
public class SmsTool {

    public String sendSms(String PhoneNumbers, String smsCode) {
        final DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "xxxxxxxxxxxxxxxx", ""xxxxxxxxxxxxxxxx");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("SignName", "IT技能树");
        request.putQueryParameter("TemplateCode", "SMS_182380115");

        try {
            request.putQueryParameter("PhoneNumbers", PhoneNumbers);
            request.putQueryParameter("TemplateParam", smsCode);//code ="{\"code\":\"+1111\"}"
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            return response.getData();
        } catch (ServerException e) {
            e.printStackTrace();
            return "ServerException";
        } catch (ClientException e) {
            e.printStackTrace();
            return "ClientException";
        }
    }

    public static String smsCode() {
        String code = "";
        for (int i = 0; i < 4; i++) {
            code = code + (int) (Math.random() * 9);
        }
        String smsCode = "{\"code\":\"" + code + "\"}";
        return smsCode;
    }
}
//    public static void main(String[] args) {
//        SmsTool smsTool =new SmsTool();
//        String  smsCode=smsTool.smsCode();
//        System.out.println(smsCode);
//        System.out.println(smsTool.sendSms("18171833619",smsCode));
//    }
