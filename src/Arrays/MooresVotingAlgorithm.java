package Arrays;

/*

Moore's Voting Algorithm (Majority Element)
Moore's Voting Algorithm is an efficient algorithm used to find the majority element in an array.

A majority element is an element that appears more than N/2 times in an array.

For example:
int[] nums = {2, 2, 1, 3, 1, 1, 3, 1, 1};


Here:
- Array size = 9
- Majority threshold = 9/2 = 4
- Element 1 appears 5 times.
Therefore, the majority element is 1.
1. Main idea behind the algorithm
The algorithm works on a simple concept:

If two different elements cancel each other out, the majority element will still remain.

We maintain two variables:
int cnt = 0;
int el = 0;


- el → Stores the current candidate for the majority element.
- cnt → Stores the voting balance of that candidate.
We follow three rules:
1. If cnt == 0, select the current array element as the new candidate.
2. If the current element equals el, increment cnt.
3. Otherwise, decrement cnt.
2. Dry run with an example
Consider:
int[] nums = {2, 2, 1, 3, 1, 1, 3, 1, 1};


Let's execute the algorithm step by step.
i	nums[i]	el (candidate)	cnt	Operation
0	2	2	1	Select 2, increment
1	2	2	2	Increment
2	1	2	1	Decrement
3	3	2	0	Decrement
4	1	1	1	Select 1, increment
5	1	1	2	Increment
6	3	1	1	Decrement
7	1	1	2	Increment
8	1	1	3	Increment

Final candidate = 1
 */

public class MooresVotingAlgorithm {
    public int majorityElement(int[] nums) {

        int cnt = 0;
        int el = 0;

        // Step 1: Find candidate
        for(int i = 0; i < nums.length; i++) {

            if(cnt == 0) {
                el = nums[i];
            }

            if(el == nums[i]) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        // Step 2: Verify candidate
        int cnt1 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(el == nums[i]) {
                cnt1++;
            }
        }

        if(cnt1 > nums.length / 2) {
            return el;
        }

        return -1;
    }

}
