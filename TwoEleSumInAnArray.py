def twoNumberSum(array, targetSum):
    # Write your code here.
	array.sort();
	i = 0;
	j = len(array) - 1;
	while i < j:
		currentSum = array[i] + array[j];
		if currentSum == targetSum:
			return [array[i], array[j]];
		elif currentSum < targetSum:
			i = i + 1;
		else :
			j = j - 1;
	return [];
