impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut ans:Vec<i32> = Vec::new();

        for i in 0..nums.len()-1 {
            for j in i+1..nums.len() {
                if (nums[i] + nums[j]) == target {
                    ans.push(i.to_string().trim().parse::<i32>().unwrap());
                    ans.push(j.to_string().trim().parse::<i32>().unwrap());
                    return ans;
                }
            }
        }

        ans
    }
}