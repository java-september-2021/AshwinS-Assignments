public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
        String versionNumber = getVersionNumber();
        String ringTone = getRingTone();
        return("Iphone " + versionNumber + " says " + ringTone);
    }
    @Override
    public String unlock() {
        // your code here
        return("Unlocking via facial recognition");
    }
    @Override
    public void displayInfo() {
        // your code here            
        String versionNumber = getVersionNumber();
        String carrier = getCarrier();
        System.out.println(String.format("Iphone %s from %s",versionNumber,carrier));    }
}

