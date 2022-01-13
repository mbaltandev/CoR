public class Main {

    public static void main(String[] args) {
	Withdraw withdraw=new Withdraw(31,6266,12321,321);
	Withdraw withdraw2=new Withdraw(31,31,12321,321);
        Yonetici Yonetici=new Yonetici();
        Vaznedar Vaznedar=new Vaznedar();
        BankaSahibi BankaSahibi=new BankaSahibi();
        Vaznedar.sonraki(Yonetici);
        Yonetici.sonraki(BankaSahibi);
        BankaSahibi.sonraki(Vaznedar);


        Vaznedar.ProccesRequest(withdraw);
        Vaznedar.ProccesRequest(withdraw2);


    }
}
