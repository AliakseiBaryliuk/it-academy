package by.itacademy.brest.class11.cw;

class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }
    // вложенный класс для представления образования
    public class Education {
        private String degree;
        private String school;

        public Education(String degree, String school) {
            this.degree = degree;
            this.school = school;
        }

        public void displayEducation() {
            System.out.println("Degree: " + degree + ", School: " + school);
        }
    }

    // Статический внутренний класс для представления работы
    public static class Career {
        private String jobTitle;
        private int yearsOfExperience;

        public Career(String jobTitle, int yearsOfExperience) {
            this.jobTitle = jobTitle;
            this.yearsOfExperience = yearsOfExperience;
        }

        public void displayCareerInfo() {
            System.out.println("Job Title: " + jobTitle + ", Experience: " + yearsOfExperience + " years");
        }
    }

    public void setAccount(String password) {

        class Account {

            void display() {
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account = new Account();
        account.display();
    }
}
