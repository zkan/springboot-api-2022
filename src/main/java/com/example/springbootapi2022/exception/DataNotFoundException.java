package com.example.springbootapi2022.exception;

import com.example.springbootapi2022.model.MessageInfo;

public class DataNotFoundException extends RuntimeException {
    private MessageInfo messageInfo;

    public DataNotFoundException(MessageInfo messageInfo) {
        this.messageInfo = messageInfo;
    }

    public MessageInfo getMessageInfo() {
        return messageInfo;
    }
}
