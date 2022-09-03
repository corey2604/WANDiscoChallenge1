package src.threedimensionalshape;

class RegularTetrahedron extends ThreeDimensionalShape {
    private final int edge;

    public RegularTetrahedron(int edge) {
        if (edge < 0) {
            throw new IllegalArgumentException("Regular Tetrahedron cannot have a negative edge");
        }
        this.edge = edge;
    }

    @Override
    public double getVolume() {
        double volume = (Math.pow(edge, 3) / (6 * Math.sqrt(2)));
        return formatToTwoDecimalPlaces(volume);
    }
}
