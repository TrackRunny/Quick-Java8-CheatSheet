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

package package_modifers;

public class Modifiers {
    // - Public means anyone can access the variable / method / class from anywhere inside the java project.
    public String publicString = "";
    // - Private means only the class file itself can access the variable / method / class.
    private String privateString = "";
    // - Protected means only other files package can access the variable / method / class from the class.
    protected String protectedString = "";

    // - Creating modifiers constructor.
    public Modifiers(String publicString, String privateString, String protectedString) {
        this.publicString = publicString;
        this.setPrivateString(privateString);
        this.setProtectedString(protectedString);
    }

    // - setPrivateString setter
    public void setPrivateString(String privateString) {
        this.privateString = privateString;
    }

    // - getPrivateString getter
    public String getPrivateString() {
        return this.privateString;
    }

    // - setProtectedString setter
    public void setProtectedString(String protectedString) {
        this.protectedString = protectedString;
    }

    // - getProtectedString getter
    public String getProtectedString() {
        return this.protectedString;
    }
}
