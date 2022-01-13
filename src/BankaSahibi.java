public class BankaSahibi extends Employee {
    @Override
    public void ProccesRequest(Withdraw req) {
        if (req.getAmount()<=50000 && req.getAmount()>20000 ){
            System.out.println("Para cekme islemi banka sahibi onaylandi "+req.getAmount()+" TL");
        }
        else {
             if (employee!=null && req.getAmount()<20000 ){
                System.out.println("20k-50k cekebilirsiniz sizi ilgili birime yonlendiriyorum");
                 employee.ProccesRequest(req);
            }
             else{
                 System.out.println("Limiti aştığınız için onaylanmadı "+req.getAmount()+" kim kime verir");


             }

        }


    }
}
