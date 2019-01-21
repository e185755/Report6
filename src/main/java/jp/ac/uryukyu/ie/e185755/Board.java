package jp.ac.uryukyu.ie.e185755;

public class Board {
    //ボードを作る

    String[][] line = new String[8][8];

    public void board(){
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                line[i][j] = " E";
            }
        }

        line[3][3] = " B";
        line[3][4] = " W";
        line[4][3] = " W";
        line[4][4] = " B";

        System.out.println("  1 2 3 4 5 6 7 8"); // X軸

        for(int i=0; i<line.length; i++){

            System.out.print(i+1); //Y軸

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

    public void change(){
        //駒を動かす

        
    }

}