package springIoc;

public class Injected {
    private Depended depended;
    public void setDepended(Depended depended) {
        this.depended = depended;
    }
    public void printName(){
        System.out.println(depended.getName());
    }

}
