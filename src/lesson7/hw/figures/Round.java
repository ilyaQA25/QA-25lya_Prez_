package lesson7.hw.figures;

class Round extends Figures {


    private Double radius;

    private Double p = 3.14;

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
