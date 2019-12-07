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

public class Student_And_Honor_Roll {
    // - Defining 3 values for a student.
    String first_name;
    String major;
    double gpa;

    // - Creating a constructor for a student.
    public Student_And_Honor_Roll(String first_name, String major, double gpa) {
        this.first_name = first_name;
        this.major = major;
        this.gpa = gpa;
    }

    // - Creating a method that checks returns if student is on honor roll or not.
    public String check_on_honor_roll() {
        if (this.gpa >= 3.5) {
            return "Yes";
        }
        return "No";
    }
}
