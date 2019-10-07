package homework3;

import java.util.Objects;

public class MilitaryShip extends Ship {
    public String level;
    public int numberOfSailors ;
    public static int numberOfObjects = 0;
    {
        numberOfObjects++;
    }

    public MilitaryShip(){
    }

    public MilitaryShip(int decks, String name, int weight, String type, int boardHeight, String level, int numberOfSailors) {

        super(decks, name, weight, type, boardHeight);
        this.level = level;
        this.numberOfSailors = numberOfSailors;
    }

    public MilitaryShip(String level, int numberOfSailors) {
        this.level = level;
        this.numberOfSailors = numberOfSailors;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Deck{" +
                "level='" + level + '\'' +
                ", numberOfSailors=" + numberOfSailors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryShip deck = (MilitaryShip) o;
        return numberOfSailors == deck.numberOfSailors &&
                Objects.equals(level, deck.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), level, numberOfSailors);
    }
}
