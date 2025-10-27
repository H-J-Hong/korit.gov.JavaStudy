package _17_Inheritance.Shipment;

/*
 * 배송비 계산기
 * */

public class ShipmentMain {
    public static void main(String[] args) {
        Shipment s1 = new Shipment("부산","서울");
        System.out.println(s1.route());
        System.out.println(s1.calcFee(200,100));
        System.out.println(s1.calcFee(-100,-100));

        BikeShipment bs1 = new BikeShipment("서면","해운대");
        System.out.println(bs1.route());
        System.out.println(bs1.calcFee(5,14));
        System.out.println(bs1.calcFee(-100,-100));

        TruckShipment ts1 = new TruckShipment("부산","서울");
        System.out.println(ts1.route());
        System.out.println(ts1.calcFee(1000,320));
        System.out.println(ts1.calcFee(-100,-100));

    }

}
