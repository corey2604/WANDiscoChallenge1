package src.threedimensionalshape;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CubeTest {
    @Test
    void testCubeWithNegativeRadiusThrowsException() {
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> new Cube(-1));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "5, 125",
            "0, 0",
    })
    void testGetVolumeWhenWidthIs1(int width, double volume) {
        // Given
        Cube cube = new Cube(width);

        // When
        double result = cube.getVolume();

        // Then
        assertEquals(volume, result);
    }
}
