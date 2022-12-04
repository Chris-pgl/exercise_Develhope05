public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("I'm studing ");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching");

    }




}
