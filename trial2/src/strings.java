import java.util.HashMap;
import java.util.HashSet;

public class strings {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        map.put('a',1);
        map.put('b',1);
        map.put('c',1);


        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        System.out.println(set.size());
        set.add(2);
        System.out.println("After");
        System.out.println(set.size());
        String s ="helloo";
        int i=0;
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        StringBuilder sb = new StringBuilder();
        int k=2;

        int count=0;

        for(i=0;i<s.length();i++)
        {
            count++;
            sb.append(s.charAt(i));
            if(count==k)  //k==2;
            {

               //Hashmapfunction which counts frequency
                // compare the frequency of two hash maps
                //if(frequency matches)
               //     return true;
              //  else
                {
                    map.clear();//map=map2
                    count=0;
                }
            }



        }













    }

}
