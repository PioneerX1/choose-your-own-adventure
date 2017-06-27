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
    if(choice == 1) {
      System.out.println("It sure was nice to sleep in, but now you'll have to make up some time and hussle!");
    } else {
      System.out.println("Boy are you tired, maybe you should get some coffee this morning.");
    }

    //Decision 2: Shower
    System.out.println("You smell yourself and you don't like it. For the sake of your partner you should take a shower. Press 1 to take a shower. Press 2 to make your partner suffer.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickShower(choice);
    if(choice == 1) {
      System.out.println("That's much better, now you're all clean and more awake even!");
    } else {
      System.out.println("Well, looks like you have sacrificed personal hygiene - all to be on-time for class.");
    }


    //Decision 3: Coffee
    System.out.println("You sure are tired today and that new French Press you bought makes such delicious coffee. It would really set your day off right if you brewed a cup and make you more alert during class. Press 1 to brew a cup of fair-trade, organic coffee. Press 2 to maintain your status as a sleepy zombie.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickCoffee(choice);
    if(choice == 1) {
      System.out.println("The coffee was good and now you are more alert for coding. But time is ticking.");
    } else {
      System.out.println("It's going to be a long day without coffee. Maybe you'll stop at the bagel place next to Epicodus.");
    }


    //Decision 4: Neighbor
    System.out.println("You have met a neighbor with a big dog. She wants to chat about stupid stuff like the weather. Press 1 to endure her pointless chitchat. Press 2 to fake a kidney stone and run away.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickNeighbor(choice);
    if(choice == 1) {
      System.out.println("Wow! You never knew weather could be sooo fascinating, and it sure was great to hear about all the pointless details in your neighbor's life, including her new garden that she just planted. Ooops, better get going!");
    } else {
      System.out.println("You feel kind of bad, but you are on a one-man/woman mission to get the school ON-TIME!");
    }


    //Decision 5: The Old Man with a Cane
    System.out.println("You are rushing to get to the bus stop, but there's an old man with a cane in front of you who really needs help crossing the street. I mean he's really OLD. Press 1 to help Old Chester across the street in a most slow and painful manner as he tells how your generation will never amount to anything. Or Press 2 to shove Old Chester to the ground and barely make your bus on time.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickOldMan(choice);
    if(choice == 1) {
      System.out.println("Man! Those stories were BORING! And he didn't even thank you for helping him across the street. What a waste of time!");
    } else {
      System.out.println("There is a special place in Hell for people like you, but your determination will hopefully ensure that you are not late - atleast today");
    }


    //Decision 6: On the Bus
    System.out.println("You are on a bus. Press 1 to to enjoy your time reading news on your phone. Press 2 to star up in the window in daydream.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickBusActivity(choice);
    if(choice == 1) {
      System.out.println("Wow! You can't believe Trump tweatted so many stupid things before 9:00am today. Must be a slow news day again. Oh no! You've missed your stop! You'll have to get off at the next one and jog to make up time.");
    } else {
      System.out.println("Even though you daydreamed, you recognized your stop out the window and got off just in the knick of time. Almost there!");
    }


    //Decision 7: Bagel
    System.out.println("You're almost to Epicodus, but your stomach is gurgling like crazy - you're starving! There's no way you can focus for 4 hours without food. You smell a delicious bagel place right next door. Press 1 to stop in and grab a quick bite with a freshly made bagel. Press 2 to suffer starvation in class.");

    choice = Integer.parseInt(myConsole.readLine());

    if (choice != 1 && choice != 2) {
      choice = checkValidChoice(choice);
    }

    myDecisions.pickBagel(choice);
    if(choice == 1) {
      System.out.println("Oh man, it'smelling so good! But you might forget you are on a diet. And almost late to coding class.");
    } else {
      System.out.println("You will be in class on-time but probably will be suffering from starvation.");
    }

    //Overall Results
    if (myDecisions.mTimeLoss <= 2) {
      System.out.println("Congratulations! You made it to Epicodus by 8:00am. You even got a nice seat right by the window with a view of downtown Seattle. It's gonna be a great day, even if you might be starving or tired!");
    } else if (myDecisions.mTimeLoss > 2 && myDecisions.mTimeLoss < 5) {
      System.out.println("You're a little late, but just in time to avoid being tardy before 8:15am. Unfortunately, you got stuck with a really rude partner who is complaining the whole time. It's gonna be a loooooong day.");
    } else {
      System.out.println("Well done - you are wayyy late. It's like 8:30am. Elysia has been looking for you to discuss your last week's project and overall competence in the class. Oh well, atleast you took the time to enjoy the finer things in life.");
    }


  }

  public static int checkValidChoice(int choice) {
    Console myConsole = System.console();

    while (choice != 1 && choice != 2) {
      System.out.println("Please select a valid choice.");
      choice = Integer.parseInt(myConsole.readLine());
    }
    return choice;
  }
}
