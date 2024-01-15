package lesson7.hw.figures;

class Square extends Figures {

    public Square(Double sideA) {
        this.sideA = sideA;
    }

    private Double sideA;

    @Override
    protected Double getPerim() {
        return sideA * 4;
    }

    @Override
    protected Double getSquare() {
        return sideA * sideA;
    }
}
