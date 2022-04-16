package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();

        zofka.penUp();
        zofka.turnLeft(90);

        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(650);
        zofka.turnRight(80);

       /* nakresliOsmiuhelnik(zofka);

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(200);

        nakresliKruh(zofka);

        zofka.penUp();
        zofka.turnLeft(15);
        zofka.move(190); */

        zofka.penDown();
        nakresliSlunce(zofka);

        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(300);
        zofka.turnRight(105);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnRight(90);

        for (int i = 0; i < 3; i++) {
            zofka.penDown();
            nakresliDomecek(zofka);
            zofka.penUp();
            zofka.turnLeft(45);
            zofka.move(80);
        }
        zofka.penDown();
        nakresliDomecek(zofka);

      zofka.penUp();
      zofka.turnRight(30);
      zofka.move(200);
      zofka.turnRight(105);
      zofka.move(350);
      zofka.turnRight(180);
      zofka.penDown();
      nakresliDomecek(zofka);


      zofka.penUp();
      zofka.turnLeft(135);
      zofka.move(280);
      zofka.turnLeft(90);
      zofka.move(250);
      zofka.turnRight(90);
      zofka.setPenColor(Color.green);


        nakresliJ(zofka);
        nakresliA(zofka);
        nakresliN(zofka);
        nakresliA(zofka);



    }

    private void nakresliN(Turtle zofka) {
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(145);
        zofka.move(120);
        zofka.turnLeft(145);
        zofka.move(100);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(20);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
    }

    private void nakresliJ(Turtle zofka) {
        zofka.move(12);
        zofka.penDown();
        zofka.turnRight(135);
        zofka.move(17);
        zofka.turnLeft(45);
        zofka.move(25);
        zofka.turnLeft(45);
        zofka.move(17);
        zofka.turnLeft(45);
        zofka.move(89);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);
    }

    private void nakresliA(Turtle zofka) {
        zofka.penDown();
        zofka.turnRight(20);
        zofka.move(105);
        zofka.turnRight(140);
        zofka.move(105);
        zofka.turnLeft(180);
        zofka.move(30);
        zofka.turnLeft(70);
        zofka.move(48);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(68);
        zofka.turnRight(70);
        zofka.move(30);
        zofka.turnLeft(70);
        zofka.move(10);
        zofka.turnLeft(90);
    }

    private void nakresliDomecek(Turtle zofka) {
        nakresliCtverec(zofka);
        nakresliStrechu(zofka);
    }

    private void nakresliStrechu(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }

    private void nakresliCtverec(Turtle zofka) {
        for (int i = 0; i < 4 ; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }
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
