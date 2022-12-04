public class Studend  extends CollegePerson implements LearningPerson{

    private int academicYear;

    public Studend (String name, String surname, int collegeId, int academicYear){
        this.name = name;
        this.surname = surname;
        this.academicYear = academicYear;
        this.collegeId = collegeId;
    }


    @Override
    public void studyAtHome() {
        System.out.println("I'm studing at home");
    }

}
