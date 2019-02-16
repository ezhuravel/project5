public class NoApplicationState implements ApplicationState {
    CollegeApplication application;

    public NoApplicationState(CollegeApplication app){
        application = app;
    }

    @Override
    public void submitApplication() {
        System.out.println("Application received!");
        application.setState(application.getSubmittedState());
    }

    @Override
    public void acceptApplication() {
        System.out.println("No application received!");
    }

    @Override
    public void rejectApplication() {
        System.out.println("No application received!");
    }

    @Override
    public void enrollStudent() {
        System.out.println("No application received!");
    }
}
