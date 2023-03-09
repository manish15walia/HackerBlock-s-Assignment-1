import java.util.*;

public class Main {
     static void printMax(int arr[], int N, int K)
    {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for (i = 0; i < K; ++i) {

            while (!Qi.isEmpty()
                   && arr[i] >= arr[Qi.peekLast()])
                  Qi.removeLast();
              Qi.addLast(i);
        }
        for (; i < N; ++i) {
          System.out.print(arr[Qi.peek()] + " ");
            while ((!Qi.isEmpty()) && Qi.peek() <= i - K)
                Qi.removeFirst();
  
            while ((!Qi.isEmpty())
                   && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
  
            Qi.addLast(i);
        }
  
        System.out.print(arr[Qi.peek()]);
    }
  

	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int [] arr = new int[N];
        for(int i=0;i<N;i++)arr[i]=sc.nextInt();
	
		printMax(arr, N, K);
	}
}
