package repositories;

import model.SongGame;

import java.util.HashMap;

public class GameInMemoryRepository {

    private static HashMap<Integer, SongGame> games;
    private static GameInMemoryRepository gameInMemoryRepository;

    public GameInMemoryRepository() {
    }

    public static synchronized GameInMemoryRepository getInstance(){
        if (gameInMemoryRepository == null){
            gameInMemoryRepository = new GameInMemoryRepository();
        }
        return gameInMemoryRepository;
    }

    public HashMap<Integer, SongGame> getGames() {
        return games;
    }

    public void setGame(SongGame game) {
        games.put(game.getGameId(), game);
    }
}
