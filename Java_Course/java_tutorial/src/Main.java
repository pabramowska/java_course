
public class Main {

    public static void main(String[] args){

        int highSchoolPosition = calculateHighSchoolPosition(400);
        displayHighScorePosition("Tim", highSchoolPosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition);
    }
    public static int calculateHighSchoolPosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if(playerScore>=500){
            return 2;
        }else if(playerScore>=100){
            return 3;
        }else {
            return 4;
        }
    }

}