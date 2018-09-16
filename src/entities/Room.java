/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author anhquan12
 */
public class Room {
    private int room_id;
    private String clan;
    
    
    public Room(int room_id, String clan) {
        this.room_id = room_id;
        this.clan = clan;
    }

    public Room() {
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getName() {
        return clan;
    }

    public void setName(String name) {
        this.clan = name;
    }

    @Override
    public String toString() {
        return "Room{" + "room_id=" + room_id + ", clan=" + clan + '}';
    }
}
