package MockitoDemo.service;

import org.springframework.stereotype.Service;

@Service
public class FlightService {

    public String getFlightDetails(Long flightId) {
        return "Flight details for ID " + flightId;
    }
}
