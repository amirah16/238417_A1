package Assignment1;

import java.io.File;

public class DirectoryTestMain
{
  public static void main(String[] args)
  {
    // create a file that is really a directory
    File aDirectory = new File("C:/Users/User/Documents/238417/Git-Command/RealTime/src");

    // get a listing of all files in the directory
    String[] filesInDir = aDirectory.list();
   
    // have everything i need, just print it now
    for ( int i=0; i<filesInDir.length; i++ )
    {
      System.out.println( "file: " + filesInDir[i] );
    }
  }
}
