package creational.adapter;

public class RoundHole {
    private double radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return roundPeg.getRadius() <= radius;
    }
}
