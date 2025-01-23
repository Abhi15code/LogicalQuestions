
public class Find_n_inArray {
 public static void main(String[] args) {
    int arr[]= {2,34,5,3,2,8,55,5,34,7,8,9};
    int n = 898;
  for(int i = 0;i<arr.length;i++){
    if(n==arr[i]){
        System.out.println("Element is present  ");
        break;
    }
    if(i==arr.length-1){
    System.out.println("Element is not present");
  }
}

// for(int i = 0;i<23;i++){
//     System.out.println("Hello no . =>   "+i);

//     if(i==10){
//         System.out.println("this is the breaking point");
//         break;

//     }

//     String name = "Abhishek";
//     System.out.println(name);
// }
   
 }
    
}
