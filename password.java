import java.io.BufferedReader;
import java.io.InputStreamReader;

 class Password extends Thread {
  boolean pa = false,chif = false,wait = false;
  public void run() {
    try {
      sleep( 500 );}
    catch( InterruptedException e ){}
    wait = true;
    while( pa!=true ) {
      if(chif==true){
        //Replace input by *
        System.out.print( "\b*" );
      }try {sleep( 1 );}
      catch( InterruptedException e ) {}}
  }
  public static void main( String[] arguments ) {
    String name = "";
    String password = "";
    Password hideThread = new Password();
    hideThread.start();
    BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    try {
      System.out.println( "Type a Name: " );
      do {
        name = in.readLine();
      } while( hideThread.wait == false );
      hideThread.chif = true;
      System.out.println( "\nType a Password:" );
      System.out.print( " " );
      password = in.readLine();
      hideThread.pa = true;
    }catch( Exception e ){}
    System.out.print( "=========================" );
    System.out.println( "\n\nName= " + name );
    System.out.println( "Password= " + password );
    System.out.print( "=========================" );
  }
}