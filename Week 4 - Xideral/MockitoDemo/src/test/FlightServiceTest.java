package MockitoDemo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class FlightServiceTest {

    @InjectMocks
    private FlightService flightService;

    @Mock
    private FlightRepository flightRepository; // Si tienes un repositorio

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetFlightDetails() {
        Long flightId = 1L;
        String expectedDetails = "Flight details for ID " + flightId;
        
        // Si se tuviera un repositorio, podrías mockearlo aquí
        // when(flightRepository.findById(flightId)).thenReturn(Optional.of(new Flight(flightId, ...)));

        // Llamar al método
        String actualDetails = flightService.getFlightDetails(flightId);

        // Verificar el resultado
        assertThat(actualDetails).isEqualTo(expectedDetails);
    }
}
