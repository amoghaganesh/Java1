package tight_coupling.musicplayer;

public class MusicSystem {
    MP3Player player = new MP3Player(); // Direct dependency (tight coupling)

    void startMusic() {
        player.play();
    }
}
