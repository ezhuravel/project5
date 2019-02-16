public class CollegeApplication {
    ApplicationState noApplicationState;
    ApplicationState submittedState;
    ApplicationState acceptedState;
    ApplicationState rejectedState;
    ApplicationState enrolledState;

    ApplicationState currentState;

    public CollegeApplication(){
        noApplicationState = new NoApplicationState(this);
        submittedState = new SubmittedState(this);
        acceptedState = new AcceptedState(this);
        rejectedState = new RejectedState(this);
        enrolledState = new EnrolledState(this);

        currentState = noApplicationState;
    }

    public void setState(ApplicationState state){
        currentState = state;
    }

    public void submitApplication(){
        currentState.submitApplication();
    }

    public void rejectApplication(){
        currentState.rejectApplication();
    }

    public void acceptApplication(){
        currentState.acceptApplication();
    }

    public void enrollStudent(){
        currentState.enrollStudent();
    }

    // Getters
    public ApplicationState getNoApplicationState(){
        return noApplicationState;
    }

    public ApplicationState getSubmittedState(){
        return submittedState;
    }

    public ApplicationState getAcceptedState(){
        return acceptedState;
    }

    public ApplicationState getRejectedState(){
        return rejectedState;
    }

    public ApplicationState getEnrolledState (){
        return enrolledState;
    }
}
