public class Main {
    public static void main(String[] args) {

//task 1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = "Ф.И.О. сотрудника- ";
        fullName += middleName + " " + firstName + " " + lastName + ".";

        System.out.println(fullName);

        System.out.println();

//task 2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта- " + fullName.toUpperCase());

        System.out.println();

//task 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace('ё' , 'е');
        System.out.println("Данные Ф.И.О. сотрудника- " + fullName2);

    }
    }
