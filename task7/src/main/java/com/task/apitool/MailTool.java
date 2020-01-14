package com.task.apitool;

import cn.hutool.core.date.DateUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

//网易邮箱 api工具 依赖hutool
public class MailTool {
    private static MailAccount account;

    static {
        account = new MailAccount();
        account.setHost("smtp.163.com");
        account.setPort(25);
        account.setAuth(true);
        //发送方
        account.setFrom("xxxxx@163.com"); //
        //用户名
        account.setUser("xxxxx@163.com"); //
        account.setPass("xxxxxxx"); //授权码
    }

    public void send(String email, String code) {

        MailUtil.send(account, email, "IT技能树" + DateUtil.now(), "您的验证码是：" + code, false);
    }

    public static String code() {
        String code = "";
        for (int i = 0; i < 4; i++) {
            code = code + (int) (Math.random() * 9);
        }
        return code;
    }
}