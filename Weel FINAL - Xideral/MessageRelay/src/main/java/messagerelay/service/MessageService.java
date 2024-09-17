package messagerelay.service;

import messagerelay.model.Message;
import messagerelay.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getMessagesForReceiver(String receiver) {
        return messageRepository.findAll().stream()
                .filter(message -> message.getReceiver().equals(receiver))
                .toList();
    }
}
