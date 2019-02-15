struct ListNode {
    int val;
    struct ListNode *next;
};

bool hasCycle(struct ListNode *head) {
    if (!head) {
        return false;
    }
    
    struct ListNode *fast=head->next;
    struct ListNode *low=head;
    
    
    while (fast && low) {
        if (fast == low) {
            return true;
        }else {
            low = low->next;
            fast = fast->next;
            if (fast) {
                fast = fast->next;
            }else {
                return false;
            }
        }
    }
    return false;
}

bool hasCycle_best(struct ListNode *head) {
    if(!head) return false;
    struct ListNode *fast = head, *slow = head;
    while(fast && fast->next) {
        fast = fast->next->next;
        slow = slow->next;
        if(fast && fast == slow) return true;
    }
    return false;
}