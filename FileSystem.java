import java.util.HashMap;
import java.util.Scanner;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter; 

class FileSystem{
  private File file; 
  private Scanner reader; 
  private FileWriter writer; 

  public FileSystem(String name){
    try{
      file = new File(name); 
      file.createNewFile(); 
    }
    catch(IOException e){
      System.out.println("An error has occured"); 
      e.printStackTrace(); 
    }
  }

  void write(String content, boolean append){
    try {
      writer = new FileWriter(file,append);
      writer.write(content);
      writer.close();
    }
    catch (IOException e) {
      System.out.println("An error has occurred.");
      e.printStackTrace();
    }
  }

  void flush(){
    try {
      writer = new FileWriter(file,false);
      writer.write("");
      writer.close();
    }
    catch (IOException e) {
      System.out.println("An error has occurred.");
      e.printStackTrace();
    }
  }

  void addUser(String email,String password){
    write("\n"+email + ":" + password,true); 
  }

  HashMap<String,String> fetchDatabase(){
    HashMap<String,String> map = new HashMap<String, String>(); 
    try{
      reader = new Scanner(file); 
      while(reader.hasNextLine()){
        String s = reader.nextLine(); 
        int x = s.indexOf(':'); 
        map.put(s.substring(0,x),s.substring(x+1,s.length())); 
      }
    }
    catch(Exception e){
      reader.close();
    }
    return map;
  }
}
