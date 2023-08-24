package com.frankmoley.lil.learningspring.data;

import org.springframework.boot.autoconfigure.domain.Entity;
import org.springframework.stereotype.Indexed;

@Entity
@Table(name="ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="ROOM_ID")
    private long id;

    @Column(name="NAME")
    private String name;

    @Column(name="ROOM_NUMBER")
    private String roomNumber;

    @Column(name="BED_INFO")
    private String bedInfo;

    // ROOM_ID BIGSERIAL PRIMARY KEY,
    // NAME VARCHAR(16) NOT NULL,
    // ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
    // BED_INFO CHAR(2) NOT NULL


    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * @return String return the bedInfo
     */
    public String getBedInfo() {
        return bedInfo;
    }

    /**
     * @param bedInfo the bedInfo to set
     */
    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    @Override
    public String toString(){
        return "Room{" +
               "id=" + id + 
               ", name=" + name + '\'' +
               ", roomNumber=" +  roomNumber + '\'' +
               ", bedInfo=" + bedInfo + '\'' +
               '}';
    }
}
