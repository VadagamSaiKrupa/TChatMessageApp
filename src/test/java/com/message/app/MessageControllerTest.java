package com.message.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.message.app.controller.MessageController;
import com.message.app.exception.ChatException;
import com.message.app.exception.MessageException;
import com.message.app.exception.UserException;
import com.message.app.model.Message;
import com.message.app.model.User;
import com.message.app.request.SendMessageRequest;
import com.message.app.response.ApiResponse;
import com.message.app.service.MessageService;
import com.message.app.service.UserService;

public class MessageControllerTest {

    @Mock
    private MessageService messageService;

    @Mock
    private UserService userService;

    @InjectMocks
    private MessageController messageController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSendMessageHandler() throws UserException, ChatException {
        // Mock data
        String jwt = "mocked-jwt-token";
        User reqUser = new User();
        SendMessageRequest request = new SendMessageRequest();
        Message message = new Message();

      
        when(userService.findUserProfile(jwt)).thenReturn(reqUser);

        
        when(messageService.sendMessage(request)).thenReturn(message);

       
  //      ResponseEntity<MessageDto> response = messageController.sendMessageHandler(jwt, request);

       
    //    assertEquals(HttpStatus.OK, response.getStatusCode());

       
    //    verify(userService, times(1)).findUserProfile(jwt);
     //   verify(messageService, times(1)).sendMessage(request);
    }

    @Test
    public void testGetChatsMessageHandler() throws ChatException {
        // Mock data
        int chatId = 1;
        List<Message> messages = Collections.singletonList(new Message());

        
        when(messageService.getChatsMessages(chatId)).thenReturn(messages);

    //    ResponseEntity<List<MessageDto>> response = messageController.getChatsMessageHandler(chatId);

        
      //  assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());
      //  assertEquals(messages.size(), response.getBody().size());

       
 //       verify(messageService, times(1)).getChatsMessages(chatId);
    }

    @Test
    public void testDeleteMessageHandler() throws MessageException {
       
        int messageId = 1;

        
        ResponseEntity<ApiResponse> response = messageController.deleteMessageHandler(messageId);

      
        assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());

       
        verify(messageService, times(1)).deleteMessage(messageId);
    }
}

