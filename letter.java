import java.util.*;
public class letter{
public static void main(String[] args) {
Scanner ob=new Scanner(System.in);
String a=ob.nextLine();
String ans="";
  for(int i=0;i<a.length();i++){
      if(a.charAt(i)!=' '){
          ans+=a.charAt(i)+"";
          a=a.replaceAll(a.charAt(i)+""," ");
      }
  }  
    System.out.println(ans);
    }

}
