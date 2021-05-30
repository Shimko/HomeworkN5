package Person;

public class Сотрудник {
    public String ФИО;
    public String Должность;
    public String телефон;
    public String email;
    public long зарплата;
    public int возраст;

    public Сотрудник(String ФИО, String Должность, String телефон, String email, long зарплата, int возраст) {
        this.ФИО = ФИО;
        this.Должность = Должность;
        this.телефон = телефон;
        this.email = email;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public void infoPerson() {
        System.out.printf(" ФИО =%s, Должность =%s, телефон =%s,email=%s, зарплата=%d,возраст =%d", ФИО, Должность, телефон, email, зарплата, возраст);
    }
}
