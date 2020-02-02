nums = [2, 7, 11, 15]
target = 9


def PairFinder(numList, target):
    for num in nums:
        j = nums.index(num) + 1
        while j <= len(nums)-1:
            result = num + nums[j]
            if result == target:
                return [nums.index(num), nums.index(nums[j])]
            else:
                return "No pair's sum equals the target"
            j += 1


answer = PairFinder(nums, target)  # returns [0,1]
print(answer)
