package model;

import lombok.Data;

@Data
public class SongGame {
    private int gameId;
    private Player player;
    private Song song;
    private Integer pathLength;

}
