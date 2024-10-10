public class Date
{
    private int day, month, year;

    public Date(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    public void setDay(int day)
    {
        this.day=day;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setDate(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String toString()
    {
        String s;
        String s1;
        String s2;
        if(this.day<10)
        {
            s="0"+this.day;
        }else
        {
            s=this.day+"";
        }
        if(this.month<10)
        {
            s1="0"+this.month;
        }else
        {
            s1=this.month+"";
        }
        if(this.year<1000)
        {
            s2="0"+this.year;
            if(this.year<100)
            {
                s2="00"+this.year;
                if(this.year<10)
                {
                    s2="000"+this.year;
                }
            }
        }else
        {
            s2=this.year+"";
        }
        return s+"/"+s1+"/"+s2;
    }
}
