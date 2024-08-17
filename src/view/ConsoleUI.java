package view;

import model.Person;
import model.Validator;
import presenter.Presenter;
import java.util.Scanner;

public class ConsoleUI implements View {
    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Scanner scanner;
    private Validator validator;
    private Presenter presenter;
    private boolean isWork;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        isWork = true;
        validator = new Validator();
    }
    @Override
    public void start() {
        int size = 6;
        String dateFormatter = "dd.MM.yyyy";
        hello();
        printDetails();
        String choice = scanner.nextLine();
        while (isWork) {
            if(choice.equalsIgnoreCase("exit")){
                finish();
                break;
            }else {
                if(validator.checkDataSize(choice, size)){
                    String[] info = choice.split(" ");
                    if (validator.checkBirthDate(info[3], dateFormatter)) {
                        if (validator.checkPhoneNumber(info[4])) {
                            if (validator.checkSex(info[5])) {
                                Person person = presenter.createPerson(info[1],info[0],info[2],info[3],Long.parseLong(info[4]),info[5].charAt(0));
                                if(presenter.saveToFile(person.getSurname(), person.toString()))
                                    printAnswer("Данные сохранены");
                                else
                                    printAnswer("Ошибка во время записи");
                            }
                        }
                    }
                }else {
                    printAnswer("Ошибка ввода");
                }
            }
            System.out.println();
            printDetails();
            choice = scanner.nextLine();
        }
    }
    public void printDetails(){
        printAnswer("Введите данные в указанном формате, разделяя пробелом или exit для завершения работы");
        printAnswer("Фамилия Имя Отчество дата_рождения номер_телефона пол");
        printAnswer("дата_рождения - строка формата dd.mm.yyyy");
        printAnswer("номер_телефона - целое беззнаковое число без форматирования");
        printAnswer("пол - символ латиницей f или m.");
    }
    public void finish() {
        printAnswer("До свидания");
        isWork = false;
    }


    private void inputError() {
        printAnswer(INPUT_ERROR);
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

    private void hello() {
        printAnswer("Доброго времени суток!");
    }
}
