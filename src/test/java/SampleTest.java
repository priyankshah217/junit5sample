import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SampleTest {

  @Test
  @Tag("Android")
  @Tag("IOS")
  @Tag("Regression")
  public void test1() throws InterruptedException {
    Thread.sleep(10_000);
    System.out.println("Inside test 1 " + "Run on Thread: " + Thread.currentThread().getId());
  }

  @Test
  @Tag("Android")
  @Tag("IOS")
  @Tag("E2E")
  public void test2() throws InterruptedException {
    Thread.sleep(10_000);
    System.out.println("Inside test 2 " + "Run on Thread: " + Thread.currentThread().getId());
  }

  @Test
  @Tag("Android")
  @Tag("Regression")
  @Tag("E2E")
  public void test3() throws InterruptedException {
    Thread.sleep(10_000);
    System.out.println("Inside test 3 " + "Run on Thread: " + Thread.currentThread().getId());
  }
}
