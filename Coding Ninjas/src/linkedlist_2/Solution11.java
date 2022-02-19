package linkedlist_2;

public class Solution11 {
	//	 bubbleSort
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head ){
        //Write your code here
        if(head==null || head.next==null)
        	return head;
        for(int i=0;i<lengthLL(head)-1;i++){
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> curr = head;
            LinkedListNode<Integer> next = curr.next;

        while(curr.next != null){
            if(curr.data > curr.next.data){
                if(prev == null){
					curr.next = next.next;
                    next.next = curr;
                    prev = next;
                    head = prev;
				}else{
					next = curr.next;
                    curr.next = next.next;
                    prev.next = next;
                    next.next = curr;
                    prev = next;
                    }
                }else{
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }
    
    private static int lengthLL(LinkedListNode<Integer> head){
        int count = 1;
        while(head.next != null){
            head = head.next;
            count++;
        }
        return count;
    }
}
