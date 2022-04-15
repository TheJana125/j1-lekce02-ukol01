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

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(500);
        zofka.turnRight(80);

        nakresliOsmiuhelnik(zofka);

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(200);

        nakresliKruh(zofka);

        zofka.penUp();
        zofka.turnLeft(15);
        zofka.move(190);
        zofka.penDown();

        nakresliSlunce(zofka);



    }

    private void nakresliSlunce(Turtle zofka) {
        for (int i = 0; i < 9 ; i++) {
        nakresliKousek(zofka);
        nakresliPaprsek(zofka);
        }
    }

    private void nakresliKousek(Turtle zofka) {
        for (int i = 0; i < 10; i++) {

        zofka.move(5);
        zofka.turnRight(5);
        }
    }

    private void nakresliPaprsek(Turtle zofka) {
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(100);
    }


    private void nakresliKruh(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 36; i++) {
            zofka.move(10);
            zofka.turnRight(10);
        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        zofka.penDown();
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
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
