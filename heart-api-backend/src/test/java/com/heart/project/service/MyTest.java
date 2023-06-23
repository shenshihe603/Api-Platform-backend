package com.heart.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.util.DigestUtils;

/**
 * @author CSJ
 * @version 1.0
 * @decription
 * @createTime 2023/6/23 星期五 13:49
 */
public class MyTest {
    @Test
    void testPassword() {
        String encryptPassword = DigestUtils.md5DigestAsHex(("heart" + "12345678").getBytes());
        System.out.println(encryptPassword);
    }
}
