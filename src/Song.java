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

public class Song {
    // - Defining three values for a song

    private String title;
    private String artist;
    private int length;

    // - This static songsCount will be the same for all song objects created.
    private static int songsCount = 0;

    // - Creating a song constructor with our 3 setter methods
    public Song(String title, String artist, int length) {
        this.setTitle(title);
        this.setArtist(artist);
        this.setLength(length);

        // - Add 1 to songsCount every time the Song constructor is called.
        songsCount++;;
    }

    // - Creating a getter method that will return the current songs count.
    public int getSongsCount() {
        return songsCount;
    }

    // - setTitle setter
    public void setTitle(String title) {
        this.title = title;
    }

    // - getTitle getter
    public String getTitle() {
        return this.title;
    }

    // - setArtist setter
    public void setArtist(String artist) {
        this.artist = artist;
    }

    // - getArtist getter
    public String getArtist() {
        return this.artist;
    }

    // - setLength setter
    public void setLength(int length) {
        this.length = length;
    }

    // getLength getter
    public int getLength() {
        return this.length;
    }
}
