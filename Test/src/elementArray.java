// Write a method countArray that takes an array of integers as a parameter. The method checks the integers that are even and in the range 2 inclusive to 100 exclusive and counts how many occurrences of each are in the array. The method should return a string that has all the values in the array along with the number of their occurrences in the array. For example: if the array has the following values:
// [2,10,10,98,3,146]
// , the method should count the occurrence of integers that match the condition above. The string returned should be as follows (use
// \n
// ): "
// 2:1
// 10:2
// 98:
// 1"
// If the array is empty, the returned string should be empty.

public class elementArray {
    public static void main(String[] args){
        int arr[] = {2 , 10, 10, 98, 3, 146};
        countArray(arr);
        System.out.println();
        int arr1[] = {6 , 12, 6, 6, 18, 45};
        countArray(arr1);
        System.out.println();
        int arr2[] = {};
        countArray(arr2);
    }
    static void countArray(int arr[]){
        int [][]tempArray = new int[arr.length][2];
        int j = 0;
        int new_element = 0;
        boolean new_element_flag;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>= 2 && arr[i]<100 && arr[i]%2==0){
                j++;
                new_element_flag = true;
                for (int k = 0 ; k < j; k++){
                    if (tempArray[k][0]==arr[i]){
                        tempArray[k][1] += 1;
                        new_element_flag = false;
                    }
                }
                if (new_element_flag){
                    tempArray[new_element][0] = arr[i];
                    tempArray[new_element][1] = 1;
                    new_element++;
                    new_element_flag = false;   
                }
            }
        }
        String str = printArray(tempArray, new_element);
        System.out.println(str);        
    }
    static String printArray(int arr[][], int length){
        String str = "";
        str = str + '"';
        for (int i =0; i < length; i++){
            if (i<length-1 ){
                str = str + arr[i][0]+": "+arr[i][1]+"\n\n"; 
            }
            else str = str + arr[i][0]+": "+arr[i][1]; 
        }
        return str+'"';
    }
}
