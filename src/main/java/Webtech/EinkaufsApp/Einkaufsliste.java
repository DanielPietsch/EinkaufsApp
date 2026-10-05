package Webtech.EinkaufsApp;
import java.util.LinkedList;

public class Einkaufsliste {

    private LinkedList<String> liste;
    private String name;

    public Einkaufsliste(String name) {
        this.name = name;
        this.liste = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addItem(String item) {
        liste.add(item);
    }

    public void removeItem(String item) {
        liste.remove(item);
    }

    public LinkedList<String> getListe() {
        return liste;
    }


}