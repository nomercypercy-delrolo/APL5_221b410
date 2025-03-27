abstract class Beverage{
    private void pour(int qty){
        System.out.println("pour "+qty+" ml of beverage to be poured into a glass");
    }
    protected abstract void addcondiment();
    protected  void stir(){}
    private void serve(){
        System.out.println("serve it with a happy face");
    }
    public void templatemethod(int qty){
        pour(qty);
        addcondiment();
        stir();
        serve();
    }
}