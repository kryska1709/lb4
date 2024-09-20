import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < 3; i++) {
                ProcessBuilder procBuilder = new ProcessBuilder("mspaint.exe");
                Process process = procBuilder.start();//запускаем
                    Thread.sleep(1000); // ждем
                process.destroy(); // убиваем процесс

            }
        }
    }
