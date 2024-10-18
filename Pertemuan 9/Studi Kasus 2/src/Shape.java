    abstract public class Shape {
        String shapeName;
        abstract double area();

        public Shape(String shapeName) {
            this.shapeName = shapeName;
        }

        @Override
        public String toString() {
            return "This is a " + shapeName;
        }
    }
