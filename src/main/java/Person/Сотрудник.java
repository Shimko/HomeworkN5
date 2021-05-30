package Person;

public class Сотрудник {
    private String ФИО;
    private String Должность;
    private String телефон;
    private String email;
    private long зарплата;
    public int возраст;
    Сотрудник(String ФИО, String Должность, String телефон, String email, long зарплата, int возраст) {
        this.ФИО = ФИО;
        this.Должность = Должность;
        this.телефон = телефон;
        this.email = email;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }
    public void setФИО(String ФИО) {
        this.ФИО = ФИО;
    }
    public void setДолжность(String должность) {
        Должность = должность;
    }
    public void setТелефон(String телефон) {
        this.телефон = телефон;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setЗарплата(long зарплата) {
        this.зарплата = зарплата;
    }
    public void infoPerson() {
        System.out.printf(" ФИО =%s, Должность =%s, телефон =%s,email=%s, зарплата=%d,возраст =%d", ФИО, Должность, телефон, email, зарплата, возраст);
    }
}
