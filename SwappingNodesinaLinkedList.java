package LeetcodeQue;

public class SwappingNodesinaLinkedList {

    //1st approach

//    public static void swapvalue(ListNode n1 , ListNode n2){
//        int temp = n1.val;
//        n1.val = n2.val;
//        n2.val = temp;
//    }
//    public ListNode swapNodes(ListNode head, int k) {
//        ListNode Temp = head;
//        int count = 0;
//        while(Temp!=null){
//            count++;
//            Temp = Temp.next;
//        }
//
//        ListNode Node1 = null;
//        ListNode Node2 = null;
//        ListNode Temp1 = head;
//        for(int i = 1 ; i <= k ; i++){
//            if(i==k){
//                System.out.println(Temp1.val);
//                Node1 = Temp1;
//                break;
//            }else{
//                Temp1 = Temp1.next;
//            }
//        }
//        ListNode temp2 = head;
//        for(int i = 1 ; i <= count ; i++){
//
//            if(i==(count-k+1)){
//                System.out.println(temp2.val);
//                Node2 = temp2;
//                break;
//            }else{
//                temp2 = temp2.next;
//            }
//        }
//
//        swapvalue(Node1 , Node2);
//
//        return head;

    //2nd appraoch

//    public ListNode swapNodes(ListNode head, int k) {
//        ListNode Temp = head;
//        ListNode slow = head;
//        ListNode fast = head;
//        ListNode first = null;
//
//        for(int i = 1 ; i < k ; i++){
//            fast = fast.next;
//        }
//        first = fast ;
//        while(fast.next!=null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        System.out.print(first.val);
//        System.out.print(slow.val);
//
//        int temp = first.val;
//        first.val = slow.val;
//        slow.val = temp;
//
//        return head;

    }








