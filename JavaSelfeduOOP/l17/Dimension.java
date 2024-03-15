package JavaSelfeduOOP.l17;

public class Dimension {
        private int width;
        private int height;
        private int bold;

        public Dimension(int width, int height, int bold) {
            this.width = width;
            this.height = height;
            this.bold = bold;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setBold(int bold) {
            this.bold = bold;
        }

        public int getBold() {
            return bold;
        }


        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

    @Override
    public String toString() {
        return "Dimension{" +
                "width=" + width +
                ", height=" + height +
                ", bold=" + bold +
                '}';
    }
}


