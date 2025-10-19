# 143. Reorder List
# Solved
# Medium
# Topics
# premium lock icon
# Companies
# You are given the head of a singly linked-list. The list can be represented as:

# L0 → L1 → … → Ln - 1 → Ln
# Reorder the list to be on the following form:

# L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
# You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

# Example 1:


# Input: head = [1,2,3,4]
# Output: [1,4,2,3]
# Example 2:


# Input: head = [1,2,3,4,5]
# Output: [1,5,2,4,3]
 

# Constraints:

# The number of nodes in the list is in the range [1, 5 * 104].
# 1 <= Node.val <= 1000

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        # Find middle
        slow = head
        fast = head.next
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # Reverse second half of list
        current = slow.next  # second starts at middle
        slow.next = None
        previous = slow.next
        while current:
            nxt = current.next
            current.next = previous  # !IMPORTANT - reverse the link
            previous = current
            current = nxt

        # Merge first and second halfs
        first = head
        second = previous
        while second:
            nxt_first = first.next
            nxt_second = second.next

            first.next = second
            second.next = nxt_first
            
            first = nxt_first
            second = nxt_second