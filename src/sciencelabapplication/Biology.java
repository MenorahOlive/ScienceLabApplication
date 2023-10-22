package sciencelabapplication;

public class Biology extends ScienceLabApplication {

    int levelOfStudy;

    public Biology(int subjectCode, String subjectName, int lvOfStudy) {
        super(subjectCode, subjectName);
        levelOfStudy = lvOfStudy;
    }
    //method overriding

    @Override
    public void apparatusFinder() {
        System.out.println("****************************************************");
        System.out.println("Welcome to apparatus finder!");
        System.out.println("APPARATUS FINDER is developed to help you access apparatus as per the experiment name.");
        System.out.println("We conduct the following experiments:");
        System.out.println("1. Does light affect photosynthesis?");
        System.out.println("2. Are Fingerprints inherited?");
        System.out.println("Which of these experiments would you like to carry out? (select 1 or 2)");

        int choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("****************************************************");
                System.out.println("DOES LIGHT AFFECT PHOTOSYNTHESIS?");
                System.out.println("Apparatus required:");
                System.out.println("1. Black polythene bag");
                System.out.println("2. Clear Polythene bag");
                System.out.println("3. Rubber Band");
                System.out.println("****************************************************");

            }
            case 2 -> {
                System.out.println("****************************************************");
                System.out.println("ARE FINGERPRINTS INHERITED?");
                System.out.println("Apparatus required:");
                System.out.println("1. Ink Pad");
                System.out.println("2. Tracing paper");
                System.out.println("3. Magnifying Glass ");
                System.out.println("****************************************************");
            }

            default -> {
                System.out.println("****************************************************");
                System.out.println("ERROR! Choose an appropriate choice");
                System.out.println("****************************************************");
            }
        }
        System.out.println("****************************************************");

    }

    //method overriding
    @Override
    public void pastpaperAccess() {
        System.out.println("****************************************************");
        System.out.println("Welcome to apparatus pastpaper access!");
        System.out.println("****************************************************");

    }

}
