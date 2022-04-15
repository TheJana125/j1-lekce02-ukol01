package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.penDown();
        nakresliPrasatko(zofka);

    }

    private void nakresliPrasatko(Turtle zofka) {
        nakresliTrojuhelnik(zofka);
        nakresliObdelnik(zofka);
        nakresliNozicky(zofka);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(125);
        zofka.move(200);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliNozicky(zofka);
    }

    private void nakresliNozicky(Turtle zofka) {
        zofka.turnLeft(60);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.penDown();
        zofka.turnRight(115);
        zofka.move(50);
    }

    private void nakresliObdelnik(Turtle zofka) {
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(140);
        zofka.turnRight(90);
        zofka.move(200);
    }

    private void nakresliTrojuhelnik(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(140);
    }

}
