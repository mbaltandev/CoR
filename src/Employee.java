public abstract class Employee {
    protected Employee employee;

    public void sonraki(Employee employee){
        this.employee=employee;
    }
    public abstract void ProccesRequest(Withdraw req);
}
