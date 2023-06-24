package org.fasttrack.tema7;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean isOpen;

    public Bottle(int totalCapacity){
        this.totalCapacity = totalCapacity;
        this.availableLiquid = totalCapacity;
        this.isOpen = false;
    }

    public boolean hasMaxAvailability() {
        return availableLiquid == totalCapacity;
    }
    public int getAvailableLiquid() {
        return availableLiquid;
    }
    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String openBottle() {
        if(isOpen) {
            return "Bottle is already open";
        } else {
            isOpen = true;
            return "Bottle is open";
        }
    }

    public String closeBottle() {
        if(!isOpen) {
            return "Bottle is already closed";
        } else {
            isOpen = false;
            return "Bottle is closed";
        }
    }

    public String drinkLiquid(int amount) {
        if (!isOpen) {
            return "Cannot drink from a closed bottle.";
        }
        if (amount > availableLiquid) {
            return "Not enough liquid in the bottle.";
        }
        availableLiquid -= amount;
        return "Drank " + amount + "ml of liquid.";
    }

}
