/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_09.ExtraWork;

/**
 *
 * @author Admin
 */
public class Honey {

    public static void main(String[] args) {
        Honey honeyPot = new Honey();

        Honey[] ha = {
            honeyPot, honeyPot,
            honeyPot, honeyPot
        };

        Bees bees = new Bees();
        bees.beeHoney = ha;

        Bear[] bears = new Bear[5];

        for (int i = 0; i < 5; i++) {
            bears[i] = new Bear();
            bears[i].hunny = honeyPot;
        }

        Kit kit = new Kit();
        kit.honey = honeyPot;

        Raccoon raccoon = new Raccoon();
        raccoon.rh = honeyPot;
        raccoon.rk = kit;

        kit = null;
    }
}

class Bees {

    Honey[] beeHoney;
}

class Bear {

    Honey hunny;
}

class Kit {

    Honey honey;
}

class Raccoon {

    Honey rh;
    Kit rk;
}
