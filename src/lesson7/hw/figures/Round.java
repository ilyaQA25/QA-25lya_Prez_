package lesson7.hw.figures;

class Round extends Figures {


    private final Double radius;

    static final Double p = 3.14;

    public Round(Double radius) {
        this.radius = radius;
    }

    @Override
    protected Double getPerim() {
        return (2 * p) * radius;
    }

    @Override
    protected Double getSquare() {
        return p * (radius * radius);
    }
}
