package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validator {
    //String data;

    public Validator(/*String data*/){
        //this.data = data;
    }

    public boolean checkDataSize(String data, int size){
        int dataSize = data.split(" ").length;
        if (dataSize > size)
            System.out.println("Количество данных больше запрашиваемых");
        if (dataSize < size)
            System.out.println("Количество данных меньше запрашиваемых");
        return size == dataSize;
    }

    public boolean checkBirthDate(String data, String pattern){
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
            LocalDate date = LocalDate.parse(data, dateTimeFormatter);
            return true;
        }catch (RuntimeException e){
            System.out.println("Дата рождения введена не корректно\n" + e);
            return false;
        }
    }

    public boolean checkPhoneNumber(String number){
        try {
            long num = Long.parseLong(number);
            return true;
        } catch (NumberFormatException e){
            System.out.println("Номер телефона введен некорректно\n" + e);
            return false;
        }
    }

    public boolean checkSex(String sex){
        if (sex.charAt(0) == 'm' || sex.charAt(0) == 'f'){
            return true;
        }else {
            System.out.println("Пол введен некорректно");
            return false;
        }
    }
}

