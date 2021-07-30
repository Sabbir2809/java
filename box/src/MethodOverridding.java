
public class MethodOverridding {

private long l;
private int i; 
public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
class secondclass extends MethodOverridding{
private float f;
private double d;

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
 void displayclass()
 {
 System.out.println(getL());
 System.out.println(getI());
 System.out.println(getF());
 System.out.println(getD());
 
 }
 
}
class thirdclass extends secondclass {
private String c;
private boolean bl;


    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public boolean getBl() {
        return bl;
    }

    public void setBl(boolean bl) {
        this.bl = bl;
    }
@Override
void displayclass()
{
  super.displayclass();
   System.out.println(getC());
   System.out.println(getBl());
   
}
}
class tania extends thirdclass{
private int x , y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

@Override
void displayclass(){
super.displayclass();
System.out.println(x);
System.out.println(y);
 }

 
}
class mainclass{
public static void main(String[] args)
{
tania bkt = new tania();
bkt.setL(234565432);
bkt.setI(67);
bkt.setF(67.98F);
bkt.setD(4.7585858);
bkt.setC( "BK");
bkt.setBl(true);
bkt.setX(12);
bkt.setY(2);
bkt.displayclass();
}
}
 