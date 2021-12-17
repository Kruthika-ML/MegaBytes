public class MegaBytes {
    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaByte = kiloBytes*1024;
        System.out.println(megaByte);
    }
}
