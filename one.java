import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class one {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter file name: ");
String filename = sc.hasNext() ? sc.next() : "sample.txt";
File f = new File(filename);
if (!f.exists()) {
try {
FileWriter fw = new FileWriter(f);
fw.write("Core Java Examination");
fw.close();
} catch (IOException e) {
System.out.println("Error initializing file.");
}
}
try {
FileReader fr = new FileReader(f);
StringBuilder sb = new StringBuilder();
int ch;
while ((ch = fr.read()) != -1) {
sb.append((char) ch);
}
fr.close();
sb.reverse();
StringBuilder result = new StringBuilder();
for (int i = 0; i < sb.length(); i++) {
char c = sb.charAt(i);
if (Character.isUpperCase(c)) {
result.append(Character.toLowerCase(c));
} else if (Character.isLowerCase(c)) {
result.append(Character.toUpperCase(c));
} else {
result.append(c);
}
}
System.out.println("Output in reverse order with toggled case:");
System.out.println(result.toString());
} catch (IOException e) {
System.out.println("File read error: " + e.getMessage());
}
sc.close();
}
}
