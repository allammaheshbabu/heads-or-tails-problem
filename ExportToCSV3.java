import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.*;

public class ExportToCSV3 {

  public static void main(String[] args) {
    PrintWriter pw;
    try {
      pw = new PrintWriter(new File("test.csv"));
ArrayList<String> str1 = new ArrayList<String>();
ArrayList<String> str2 = new ArrayList<String>();
int k=0,p1heads=0,p1tails=0,p2heads=0,p2tails=0;
           Random random = new Random();   
      StringBuffer csvHeader = new StringBuffer("");
      StringBuffer csvData = new StringBuffer("");
      csvHeader.append("round ,player1,player2\n");

      // write header
      pw.write(csvHeader.toString());

      // write data
for(int i=0;i<10;i++){
int x = random.nextInt(2);
if(x==1){
str1.add("heads");
p1heads++;
}
else{

str1.add("tails");
p1tails++;
}
if(x==0){
str2.add("heads");
p2heads++;
}
else{

str2.add("tails");
p2tails++;
}
  
}

for(int j=0;j<10;j++){
          k++;
      csvData.append("round"+k);
      csvData.append(',');
      csvData.append(str1.get(j));
      csvData.append(',');
      csvData.append(str2.get(j));
      csvData.append('\n');
      
}
csvData.append('\n');
csvData.append('\n');
csvData.append("plr1heads");
      csvData.append(',');
      csvData.append(p1heads);
      csvData.append('\n');
csvData.append("plr1tails");
      csvData.append(',');
      csvData.append(p1tails);
      csvData.append('\n');
csvData.append("plr2heads");
      csvData.append(',');
      csvData.append(p2heads);
      csvData.append('\n');
csvData.append("plr2tails");
      csvData.append(',');
      csvData.append(p2tails);
      csvData.append('\n');
     

pw.write(csvData.toString());
      pw.close();
    }
 catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}