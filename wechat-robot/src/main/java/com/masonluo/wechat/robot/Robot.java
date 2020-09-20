package com.masonluo.wechat.robot;

import io.github.biezhi.wechat.WeChatBot;
import io.github.biezhi.wechat.api.annotation.Bind;
import io.github.biezhi.wechat.api.constant.Config;
import io.github.biezhi.wechat.api.enums.MsgType;
import io.github.biezhi.wechat.api.model.WeChatMessage;

/**
 * @author Masonluo
 * @date 2020-09-10 10:05
 */
public class Robot extends WeChatBot {
    public Robot(Config config) {
        super(config);
    }

    @Bind(msgType = MsgType.ALL)
    public void handlerMsg(WeChatMessage message) {
        System.out.println(message.getRaw());
        System.out.println(message.getMsgType());
        System.out.println(message);
    }

    public static void main(String[] args) {
        new Robot(Config.me().autoLogin(true).showTerminal(true)).start();
    }
}
