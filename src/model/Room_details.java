package model;

public class Room_details {
    private int id_room_details;
    private int id_room;
    private String name_room;
    private double price;
    private String description;
    private int amount;


    public Room_details(int id_room_details, int id_room, String name_room, double price, String description, int amount) {
        this.id_room_details = id_room_details;
        this.id_room = id_room;
        this.name_room = name_room;
        this.price = price;
        this.description = description;
        this.amount = amount;
    }

    public int getId_room_details() {
        return id_room_details;
    }

    public void setId_room_details(int id_room_details) {
        this.id_room_details = id_room_details;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public String getName_room() {
        return name_room;
    }

    public void setName_room(String name_room) {
        this.name_room = name_room;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
