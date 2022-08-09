package model;

import lombok.Data;

import java.util.List;

@Data
public class Player {
    private Integer personId;
    private List<Song> songArrayList;
}
