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
public class Student {
    private int id;
    private int room_id;
    private String name;
    private String dob;
    

    public Student(int id, int room_id, String name, String dob) {
        this.id = id;
        this.room_id = room_id;
        this.name = name;
        this.dob = dob;
    }    

    public Student() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", room_id=" + room_id + ", name=" + name + ", dob=" + dob + '}';
    }

   

}
