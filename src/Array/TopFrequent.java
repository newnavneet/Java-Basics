package Array;

import java.util.*;

public class TopFrequent {
    public static void main(String[] args) {
        topKFrequent(new int[] {1,1,1,2,2,3}, 2);

    }
    public static int[] topKFrequent(int[] nums, int k){
        int[] res = new  int[k];
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i: nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        Queue<Integer> minheap = new PriorityQueue<>((a,b)-> count.get(a) -count.get(b));

        for(int key: count.keySet()){
            minheap.add(key);
            if(minheap.size() > k){
                minheap.poll();
            }
        }
        while ( k-- > 0){
            res[k] = minheap.poll();
        }
//
//        LinkedHashMap<Integer,Integer> orderedcount = new LinkedHashMap<>();
//        count.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEachOrdered(x-> orderedcount.put(x.getKey(), x.getValue()));
//        for(int i: orderedcount.keySet()){
//            res[res.length - (k--)] =  i;
//            if(k == 0){
//                break;
//            }
//        }
        System.out.println(minheap);
//        System.out.println(orderedcount);
        return res;
    }
}
