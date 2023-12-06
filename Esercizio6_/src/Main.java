//A partire dal programma creato precedentemente in cui si richiedeva il calcolo
// dell'area aggiungere una ulteriore classe chiamata Triangolo supportando poi
// il calcolo dell'area per quest'ultima figura

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo=new Rettangolo(20,25);
        rettangolo.calcolaArea();
        Triangolo triangolo= new Triangolo(3,5);
        triangolo.calcolaArea();
    }
}