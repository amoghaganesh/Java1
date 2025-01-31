package service;

public class MediaServiceImpl implements MediaService {
    public void playMusic(String song) {
        System.out.println("Playing song: " + song);
    }
    public void stopMusic() {
        System.out.println("Music stopped.");
    }
}