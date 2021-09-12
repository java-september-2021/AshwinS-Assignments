import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{
    Random rand = new Random();

    // getTenRolls
    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public int[] GetTenRolls(){
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    // getRandomLetter
    // Write a method that will:
        // Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
        // Generate a random index between 0-25, and use it to pull a random letter out of the array.
        // Return the random letter.
    public String GetRandomLetter(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        return alphabet[rand.nextInt(alphabet.length)];
    }

    // generatePassword
    // Write a method that uses the previous method to create a random string of eight characters, and return that string.
    public String GeneratePassword(){
        String pwd = "";
        for(int i = 0; i<8; i++){
            String RandAlpha = GetRandomLetter();
            pwd += RandAlpha;
        }
        return pwd;
    }

    // getNewPasswordSet
    // Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
    public ArrayList<String> GetNewPasswordSet(int num){
        ArrayList<String> list = new ArrayList<String>();
        
        for(int j = 0; j<8; j++){
            String pwd = "";
            for(int i = 0; i<num; i++){
                String RandAlpha = GetRandomLetter();
                pwd += RandAlpha;
            }
            list.add(pwd);
        }
        return list;
    }
}








