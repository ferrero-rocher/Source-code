import java.util.HashMap;

public class demo {
    public static void main(String[] args) {
        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        map1.put('a',1);
        map1.put('b',2);
        StringBuilder sb = new StringBuilder();

        HashMap<Character,Integer> map2 = getFreq(sb);
        {
            if(map1.keySet().equals(map2.keySet()) && map1.equals(map2))

            {
                System.out.println(true);
            }
        }
        int k=2;
        int[] arr = {3,2,4,5,5}; // 5
        int count =0;
        for(int first=0, last =k-1 ; last<arr.length;first++,last++)
        {
            count++;
            //append


        }


    }

    static HashMap<Character,Integer> getFreq (StringBuilder sb)
    {
            HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        map2.put('b',2);
        map2.put('a',1);
        return map2;

    }
}
