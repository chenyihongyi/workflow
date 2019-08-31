package com.workflow.demo.util;

import java.util.UUID;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 21:29
 */
public class UuidUtil {
    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
    public static void main(String[] args) {
        System.out.println(get32UUID());
    }
}
