var singleNumber = function (nums) {
  for (let i = 0; i < nums.length; i++) {
    let check = true;
    for (let j = 0; j < nums.length; j++) {
      if (nums[i] == nums[j]) {
        check = false;
      }
    }
    if (check) {
      return nums[i];
    }
  }
};
const nums = [2, 2, 1];
console.log(singleNumber(nums));
