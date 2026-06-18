/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_08.ExtraWork;

import chapter_08.ExtraWork.Picasso;

/**
 *
 * @author Admin
 */
// Clowns inherits from Picasso.
// It does not define its own iMethod(),
// so it inherits the version from Picasso.
class Clowns extends Picasso {
}

// Acts also inherits from Picasso.
class Acts extends Picasso {

    // Override the iMethod() inherited from Picasso.
    // This version always returns 5.
    @Override
    public int iMethod() {
        return 5;
    }
}
