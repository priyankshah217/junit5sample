import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SampleTest2 {

  @Test
  @Tag("Android")
  @Tag("IOS")
  @Tag("Regression")
  public void test4() throws InterruptedException {
    Thread.sleep(10_000);
    System.out.println("Inside test 4 " + "Run on Thread: " + Thread.currentThread().getId());
  }

  @Test
  @Tag("Android")
  @Tag("IOS")
  @Tag("E2E")
  public void test5() throws InterruptedException {
    Thread.sleep(10_000);
    System.out.println("Inside test 5 " + "Run on Thread: " + Thread.currentThread().getId());
  }

  @Test
  @Tag("Android")
  @Tag("Regression")
  @Tag("E2E")
  public void test6() throws InterruptedException {
    Thread.sleep(10_000);
    System.out.println("Inside test 6 " + "Run on Thread: " + Thread.currentThread().getId());
  }
}
