
public class CashRegister {

    private final double ECON_LUNCH = 2.50;
    private final double GOURMET_LUNCH = 4.00;
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        if (cashGiven < ECON_LUNCH) {
            return cashGiven;
        }
        this.cashInRegister += ECON_LUNCH;
        this.economicalSold++;
        return cashGiven - ECON_LUNCH;
    }
    
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() < ECON_LUNCH) {
            return false;
        }
        card.pay(ECON_LUNCH);
        this.economicalSold++;
        return true;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if (cashGiven < GOURMET_LUNCH) {
            return cashGiven;
        }
        
        this.cashInRegister += GOURMET_LUNCH;
        this.gourmetSold++;
        return cashGiven - GOURMET_LUNCH;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() < GOURMET_LUNCH) {
            return false;
        }
        card.pay(GOURMET_LUNCH);
        this.gourmetSold++;
        return true;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
