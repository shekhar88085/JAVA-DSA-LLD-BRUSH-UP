package LLD.DesignPatterns.Structural.Adapter;

public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".mp3")) {
            System.out.println("Playing audio: " + fileName);
        } else if (fileName.endsWith(".mp4")) {
            System.out.println("Using adapter for video playback.");
            MediaAdapter adapter = new MediaAdapter(new AdvanceMediaPlayerImpl());
            adapter.play(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}