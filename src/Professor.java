public class Professor extends CollegePerson implements TeachingPerson{

    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching at school");
    }

}
