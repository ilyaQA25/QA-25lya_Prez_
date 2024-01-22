package lesson7.hw.figures;


class Rectangle extends Figures {

    private final Double sideA;
    private final Double sideB;


    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


//    public Rectangle(Double sideA) {
//        this.sideA = sideA;
//    }

    @Override
    protected Double getPerim() {
        Double perimetr = (sideA * 2) + (sideB * 2);
        return perimetr;
    }

    @Override
    protected Double getSquare() {
        Double square = sideA * sideB;
        return square;
    }




}

