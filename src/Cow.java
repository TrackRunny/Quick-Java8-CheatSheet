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

// - We are implementing all the methods from the Animal interface template.
public class Cow implements Animal{

    // - Implementing the speak method and making the cow say moo.
    @Override
    public void speak() {
        System.out.println("Moo");
    }

    // - Implementing the eat method and making the cow eat grass.
    @Override
    public void eat() {
        System.out.println("The cow eats some grass");
    }
}
