class StackImpl<T> implements Stack<T> {
    private int limit;
    private int p;
    private T[] data;
    public StackImpl(int num)
    {
        data= (T[])new Object[num];
        setLimit(num);
    }
    public void setLimit(int var)
    {
        this.limit = var;
    }
    public int getLimit()
    {
        return this.limit;
    }

    public int size(){
        return p;
    }
    public boolean plena(){
        if(p>limit)
            return true;
        else return false;
    }


    public void push(T t) throws PilaLlenaException{
        if(this.plena())
        {
            throw new PilaLlenaException();
        }
        this.data[this.p++]=t;
        this.p++;
    }



    public T pop() throws PilaVaciaException{
        if(this.size()==0)
        {
            throw new PilaVaciaException();
        }
        T t=this.data[this.p--];
        this.p--;
        return t;
    }
}
