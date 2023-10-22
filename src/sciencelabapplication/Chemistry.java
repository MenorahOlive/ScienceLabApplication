package sciencelabapplication;

public class Chemistry extends ScienceLabApplication {

    int yearOfStudy;

    public Chemistry(int subjectCode, String subjectName, int yrOfStudy) {
        super(subjectCode, subjectName);
        yearOfStudy = yrOfStudy;
    }
    //method overriding

    @Override
    public void apparatusFinder() {
        System.out.println("****************************************************");
        System.out.println("Welcome to apparatus finder!");
        System.out.println("APPARATUS FINDER is developed to help you access apparatus as per the experiment name.");
        System.out.println("We conduct the following experiments:\n");
        System.out.println("1. What makes ice melt faster?");
        System.out.println("2.pH test");
        System.out.println("Which of these experiments would you like to carry out? (select 1 or 2)");
        int select = input.nextInt();
        switch (select) {
            case 1 -> {
                System.out.println("****************************************************");
                System.out.println("WHAT MAKES ICE MELT FASTER?");
                System.out.println("Apparatus required:");
                System.out.println("1. Ice cubes");
                System.out.println("2. Muffin tin, jars or containers");
                System.out.println("3. Salt");
                System.out.println("****************************************************");

            }
            case 2 -> {
                System.out.println("****************************************************");
                System.out.println("pH TEST");
                System.out.println("Apparatus required:");
                System.out.println("1. Blue & Red Litmus paper");
                System.out.println("2. Lemon");
                System.out.println("3. Toothpaste");
                System.out.println("4. Water");
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

    //method 2
    @Override
    public void pastpaperAccess() {
        System.out.println("****************************************************");
        System.out.println("Welcome to apparatus pastpaper access!");
        System.out.println("****************************************************");

    }

}
