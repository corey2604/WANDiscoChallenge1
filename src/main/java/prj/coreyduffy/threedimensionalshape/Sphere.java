package prj.coreyduffy.threedimensionalshape;

class Sphere extends AbstractThreeDimensionalShape {
    private final int radius;

    public Sphere(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Sphere cannot have a negative radius");
        }
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        return formatToTwoDecimalPlaces(volume);
    }
}
