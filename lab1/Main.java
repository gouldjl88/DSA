//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Jeff Gould
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] array = {5, 9, 3, 12, 7, 3, 11, 5};
    for(int i = 0; i < array.length; i++)
    {
      System.out.println(array[i]);
    }

    for(int i = array.length - 1; i >= 0; i--)
    {
      System.out.println(array[i]);;
    }

    System.out.println(array[0]);
    System.out.println(array[7]);

    System.out.println("Max: " + lab.max(1, 5));
    System.out.println("Min: " + lab.min(1,5));
    System.out.println("Sum: " + lab.sum(array));
    System.out.println("Avg: " + lab.average(array));
    System.out.println("Max Array: " + lab.max(array));
    System.out.println("Min Array: " + lab.min(array));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b)
  {
    if(a > b)
    {
      return a;
    }
    else return b;
  }

  public int min(int a, int b)
  {
    if(a < b)
    {
      return a;
    }
    else return b;
  }

  public int sum(int[] nums)
  {
    int sum = 0;

    for(int i = 0; i < nums.length; i++)
    {
      sum += nums[i];
    }
      return sum;
  }

  public int average(int[] nums)
  {
    int sum = 0;
    int count = 0;

    for (int j : nums) 
    {
      sum += j;
      count++;
    }
      return sum/count;
  }

  public int max(int[] nums)
  {
    int max = 0;
    for(int i = 0; i < nums.length; i++)
    {
      if (nums[i] > max)
      {
        max = nums[i];
      }
    }
    return max;
  }

  public int min(int[] nums)
  {
    int min = max(nums);
    for(int i = 0; i < nums.length; i++)
    {
      if(nums[i] < min)
      {
        min = nums[i];
      }
    }
    return min;
  }
}