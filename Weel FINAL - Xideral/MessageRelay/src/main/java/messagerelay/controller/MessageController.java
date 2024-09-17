package messagerelay.controller;

import messagerelay.model.Message;
import messagerelay.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }

    @GetMapping("/{receiver}")
    public List<Message> getMessagesForReceiver(@PathVariable String receiver) {
        return messageService.getMessagesForReceiver(receiver);
    }
}
