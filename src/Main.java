public class Main {

    public static void main(String[] args) {

        // Accepting application
        CollegeApplication cp1 = new CollegeApplication();
        cp1.submitApplication();
        cp1.acceptApplication();
        cp1.enrollStudent();

        System.out.println();

        // Rejecting application
        CollegeApplication cp2 = new CollegeApplication();
        cp2.submitApplication();
        cp2.rejectApplication();
        cp2.enrollStudent();

        System.out.println();

        // Trying out of order
        CollegeApplication cp3 = new CollegeApplication();
        cp3.enrollStudent();
        cp3.acceptApplication();
        cp3.submitApplication();
        cp3.acceptApplication();
        cp3.rejectApplication();

    }
}
