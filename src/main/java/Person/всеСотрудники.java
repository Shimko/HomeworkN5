package Person;

public class всеСотрудники {
    public static void main(String[] args) {
        checkPerson();
    }
    public static void checkPerson() {
        Сотрудник[] persArray = new Сотрудник[5];
        persArray[0] = new Сотрудник("Иванов Евгений","педиатр", "890435667564", "Ivanov@mail.ru",47563, 43);
        persArray[1] = new Сотрудник("Кузнецов Виктор","хирург", "893755667674", "Kuzneczov@mail.ru",34563, 28);
        persArray[2] = new Сотрудник("Бочкарев Петр","терапевт", "892555667004", "Bochkarev@mail.ru",41563, 35);
        persArray[3] = new Сотрудник("Сидоров Александр","рентгенолог", "893755667000", "Sidorov@mail.ru",56563, 54);
        persArray[4] = new Сотрудник("Орлов Степан","Кардиолог", "893723667854", "Orlov@mail.ru",48563, 61);
        for (int i = 0; i < persArray.length; i++){
            if(persArray[i].возраст >= 40){
                persArray[i].infoPerson();
                System.out.println();
            }
        }
    }
}
