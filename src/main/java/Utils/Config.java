package Utils;

public class Config {
    //environment getter
    public static class Environment {
        private String[] setEnvironmentValues = new String[3];

        // Setter method to set all three values at once
        public void setEnvironmentValues(String stg, String pro, String dev) {
            setEnvironmentValues[0] = stg;
            setEnvironmentValues[1] = pro;
            setEnvironmentValues[2] = dev;
        }

        // Getter method to retrieve one value by index
        public String getValue(int index) {
            return setEnvironmentValues[index];

        }
    }
}