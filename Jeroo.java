/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
 public void setup(){
  hop();
  turn(RIGHT);
  hop();
  turn(LEFT);
}
  
public void planthop2 (){
  plant();
  hop();
  hop();
}

public void spindownright(){
  turn(RIGHT);
  hop();
  turn(RIGHT);
}

public void spindownleft(){
  turn(LEFT);
  hop();
  turn(LEFT);
}

public void planthop2xthree (){
  planthop2();
  planthop2();
  planthop2();
}

public void planthop2xtwo (){
  planthop2();
  planthop2();
}

public void setupBowling(){
  setup();
  planthop2xthree();
  plant();
  spindownright();
  hop();
  planthop2xtwo();
  plant();
  spindownleft();
  hop();
  planthop2();
  plant();
  spindownright();
  hop();
  plant();
}
    


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}
