static String[] braces(String[] values) {
    String[] ans = new String[values.length];
    int m=0,flag=0;
    for(String k : values)
    {
        char[] bracketc = k.toCharArray();
        int[] open = new int[3];
        int[] close = new int[3];
        
        for(int i=0 ; i<bracketc.length ; i++)
        {
            if('{' == bracketc[i])
            {
                open[0]++;
            }
            else if('[' == bracketc[i])
            {
                open[1]++;
            }
            else if('(' == bracketc[i])
            {
                open[2]++;
            }
            else if('}' == bracketc[i])
            {
                close[0]++;
            }
            else if(']' == bracketc[i])
            {
                close[1]++;
            }
            else if(')' == bracketc[i])
            {
                close[2]++;
            }
             System.out.print(bracketc[i]);
            
        }
        int j =0 ;
        while(j<3)
        {
            if(open[j] != close [j])
            {
                flag = 1;
            }
            j++;
        }
        
        if(flag == 1)
        {
            ans[m] = "YES";
            //System.out.print("yes");
        }
        else
        {
            ans[m] = "NO";
            //System.out.print("no");
        }
        
        
    }
    return  ans;

    }
