package prj.coreyduffy.threedimensionalshape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;

class ThreeDimensionalShapeFactoryTest {
    ThreeDimensionalShapeFactory threeDimensionalShapeFactory = ThreeDimensionalShapeFactory.getInstance();

    @Test
    void testFactoryReturnsSphere() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.SPHERE, 1);

        // Then
        assertInstanceOf(Sphere.class, result);
    }

    @Test
    void testFactoryReturnsCube() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.CUBE, 1);

        // Then
        assertInstanceOf(Cube.class, result);
    }

    @Test
    void testFactoryReturnsRegularTetrahedron() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.REGULAR_TETRAHEDRON, 1);

        // Then
        assertInstanceOf(RegularTetrahedron.class, result);
    }

    @Test
    void testFactoryThrowsReturnsNullIfNullThreeDimensionalShape() {
        // When
        ThreeDimensionalShape result = threeDimensionalShapeFactory.createThreeDimensionalShape(null, 1);

        // Then
        assertNull(result);
    }
}
