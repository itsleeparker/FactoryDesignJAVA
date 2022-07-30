import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

public class BuyPhone {
    private String handleInput(){
        String choice = Main.scan.nextLine();
        return choice;
    }

    private void DisplayMenu(){
        System.out.println("======WELCOME TO MOBILE STORE========");
        System.out.println("What would you like to Buy  : ");
        System.out.println("IPhone");
        System.out.println("Android");
        System.out.println("Press Q to exit!");
    }

    private void HandleQuit(@NotNull Boolean quit){
        if(quit){
            System.out.println("====THANKS FOR USE AGAIN======");
            System.exit(1);
        }
    }

    public Os getPhone(){
        String op;
        PhoneFactory factory;
        this.DisplayMenu();
        op = this.handleInput().toUpperCase(Locale.ROOT);
        this.HandleQuit(op.equals("Q"));
        System.out.println("Hey User you bough this phone " + op);
        factory = new PhoneFactory(op);
        return factory.getInstance();
    }
}
