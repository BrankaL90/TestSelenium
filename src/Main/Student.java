package Main;

public class Student {


        public String ime;
        public String prezime;
        public int godine;


    public Student(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;

    }

    public Student(String prezime, int godine) {
        this.prezime = prezime;
        this.godine = godine;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                '}';
    }
}

