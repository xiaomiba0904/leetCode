#include <stdio.h>
#include <stdlib.h>
#include <stddef.h>

struct ListNode
{
	int val;
	struct ListNode *next;
};


void print_ListNode(struct ListNode *node) {
	while(node != NULL) {
		printf("%d->", node->val);
		node = node->next;
	}
	printf("\n");
}

struct ListNode* create(int* list, int listSize){
	struct ListNode *header=NULL;
	struct ListNode *last=NULL;
	struct ListNode *this=NULL;

	for (int i = 0; i < listSize; ++i)
	{
		this = (struct ListNode *)malloc(sizeof(struct ListNode));
		this->val = list[i];
		this->next = NULL;

		if (last == NULL) {
			header = this;
		}else {
			last->next = this;
		}
		last = this;
	}

	return header;
}


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *header=NULL;
    struct ListNode *this=NULL;
    struct ListNode *last=NULL;
    int sum_value = 0;
    int l1_value = 0; 
    int l2_value = 0;

    while (1) {
    	this = (struct ListNode *)malloc(sizeof(struct ListNode));
    	if (l1 && l2) {
    		l1_value = l1->val;
    		l2_value = l2->val;
    		l1 = l1->next;
    		l2 = l2->next;
    	} else if (l1 && !l2) {
    		l1_value = l1->val;
    		l1 = l1->next;
    		l2_value = 0;
    	} else if (!l1 && l2) {
    		l2_value = l2->val;
    		l2 = l2->next;
    		l1_value = 0;
    	} else if (!l1 && !l2 && sum_value >0){
    		l1_value = 0;
    		l2_value = 0;
    	} else {
    		break;
    	}

    	sum_value = l1_value + l2_value +sum_value;
    	if (sum_value >= 10) {
    		this->val = sum_value % 10;
    		sum_value = sum_value / 10;
    	} else {
    		this->val = sum_value;
    		sum_value = 0;
    	}


		if (last == NULL) {
			header = this;
			last = this;
		}
		last->next = this;
		this->next = NULL;
		last = this;

    }

    return header;
}


int main(int argc, char const *argv[])
{
	int l1[] = {1,3,4,6};
	int l2[] = {1,2,7};
	struct ListNode *test1, *test2, *result;
	test1 = create(l1, 4);
	test2 = create(l2, 3);
	print_ListNode(test1);
	print_ListNode(test2);
	result = addTwoNumbers(test1, test2);
	print_ListNode(result);
	return 0;
}