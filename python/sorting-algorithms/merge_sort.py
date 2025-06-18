def merge_sort(nums):
    if len(nums) < 2:
        return nums
    mid = len(nums)//2
    l = merge_sort(nums[0:mid])
    r = merge_sort(nums[mid:len(nums)])
    return merge(l,r)


def merge(first, second):
    ## merge 2 sorted arrays - using 2 pointer
    f_len, s_len = len(first), len(second)
    f_counter, s_counter = 0, 0
    merged_list = []
    while f_counter < f_len and s_counter < s_len:
        if first[f_counter] < second[s_counter]:
            merged_list.append(first[f_counter])
            f_counter += 1
        else:
            merged_list.append(second[s_counter])
            s_counter += 1
    while f_counter < f_len:
        merged_list.append(first[f_counter])
        f_counter += 1
    while s_counter < s_len:
        merged_list.append(second[s_counter])
        s_counter += 1
    return merged_list  
