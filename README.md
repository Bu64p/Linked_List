# Linked_List

In computer science, a linked list is a linear collection of data elements whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence. In its most basic form, each node contains: data, and a reference (in other words, a link) to the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position in the sequence during iteration. More complex variants add additional links, allowing more efficient insertion or removal of nodes at arbitrary positions. A drawback of linked lists is that access time is linear (and difficult to pipeline). Faster access, such as random access, is not feasible. Arrays have better cache locality compared to linked lists.

![Singly-linked-list svg](https://user-images.githubusercontent.com/96871830/159186827-7f417470-07cc-4930-ba90-17eedfdfeb36.png)

*A linked list whose nodes contain two fields: an integer value and a link to the next node. The last node is linked to a terminator used to signify the end of the list.*

# Doubly linked list

In a 'doubly linked list', each node contains, besides the next-node link, a second link field pointing to the 'previous' node in the sequence. The two links may be called 'forward('s') and 'backwards', or 'next' and 'prev'('previous').

![610px-Doubly-linked-list svg](https://user-images.githubusercontent.com/96871830/159186890-6b8e11a5-3adb-4cfb-8ccc-90e23d152f88.png)

*A doubly linked list whose nodes contain three fields: an integer value, the link forward to the next node, and the link backward to the previous node*

[wikipedia](https://en.wikipedia.org/wiki/Linked_list)

#  Methods:

| Command | Description |
| ---------- | --------- |
| `linkedList() : void` | create a Linked list |
| `add(Object value) : void` | add ```value``` on head of list  |
| `getValue(int i) : Object` | get the value of index ```i``` in list (#)|
| `getIndex(Object value) : int` | get the index of object ```value``` (#)|
| `deleteIndex(int i) : void` | delete index ```i``` in list (#)|
| `deleteValue(Object value) : void` | delete object ```value``` in list (#)|
| `getSize() : int` | get the size of list|
> if any index or object is not in the list and you use any of (#) you will get an exception
#  
 compiled in Java16. 

    
    
    

#
<b><i>Code and Design By Eng.Parsa Gh (Bu64p)</b></i>
