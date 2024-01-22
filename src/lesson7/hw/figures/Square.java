package lesson7.hw.figures;

class Square extends Rectangle {



    private final Double sideA;


    public Square(Double sideA) {
        super(sideA, sideA);
        this.sideA = sideA;

    }


    @Override
    protected Double getPerim() {
        return sideA * 4;
    }

    @Override
    protected Double getSquare() {
        return sideA * sideA;
    }
}
