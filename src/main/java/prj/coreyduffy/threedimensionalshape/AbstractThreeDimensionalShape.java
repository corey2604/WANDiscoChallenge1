package prj.coreyduffy.threedimensionalshape;

import java.text.DecimalFormat;

public abstract class AbstractThreeDimensionalShape implements ThreeDimensionalShape {
    private static final DecimalFormat TWO_DECIMAL_PLACE_FORMAT = new DecimalFormat("#.##");

    protected double formatToTwoDecimalPlaces(double value) {
        return Double.parseDouble(TWO_DECIMAL_PLACE_FORMAT.format(value));
    }
}
