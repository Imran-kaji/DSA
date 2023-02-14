public class Merge_Sort {

    int array[];
    int temparray[];
    int lenght;

    public static void main(String[] args) {
        int inputArray[] = {48, 36, 13, 04, 90, 56};
        Merge_Sort ms= new Merge_Sort();
        ms.sort(inputArray);

        for (int i:inputArray)
        {
            System.out.print(i+" ");
        }

    }

    public void sort(int inputArray[])
    {
        this.array = inputArray;
        this.lenght= inputArray.length;
        this.temparray= new int[lenght];
        devideArray(0, lenght-1);

    }
    public void devideArray(int lowerIndex, int higherIndex)
    {
        if (lowerIndex<higherIndex)
        {
            int middle = lowerIndex+(higherIndex-lowerIndex)/2;

            //it will sort the left side of the array
            devideArray(lowerIndex,middle);

            //it will sort the right side of the array
            devideArray(middle+1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);
        }
    }
    public void mergeArray(int lowerIndex, int middle, int higherIndex)
    {
        for (int i=lowerIndex; i<=higherIndex; i++)
        {
            temparray[i]= array[i];

        }
        int i= lowerIndex;
        int j= middle+1;
        int k= lowerIndex;
        while (i<=middle && j<=higherIndex)
        {
            if (temparray[i]<=temparray[j])
            {
                array[k] = temparray[i];
                i++;
            }
            else
            {
                array[k]= temparray[j];
                j++;
            }
            k++;
        }
        while (i<=middle)
        {
            array[k] = temparray[i];
            k++;
            i++;
        }
    }
}
