package com.course.servicemesh.authors.courseservicemeshauthors.models;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String version;
    private String nation;

    public Author(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

   public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }
    
    public Author withVersion(String version) {
        this.setVersion(version);
        return this;
    }
    
    public Author withNation(String nation) {
        this.setNation(nation);
        return this;
    }

    public Author withLastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public Author withBirthDate(String birthDate) {
        this.setBirthDate(birthDate);
        return this;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
