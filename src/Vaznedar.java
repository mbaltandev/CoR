public class Vaznedar extends Employee{
    @Override
    public void ProccesRequest(Withdraw req) {
        if (req.getAmount()<=5000){
            System.out.println("Para cekme islemi vaznedar onaylandi "+req.getAmount()+" TL");

        }
        else if (employee!=null){
            System.out.println("Maksimum 5k cekebilirsiniz sizi yoneticiye aktardık");
            employee.ProccesRequest(req);
        }
    }
}
