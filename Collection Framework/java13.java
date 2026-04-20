// gc-> garbage collection

public class GC {
    static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Apple", "16 pro max");
            System.out.println(mobilePhone);
            mobilePhone = null;
       System.out.println(mobilePhone);
        System.gc();
        }
    }

    class MobilePhone {
        public String brand;

        public String model;

        public MobilePhone(String brand , String model) {
            this.brand = brand;
            this.model = model;
        }

        @Override
        public String toString() {
            return "MobilePhone{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    '}';
        }
    }



