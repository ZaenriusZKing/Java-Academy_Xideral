package MockitoDemo.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public String getTicketDetails(Long ticketId) {
        return "Ticket details for ID " + ticketId;
    }
}

