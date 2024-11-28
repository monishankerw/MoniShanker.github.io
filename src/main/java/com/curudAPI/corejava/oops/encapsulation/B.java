package org.example.corejava.oops.encapsulation;

public class B {
    private int id;
    private String name;

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

    public static void main(String[] args) {
        B b=new B();
        b.setId(1);
        b.setName("abc");
        System.out.println(b.getId());
        System.out.println(b.getName());
    }
}
