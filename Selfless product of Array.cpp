#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    long i=0;
    while(i<n){
        long j=0,prod=1;
        while(j<n){
            if(i==j){
                j++;
                continue;
            }
            
                
            prod=prod*arr[j];
            j++;
        
        }
        cout<<prod<<" ";
        i++;
       
    }
 
}
