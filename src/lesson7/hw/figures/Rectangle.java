package lesson7.hw.figures;


class Rectangle extends Figures {

    private Double sideA;
    private Double sideB;

    private Double perimetr;

    private Double square;


    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

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

   /* Integer getSqareRectangle(Integer sideA, Integer sideB){
        Integer sqareRectangle = (sideA)*(sideB);

        return sqareRectangle;
    }

    Integer getPerimetr(Integer sideA, Integer sideB){
        Integer perimRectangle = (sideA*2)+(sideB*2);
        return perimRectangle;
    }
*/


}

