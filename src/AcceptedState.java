public class AcceptedState implements ApplicationState {
    CollegeApplication application;

    public AcceptedState(CollegeApplication app){
        application = app;
    }

    @Override
    public void submitApplication(){
        System.out.println("Application has already been accepted");
    }

    @Override
    public void acceptApplication(){
        System.out.println("Application has already been accepted");
    }

    @Override
    public void rejectApplication(){
        System.out.println("Application has already been accepted, but you ruined it!");
        application.setState(application.getRejectedState());
    }

    @Override
    public  void enrollStudent(){
        System.out.println("Welcome to College!");
        application.setState(application.getEnrolledState());
    }
}
