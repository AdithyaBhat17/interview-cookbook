/*
Asked by - VMWare, Amazon.

Given K sorted linked list your task is to merge them.
You need to complete mergeKList  method that takes 2 arguments the arr[]
that represents an array of  sorted linked lists and an integer N denoting the
no. of sorted linked lists. The method needs to return  head of the obtained linked list.
*/

//definition of LL.
function Node(data){
    this.data = data
    this.next = null
}

const mergeTwoLists = (list1,list2) => {
    if(!list1) return list2
    if(!list2) return list1
    let result = new Node(-1)
    let temp = result
    while(list1 && list2){
        if(list1.data < list2.data){
            result.next = list1
            list1 = lis1.next
        }else{
            result.next = list2
            list2 = list2.next
        }
        result = result.next
    }
    if(list1) result.next = list1
    if(list2) result.next = list2
    return temp.next
}

const mergeKLists = (lists) => {
    let result = lists[0] || null
    for(let i=1;i<lists.length;i++)
        result = mergeTwoLists(result,lists[i])
    return result
}
