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
    private String address;
    private String PhoneNo;

    public Student() {

    }

    public Student(int regNo, int classRoom, int roomNo, String address, String phoneNo) {
        this.RegNo = regNo;
        this.ClassRoom = classRoom;
        this.RoomNo = roomNo;
        this.address = address;
        this.PhoneNo = phoneNo;
    }
    public Student( int classRoom, int roomNo, String address, String phoneNo) {

        this.ClassRoom = classRoom;
        this.RoomNo = roomNo;
        this.address = address;
        this.PhoneNo = phoneNo;
    }

    public int getRegNo() {
        return RegNo;
    }

    public void setRegNo(int regNo) {
        this.RegNo = regNo;
    }

    public int getClassRoom() {
        return ClassRoom;
    }

    public void setClassRoom(int classRoom) {
        this.ClassRoom = classRoom;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int roomNo) {
        this.RoomNo = roomNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.PhoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RegNo=" + RegNo +
                ", ClassRoom=" + ClassRoom +
                ", RoomNo=" + RoomNo +
                ", address='" + address + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                '}';
    }
}
