package src;

import src.threedimensionalshape.ThreeDimensionalShape;
import src.threedimensionalshape.ThreeDimensionalShapeFactory;
import src.threedimensionalshape.ThreeDimensionalShapeType;

public class Main {

    public static void main(String[] args) {
        ThreeDimensionalShapeFactory threeDimensionalShapeFactory = ThreeDimensionalShapeFactory.getInstance();
        ThreeDimensionalShape sphere = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.SPHERE, 1);
        System.out.println("Volume of sphere is " + sphere.getVolume());
        ThreeDimensionalShape cube = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.CUBE, 1);
        System.out.println("Volume of cube is " + cube.getVolume());
        ThreeDimensionalShape regularTetrahedron = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.REGULAR_TETRAHEDRON, 1);
        System.out.println("Volume of regular tetrahedron is " + regularTetrahedron.getVolume());
    }
}
