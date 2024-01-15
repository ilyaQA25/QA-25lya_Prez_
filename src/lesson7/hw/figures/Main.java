package lesson7.hw.figures;

public class Main {
    public static void main(String[] args) {

        Triangle tr1 = new Triangle(3.0, 4.0, 5.0);
        Rectangle rect1 = new Rectangle(4.0, 5.0);
        Square sqr1 = new Square(6.0);
        Square sqr2 = new Square(8.0);
        Round rd1 = new Round(7.0);

        Figures[] list = new Figures[5];
        list[0] = tr1;
        list[1] = rect1;
        list[2] = sqr1;
        list[3] = sqr2;
        list[4] = rd1;

        double overalPerim = 0;
        for (int i = 0; i < list.length; i++) {
            overalPerim += list[i].getPerim();
        }
        System.out.println(overalPerim);
        /*double perim = 0;
        for (var item:
             list) {
            perim += item.getPerim();
        }

        System.out.println(perim);
        }*/
    }
}
