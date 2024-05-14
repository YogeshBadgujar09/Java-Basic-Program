class RotateArray{

    public void rotate(int[] nums , int k)
    {
        if(k > nums.length)
        {
            k = k % nums.length ;
        }

        int[] result = new int[nums.length];

        for(int i=0 ; i<k ; i++)
        {
            result[i] = nums[nums.length - k+i];
        }

        int j=0 ;

        for(int i=k ; i<nums.length  ; i++)
        {
            result[i] = nums[j];
            j++ ;
        }


        System.arraycopy(result,0,nums,0,nums.length);

    }

    public static void main(String args[])
    {
        int nums[] = {2,4,3,1,4};
        int k=5;

        RotateArray obj = new RotateArray();
        obj.rotate(nums ,k);


    }




}
