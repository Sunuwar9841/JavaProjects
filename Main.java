// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
class Main {
   //import java.util.ArrayList;

//class Playlist {
  
  public static void main(String[] args) {

    ArrayList <String> desertPlaylist = new ArrayList <>();

    desertPlaylist.add("Gucci");
    desertPlaylist.add("Put");
    desertPlaylist.add("Statue");
    desertPlaylist.add("Cat");
    desertPlaylist.add("Yeppi");
    desertPlaylist.add("Yeezy");
    desertPlaylist.size();

System.out.println(desertPlaylist + "\n");
 System.out.println(desertPlaylist.size());
 desertPlaylist.remove("Put");
 System.out.println(desertPlaylist + "\n");
 
 
//  for(int i =0; i <deserPlaylist.size; i++){
//   int temp = desertPlayist[0];
//   int desertPlayist[0] =desertPlaylist[size()-1] ;
//   int desertPlaylist[size()-1] = temp;
   
//     System.out.println(desertPlaylist + "\n");
  
//   }
int indexA = desertPlaylist.indexOf("Gucci");
System.out.println(indexA + "\n");
 
int indexB = desertPlaylist.indexOf("Yeezy");
System.out.println(indexB + "\n");
 
 String temp = "Gucci";
 desertPlaylist.set(indexA , "Yeezy");
 desertPlaylist.set(indexB, temp);
 System.out.println(desertPlaylist + "\n");
 
 
 

  
}
}
