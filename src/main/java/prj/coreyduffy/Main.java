package prj.coreyduffy;

import prj.coreyduffy.threedimensionalshape.ThreeDimensionalShape;
import prj.coreyduffy.threedimensionalshape.ThreeDimensionalShapeFactory;
import prj.coreyduffy.threedimensionalshape.ThreeDimensionalShapeType;

public class Main {

    public static void main(String[] args) {
        ThreeDimensionalShapeFactory threeDimensionalShapeFactory = ThreeDimensionalShapeFactory.getInstance();
        ThreeDimensionalShape sphereWithRadiusOfOne = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.SPHERE, 1);
        System.out.println("Volume of sphere with a radius of 1 is " + sphereWithRadiusOfOne.getVolume());
        ThreeDimensionalShape sphereWithRadiusOfFive = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.SPHERE, 5);
        System.out.println("Volume of sphere with a radius of 5 is " + sphereWithRadiusOfFive.getVolume());
        ThreeDimensionalShape cubeWithWithOfOne = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.CUBE, 1);
        System.out.println("Volume of cube with width of 1 is " + cubeWithWithOfOne.getVolume());
        ThreeDimensionalShape cubeWithWithOfFive = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.CUBE, 5);
        System.out.println("Volume of cube with width of 5 is " + cubeWithWithOfFive.getVolume());
        ThreeDimensionalShape regularTetrahedronWithEdgeOf1 = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.REGULAR_TETRAHEDRON, 1);
        System.out.println("Volume of regular tetrahedron with edge of 1 is " + regularTetrahedronWithEdgeOf1.getVolume());
        ThreeDimensionalShape regularTetrahedronWithEdgeOf5 = threeDimensionalShapeFactory.createThreeDimensionalShape(ThreeDimensionalShapeType.REGULAR_TETRAHEDRON, 5);
        System.out.println("Volume of regular tetrahedron with edge of 5 is " + regularTetrahedronWithEdgeOf5.getVolume());
    }
}
