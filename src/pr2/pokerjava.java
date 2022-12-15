package pr2;
import java.util.Random;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class pokerjava
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Random rand = new Random();
        String[] cards =  {"card1", "card2", "card3", "card4", "card5","card6", "card7", "card8", "card9", "card10", "card11", "card12", "card13", "card14", "card15", "card16", "card17","card18","card19","card20", "card21", "card22", "card23", "card24"};
        for (int i = 0; i < cards.length; i++)
            {
                int j = rand.nextInt(1000) % (cards.length);
                String str = cards[i];
                cards[i] = cards[j];
                cards[j] = str;
            }

        int count = 1;
        for (int i = 0; i < cards.length; i++)
        {
            System.out.println("Player number " + count + " got: " + cards[i] + " " + cards[i+1] + " " + cards[i+2] +" " + cards[i+3] + " " + cards[i+4]);
            i+=4;
            count+=1;
            if (count == c+1)
            {
                break;
            }


        }

    }
}
