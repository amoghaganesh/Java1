package loose_coupling.musicplayer;

public class MusicRunner {
    public static void main(String[] args) {
        MediaPlayer player = new MP3Player();
        MusicSystem system = new MusicSystem(player);
        system.startMusic();
    }
}
