package runner;

import creational.adapter.RoundHole;
import creational.adapter.RoundPeg;
import creational.adapter.SquarePeg;
import creational.adapter.SquarePegAdapter;

public class AdapterRunner {
    public void run() {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(4);
        RoundPeg tooBigRoundPeg = new RoundPeg(8);

        System.out.println("Does round peg with radius = 4 fits to the round hole with radius = 5? " + (roundHole.fits(roundPeg) ? "Yes" : "No"));
        System.out.println("Does round peg with radius = 8 fits to the round hole with radius = 8? " + (roundHole.fits(tooBigRoundPeg) ? "Yes" : "No"));
        System.out.println("Lets try to put square peg into round hole !");

        SquarePeg squarePeg = new SquarePeg(2);
        SquarePeg tooBigSquarePeg = new SquarePeg(10);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        SquarePegAdapter tooBigSquarePegAdapter = new SquarePegAdapter(tooBigSquarePeg);

        System.out.println("Does square peg with width = 2 fits to the round hole with radius = 5? " + (roundHole.fits(squarePegAdapter) ? "Yes" : "No"));
        System.out.println("Does square peg with width = 10 fits to the round hole with radius = 5? " + (roundHole.fits(tooBigSquarePegAdapter) ? "Yes" : "No"));
    }
}
