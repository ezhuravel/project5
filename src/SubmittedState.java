public class SubmittedState implements ApplicationState {
    CollegeApplication application;

    public SubmittedState(CollegeApplication app){
        application = app;
    }

    @Override
    public void submitApplication(){
        System.out.println("Application has already been accepted");
    }

    @Override
    public void acceptApplication(){
        System.out.println("Congratulations! You have been accepted!");
        application.setState(application.getAcceptedState());
    }

    @Override
    public void rejectApplication(){
        System.out.println("Sorry! Try again next semester :(");
        application.setState(application.getRejectedState());
    }

    @Override
    public  void enrollStudent(){
        System.out.println("You have to get accepted first!");
    }
}
