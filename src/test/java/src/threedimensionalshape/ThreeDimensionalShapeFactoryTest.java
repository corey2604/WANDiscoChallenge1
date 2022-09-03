package src.threedimensionalshape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreeDimensionalShapeFactoryTest {
    ThreeDimensionalShapeFactory threeDimensionalShapeFactory = ThreeDimensionalShapeFactory.getInstance();

    @Test
    void testFactoryReturnsSphere() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.SPHERE, 1);

        // Then
        assertTrue(result instanceof Sphere);
    }

    @Test
    void testFactoryReturnsCube() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.CUBE, 1);

        // Then
        assertTrue(result instanceof Cube);
    }

    @Test
    void testFactoryReturnsRegularTetrahedron() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.REGULAR_TETRAHEDRON, 1);

        // Then
        assertTrue(result instanceof RegularTetrahedron);
    }

    @Test
    void testFactoryThrowsReturnsNullIfNullThreeDimensionalShape() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(null, 1);

        // Then
        assertNull(result);
    }
}
