package model;

public class Service {
    private Builder builder;

    public Service(){
        builder = new Builder();
    }

    public Person newPerson(String name, String surname, String patronymic, String birthDate, long phoneNumber, char sex){
        return builder.setName(name)
                .setSurname(surname)
                .setPatronymic(patronymic)
                .setBirthDate(birthDate)
                .setPhoneNumber(phoneNumber)
                .setSex(sex)
                .build();
    }
}
