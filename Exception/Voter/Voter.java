package com.java.Exception.Voter;

public class Voter {
    private long id;
    private Person person;
    private String location;
    private String code;

    // Getter and Setter
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setPerson(Person person){
        this.person = person;
    }
    public Person getPerson(){
        return person;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return code;
    }

    public String toString(){
        return "Voter[id=00" + id + ", {person: id=00%d, name=%s, gender=%s, dateOfBirth=%s, idCard=%s".formatted(person.getId(), person.getName(), person.getGender(), person.getDateOfBirth(), person.getIdCard()) + "}, location=" + location + ", code=" + code + "]";
    }
}
