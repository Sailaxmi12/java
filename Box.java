class giftbox{
    int width;
    int height;
    int depth;
    void volume(){
        int a=depth*width*height;
        System.out.println("volume of box"+a);
    }
}
public class Box {
    public static void main(String args[])
    
    {
        Box multipleBoxes;
    Box gift=new Box();
    gift.height=10;
    gift.width=20;
    gift.depth=30;
    gift.volume();

}
    
}
