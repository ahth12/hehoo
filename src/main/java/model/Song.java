package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Song {
    private Integer songId;
    private String songName;
    private Double songDuration;

}
