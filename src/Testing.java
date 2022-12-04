public class Testing {

    public static void main(String[] args) {

        Studend student1 = new Studend("Gino","Rossi",8965,2);

        Professor professor1 = new Professor("Carlo", "Franchini",9976,"C++");

        Assistant assistant1 = new Assistant("Gastani", "Frinzi",9887,true);

        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();

        student1.studyAtHome();
        professor1.teachToOtherPeople();
        assistant1.studyAtHome();
        assistant1.teachToOtherPeople();




    }
}
