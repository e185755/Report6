package jp.ac.uryukyu.ie.e185755;
import java.util.Arrays;

public class Board {

    //ボードを作る
    String[][] line = new String[8][8];
    //line[0] = new String[]

    public void board(){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                line[i][j] = "e ";
            }
        }
        for(int i=0; i<line.length; i++){
            for(int j=0; j<line[i].length; j++){
                if  (j == 7){
                    System.out.println(line[i][j]);
                }
                else {
                    System.out.print(line[i][j]);
                }
            }
        }

    }
}