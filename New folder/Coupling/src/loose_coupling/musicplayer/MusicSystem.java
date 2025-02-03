package loose_coupling.musicplayer;

public class MusicSystem {
    private MediaPlayer player;

    MusicSystem(MediaPlayer player) { // Dependency Injection
        this.player = player;
    }

    void startMusic() {
        player.play();
    }
}
