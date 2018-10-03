// TODO : Write a JAVA program for the same.

// Insert value in sorted way in a sorted doubly linked list
// Given a sorted doubly linked list and a value to insert, write a function to insert the value in sorted way.

// Algorithm:
// Let input doubly linked list is sorted in increasing order.
// New node passed to the function contains data in the data part and previous and next link are set to NULL.

// sortedInsert(head_ref, newNode)
//       if (head_ref == NULL)
//       head_ref = newNode
        
//       else if head_ref->data >= newNode->data
//           newNode->next = head_ref
//       newNode->next->prev = newNode
//       head_ref = newNode    
        
//       else
//       Initialize current = head_ref
//       while (current->next != NULL and
//                current->next->data data)
//         current = current->next
        
//       newNode->next = current->next
//       if current->next != NULL
//         newNode->next->prev = newNode
            
//           current->next = newNode
//       newNode->prev = current

#include <bits/stdc++.h>   
using namespace std;   
// Node of a doubly linked list 
struct Node { 
    int data; 
    struct Node* prev, *next; 
}; 

struct Node* getNode(int data) { 
    // allocate node 
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));   
    // put in the data 
    newNode->data = data; 
    newNode->prev = newNode->next = NULL; 
    return newNode; 
} 
  
// function to insert a new node in sorted way in 
// a sorted doubly linked list 
void sortedInsert(struct Node** head_ref, struct Node* newNode) { 
    struct Node* current;   
    // if list is empty 
    if (*head_ref == NULL) 
        *head_ref = newNode;   
    // if the node is to be inserted at the beginning of the doubly linked list 
    else if ((*head_ref)->data >= newNode->data) { 
        newNode->next = *head_ref; 
        newNode->next->prev = newNode; 
        *head_ref = newNode; 
    } 
  
    else { 
        current = *head_ref;   
        // locate the node after which the new node is to be inserted 
        while (current->next != NULL && current->next->data < newNode->data) 
            current = current->next; 
  
        /* Make the appropriate links */
        newNode->next = current->next; 
  
        // if the new node is not inserted at the end of the list 
        if (current->next != NULL) 
            newNode->next->prev = newNode; 
  
        current->next = newNode; 
        newNode->prev = current; 
    } 
} 
  
// function to print the doubly linked list 
void printList(struct Node* head) { 
    while (head != NULL) { 
        cout << head->data << " "; 
        head = head->next; 
    } 
} 
  
int main() { 
    /* start with the empty doubly linked list */
    struct Node* head = NULL; 
  
    // insert the following nodes in sorted way 
    struct Node* new_node = getNode(8); 
    sortedInsert(&head, new_node); 
    new_node = getNode(5); 
    sortedInsert(&head, new_node); 
    new_node = getNode(3); 
    sortedInsert(&head, new_node); 
    new_node = getNode(10); 
    sortedInsert(&head, new_node); 
    new_node = getNode(12); 
    sortedInsert(&head, new_node); 
    new_node = getNode(9); 
    sortedInsert(&head, new_node); 
  
    cout << "Created Doubly Linked List" << endl; 
    printList(head); 
    return 0; 
} 