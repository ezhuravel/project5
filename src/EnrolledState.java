public class EnrolledState implements  ApplicationState{
    CollegeApplication application;

    public EnrolledState(CollegeApplication app){
        application = app;
    }

    @Override
    public void submitApplication(){
        System.out.println("You are enrolled");
    }

    @Override
    public void acceptApplication(){
        System.out.println("You are enrolled");
    }

    @Override
    public void rejectApplication(){
        System.out.println("You got kicked out!");
        application.setState(application.getRejectedState());
    }

    @Override
    public  void enrollStudent(){
        System.out.println("You are enrolled");
    }
}
