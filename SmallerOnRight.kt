package ArrayRVR

fun main(args:Array<String>)
{
    val arr= arrayOf(10,3,4,5,7,1,3,2)
    smallerEleOnRight(arr,arr.size)
}

fun smallerEleOnRight(arr: Array<Int>, size: Int):Unit
{
    for(i in 0..size-1)
    {
        var count=0;
        for(j in i+1..size-1)
        {

            if(arr[j]<arr[i])
            {
               count++
            }
        }
        println("Number of elements less than ${arr[i]} are $count")
    }

}
