import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    String story;
    String name;
    String name2;
    String adjective1;
    String adjective2;
    String adjective3;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;
    Random rand = new Random();

    //Getters

    public String getStory() {
        return story;
    }

    public String getName() {
        return name;
    }

    public String getName2() {
        return name2;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getAdjective3() {
        return adjective3;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNums() {
        return randomNums;
    }

    //Setters

    public void setStory(String newStory) {
        this.story = newStory;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setName2(String newName2) {
        this.name2 = newName2;
    }

    public void setAdjective1(String newAdj1) {
        this.adjective1 = newAdj1;
    }

    public void setAdjective2(String newAdj2) {
        this.adjective2 = newAdj2;
    }

    public void setAdjective3(String newAdj3) {
        this.adjective3 = newAdj3;
    }

    public void setNoun1(String newNoun1) {
        this.noun1 = newNoun1;
    }

    public void setNoun2(String newNoun2) {
        this.noun2 = newNoun2;
    }

    public void setNoun3(String newNoun3) {
        this.noun3 = newNoun3;
    }

    public void setAdverb(String newAdverb) {
        this.adverb = newAdverb;
    }

    public void setRandomNums() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numHolder = new int[3];
        while (index < numHolder.length) {
            numHolder[index] = num + index;
            index++;
        }
        randomNums = "not " + numHolder[0] + ", not " + numHolder[1] + ", but " + numHolder[2];
    }

    public void displayInstructions() {
        System.out.println("Welcome to the Mad Libs game. If you type in some words, we'll give you a story.\nLet's start with a name, shall we.");
    }

    //Get data from user
    public void enterName() {
        setName(scanner.nextLine());
    }

    public void enterName2() {
        System.out.println("Okay thank you! How about another name?");
        setName2(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun!");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun!");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me just one more noun.");
        setNoun3(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Now let me have an adjective.");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Okay let me have another adjective please.");
        setAdjective2(scanner.nextLine());
    }

    public void enterAdjective3() {
        System.out.println("What I really need is a million bucks...just kidding. I need one more adjective");
        setAdjective3(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Last but not least, give me an adverb.");
        setAdverb(scanner.nextLine());
    }

    public void madLibsStory() {
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if (num == 0) {
            story = getName() + " and another person by the name of " + getName2() + " found a secret passage-way underneath"
                    + " a very " + getAdjective1() + " " + getNoun1() + "." + " They came across " + getRandomNums()
                    + " " + getNoun2() + "'s and thought they were hallucinating" + "." + " The next thing you know,"
                    + " they saw a " + getAdjective2() + " " + getNoun3() + " flying " + getAdverb() + " towards them."
                    + " They said it was the best experience of their lifetime.";
        } else {
            story = getName() + " went on vacation to see a friend " + getName2() + ". They visited a cabin in the woods." + " During the vacation,"
                    + " they went out on a hike on their " + getNoun1() + ". They saw, " + getRandomNums() + " " + getAdjective1()
                    + " " + getNoun2() + "'s and they were so " + getAdjective2() + ". The excitement didn't stop there! "
                    + "Oh no, after they enjoyed some snacks with a pack of " + getAdverb() + " " + getAdjective3() + " " + getNoun3() + "'s.";
        }
        setStory(story);
    }

    public void play() {
        enterName();
        enterName2();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdjective1();
        enterAdjective2();
        enterAdjective3();
        enterAdverb();
        setRandomNums();
        madLibsStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {

        MadLibs game = new MadLibs();
        game.displayInstructions();
        game.play();
    }
}

