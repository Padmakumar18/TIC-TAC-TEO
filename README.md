
import java.util.*;
import javax.xml.transform.Source;
These lines import the necessary Java libraries. `java.util.*` is imported for general utility classes, and `javax.xml.transform.Source` is imported, but it doesn't seem to be used in the code.

public class Xo
{
This line defines the start of the `Xo` class. The program logic is contained within this class.

    static boolean ArrayCheck(int[] numArr)
    {
Here, a static method `ArrayCheck` is defined, which takes an integer array `numArr` as an argument. 
The method checks if there are any duplicate non-zero values in the array and returns a boolean indicating whether there are duplicates.

        int count = 0;
This initializes a variable `count` to zero.

        for (int i = 0; i < 8; i++)
        {
            for (int j = i + 1; j < 8; j++)
            {
These nested loops iterate over the elements of `numArr` to compare each element with the others.

   if ((numArr[i] == numArr[j]) && (numArr[i] != 0 && numArr[j] != 0))
                {
                    count++;
                }
            }
        }
This condition checks if two elements in the array are equal (not equal to zero) and increments the `count` variable if they are.


        if (count > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
This block returns `true` if `count` is greater than zero, indicating that there are duplicate non-zero values in the array. Otherwise, it returns `false`.


    static boolean Check1(char[] arr, int count, String Name)
    {
Here, another static method `Check1` is defined, which takes a character array `arr`, an integer `count`, and a string `Name` as arguments. This method checks for a win condition for player 1 (X) in the Tic-Tac-Toe game and returns a boolean indicating the result.

        int c = 0;
        int array[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 3, 6, 1, 4, 7, 2, 5, 8, 0, 4, 8, 2, 4, 6};
These lines initialize the variables `c` and `array`. `c` is used to count the number of X's in a winning combination, and `array` defines the winning combinations in the Tic-Tac-Toe game.


        for (int i = 0; i <= 21; i = i + 3)
        {
This loop iterates through the `array` to check each winning combination.


            c = 0;
            for (int j = i; j < i + 3; j++)
            {
This nested loop checks each element of the current winning combination.

                if (arr[array[j]] == 'X')
                {
                    c++;
                }
            }
This condition checks if the element of the character array `arr` at the index specified by `array[j]` is 'X' and increments the `c` variable if true.

            if (c == 3)
            {
                break;
            }
          }
If `c` reaches 3, it means that player 1 (X) has a winning combination, and the loop is exited.

        if (c == 3)
        {
            System.out.println();
            System.out.println("-------------------");
            System.out.println(Name + " Win the Game");
            System.out.println("-------------------");
            return true;
        }
        else
        {
            return false;
        }
    }
If `c` is 3, it means that player 1 (X) has won, and a message is printed to announce the winner.
The method returns `true` to indicate the win; otherwise, it returns `false`.

The code continues with similar methods and logic to check for player 2 (O) wins and to display the Tic-Tac-Toe game board. 
The `main` method initiates the game and handles player input and turns, while checking for wins or a draw.
