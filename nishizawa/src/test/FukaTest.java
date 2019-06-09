package test;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import cyber_dojo_parentheses.Main;

public class FukaTest {

    @Test
    public void 負荷テスト100() throws IOException {
        Path file = Paths.get("負荷テスト100.txt");
        long start = System.currentTimeMillis();
        
        Files.lines(file).forEach(line -> {
            assertTrue(Main.judgePair(line));
        });
        
        long end = System.currentTimeMillis();
        System.out.println("負荷テスト100 : " + (end - start)  + "ms");
    }
    @Test
    public void 負荷テスト1000() throws IOException {
        Path file = Paths.get("負荷テスト1000.txt");
        long start = System.currentTimeMillis();
        
        Files.lines(file).forEach(line -> {
            assertTrue(Main.judgePair(line));
        });
        
        long end = System.currentTimeMillis();
        System.out.println("負荷テスト1000 : " + (end - start)  + "ms");
    }
}
