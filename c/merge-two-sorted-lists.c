#include <stdio.h>
#include <stdlib.h>

typedef struct ListNode
{
	int val;
	struct ListNode *next;
} Node;

Node* create_ListNode(int* list, int len) {
	Node *head = (Node *)malloc(sizeof(Node));
	Node *tail = head;
	tail->next = NULL;

	for (int i = 0; i < len; ++i)
	{
		Node *this = (Node *)malloc(sizeof(Node));
		this->val = list[i];
		this->next = NULL;
		tail->next = this;
		tail = this;

	}
	return head->next;
}

void printf_ListNode(Node* list) {
	Node *l = list;
	while(l) {
		printf("%d->", l->val);
		l = l->next;
	}
	printf("\n");
}

Node* mergeTwoLists(Node* l1, Node* l2) {
	Node *head = (Node *)malloc(sizeof(Node));
	Node *tail = head;
	tail->next = NULL;


	int value;
    while (l1 || l2) {
    	if (!l1 && l2) {
    		value = l2->val;
    		l2 = l2->next;
    	} 
    	else if(l1 && !l2) {
    		value = l1->val;
    		l1 = l1->next;
    	}
    	else {
    		if (l1->val <= l2->val) {
    			value = l1->val;
    			l1= l1->next;
    		}else {
    			value = l2->val;
    			l2 = l2->next;
    		}
    	}

    	Node *this = (Node *)malloc(sizeof(Node));
    	this->val = value;
    	this->next = NULL;
    	tail->next = this;
    	tail = this;
    }
    return head->next;
}

int main(int argc, char const *argv[])
{
	int test1[] = {1,3,5};
	int test2[] = {2,4,6};
	Node * list1 = create_ListNode(test1, 3);
	Node *list2 = create_ListNode(test2, 3);
	Node *result = mergeTwoLists(list1, list2);
	printf_ListNode(result);
	return 0;
}