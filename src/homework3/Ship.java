package homework3;

import java.util.Objects;

public class Ship {
    private int decks; //Палубы
    private String name;
    private int weight;
    private String type;
    private int boardHeight;

    public int getDecks() {
        return decks;
    }

    public void setDecks(int decks) {
        this.decks = decks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBoardHeight() {
        return boardHeight;
    }

    public void setBoardHeight(int boardHeight) {
        this.boardHeight = boardHeight;
    }

    Ship(int decks, String name, int weight, String type, int boardHeight) {
        this.decks = decks;
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.boardHeight = boardHeight;
    }

    public Ship() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return decks == ship.decks &&
                Double.compare(ship.weight, weight) == 0 &&
                Double.compare(ship.boardHeight, boardHeight) == 0 &&
                Objects.equals(name, ship.name) &&
                Objects.equals(type, ship.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decks, name, weight, type, boardHeight);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "decks=" + decks +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", boardHeight=" + boardHeight +
                '}';
    }
}
