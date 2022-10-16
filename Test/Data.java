package test;

import java.util.Objects;

class Data implements Comparable<Data>
{
    private int first, second;

    public Data(int first, int second) 
    {
        this.first = first;
        this.second = second;
    }
    
    public int getFirst() 
    {
        return first;
    }

    public int getSecond() 
    {
        return second;
    }

    @Override
    public int compareTo(Data that)
    {
        return this.first-that.first;
    }
    
    @Override
    public String toString()
    {
        return "(" + first + ", " + second + ")";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null) return false;
        if(obj instanceof Data)
        {
            Data that = (Data)obj;
            return this.first == that.first && this.second == that.second;
        }
        return false;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(first, second);
    }
}
