package recursion;

import java.util.ArrayList;

public class Ort {
    private String name;
    private ArrayList<Ort> neighbours = new ArrayList<>();
    private ArrayList<String> validCircle = new ArrayList<>();

    public Ort(String name) {
        this.name = name;
    }

    public void addNeighbour(Ort o) {
        neighbours.add(o);
    }

    public boolean hasCircle(Ort o) {
        return hasCircle(o, o, null);
    }

    public boolean hasCircle(Ort o, Ort current, Ort previous) {
        validCircle.add(current.name);
        for (Ort neighbour : current.neighbours) {
        if (neighbour == previous) {
            validCircle.clear();
            return false;
        }
        if (neighbour == o){
            validCircle.add(o.name);
            return true;
        } else {
            if (hasCircle(o,neighbour,current))
            return true;
            }
        }
        return false;
    }

    public ArrayList<Ort> getNeighbours() {
        return neighbours;
    }

    public ArrayList<String> getValidCircle() {
        return validCircle;
    }
}
