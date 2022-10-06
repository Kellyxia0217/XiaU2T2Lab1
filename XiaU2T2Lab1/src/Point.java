public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;


    }

    public Point (int num){
        x=num;
        y=num;
    }

    public Point() {
        x=0;
        y=0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newx) {
        x = newx;
    }

    public void setY(int Newy) {
        y = Newy;
    }

    public String coordinate() {
        return "("+ x + " , " + y + ")";
    }

    public String quadrant(){
        String Quadrant;
        if (x>0 && y>0) {
            Quadrant = "I";

        }else if (x<0 && y>0){
            Quadrant = "II";
        }else if (x>0 && y<0){
            Quadrant = "III";
        }else if (x<0 && y<0){
            Quadrant = "IV";
        } else {
            Quadrant = "on line";
        }
        return Quadrant;
    }


}
