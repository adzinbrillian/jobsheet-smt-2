package WEEK2;

public class Dragon {
    int width, height, x, y;
    public Dragon(int w, int h) {
        width = w;
        height = h;
        x = w/2;
        y = h/2;

    }
    void printPosition(){
        System.out.printf("%d, %d",x,y);
        System.out.println();
    }
    void moveLeft(){
        if(x>0)
            x--;
        printPosition();
        deleteColission();

    }
    void moveright(){
        if(x<width)
             x++;
        printPosition();
        deleteColission();

    }
    void moveup(){
        if(y>0)
            y--;
        printPosition();
        deleteColission();
    }
    void movedown(){
        if(y<height)
            y++;
        printPosition();
        deleteColission();

    }void deleteColission(){
        if(x<=0 ||y<=0 || x>=width || y>=height)
            System.out.println("Game Over!");

    }
    public static void main(String[] args) {
        Dragon p = new Dragon(50, 100);
        for(int i=0;i<=50;i++){
            p.movedown();
        }
    }
}
