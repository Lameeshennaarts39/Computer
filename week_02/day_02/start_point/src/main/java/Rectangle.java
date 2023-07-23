public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int calculatedArea(){
        return this.length * this.width;
    }

    public boolean isSquare(){
        if (length == width){
            return true;
        } else {
            return false;
        }
    }

}
