


import java.util.HashSet;


class Solution1 {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to modify the list by removing elements present in nums array
    public ListNode modifiedList(int[] nums, ListNode head) {
    	HashSet<Integer> set = new HashSet<Integer>();
    	for(int num :nums)
    	{
    		set.add(num);
    	}
    	
    	ListNode dummy =new ListNode(0);
    	dummy.next=head;
    	ListNode current =dummy;
    	
    	while (current.next !=null) {
			if(set.contains(current.next.val))
			{
				current.next= current.next.next;
			}
			else {
				current =current.next;
				}
			}
    	return dummy.next;
		}
    
    
    

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Solution1 m1 = new Solution1();

        // Input array nums
        int[] nums = {1, 2, 3};

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.print("Original list: ");
        printList(head);

        // Modify the list
        ListNode modifiedHead = m1.modifiedList(nums, head);

        // Print modified list
        System.out.print("Modified list: ");
        printList(modifiedHead);
    }

 }



