package jp.ac.uryukyu.ie.e185755;

public class APiece {
    Input input = new Input();

    private String color; //駒の色　黒＝B　白＝W　何もない場合＝E
    private int x, y; //座標

    public APiece(int x, int y) {
        this.color = "E";
        this.x = x;
        this.y = y;
    }


    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public int getX() {
        return this.x;
    }
    public void setX(int x){
        this.x = input.getInt();
    }


    public int getY() {
        return this.y;
    }
    public void setY(int y){
        this.y = input.getInt();
    }

}