public class TrainConsistManagementApp {

    // Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie model
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type) {
            this.type = type;
        }

        void assignCargo(String cargo) {
            try {
                // Unsafe condition
                if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + type + " -> " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed for " + type);
            }
        }

        public String toString() {
            return type + " (" + cargo + ")";
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("==================================");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("Final Bogies:");
        System.out.println(b1);
        System.out.println(b2);
    }
}