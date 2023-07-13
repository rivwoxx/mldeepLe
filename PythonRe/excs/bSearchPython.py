def bSearch(arr, target):
    high = len(arr) - 1
    low = 0
    
    while(low <= high):
        mid = int((high + low) / 2)
        if(arr[mid] == target):
            return mid
        elif(arr[mid] < target):
            low = mid - 1
        elif(arr[mid] > target):
            high = mid + 1
        else:
            return -1

    

arr =  [1,3,4,5,6,7,8,9,10]
print(bSearch(arr, 10))