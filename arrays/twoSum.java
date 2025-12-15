class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null || l2 != null || carry != 0){
            int valor1 = (l1 != null) ? l1.val : 0;
            int valor2 = (l2 != null) ? l2.val : 0;
 
            int resultado = valor1 + valor2 + carry;

            carry = resultado / 10;
            int valor3 = resultado % 10;

            current.next = new ListNode(valor3);
            current = current.next;

            if (l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
