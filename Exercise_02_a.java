package Chapter_16_a_01;
import java.util.*;
import java.util.NoSuchElementException;


/*Write a method called max that returns the maximum value in a list of integers. If the list is empty, it should throw a
        NoSuchElementException.
*/
public class Exercise_02_a
{
    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(7);
        list1.add(9);


        max(list1);
        max(list2);
    }
    public static void max (LinkedIntList list)
    {
        int max = 0;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);

            }
        }
        if (list.size() == 0) {
            throw new NoSuchElementException();
        }
        System.out.println(max);

    }

}