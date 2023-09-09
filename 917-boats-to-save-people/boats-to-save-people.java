class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int count=0;
        while(left<right)
        {
            if(people[left]+people[right]>limit)
            {
                right--;
            }
            else if(people[left]+people[right]<=limit)
            {
                people[left]=Integer.MAX_VALUE;
               people[right]=Integer.MAX_VALUE;
                left++;
                right--;
                count++;
            }
           
        }
        for(int i=0;i<people.length;i++)
        {
            if(people[i]<=limit)
            {
                count++;
            }
        }
        return count;
    }
}