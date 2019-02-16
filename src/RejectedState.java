public class RejectedState implements ApplicationState {
    CollegeApplication application;

    public RejectedState(CollegeApplication app){
        application = app;
    }

    @Override
    public void submitApplication(){
        System.out.println("Resubmitting application!");
        application.setState(application.getSubmittedState());
    }

    @Override
    public void acceptApplication(){
        System.out.println("You have been rejected! Try resubmitting!");
    }

    @Override
    public void rejectApplication(){
        System.out.println("You have already been rejected! Try resubmitting!");
    }

    @Override
    public  void enrollStudent(){
        System.out.println("You have been rejected! Try resubmitting!");
    }
}
