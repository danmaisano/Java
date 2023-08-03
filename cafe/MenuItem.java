public class MenuItem {
        private String name;
        private double price;
        private int maxQuantity;

        public MenuItem(String name, double price, int maxQuantity) {
            this.name = name;
            this.price = price;
            this.maxQuantity = maxQuantity;
        }

        // Getters and setters (optional, but recommended for accessing the properties)
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getMaxQuantity() {
            return maxQuantity;
        }

        public void setMaxQuantity(int maxQuantity) {
            this.maxQuantity = maxQuantity;
        }
    }