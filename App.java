import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    int choice;
    System.out.println("GET TO EPICODUS BY 8AM!!");
    System.out.println("A game of ruthlessness, cunning, and wit....");
    System.out.println("Make a series of decisions that will determine whether you get to class on-time or get the dreaded TARDY on your record.");
    System.out.println("--------");

    System.out.println("What is your name?");
    String name = myConsole.readLine();
    DecisionTree myDecisions = new DecisionTree(name);

    //Decision 1: Snooze
    System.out.println("Good morning, " + name + " you wake up to the sound of your alarm going off. It's early and you sure did work hard yesterday at coding. Maybe you deserve a little more rest. Press 1 to hit snooze on your alarm. Press 2 to get up and brave the world.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickSnooze(choice);

    //Decision 2: Shower
    System.out.println("You smell yourself and you don't like it. For the sake of your partner you should take a shower. Press 1 to take a shower. Press 2 to make your partner suffer.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickShower(choice);

    //Decision 3: Coffee
    System.out.println("You sure are tired today and that new French Press you bought makes such delicious coffee. It would really set your day off right if you brewed a cup and make you more alert during class. Press 1 to brew a cup of fair-trade, organic coffee. Press 2 to maintain your status as a sleepy zombie.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickCoffee(choice);

    //Decision 4: Neighbor
    System.out.println("You have met a neighbor with a big dog. She wants to chat about stupid stuff like the weather. Press 1 to endure her pointless chitchat. Press 2 to fake a kidney stone and run away.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickNeighbor(choice);

    //Decision 5: The Old Man with a Cane
    System.out.println("You are rushing to get to the bus stop, but there's an old man with a cane in front of you who really needs help crossing the street. I mean he's really OLD. Press 1 to help Old Chester across the street in a most slow and painful manner as he tells how your generation will never amount to anything. Or Press 2 to shove Old Chester to the ground and barely make your bus on time.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickOldMan(choice);

    //Decision 6: On the Bus
    System.out.println("You are on a bus. Press 1 to to enjoy your time reading news on your phone. Press 2 to star up in the window in daydream.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickBusActivity(choice);

    //Decision 7: Bagel
    System.out.println("You're almost to Epicodus, but your stomach is gurgling like crazy - you're starving! There's no way you can focus for 4 hours without food. You smell a delicious bagel place right next door. Press 1 to stop in and grab a quick bite with a freshly made bagel. Press 2 to suffer starvation in class.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickBagel(choice);

  }

  public static void checkValidChoice(int choice) {
    Console myConsole = System.console();

    while (choice != 1 && choice != 2) {
      System.out.println("Please select a valid choice.");
      choice = Integer.parseInt(myConsole.readLine());
    }
    return choice;
  }
}
