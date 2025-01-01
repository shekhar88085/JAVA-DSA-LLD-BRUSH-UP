package LLD.DesignPatterns.Structural.Adapter;

public class AdvanceMediaPlayerImpl implements AdvanceMediaPlayer {

    @Override
    public void playAudio(String file) {
        System.out.println("Playing audio: " + file);
    }

    @Override
    public void playVideo(String file) {
        System.out.println("Playing video: " + file);
    }
    
}
