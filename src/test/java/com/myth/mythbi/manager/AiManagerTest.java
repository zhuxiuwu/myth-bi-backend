package com.myth.mythbi.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 易小川
 * @version 1.0
 */
@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doChat() {
        String s = aiManager.doChat(1659171950288818178L, "易小川");
        System.out.println(s);
    }
}