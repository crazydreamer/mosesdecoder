// ptQuery.java

import java.io.*;

public class example {
    
    static {
        System.loadLibrary("JavaQueryPhraseTableMin");
    }

    public static void main(String argv[]) {
        String mosesModelPath = argv[0];
            
        QueryPhraseTableMin pt = new QueryPhraseTableMin(mosesModelPath);
        if(pt != null) {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String s = "";
                while ((s = in.readLine()) != null &&  s.length() != 0) {
                    String a = pt.query(s);
                    System.out.print(a);
                }
            }
            catch (IOException e) {
                
            }
        }
    }
}