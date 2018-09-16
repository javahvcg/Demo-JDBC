/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Room;
import entities.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DBConnection;

/**
 *
 * @author anhquan12
 */
public class StudentDAO {

    PreparedStatement ps = null;
    Connection connection = null;
    ResultSet rs = null;

    public Student addNew(Student student) {

        DBConnection conn = new DBConnection();
        connection = conn.getConnection();
        try {
            String sql = "insert into student(id, room_id, name, dob) values (?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, 2);
            ps.setInt(2, 2);
            ps.setString(3, "VaneLove");
            ps.setString(4, "1988-06-07");
            int executeUpdate = ps.executeUpdate();
            if (executeUpdate > 0) {
                System.out.println("Insert data success !");
                return student;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            conn.close(rs, ps, connection);
        }
        return null;
    }
//    public static void main(String[] args) {
//        StudentDAO dao = new StudentDAO();
//        Student student = new Student();
//        dao.addNew(student);
//    }

    public ArrayList<Student> getAll() {
        ArrayList<Student> list = null;
        DBConnection conn = new DBConnection();
        connection = conn.getConnection();
        String sql = "select * from student inner join room on student.room_id = room.room_id";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                int room_id = rs.getInt("room_id");
                String name = rs.getString("name");
                String dob = rs.getString("dob");
                Student student = new Student(id, room_id, name, dob);
                Room room = new Room(room_id, dob);
                list.add(student);
                System.out.println(student.toString());                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student student = new Student();
        dao.getAll();
    }
}
