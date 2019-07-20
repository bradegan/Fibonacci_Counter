

public class FibonacciCounter {
  public int count;
  public long value;
  /**
   * Construct a FibonacciCounter box object that has the provided count parameters
   *
   * @param count
   *
   */

  public FibonacciCounter(int count) {


    this.count = count;

    double part1 = Math.pow(((1 + Math.sqrt(5)) / 2), count);
    double part2 = Math.pow(((1 - Math.sqrt(5)) / 2), count);
    double part3 = (1 / Math.sqrt(5)) * (part1 - part2);
    this.value = Math.round(part3);
  }
  /**
   Returns  fibonaccicounter object with increased count
   @return an object
   */
  public FibonacciCounter increaseCount() {
    this.count = count + 1;
    return new FibonacciCounter(this.count);

  }

  /**
   Returns  fibonaccicounter object with decreased count
   @return an object
   */
  public FibonacciCounter decreaseCount() {
    if (count >= 1) {
      this.count = (count - 1);
      return new FibonacciCounter(this.count);
    }
    return new FibonacciCounter(this.count);
  }
  /**
   Returns  count
   @return count, an int
   */
  public int getCount() {

    return (this.count);
  }

  /**
   Returns  value
   @return value, an int
   */
  public long getValue() {

    return this.value;
  }
}


