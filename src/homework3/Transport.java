package homework3;

import java.util.Objects;

public abstract class Transport {

    private double maxSpeed;

    public Transport() {
    }

    public Transport(double maxSpeed) {
        this.setMaxSpeed(maxSpeed);
    }



    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.maxSpeed, maxSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public abstract String fastRun();
}
