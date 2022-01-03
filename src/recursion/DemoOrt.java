package recursion;

import java.util.Arrays;

public class DemoOrt {
    public static void main(String[] args) {
        Ort graz = new Ort("graz");
        Ort wien = new Ort("wien");
        Ort marburg = new Ort("marburg");
        Ort linz = new Ort("linz");
        Ort tirol = new Ort("tirol");

        graz.addNeighbour(marburg);
        graz.addNeighbour(wien);

        wien.addNeighbour(linz);

        linz.addNeighbour(graz);
        linz.addNeighbour(wien);

        marburg.addNeighbour(graz);
        wien.addNeighbour(graz);


        System.out.println(graz.hasCircle(graz));
        System.out.println("graz: " + graz.getValidCircle());
    }


}
