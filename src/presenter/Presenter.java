package presenter;

import model.Person;
import model.Service;
import model.writer.FileHandler;
import view.View;

public class Presenter {
    private View view;
    private Service service;
    private FileHandler fileHandler;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
        fileHandler = new FileHandler();
    }

    public Person createPerson(String name, String surname, String patronymic, String birthDate, long phoneNumber, char sex){
        return service.newPerson(name,surname,patronymic,birthDate,phoneNumber,sex);
    }
    public boolean saveToFile(String surname, String text){
        fileHandler.setPath("contacts/"+surname + ".txt");
        return fileHandler.save(text+"\n");
    }

}
