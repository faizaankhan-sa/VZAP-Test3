package com.vzap.author;

public final class Author {
    private final String surname;
    private String firstName;
    private char gender;
    private final String idNumber;

    public Author(String surname, String idNumber) {
        this.surname = surname;
        this.idNumber = idNumber;
    }

    public Author(String surname, String firstName, char gender, String idNumber) {
        this.surname = surname;
        this.firstName = firstName;
        this.gender = gender;
        this.idNumber = idNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author other = (Author) obj;
        return idNumber.equals(other.idNumber) && surname.equals(other.surname);
    }

    @Override
    public String toString() {
        return "Author surname " + surname + ", firstName " + firstName + ", gender " + gender + ", idNumber " + idNumber;
    }


}


