// * @param {ListNode} l1
// * @param {ListNode} l2
// * @return {ListNode}
// */
var addTwoNumbers = function (l1, l2) {
  let previousNode = new ListNode(0);
  const headNode = previousNode;
  let carry = 0;
  let sum = 0;
  while (l1 != null || l2 != null || sum > 0) {
    if (l1 != null) {
      sum += l1.val;
      l1 = l1.next;
    }
    if (l2 != null) {
      sum += l2.val;
      l2 = l2.next;
    }
    if (sum >= 10) {
      carry = 1;
      sum = sum - 10;
    }
    headNode.next = new ListNode(sum);
    headNode = headNode.next;
    sum = carry;
    carry = 0;
  }
  return previousNode.next;
};
const l1 = [2, 4, 3];
const l2 = [5, 6, 4];
console.log(addTwoNumbers(l1, l2));
