import java.util.Arrays;

public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava puzzle = new PuzzleJava();
        // System.out.println(Arrays.toString(puzzle.GetTenRolls()));
        // System.out.println(puzzle.GetRandomLetter());
        // System.out.println(puzzle.GeneratePassword());
        System.out.println(puzzle.GetNewPasswordSet(10));

    }
}