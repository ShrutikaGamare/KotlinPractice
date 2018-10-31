
/*
Time Complexity is O(nk)
where n is the number of elements and k is the window size.

Space Complexity is O(1)
*/


fun main(args:Array<String>)
{
    val arr:IntArray= intArrayOf(10,4,2,11,3,15,12,8,7,9,21,14);

    findMax(arr,window=3)
}

private fun findMax(array: IntArray, window: Int)
{


    for(i in 0..(array.size-1)-window+1)
    {
     
        var window=window-1
        var j=i

        var max=array[j]
        while(j<=i+window)
        {
            if(array[j]>=max)
                max=array[j]

            j++;
        }
        print(max)
        println()

    }
}
