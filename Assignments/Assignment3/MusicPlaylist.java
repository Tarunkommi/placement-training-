//Create a music playlist using LinkedList. Each song has a title and an artist.
// Operations to implement: 
// 1 Add song at beginning 
// 2 Add song at end 
// 3 Remove a song 
// 4 Display playlist 
// 5 Move to next song 
// 6 Move to previous song

package Assignments.Assignment3;

import java.util.LinkedList;

class Song {
    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void display() {
        System.out.println(title + " - " + artist);
    }
}

public class MusicPlaylist {

    static LinkedList<Song> playlist = new LinkedList<>();
    static int currentIndex = 0;

    static void playNext() {

        if (currentIndex < playlist.size() - 1) {
            currentIndex++;
            System.out.println("\nPlaying next song:");
            playlist.get(currentIndex).display();
        } else {
            System.out.println("\nPlaying last song.");
        }
    }

    static void playPrevious() {

        if (currentIndex > 0) {
            currentIndex--;
            System.out.println("\nPlaying previous song:");
            playlist.get(currentIndex).display();
        } else {
            System.out.println("\nPlaying first song.");
        }
    }

    public static void main(String[] args) {


        // Add songs
        playlist.add(new Song("Believer", "Imagine Dragons"));
        playlist.add(new Song("Shape of You", "Ed Sheeran"));
        playlist.add(new Song("Perfect", "Ed Sheeran"));
        playlist.add(new Song("Faded", "Alan Walker"));

        System.out.println("Playlist: ");

        for (int i = 0; i < playlist.size(); i++) {
            playlist.get(i).display();
        }

        playlist.addFirst(
            new Song("Blinding Lights", "The Weeknd")
        );

        playlist.addLast(
            new Song("Heat Waves", "Glass Animals")
        );

        System.out.println("\nAfter adding songs:");

        for (Song song : playlist) {
            song.display();
        }
        // Remove song
        playlist.remove(3);
        
        currentIndex = 0;

        System.out.println("\nCurrent Song:");
        playlist.get(currentIndex).display();
        playNext();

        playNext();
        playPrevious();

    }
}
