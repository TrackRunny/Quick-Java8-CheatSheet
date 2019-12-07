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

public class Movie {
    // - Defining 3 values for a movie.

    // - Private means that no other class's can edit the title, director, and rating string, only the movie class can directly edit it.
    private String title;
    private String director;
    private String rating;

    // - Creating a movie constructor with our setter methods.
    public Movie(String title, String director, String rating) {
        this.setTitle(title);
        this.setDirector(director);
        this.setRating(rating);
    }

    // - Creating a setter method to where the user can define what the rating is. This prevents the user from entering a invalid movie rating.
    public void setRating(String rating) {
        // - Checking if the rating the user puts in is equal to one of the following options.
        if (rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R") || rating.equals("NR")) {
            // - Then assigning the rating value.
            this.rating = rating;
        } else {
            // - Other wise, setting the movie rating to NR.
            this.rating = "NR";
        }
    }

    // - Creating a getter method that returns the movie rating to the user.
    public String getRating() {
        return this.rating;
    }

    // - Creating another setter method that allows the user to specify what title they want for the movie.
    public void setTitle(String title) {
        this.title = title;
    }

    // - Creating another getter method that returns the movie title to the user.
    public String getTitle() {
        return this.title;
    }

    // - Creating our last setter method that allows the user to specify what director they want for the movie.
    public void setDirector(String director) {
        this.director = director;
    }

    // - Creating out last getter method that returns the movie director name to the user.
    public String getDirector() {
        return this.director;
    }
}
