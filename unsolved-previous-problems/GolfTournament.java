import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Haya on 16/03/2018.
 */
public class GolfTournament {
    private static Scanner in = new Scanner(System.in);
    public static void main (String[] args){
        int n = Integer.parseInt(in.nextLine());
        Golfer[] golfers = new Golfer[n];
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            String[] scores = in.nextLine().split(" ");
            int total = 0;
            for(int j = 0; j < scores.length; j++) {
                total += Integer.parseInt(scores[j]);
            }
            golfers[i] = new Golfer(name, total);
        }
        Arrays.sort(golfers);
        for(int i = 0; i < 5; i++) {
            System.out.println(golfers[i].toString());
        }
    }
}

class Golfer implements Comparable<Golfer> {
    private String name;
    private int score;
    Golfer(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public int compareTo(Golfer golfer) {
        if (score == golfer.score)
            return name.compareTo(golfer.name);
        return Integer.compare(score, golfer.score);
    }
    @Override
    public String toString() {
        return name + " " + score;
    }
}
