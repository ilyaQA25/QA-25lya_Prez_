package lesson7.hw.figures;

class Triangle extends Figures {


    private Double sideA;
    private Double sideB;


    private Double sideC;
    private Double perimetr;
    private Double height;
    private Double halfPerimetr;

    private Double squareTriangle;


    public Triangle(Double sideA, Double sideB, Double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }


    @Override
    protected Double getPerim() {
        return sideA + sideB + sideC;
    }

    @Override
    protected Double getSquare() {
        return Math.sqrt((getPerim() / 2) * ((getPerim() / 2) - sideA) * ((getPerim() / 2) - sideB) * ((getPerim() / 2) - sideC));
    }


    /*Double getHeight(){
        halfPerimetr = perimetr;
        height = (2 * (Math.sqrt(halfPerimetr * (halfPerimetr - sideA) * (halfPerimetr - sideB) * (halfPerimetr - sideC))) / 2);
        return height;
    }*/

 /*   Double getSquareTriangle() {
        Double squareTriangle = *height;
        return squareTriangle;
    }*/


}

