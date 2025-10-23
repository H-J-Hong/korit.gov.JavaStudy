package _16_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;

    public WaterBottle() {
        this.currentWater = 0;
    }

    public int getCurrentWater() {
        System.out.println("===================================");
        System.out.println("병 안에 현재 " + currentWater + "ml의 물이 남아 있습니다.");
        System.out.println("===================================");

        return this.currentWater;
    }

    public void fill(int water) {
        if (water <= 0) System.out.println("물을 채울 수 없습니다.");
        else if ((currentWater + water) > 1000) System.out.println("물이 넘칩니다.");
        else {
            this.currentWater += water;
            System.out.println("병에 물을 " + water + "ml 만큼 채웠습니다.");
            this.getCurrentWater();
        }
    }

    public void drink(int water) {
        if (water <= 0) System.out.println("물을 마실 수 없습니다.");
        else if (water > currentWater) System.out.println("물이 모자랍니다.");
        else {
            this.currentWater -= water;
            System.out.println("병에 물을 " + water + "ml 만큼 마셨습니다.");
            this.getCurrentWater();
        }
    }
}
