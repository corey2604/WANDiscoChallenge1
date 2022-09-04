package prj.coreyduffy.threedimensionalshape;

public class ThreeDimensionalShapeFactory {

    private static ThreeDimensionalShapeFactory instance = null;

    private ThreeDimensionalShapeFactory() {
    }

    public static ThreeDimensionalShapeFactory getInstance() {
        if (instance == null) {
            instance = new ThreeDimensionalShapeFactory();
        }
        return instance;
    }

    public ThreeDimensionalShape createThreeDimensionalShape(ThreeDimensionalShapeType threeDimensionalShapeType, int sideMeasurement) {
        if (threeDimensionalShapeType == null) {
            return null;
        }
        switch (threeDimensionalShapeType) {
            case SPHERE:
                return new Sphere(sideMeasurement);
            case CUBE:
                return new Cube(sideMeasurement);
            case REGULAR_TETRAHEDRON:
                return new RegularTetrahedron(sideMeasurement);
            default:
                throw new UnsupportedOperationException("Unsupported three dimensional shape type: " + threeDimensionalShapeType);
        }
    }
}
