



public class CountEvenNUm {
public static int CountEvenFromArray(int[] arr){

int len = arr.length;
String[] StrArr = new String[len];

//each index  value make a string
for (int i = 0; i < arr.length; i++) {
  StrArr[i] = String.valueOf(arr[i]);

}
int count = 0;
for (int i = 0; i < StrArr.length; i++) {
    if (StrArr[i].length()%2==0) {
        count++;
    }
    // System.out.println(StrArr[i] + " ");
}
return count;
}


 public static void main(String[] args) {
    int [] arr = {12,345,2,6,7810,22};   //count 2 because 

 int res = CountEvenFromArray(arr);
System.out.println(res); 
}   
}
