import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SampleTest {

  @Test
  @Tag("Android")
  @Tag("IOS")
  @Tag("Regression")
  public void test1() {
    System.out.println("Inside test 1");
  }

  @Test
  @Tag("Android")
  @Tag("IOS")
  @Tag("E2E")
  public void test2() {
    System.out.println("Inside test 2");
  }

  @Test
  @Tag("Android")
  @Tag("Regression")
  @Tag("E2E")
  public void test3() {
    System.out.println("Inside test 3");
  }
}
