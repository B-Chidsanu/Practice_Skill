//มากสุด 2 ตัวมาคูณกัน
//น้อยสุด 2 ตัวมาคูณกัน
var maxProductDifference = function (nums) {
  nums.sort((a, b) => a - b);
  const max1 = nums[nums.length - 1];
  const max2 = nums[nums.length - 2];
  const min1 = nums[0];
  const min2 = nums[1];

  const sum = max1 * max2 - min1 * min2;
  console.log(nums);
  console.log(max1);
  console.log(max2);
  return sum;
};
const nums = [4, 2, 5, 9, 7, 4, 8];
console.log(maxProductDifference(nums));
