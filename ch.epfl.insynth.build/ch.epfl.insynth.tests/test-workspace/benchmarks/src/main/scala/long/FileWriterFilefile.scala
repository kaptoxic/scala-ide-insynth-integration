package long.javaapi.FileWriterFilefile

//http://www.java2s.com/Code/JavaAPI/java.io/newFileWriterFilefile.htm

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
  def main(args:Array[String]) {
    
    var inputFile:File = new File("farrago.txt")

    var in:FileReader = new FileReader(inputFile)
    var out:FileWriter = new FileWriter(new File("?")) //r>5
    var c:Int = in.read()

    while (c != -1){
      out.write(c);
      c = in.read()
    }

    in.close();
    out.close();
  }
}

/*
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    File inputFile = new File("farrago.txt");
    File outputFile = new File("outagain.txt");

    FileReader in = new FileReader(inputFile);
    FileWriter out = new FileWriter(outputFile);
    int c;

    while ((c = in.read()) != -1)
      out.write(c);

    in.close();
    out.close();
  }
}
*/
