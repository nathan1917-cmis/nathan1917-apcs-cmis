public class LoopPractice
    {
    public static void main ( String[] args)
        {
        int[] nums = new int[10];
        for(int index = 0; index < nums.length; index++ )
            {
            nums[ index ] = index;
            }//end for
        int[] squares = new int[10];
        for(int index = 0; index < squares.length; index++ )
            {
            squares[ index ] = index ^ 2;
            }//end for
        for(int index = 0; index < nums.length; index++ )
            {
            System.out.println(nums[ index ] + "\t" + squares[ index ]);
            }//end for
        }//end method main
        
    }//end class LoopPractice