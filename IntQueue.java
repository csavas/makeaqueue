//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

//ArrayList of ints
//or
//array of ints
import java.io.*; 
import java.util.*;
import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
 private int[] rayOfInts;
 private int numInts;
 
 public IntQueue()
 {
   numInts = 0;
   rayOfInts = new int[numInts];   
 }

 public void add(int item)
 { //add to back
   int[] temp = new int[numInts+1];
   for(int i = 0; i <= numInts; i++){
     if(i == numInts){
       temp[i] = item;
     }
     else
       temp[i] = rayOfInts[i];
   }
     numInts++;
     rayOfInts = new int[numInts];
     rayOfInts = temp;
 }

 public int remove()
 { //take off first int
  int[] temp = new int[numInts-1];
  int x = rayOfInts[0];
  numInts--;
  temp = Arrays.copyOfRange(rayOfInts, 1, rayOfInts.length);
     rayOfInts = new int[numInts];
     rayOfInts = temp.clone();
  return x;
 }

 public boolean isEmpty()
 {
   if(numInts == 0)
     return true;
  return false;
 }

 public int peek()
 {
  return rayOfInts[0];
 }

 public String toString()
 {
  return Arrays.toString(rayOfInts);
 }
}