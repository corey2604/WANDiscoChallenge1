package src.threedimensionalshape;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SphereTest {
    @Test
    void testSphereWithNegativeRadiusThrowsException() {
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> new Sphere(-1));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 4.19",
            "5, 523.6",
            "0, 0",
    })
    void testGetVolume(int radius, double volume) {
        // Given
        Sphere sphere = new Sphere(radius);

        // When
        double result = sphere.getVolume();

        // Then
        assertEquals(volume, result);
    }
}
