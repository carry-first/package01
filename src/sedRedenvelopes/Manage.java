package sedRedenvelopes;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Random;

public class Manage extends User {

    public Manage(String name, int totalMoney) {
        super(name, totalMoney);
    }

    public void send(int money, int count) {
        ArrayList<Integer> currentMoney = new ArrayList<>();
        Random rm = new Random();
        double min = 0.1;
        int t = count > 1 ? count : 1;
        double max = money / t;
        for (int i = 0; i < count - 1; i++) {
            if (rm.nextInt(10) < money / 1)
                currentMoney.add(new Random().nextInt(count) + 1);
        }
    }
}
