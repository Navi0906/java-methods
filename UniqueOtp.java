import java.util.*;

public class UniqueOtp {

    // Method to generate a 6-digit OTP number
    public static String generateOtp() {
        int otp = 100000 + (int) (Math.random() * 900000);
        return String.valueOf(otp); 
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOtpsUnique(String[] otps) {
        Set<String> otpSet = new HashSet<>();
        for (String otp : otps) {
            if (!otpSet.add(otp)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        String[] otps = new String[10]; 

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOtp();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (String otp : otps) {
            System.out.println(otp);
        }

        // Check if the OTPs are unique
        boolean unique = areOtpsUnique(otps);
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}