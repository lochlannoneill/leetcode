# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]
# Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    num_dict = {}
    for i, num in enumerate(nums):
        difference = target - num
        if difference in num_dict:
            return [num_dict[difference], i]
        num_dict[num] = i
    return []
    
def main():
    nums = [2, 7, 11, 15]
    print(twoSum(nums, 9))
    
    nums = [3, 2, 4]
    print(twoSum(nums, 6))
    
    nums = [3, 3]
    print(twoSum(nums, 6))

if __name__ == "__main__":
    main()
    
    