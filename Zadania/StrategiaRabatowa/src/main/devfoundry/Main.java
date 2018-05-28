package devfoundry;

import devfoundry.price_calculator.PriceCalculator;
import devfoundry.price_calculator.princing_strategy.RegularPrice;
import devfoundry.price_calculator.princing_strategy.SalePrice;

public class Main {

    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();

        //Użytkownik nie jest zapisany do newslettera - normalna cena
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);

        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);

        //Użytkownik jest zapisany do newslettera
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);

        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);
    }

}
