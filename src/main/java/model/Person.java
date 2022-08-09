package model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Person {
    private Integer personId;
    private ArrayList<Song> songArrayList;
}
