package boombox.music_player;

import boombox.music_player.command.MusicPlayerCommand;
/**
 * @author KRIS
 */
public class MusicPlayerRemote {

    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton(){
        musicPlayerCommand.play();
    }
}
