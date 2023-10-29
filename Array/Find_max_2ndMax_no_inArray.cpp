//Find the max and second max element from the given unsorted array 

#include <iostream>
using namespace std;

int main()
{

    int size  = 5;
    int arr[size] = {5, 4, 2, 3, 1};
    int max = arr[0];
    int max2;

// To find the max element
    for(int i: arr)
    {
        max<arr[i] ? max = arr[i] : max ;
    }

// To find the Second max element
    if(arr[0] != max) 
    {
         max2 = arr[0];
        for(int i: arr)
        {
             max2<arr[i] ?( arr[i] != max ? max2 = arr[i] : max ) : max2 ;
        }
    }

// To find the Second max element if 1st element is max
    else if(arr[0] == max)
    {
         max2 = arr[1];
        for(int i = 1; i<size; i++)
        {
            max2<arr[i] ? (max2!= max ? max2 = arr[i] : max) : max2;
        }
    }
        
    cout<<"Max element: "<<max<<endl;
    cout<<"Second max element: "<<max2<<endl;
    
    return 0;
}

