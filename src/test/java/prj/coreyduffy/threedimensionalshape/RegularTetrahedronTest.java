package prj.coreyduffy.threedimensionalshape;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RegularTetrahedronTest {
    @Test
    void testRegularTetrahedronWithNegativeEdgeThrowsException() {
        // When - Then
        assertThrows(IllegalArgumentException.class, () -> new RegularTetrahedron(-1));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0.12",
            "5, 14.73",
            "0, 0",
    })
    void testGetVolume(int radius, double volume) {
        // Given
        RegularTetrahedron regularTetrahedron = new RegularTetrahedron(radius);

        // When
        double result = regularTetrahedron.getVolume();

        // Then
        assertEquals(volume, result);
    }
}
