package Lab06;

import java.io.PrintStream;
import java.util.Random;

public class PhoneNumbers
{
  public PhoneNumbers()
  {
    Random random = new Random();
    int[] phoneNumber = new int[10];
    for (int i = 0; i < 3; i++) {
      phoneNumber[i] = random.nextInt(8);
    }
    int secondThreeTotal = random.nextInt(636);
    
    int firstDigit = secondThreeTotal / 100;
    int secondDigit = (secondThreeTotal - firstDigit * 100) / 10;
    int thirdDigit = secondThreeTotal - firstDigit * 100 - secondDigit * 10;
    
    phoneNumber[3] = firstDigit;
    phoneNumber[4] = secondDigit;
    phoneNumber[5] = thirdDigit;
    for (int i = 6; i < 10; i++) {
      phoneNumber[i] = random.nextInt(10);
    }
    System.out.println(formatPhoneNumber(phoneNumber));
  }
  
  private String formatPhoneNumber(int[] phoneNumber)
  {
    StringBuilder sb = new StringBuilder();
    sb.append(phoneNumber[0])
      .append(phoneNumber[1])
      .append(phoneNumber[2])
      .append("-")
      .append(phoneNumber[3])
      .append(phoneNumber[4])
      .append(phoneNumber[5])
      .append("-")
      .append(phoneNumber[6])
      .append(phoneNumber[7])
      .append(phoneNumber[8])
      .append(phoneNumber[9]);
    return sb.toString();
  }
  
  public static void main(String[] args)
  {
    for (int i = 0; i < 100; i++) {
      PhoneNumbers localPhoneNumbers = new PhoneNumbers();
    }
  }
}
