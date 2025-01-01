package LLD.DesignPatterns.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer(); // Client

        player.play("song.mp3"); // Directly handled by AudioPlayer
        player.play("movie.mp4"); // Uses MediaAdapter to handle via AdvancedMediaPlayer
        player.play("document.pdf"); // Unsupported file format
    }
}
