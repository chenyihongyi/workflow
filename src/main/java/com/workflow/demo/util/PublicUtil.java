package com.workflow.demo.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 23:09
 */
public class PublicUtil {

    public static void main(String[] args) {
        System.out.println("本机的ip=" + PublicUtil.getIp());
    }

    public static String getPorjectPath(){
        String nowpath = "";
        nowpath=System.getProperty("user.dir")+"/";

        return nowpath;
    }

    /**
     * 获取本机访问地址
     * @return
     */
    public static String getIp(){
        String ip = "";
        try {
            InetAddress inet = InetAddress.getLocalHost();
            ip = inet.getHostAddress();
            //System.out.println("本机的ip=" + ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return ip;
    }
}
