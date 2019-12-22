
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        Member[] allMembers = new Member[]{
                new Member(1, "A", "Ayan"),
                new Member(2, "B", "Byan"),
                new Member(3, "C", "Cyan"),
                new Member(4, "D", "Dyan"),
                new Member(5, "E", "Eyan"),
                new Member(6, "F", "Fyan"),
                new Member(7, "F", "Fyan"),
                new Member(8, "G", "Gyan"),
                new Member(9, "H", "Hyan"),
                new Member(10, "I", "Iyan"),
                new Member(11, "J", "Jyan"),
                new Member(12, "K", "Kyan"),
                new Member(13, "L", "Lyan"),
                new Member(14, "M", "Myan"),
                new Member(15, "N", "Nyan"),
                new Member(16, "O", "Oyan"),
                new Member(17, "P", "Pyan"),
                new Member(18, "Q", "Qyan"),
                new Member(19, "R", "Ryan"),
                new Member(20, "S", "Syan"),
        };


        System.out.print("Enter the number of active members: ");
        Scanner scanner = new Scanner(System.in);

        int numberOfActiveMembers = scanner.nextInt();
        if (numberOfActiveMembers > allMembers.length) {
            System.out.println("There are not so many participants in the chat");
        }

        Random random = new Random();

        HashSet<Member> activeMembers = new HashSet<>();
        System.out.println("online");
        while (activeMembers.size() < numberOfActiveMembers) {
            activeMembers.add(allMembers[random.nextInt(allMembers.length)]);
        }
        for (Member temp : activeMembers) {
            System.out.println(temp);
        }
        System.out.println("--------------\n");

        String text = "";
        int currentMember = -1;

        boolean endOfChat = false;

        while (!endOfChat) {

            Member member = activeMembers.toArray(new Member[activeMembers.size()])[random.nextInt(activeMembers.size())];
            if (member.Id != currentMember) {
                currentMember = member.Id;

                System.out.println(member.name + " is typing ....");

                Scanner typing = new Scanner(System.in);

                while (true) {
                    text = typing.nextLine();

                    if (text.equals("2")) {
                        if (activeMembers.size() == 1) {
                            endOfChat = true;
                        }
                        break;
                    }

                    System.out.println(dtf.format(LocalDateTime.now()) + " " + member.name + " " + text);

                    if (text.equals("offline")) {
                        activeMembers.remove(member);
                        System.out.println("--------------");
                        System.out.println(member.name + " is offline");
                        System.out.println("--------------");
                        if (activeMembers.size() == 0) {
                            endOfChat = true;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println("End of chat, GOOD BYE");
    }
}