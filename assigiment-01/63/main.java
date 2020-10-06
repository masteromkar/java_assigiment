
public class main {


    public static void main(String[] args) {
      CountCharacters cc = new CountCharacters();
      cc.countChars("I tam ant Intdian");
    }
} 

class CountCharacters{
    public void countChars(String str){
      char[] strArr;
      
        strArr = str.toCharArray();
        char ch ='t';
        int count = 0;
        for(int i = 0; i < strArr.length; i++){
          
            if(strArr[i]==' ' || strArr[i]=='\t')
            {
                continue;
            }else if(ch == strArr[i])
            {
                count++;
            }
            
        }
        System.out.println(count +" times 't' Ocuure in string");
    }
}