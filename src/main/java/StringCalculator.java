/**
 * Created with IntelliJ IDEA.
 * User: RuaTre_IT
 * Date: 6/3/13
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public int add(String... s) {
        int length= s.length;
        int sum=0;
        if(length==1)
        {
            if(s[0].isEmpty())
                return 0;  //To change body of created methods use File | Settings | File Templates.
            return Integer.parseInt(s[0]);
        }
        else    {
            for(int i=0; i<length;i++)
            {
                if(sumCur(s[i])==1)
                    return -1;
                sum=sum+sumCur(s[i]);
            }
            return sum;
        }
    }

    private int sumCur(String s) {
        int sumCur=0;
        if(s.length()==1)
            return Integer.parseInt(s);
        if(s.contains(",\n"))
            return -1;
        if(s.contains("//;\n"))
            sumCurSpec(s);
        String cru[] = s.split("[,\n]");
        for(int i=0; i<cru.length;i++)
        {
            sumCur=sumCur+Integer.parseInt(cru[i]);
        }
        return sumCur;
    }
    public int sumCurSpec(String s)
    {
        int sumCur=0;
        s = s.substring(4,s.length());
        String cur[] = s.split(";");
        for (int i = 0; i<cur.length; i++)
        {
            sumCur=sumCur +Integer.parseInt(cur[i]);
        }
        return sumCur;
    }

}
