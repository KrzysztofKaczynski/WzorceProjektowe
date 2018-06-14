package boombox;

import boombox.music_player.MusicPlayer;
import boombox.music_player.MusicPlayerRemote;
import boombox.music_player.command.PlayFirstTrack;
import boombox.music_player.command.PlayNextTrack;
import boombox.music_player.command.PlayRandomTrack;

public class Main {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
