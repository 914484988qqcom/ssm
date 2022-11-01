package pojo;

public class student {
    private int id;
    private String name;
    private int password;
    private int sno;

    public student() {
    }

    public student(int id, String name, int password, int sno) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.sno = sno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", sno=" + sno +
                '}';
    }
}
