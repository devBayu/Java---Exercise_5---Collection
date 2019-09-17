import com.enigma.model.MultiFriends;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<MultiFriends> alucardFriends = new ArrayList<>();

        alucardFriends.add(new MultiFriends("Tigreal"));
        alucardFriends.add(new MultiFriends("Saber"));
        alucardFriends.add(new MultiFriends("Gusion"));
        alucardFriends.add(new MultiFriends("Dyroth"));
        alucardFriends.add(new MultiFriends("Miya"));
        alucardFriends.add(new MultiFriends("Hayabusa"));
        alucardFriends.add(new MultiFriends("Miya"));

        List<MultiFriends> lancelotFriends = new ArrayList<>();

        lancelotFriends.add(new MultiFriends("Gusion"));
        lancelotFriends.add(new MultiFriends("Saber"));
        lancelotFriends.add(new MultiFriends("Hayabusa"));
        lancelotFriends.add(new MultiFriends("Miya"));
        lancelotFriends.add(new MultiFriends("Tigreal"));
        lancelotFriends.add(new MultiFriends("Gatot Kaca"));
        lancelotFriends.add(new MultiFriends("Lesley"));

        alucardFriends.retainAll(lancelotFriends);
            for (MultiFriends friend:alucardFriends){
                System.out.println("Teman Yang sama adalah :" + friend.getNameFriends());

            }
        }
    }
