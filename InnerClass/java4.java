public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void ReservedRooms(String guestName, int numOfRooms) {

        class ReservationValidator {

            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("guest name can not be empty !");
                    return false;
                }
                if (numOfRooms < 0) {
                    System.out.println("number of rooms should be positiv");
                    return false;
                }
                if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println("not enough rooms available");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()) {
            reservedRooms += numOfRooms;
            System.out.println("reservation confirmed for " + guestName + " for " + numOfRooms + " rooms.");
        } else {
            System.out.println("reservation failed");
        }
    }
}
