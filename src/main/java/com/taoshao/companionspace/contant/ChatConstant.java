package com.taoshao.companionspace.contant;

/**
 * @Author: taoshao
 * @Date: 2023年04月11日 11:59
 * @Version: 1.0
 * @Description: 聊天类
 */
public interface ChatConstant {
    /**
     * 私聊
     */
    int PRIVATE_CHAT = 1;
    /**
     * 队伍群聊
     */
    int TEAM_CHAT = 2;
    /**
     * 大厅聊天
     */
    int HALL_CHAT = 3;

    String CACHE_CHAT_HALL = "companionspace:chat:chat_records:chat_hall";

    String CACHE_CHAT_PRIVATE = "companionspace:chat:chat_records:chat_private";

    String CACHE_CHAT_TEAM = "companionspace:chat:chat_records:chat_team";

}
