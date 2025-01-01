package LLD.DesignPatterns.Structural.Adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvanceMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".mp3")) {
            advancedMediaPlayer.playAudio(fileName);
        } else if (fileName.endsWith(".mp4")) {
            advancedMediaPlayer.playVideo(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}