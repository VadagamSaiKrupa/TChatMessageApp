package com.message.app.service;

import java.util.List;

import com.message.app.exception.ChatException;
import com.message.app.exception.MessageException;
import com.message.app.exception.UserException;
import com.message.app.model.Message;
import com.message.app.request.SendMessageRequest;

public interface MessageService  {
	
	public Message sendMessage(SendMessageRequest req) throws UserException, ChatException;
	
	public List<Message> getChatsMessages(Integer chatId) throws ChatException;
	
	public Message findMessageById(Integer messageId) throws MessageException;
	
	public String deleteMessage(Integer messageId) throws MessageException;

}
