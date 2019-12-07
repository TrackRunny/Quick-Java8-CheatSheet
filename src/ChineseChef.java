/*
 * Quick-Java8-CheatSheet - A Java 8 cheat sheet that covers most of Java 8 basics.
 * Copyright (C) 2019 TrackRunny

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

// - The chinese chef can make everything the normal chef can, in addition to making fried rice.
// - The chinese chef is able to take all the of functions from the regular chef even though they are not inside the class.
public class ChineseChef extends Chef {
    // - Creating a method to where the chinese chef makes its own special dish, unlike the one from the regular chef.

    public void makeSpecialDish() {
        System.out.println("The chinese chef makes orange chicken.");
    }

    // - Creating a method to where the chinese chef makes fried rice.
    public void makeFriedRice() {
        System.out.println("The chinese chef makes fried rice.");
    }
}
