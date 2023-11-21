class Solution {
    public boolean judgeCircle(String moves) {
        int v=0;
        int h=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
                v++;
            else if(moves.charAt(i)=='D')
                v--;
            else if(moves.charAt(i)=='L')
                h++;
            else if(moves.charAt(i)=='R')
                h--;
            
        }
        return (h==0 && v==0)?true:false;
        
    }
}