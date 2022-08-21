public class Main {
    public static void main(String[] args) {
        //Задание 1 - ФИО
        String firstName = "Семён"; //имя
        String middleName = "Иванович"; //отчество
        String lastName = "Иванов"; //фамилия
        String fullName = lastName + ' ' + firstName + ' ' + middleName; //ФИО
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2 - ФИО заглавными буквами
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        //Задание 3 - ФИО без буквы ё
        fullName = lastName + ' ' + firstName + ' ' + middleName;
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);

        //Задание 4 - разделяем ФИО

        firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        middleName = fullName.substring(fullName.lastIndexOf(' ') + 1, fullName.length());
        lastName = fullName.substring(0, fullName.indexOf(' '));

        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Фамилия: " + lastName);

    }
}