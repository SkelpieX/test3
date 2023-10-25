//Controller Class

public class CashRegisterController {
    private CashRegister cashRegister;
    private CashRegisterView view;

    public CashRegisterController(CashRegister cashRegister, CashRegisterView view) {
        this.cashRegister = cashRegister;
        this.view = view;
    }

    public void scanProduct(String upcCode) {
        Product product = cashRegister.scanProduct(upcCode);
        view.displayProduct(product);
    }
}
