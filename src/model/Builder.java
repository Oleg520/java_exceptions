package model;

public class Builder {
    private Person person;
    private String name;
    private String surname;
    private String patronymic;
    private String birthDate;
    private long phoneNumber;
    private char sex;

    public Builder() {
        createPerson();
    }


    private void createPerson() {
        person = new Person();
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public Builder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Builder setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public Builder setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Builder setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Builder setSex(char sex) {
        this.sex = sex;
        return this;
    }

    private void createName() {
        person.setName(name);
    }

    private void createSurname() {
        person.setSurname(surname);
    }

    private void createPatronymic() {
        person.setPatronymic(patronymic);
    }

    private void createBirthDate() {
        person.setBirthDate(birthDate);
    }

    private void createPhoneNumber() {
        person.setPhoneNumber(phoneNumber);
    }

    private void createSex() {
        person.setSex(sex);
    }

    public Person build() {
        createPerson();
        createName();
        createSurname();
        createPatronymic();
        createBirthDate();
        createPhoneNumber();
        createSex();
        return person;
    }
}
