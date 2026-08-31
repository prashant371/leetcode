class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int first = -1;
        int last = -1;
        int min = Integer.MAX_VALUE;
        int max = -1;

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;

        while(curr.next != null)
        {
            if((curr.val > prev.val && curr.val > curr.next.val) ||
               (curr.val < prev.val && curr.val < curr.next.val))
            {
                if(first == -1)
                {
                    first = index;
                }
                else
                {
                    min = Math.min(min, index - last);
                    max = index - first;
                }

                last = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if(first == -1 || first == last)
        {
            return new int[]{-1, -1};
        }

        return new int[]{min, max};
    }
}