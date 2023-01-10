public class Selection_Sort {
    public static void main(String[] args) {

        int [] arr  = {38, 2, 9, 53, 40, 6};

        int min, temp =0;

        for (int i=0; i<arr.length; i++)
        {
             min =i;
            for (int j=i+1; j< arr.length; j++)
            {
                if (arr[j]<arr[min])
                {
                    min = j;
                }
            }
            temp =arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        // For String array
        /*String [] arr  = {"Imran", "Arman", "Yasir", "Mosim","Priyanshu"};

        int min;
        String temp ="";

        for (int i=0; i<arr.length; i++)
        {
            min =i;
            for (int j=i+1; j< arr.length; j++)
            {
                if (arr[j].compareTo(arr[min])<0)
                {
                    min = j;
                }
            }
            temp =arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }*/
    }
}
