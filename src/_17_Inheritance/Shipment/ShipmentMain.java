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

        BikeShipment bs1 = new BikeShipment("대전","대구");
        System.out.println(bs1.route());
        System.out.println(bs1.calcFee(200,100));
        System.out.println(bs1.calcFee(-100,-100));

        TruckShipment ts1 = new TruckShipment("광주","세종");
        System.out.println(ts1.route());
        System.out.println(ts1.calcFee(200,100));
        System.out.println(ts1.calcFee(-100,-100));

    }

}
