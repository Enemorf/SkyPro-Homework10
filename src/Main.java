public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String space = " ";
        String fullName = lastName+space+firstName+space+middleName;

        task1(fullName);
        task2(fullName);

        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName+space+firstName+space+middleName;

        task3(fullName);
    }

    static void task1(String fullName)
    {
        System.out.println("Задание 1");
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("---\n");
    }

    static void task2(String fullName)
    {
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("---\n");
    }

    static void task3(String fullName)
    {
        System.out.println("Задание 3");
        System.out.println("Данные ФИО сотрудника — "+ fullName.replace("ё","е"));
        System.out.println("---\n");
    }
}