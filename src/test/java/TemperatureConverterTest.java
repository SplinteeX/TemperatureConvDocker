import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void fahrenheitToCelsius() {
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    public void celsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    public void kelvinToFah() {
        assertEquals(80.33, TemperatureConverter.kelvinToFah(300.0), 0.01);
        assertEquals(32.0, TemperatureConverter.kelvinToFah(273.15), 0.01);
    }

    @Test
    public void isExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-50));
        assertFalse(TemperatureConverter.isExtremeTemperature(25));
    }
}
