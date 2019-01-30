import java.util.HashSet;

public class FirstDuplicate {


    //solve the  problem
  int  checkArrayFirstDuplicates(int [] array){
        for (int anArray1 : array) {
            for (int anArray : array) {
                if (anArray1 == anArray) {
                    return anArray1;
                }
            }
        }
        return -1;
    }

    //improve the efficiency of the algorithm
    int firstDuplicateHash(int[] duplicateArray) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int currentIndex : duplicateArray) {
            if (integerHashSet.contains(currentIndex)) {
                return currentIndex;
            } else {
                integerHashSet.add(currentIndex);
            }
        }
        return -1;

    }


}



