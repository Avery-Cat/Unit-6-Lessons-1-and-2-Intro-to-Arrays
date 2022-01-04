import java.util.*;
class Main {
  public static void main(String[] args) {
    int [] nums = new int [6];
    nums[0] = 5;
    nums[1] = 10;
    nums[2] = 15;
    nums[3] = 20;
    nums[4] = 25;
    nums[5] = 30;

    //never put equals in the for loop! Will cause exception!
    for(int i = 0; i < nums.length; i++){
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    //backwards
    for(int i = nums.length - 1; i >= 0; i--){
      System.out.println("nums[" + i + "] = " + nums[i]);
    }
    //use array elements in a calculation
    int sum = nums[0] + nums[1];
    System.out.println("sum = " + sum);

    nums[5] = nums[5]*2;
    System.out.println("nums[5] = " + nums[5]);

    for(int i = 0; i < nums.length; i++){
      nums[i] = nums[i]/5;
      System.out.println("nums[" + i + "] = " + nums[i]);
    }

    //initializer list
    int[] nums2 = {5, 10, 15, 20, 25, 30};
    for(int i = 0; i < nums2.length; i++){
      System.out.println("nums2[" + i + "] = " + nums2[i]);
    }

    /*String [] candy = new String [5];
    Scanner it = new Scanner(System.in);
    int index = 0;

    while(index < candy.length){
      System.out.println("Enter a candy: ");
      candy [index] = it.nextLine();
      System.out.println("candy[" + index + "] = " + candy[index]);
      index++;
    }*/

    //Lesson 2 searching
    //when looking for something, iterate
    int look = 12;
    int indexWhere = -1;
    for(int index = 0; index<nums.length; index++){
      if(nums[index] == look){
        indexWhere = index;
        break; //forces you to exit the loop
      }
    }
    if(indexWhere != -1){
      System.out.println("Look has been found at " + indexWhere);
    }else{
      System.out.println("Look has not been found.");
    }

    //searching for a String
    /*String [] words = {"have","a","nice","day"};*/
    String words[] = {"have","a","nice","day"}; //not wrong
    int indexWhere2 = -1;
    for(int index = 0; index<words.length; index++){
      if(words[index].equals("nice")){
        indexWhere2 = index;
        break; //forces you to exit the loop
      }
    }
    if(indexWhere2 != -1){
      System.out.println("word has been found at " + indexWhere2);
    }else{
      System.out.println("word has not been found.");
    }

    //count values in an array
    int evens = 0;
    int odds = 0;
    for(int index = 0; index<nums.length; index++){
      if((nums[index] %2) == 0){
        evens++;
      }else{
        odds++;
      }
    }
    System.out.println("Evens = "+evens+" Odds = "+odds);

    //set flag if word has more than 4 letters
    boolean flag = false;
    for(int index = 0; index<words.length; index++){
      //  String    how many char
      if(words[index].length() >= 4){
        flag = true;
        break;
      }
    }
    System.out.println("Were there any words with more than 4 letters? " + flag);

    String [] words2 = {"apple", "banana", "peach", "cherries", "blueberries"};
    for(int i = 0; i<words2.length; i++){
      String first = words2[i].substring(0,1);
      String last = words2[i].substring(words2[i].length() - 1);
      System.out.println("Index Value " + i + ": " + words2[i] + " " + first + " " + last);
    }
  }
}