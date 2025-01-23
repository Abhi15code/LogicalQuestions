public class duplicateStringArray {
  public static void main(String[] args) {
    String arr[] = { "abhishek", "ankur", "abhishek", "nishant", "krishna", "ankur" ,"ankur"};
    int count = 0;
    String duplicate = ",";
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length; j++) {
        if ((arr[i].equals(arr[j])) && (i != j)) {
          count++;
          duplicate = arr[j];

        }
      }
    }

    System.out.println(duplicate + "::" + count);
  }
}
