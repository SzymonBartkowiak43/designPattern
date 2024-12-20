package org.example.zajecia.zadanie2;

class Record {
    private int id;
    private String name;
    private int age;

    public Record(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Record [ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }
}
