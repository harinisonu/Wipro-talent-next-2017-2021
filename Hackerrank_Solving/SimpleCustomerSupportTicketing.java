static String[] braces(String[] values) {
    String[] ans = new String[values.length];
    String bracop="";
    String brackclo="";
    for(String k : values)
    {
        char[] bracketc = k.toCharArray();
        char[] close = new char[bracketc.length];
        bracop="";
        for(int i=0 ; i<bracketc.length ; i++)
        {
            if('{' == bracketc[i] || '[' == bracketc[i] || '(' == bracketc[i])
            {
                bracop = bracop+bracketc[i];
            }
            else 
            {
                close[i] = bracketc[i];
            }
             
        }
        brackclo="";
        for(char b : close)
        {
            if(b == '}')
                brackclo="{"+brackclo;
            else if(b == ']')
                brackclo="["+brackclo;
            else if(b == ')')
                brackclo="("+brackclo;
        }
        if(brackclo.equals(bracop))
        {
            //ans[m] = "YES";
            System.out.print("yes");
        }
        else
        {
            //ans[m] = "YES";
            System.out.print("no");
        }

    }
    return  ans;
    }
