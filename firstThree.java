import java.util.Arrays;
import java.util.Scanner;


public class firstThree {
    
    //完成 main 方法
    public static void main(String[] args) {

        firstThree firstObj = new firstThree();
        int[] scores = firstObj.inputScores(10);

        int[] sortedScore = firstObj.getFristThress(scores);
        firstObj.printFirstThreee(sortedScore);

        
        
        
        
    }
    
    //定义方法完成成绩排序并输出前三名的功能

    public void printFirstThreee(int[] scores){
        System.out.println("Scores are: ");
        for(int i=scores.length;i>((scores.length)-3);i--){
            System.out.println(scores[i-1]);
        }
    }

    public int[] getFristThress(int[] scores){
         Arrays.sort(scores);
         return scores;
        
    }
    
    
    public int[] inputScores(int scoreCount){
        
        int[] scores = new int[scoreCount];

        Scanner inputScore = new Scanner(System.in);

        for(int i=0; i<scoreCount; i++){
            System.out.println("please enter scores");
            scores[i] = inputScore.nextInt();
        }
        inputScore.close();
        return scores;
    }
    
    
    
    
    
    
    
    
    
    
}