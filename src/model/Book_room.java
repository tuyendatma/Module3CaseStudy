package model;

public class Book_room {
    private int id_book_room;
    private String account_name;
    private int id_room;
    private String check_in_date;
    private String check_out_date;

    public Book_room() {
    }

    public Book_room(int id_book_room, String account_name, int id_room, String check_in_date, String check_out_date) {
        this.id_book_room = id_book_room;
        this.account_name = account_name;
        this.id_room = id_room;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
    }

    public int getId_book_room() {
        return id_book_room;
    }

    public void setId_book_room(int id_book_room) {
        this.id_book_room = id_book_room;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public String getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(String check_in_date) {
        this.check_in_date = check_in_date;
    }

    public String getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(String check_out_date) {
        this.check_out_date = check_out_date;
    }
}
