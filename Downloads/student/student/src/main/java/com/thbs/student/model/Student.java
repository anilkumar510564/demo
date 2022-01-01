package com.thbs.student.model;

import javax.persistence.*;

@Entity
@Table(name = "studentdatabse")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int RegNo;
    private int ClassRoom;
    private int RoomNo;
    private String Address;
    private String PhoneNo;

    public Student() {
        super();
    }



    public Student(int regNo, int classRoom, int roomNo, String address, String phoneNo) {
        RegNo = regNo;
        ClassRoom = classRoom;
        RoomNo = roomNo;
        Address = address;
        PhoneNo = phoneNo;
    }
    public Student( int classRoom, int roomNo, String address, String phoneNo) {

        ClassRoom = classRoom;
        RoomNo = roomNo;
        Address = address;
        PhoneNo = phoneNo;
    }

    public int getRegNo() {
        return RegNo;
    }

    public void setRegNo(int regNo) {
        RegNo = regNo;
    }

    public int getClassRoom() {
        return ClassRoom;
    }

    public void setClassRoom(int classRoom) {
        ClassRoom = classRoom;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RegNo=" + RegNo +
                ", ClassRoom=" + ClassRoom +
                ", RoomNo=" + RoomNo +
                ", Address='" + Address + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                '}';
    }
}
