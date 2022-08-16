/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.array_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 class second_largest_element
{
    public void find_large_element(int [] arr, int length)
    {
        int large=arr[0];
        int second_large=arr[1];
        int temp;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<length;i++)
        {
            if(max<arr[i])
            {
               max=arr[i];
            }
            if(min>arr[i])
            {
                
                min=arr[i];
                
            }
            
        }
        System.out.println("largest element:"+max);
        System.out.println("minimum element:"+min);
        int sec_max=arr[0];
        for(int i=1;i<length;i++)
        {
            if(arr[i]<max&&arr[i]>sec_max)
            {
                
                sec_max=arr[i];
            }
        }
           System.out.println("Second largest element:"+sec_max);
    }
        
}
class Minimum
{
    public void find_min_sum(int [] arr,int length)
    {
        int sum1=0;
        int sum2=arr[0];
        for(int i=0;i<length;i++)
        {
            sum1=0;
            for(int j=i+1;j<length;j++)
            {
                sum1+=arr[j];
                if(sum2>sum1)
                {
                    sum2=sum1;
                }
                
            }
        }
        System.out.println("minimum sum of array :"+sum2);
    }
}
class Maximum
{
     public void find_max_sum(int [] arr,int length)
    {
        int sum1=0;
        int max=arr[0];
        for(int i=0;i<length;i++)
        {
              sum1+=arr[i];
                if(max<sum1)
                {
                    max=sum1;
                }
                if(sum1<0)
                  sum1=0;
                
   
        
        
    }
    System.out.println("maximum sum of array :"+max);
}
}
class Even_Odd
{
    public void find_even_odd(int []arr,int length)
    {
        int []b=new int[length];
        int []c=new int[length];
        int j=0,k=0;
        for(int i=0;i<length;i++)
        {
            if(arr[i]%2==0)
            {
                b[j]=arr[i];
                j++;
            }
            else
            {
                c[k]=arr[i];
                k++;
            }
        }
        System.out.println("Even no. of array:");
        for(int i=0;i<j;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println("\n");
        System.out.println("odd no. of array:");
        for(int i=0;i<k;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
class Delete_Element{
    public void delete_element(int[]arr,int length)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a element your want to delete");
        int delete=s.nextInt();
        int pos=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==delete)
                pos=i;
        }
        for(int i=pos;i<arr.length-1;i++)
        {
             arr[i]=arr[i+1];   
        }
        System.out.println("After deletion of array element");
        for(int i=0;i<arr.length-2;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
class Split_Array{
    public void split_array(int [] a,int length)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a position you want to split the array ");
        int pos=s.nextInt();
        int [] b=new int[length];
        int []c=new int[length];
        int k=0,x=0,i;
        for(i=0;i<pos;i++)
        {
            b[k]=a[i];
            k++;
        }
        for(int j=i;j<length;j++)
        {
         c[x]=a[j];  
         x++;
        }
        System.out.println("After spliting the array ");
        for(int l=0;l<k;l++)
        {
            System.out.print(b[l]+" ");
        }
        System.out.println("\n");
        for(int m=0;m<x;m++)
        {
              System.out.print(c[m]+" ");
        }
    }
}

class sort_0_1_2{
    public void sort_z_o_t(int []arr,int length)
    {
        int low=0;
        int mid=0;
        int high=length-1;
        int temp=0;
        while(mid<=high)
        {
            if(arr[mid]==0)
            { temp=arr[low];
              arr[low]=arr[mid];
              arr[mid]=temp;
              low++;
              mid++;  
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
                
            }
        }
        System.out.print("After sorting 0 1 and 2 \n");
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

class Find_insertion{
    public ArrayList<Integer> find_insertion(int [] arr1,int [] arr2)
    {
     ArrayList<Integer> al= new ArrayList();
     for(int i=0;i<arr1.length;i++)
     {
         for(int j=0;j<arr2.length;j++)
         {
             if(arr1[i]<arr2[j])
                 break;
             if(arr1[i]==arr2[j])
             {
                 al.add(arr1[i]);
                 arr1[j]=-1;
                 break;
             }
         }
     }
     return al;
     
    }
}
class Swap_Alternate_NO
{
    public int [] Swap(int [] arr)
    {
        for(int i=0;i<arr.length;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
        }
        return arr;
    }
}
class Sort_0_1
{
    public int [] Sorting_0_1(int [] arr)
    {
        int i=0;
        int j=arr.length-1;
        int temp;
       while(i<j)
       {
           if(arr[i]==1 && arr[j]==0)
           {
               temp= arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           }
           else if(arr[i]==0 && arr[j]==1)
           {
               i++;
               j--;
           }
           else
               i++;
       }
       return arr;
       
    }
}
class find_unique_no
{
    public int unique(int [] arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
            
        }
        return ans;
    }
}
class Cyclic_Rotation{
    public void rotation_of_array(int [] arr1,int length)
    {
        int temp=arr1[length-1];
        for(int i=arr1.length-1;i>0;i--)
        {
            arr1[i]=arr1[i-1];
        }
        arr1[0]=temp;
        System.out.print("After rotation of array ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
class Minimize_Diffirence{
    public int getMinDiff(int [] arr,int n,int k)
    {
        int min=0,max=0,r=0;
        Arrays.sort(arr);
        r=arr[n-1]-arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=k)
            {
                max=Math.max(arr[i-1]+k, arr[n-1]-k);
                min=Math.min(arr[i]-k,arr[0]+k);
                r=Math.min(r, max-min);
            } 
            else
            {
                continue;
            }
            
        }
        return r;
    }
}
class Find_Duplicate{
    public int Duplicate_Element(int [] arr1,int length)
    {
        int index=0;
        for(int i=0;i<arr1.length;i++)
        {
            index=Math.abs(arr1[i])-1;
            
            if(arr1[index]<0)
                return Math.abs(arr1[i]);
            else
                arr1[i]=-arr1[i];
        }
        return -1;
        
    }
    
   
}
class Find_Jump
{
    int max=0,jump=0,halt=0;
    public int find_jump(int [] arr,int length)
    {
        if(arr[0]==0)
        {
            return -1;
            
        }
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,i+arr[i]);
            if(max>=arr.length-1)
            {
                jump+=1;
                return jump;
            }
            if(i==halt)
            {
                halt=max;
                jump++;
            }
            if(halt>=arr.length-1)
            {
                return jump;
            }
            
            
        }
     return -1;
    }
    
}
class Merge_Sorted_Array{
    public void sorted_array(int []arr1,int []arr2,int n,int m)
    {
        int i=0,j=0,k=0;
        int [] merge_sort=new int[n+m];
        while(i<n && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                merge_sort[k]=arr2[j];
                k++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                merge_sort[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                merge_sort[k]=arr1[i];
                k++;
                i++;
                j++;
            }
        }
        while(i<n)
        {
            merge_sort[k]=arr1[i];
            k++;
            i++;
        }
         while(j<m)
        {
            merge_sort[k]=arr2[j];
            k++;
            j++;
        }
        System.out.println("After merging the two sorted array!!!");
        for(int x=0;x<merge_sort.length;x++)
        {
            System.out.print(merge_sort[x]+" ");
        }
    }
}
class Merge_Interval{
    public int [][] merge(int[][]interval)
    {
        
        //sorting
        int flag=0;
       
            for(int j=0;j<interval.length;j++)
            {
                if(interval[j][0]>interval[j+1][0])
                {
                    //swap
                    int[] temp=new int[2];
                    temp[0]=interval[j][0];
                    temp[1]=interval[j][1];
                    interval[j][0]=interval[j+1][0];
                    interval[j][1]=interval[j+1][1];
                    interval[j+1][0]=temp[0];
                    interval[j+1][1]=temp[1];
                    flag=1;
                    
                }
            
            if(flag==0)
                break;
        }
        List <int[]>res=new ArrayList<>();
        int current_interval[]=interval[0];
        res.add(current_interval);
        for(int i=0;i<interval.length;i++)
        {
            if(interval[i][0]<=current_interval[1])
            {
                current_interval[1]=Math.max(current_interval[1], interval[i][1]);
                
            }
            else
            {
                current_interval=interval[i];
                res.add(current_interval);
            }
        }
        return res.toArray(new int [res.size()][]);
        
    }
}
class Stock{
    public int BUY_SELL(int[]arr)
    {
        int profit=0;
        int cur_profit=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                cur_profit=arr[j]-arr[i];
                if(cur_profit>profit)
                {
                    profit=cur_profit;
                }
            }
        }
        return profit;
    }
}
class pair{
    public int count_pair(int [] arr,int k)
    {
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=i+1;j<arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
}
class count_inversion{
    public int count(int [] arr)
    {
        int inversion=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                    inversion++;
            }
        }
        return inversion;
        
    }
}
class SubArray_Sotred
{
    public void Three_Sorted(int [] arr1,int []arr2,int []arr3)
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    for(int k=0;k<arr3.length;k++)
                    {
                        if(arr1[i]==arr3[k])
                        {
                            System.out.print(arr1[i]+" ");
                        }
                    }
                }
            }
        }
    }
}
class SubArray_Product{
    public int Find_Product(int []arr1)
    {
        int cur_pro=1,pro=1;
        for(int i=0;i<arr1.length;i++)
        {
            cur_pro=1;
            for(int j=1;j<arr1.length;j++)
            {
                cur_pro*=arr1[j];
                if(cur_pro>pro)
                   pro=cur_pro;
            }
        }
        return pro;
    }
}
class SubArray_Zero{
    public int Find_Zero_Sum(int []arr1)
    {
        int sum;
        for(int i=0;i<arr1.length;i++)
        {
            sum=0;
            for(int j=i+1;j<arr1.length;j++)
            {
                sum+=arr1[i]+arr1[j];
                if(sum==0)
                {
                    return sum;
                }
            }
        }
        return -1;
    }
}
class Binary_Search
{
    public int Binary_Search(int [] arr,int data)
    {
        int low=0;
        int high=arr.length-1;
        int mid=-1;
        while(low<=high)
        {
             mid=(low+high)/2;
            if(arr[mid]<data)
                low=mid+1;
            else if(arr[mid]>data)
            {
                high=mid-1;
            }
            else
                return mid;
        }
         return mid;
    }
}
class Bubble_Sort{
    public void Bubble_Sort(int [] arr)
    {
        int counter=arr.length-1;
        int temp;
        for(int i=0;i<=counter;i++)
        {
            for(int j=i+1;j<=counter;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
            }
        }
    }
    public void display(int [] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+" ");
    }
}
class Selection_sort{
    public void selection_sort(int []arr)
    {
        int min,temp;
        int cap=arr.length-1;
        for(int i=0;i<=cap;i++)
        {
            min=arr[i];
            for(int j=i+1;j<=cap;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    temp=arr[i];
                    arr[i]=min;
                    arr[j]=temp;
                }
                
            }
           
        }
    }
     public void display(int [] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+" ");
    }
}
class Insertion_Sort
{
    public void insertion_sort(int [] arr)
    {
        for(int i=1;i<=arr.length-1;i++)
        {
            int val=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>val)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
    public void display(int [] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+" ");
    }
    }

 class Lower_Bound
 {
     public int lower_bound(int [] arr,int data)
     {
         int low=0;
         int high=arr.length-1;
         int ans=-1;
         while(low<=high)
         {
             int mid=(low+high)/2;
             if(arr[mid]==data)
             {
                 ans=mid;
                 high=mid-1;
             }
             else if(arr[mid]<data)
             {
                 high=mid-1;
             }
             else
             {
                 low=mid+1;
             }
         }
         return ans;
     }
 }
 class Upper_Bound
 {
     public int upper_bound(int [] arr,int data)
     {
         int low=0;
         int high=arr.length-1;
         int ans=-1;
         while(low<=high)
         {
             int mid=(low+high)/2;
             if(arr[mid]==data)
             {
                 ans=mid;
                 low=mid+1;
             }
             else if(arr[mid]<data)
             {
                 high=mid-1;
             }
             else
             {
                 low=mid+1;
             }
         }
         return ans;
     }
 }
class Sprial_Matrix{
    public void spiral_matrix(int[][]arr)
    {
        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[top].length-1;
        int dir=1;
        int count=((bottom+1)*(right+1));
        while(left<=right && top<=bottom)
        {
            if(count>0)
            {
                if(dir==1)
                {
                    for(int i=left;i<=right;i++)
                    {
                        System.out.print(arr[top][i]+" ");
                        count--;
                    }
                    dir=2;
                    top++;
                }
            }
             if(count>0)
            {
                if(dir==2)
                {
                    for(int i=top;i<=bottom;i++)
                    {
                        System.out.print(arr[i][right]+" ");
                        count--;
                    }
                    dir=3;
                    right--;
                }
            }
              if(count>0)
            {
                if(dir==3)
                {
                    for(int i=right;i>=left;i--)
                    {
                        System.out.print(arr[bottom][i]+" ");
                        count--;
                    }
                    dir=4;
                    bottom--;
                }
            }
             if(count>0)
            {
                if(dir==4)
                {
                    for(int i=bottom;i>=top;i--)
                    {
                        System.out.print(arr[i][left]+" ");
                        count--;
                    }
                    dir=1;
                    left++;
                }
            }
        }                
    }
}
class Book_allocation{
    public int book_allocation(int[]arr,int n,int stno)
    {
       int start=arr[n];
       int end=0;
       for(int i=0;i<=arr.length-1;i++)
           end+=arr[i];
       int res=-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           if(isvalid(arr,n,stno,mid)==true)
           {
               res=mid;
               end=mid-1;
           }
           else
               start=mid+1;
       }
       return res;
    }
    public boolean isvalid(int []arr,int n,int stno,int mid)
    {
        int student=1;
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            sum+=arr[i];
            if(sum>mid)
            {   student++;
                sum=arr[i];
            }
            if(student>stno)
                return false;
            
        }
        return true;
    }
}
class Wave_Form{
    public void wave_form(int[][]arr)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<=arr[i].length-1;j++)
                    System.out.print(arr[i][j]+" ");
            }
            else
            {
                 for(int j=arr[i].length-1;j>=0;j--)
                    System.out.print(arr[i][j]+" ");
                
            }
        }
    }
}
class Painter_Partion{
    // this is very similar problem of book allocation
    public int painter_partion(int [] arr,int n, int no_p)
    {
        int ans=-1;
        int start=arr[n];
        int end=0;
        for(int i=0;i<=n;i++)
            end+=arr[i];  
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isvalid(arr,n,no_p,mid)==true)
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }     
    public boolean isvalid(int []arr,int n,int no_p,int mid)
    {   int sum=0;
        int painter=0;
        for(int i=0;i<=n;i++)
        {
            sum+=arr[i];
            if(sum>mid)
            {    painter++;
                 sum=arr[i];
            }  
            if(painter>no_p)
                return false;
        }  
        return true;     
    }
}
class Aggressive_Cow
{
    public int aggressive_cow(int [] arr,int n, int k)
    {
        int start=arr[0];
        int end=arr[n]-arr[0];
        int ans=-1;
        int mid;
        while(start<=end)
        {
                  mid=start+(end-start)/2;
                 if(isvalid(arr,n,k,mid)==true)
                 {
                     ans=mid;
                     start=mid+1;
                 }
                 else
                 {
                     end=mid-1;
                 }
        }
        return ans;
    }
    public boolean isvalid(int []arr,int n,int k,int mid)
    {
        int cordinate=arr[0];
        int count=1;
        for(int i=1;i<=n;i++)
        {
            if(arr[i]-cordinate>=mid)
            {
                cordinate=arr[i];
                count++;
            }
            if(count==k)
                return true;
        }
        return false;
    }
}
public class Array {

    
    public static void main(String[] args) {
   
     int [] arr={1,2,4,8,9};
     Aggressive_Cow obj=new Aggressive_Cow();
     int cows=3;
     int n=arr.length-1;
    int res = obj.aggressive_cow(arr,n,cows);
     if(res==-1)
         System.out.println("the given info incorrect!!!");
     else
         System.out.println("The largest minimum distance is="+res);
        
        
     
          
      
    }
    
}
