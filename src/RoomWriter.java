
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class RoomWriter {

    public void writeRoomFile(String fileName, List<Room> roomList) {
        ObjectOutputStream oos = null;

        try {
            // Create the streams
            FileOutputStream fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);

            // Write the objects
            for (Room room : roomList) {
                oos.writeObject(room);
            }

            System.out.println("Rooms successfully written");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the file
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
