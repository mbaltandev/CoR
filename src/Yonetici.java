public class Yonetici extends Employee{
    @Override
    public void ProccesRequest(Withdraw req) {
        if (req.getAmount()<=20000 && req.getAmount()>5000 ){
            System.out.println("Para cekme islemi yonetici tarafindan onaylandi "+req.getAmount()+" TL");
        }
        else if (employee!=null ){
            System.out.println("20k-5k cekebilirsiniz sizi banka sahibine aktardık");
            employee.ProccesRequest(req);
        }
    }
}
