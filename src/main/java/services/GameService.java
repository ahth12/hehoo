package services;

import lombok.Data;
import model.Player;
import model.Song;
import model.SongGame;
import repositories.GameInMemoryRepository;

import java.util.UUID;

@Data
public class GameService {

    public SongGame startGame(Player player, Song song){
        SongGame newSongGame = new SongGame();
        newSongGame.setGameId(1);
        newSongGame.setPlayer(player);
        newSongGame.setSong(song);
        double pathLength = (song.getSongDuration()*100.0);
        newSongGame.setPathLength((int) pathLength);
        GameInMemoryRepository.getInstance().setGame(newSongGame);
        return newSongGame;
    }

}
