package philipuskristianrenaldy.jwork;

import java.util.ArrayList;

/**
 * Write a description of class DatabaseBonus here.
 *
 * @author (Philipus Kristian Renaldy)
 * @version (1 - 4 - 2021)
 */
public class DatabaseBonus {
    // instance variables - replace the example below with your own
    private static ArrayList<Bonus> BONUS_DATABASE = new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase() {
        return BONUS_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                x = bonus;
                return x;
            }
        }
        if (x == null){
            throw new BonusNotFoundException(id);
        }
        return x;
    }

    public static Bonus getBonusByRefferalCode(String refferalCode) {
        Bonus x = null;
        for (Bonus bonus : BONUS_DATABASE) {
            if (refferalCode.equals(bonus.getReferralCode())) {
                x = bonus;
            }
        }
        return x;
    }

    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus bonus1 : BONUS_DATABASE) {
            if (bonus.getReferralCode() == bonus1.getReferralCode()) {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
            BONUS_DATABASE.add(bonus);
            lastId = bonus.getId();
            return true;
    }

    public static boolean removeBonus(int id) throws BonusNotFoundException {
        try {
            for (Bonus bonus : BONUS_DATABASE) {
                if (bonus.getId() == id) {
                    BONUS_DATABASE.remove(bonus);
                    return true;
                }
            }
        } catch (Exception e) {
            throw new BonusNotFoundException(id);
        }
        return false;
    }

    public static boolean activateBonus(int id) {
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(true);
                x = true;
            }
        }
        return x;
    }

    public static boolean deactivateBonus(int id) {
        boolean x = false;
        for (Bonus bonus : BONUS_DATABASE) {
            if (id == bonus.getId()) {
                bonus.setActive(false);
                x = true;
            }
        }
        return x;
    }
}
