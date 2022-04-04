package abstraction;

interface RealInterface{
    void sum();//abstract methhod
    default void eq(){
        System.out.println("ok");
    }
}

public class FakeInterface implements RealInterface{
    @Override
    public void sum() {
        System.out.println();
    }

    @Override
    public void eq() {
        RealInterface.super.eq();
    }
}
