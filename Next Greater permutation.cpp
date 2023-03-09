#include <bits/stdc++.h>
using namespace std;

void nextPermutation(vector<int>& arr)
{
	next_permutation(arr.begin(),arr.end());
}

int main()
{
      int n;
      cin>>n;
      vector<int>arr;
      int a;
	 for(int i=0 ; i<n ; i++){
        cin>>a;
        arr.push_back(a);
       }
	nextPermutation(arr);
	for (auto i : arr) {
		cout << i << " ";
	}

	return 0;
}
