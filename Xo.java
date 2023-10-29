package XOGame;

import java.util.*;
import javax.xml.transform.Source;

public class Xo
{
    static boolean ArrayCheck(int[] numArr)
    {
        int count=0;
        for(int i=0;i<8;i++)
        {
            for(int j=i+1;j<8;j++)
            {
                if((numArr[i]==numArr[j]) && (numArr[i]!=0 && numArr[j]!=0))
                {
                    count++;
                }
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static boolean Check1(char[] arr,int count,String Name)
    {
        int c=0;
        int array[] = new int[]{0,1,2,3,4,5,6,7,8,0,3, 6, 1, 4, 7, 2, 5, 8, 0, 4, 8, 2, 4, 6};                            
        for(int i=0;i<=21;i=i+3)
        {
            c=0;
            for(int j=i;j<i+3;j++)
            {
                if(arr[array[j]]=='X') 
                {
                    c++;
                }
            }
            if(c==3)
            {
                break;
            }
        }
        if(c==3)
            {
            System.out.println();
            System.out.println("-------------------");
            System.out.println(Name+" Win the Game");
            System.out.println("-------------------");
            return true;
            }
            else
            {
            return false;
            }
    }
    static boolean Check2(char[] arr,int count,String Name)
    {
        int c=0;
        int array[] = new int[]{0,1,2,3,4,5,6,7,8,0,3, 6, 1, 4, 7, 2, 5, 8, 0, 4, 8, 2, 4, 6};
        for(int i=0;i<=21;i=i+3)
        {
            c=0;
            for(int j=i;j<i+3;j++)
            {
                if(arr[array[j]]=='O') 
                {
                    c++;
                }
            }
            if(c==3)
            {
                break;
            }
        }
        if(c==3)
            {
            System.out.println();
            System.out.println("-------------------");
            System.out.println(Name+" Win the Game");
            System.out.println("-------------------");
            return true;
            }
            else
            {
            return false;
            }
    }
    static void Star(char[] arr)
    {
        int a=0;
        System.out.println("-----------");
        for(int i=1;i<12;i++)
        {
            for(int j=1;j<12;j++)
            {
            if(i==4 || i==8 || j==4 || j==8 || j==12)
            {
                System.out.print("*");
            }
            else
            {
                if(((i==2)&&(j==2||j==6||j==10))||((i==6)&&(j==2||j==6||j==10))||((i==10)&&(j==2||j==6||j==10)))
                {
                    System.out.print(arr[a]);
                    a++;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            }
            System.out.println();
        }
        System.out.println("-----------");
    }
    public static void main(String[] args) 
    {
        char[] arr=new char[]{' ',' ',' ',' ',' ',' ',' ',' ',' '};
        int[] numArr=new int[]{0,0,0,0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        int nine=9;
        int index=0;
        System.out.println("Enetr the Player 1 Name : ");
        String Name1 = sc.nextLine();
        System.out.println("Enter the Player 2 Name : ");
        String Name2 = sc.nextLine();
        Star(arr);
        int count = 1;
        boolean a = false;
        boolean aa=false;
        for(int i=0;i<nine;i++)
        {
            if(count%2!=0)
            {
                System.out.println(Name1+" try : ");
                int num=sc.nextInt();
                numArr[index]=num;
                index++;
                boolean pk=ArrayCheck(numArr);
                if(pk)
                {
                    System.out.println("-------------------");
                    System.out.println("Use Diffrent number...!");
                    System.out.println("-------------------");
                    nine++;
                    index--;
                }
                else
                {
                count++;
                arr[num-1]='X';
                Star(arr);
                aa=Check1(arr,count,Name1);
                }
            }
            else
            {
                System.out.println(Name2+" try : ");
                int num=sc.nextInt();
                numArr[index]=num;
                index++;
                Boolean pk=ArrayCheck(numArr);
                if(pk)
                {
                    System.out.println("-------------------");
                    System.out.println("Use Diffrent number...!");
                    System.out.println("-------------------");
                    nine++;
                    index--;
                }
                else
                {
                    count++;
                    arr[num-1]='O';
                    Star(arr);
                    a= Check2(arr,count,Name2);
                }
            }
            if(a || aa)
            {
                break;
            }
        }
        if(a==false && aa==false)
        {
            System.out.println("\n");
            System.out.println("-----Draw the Macth-----");
        }
        sc.close();
    }
}
