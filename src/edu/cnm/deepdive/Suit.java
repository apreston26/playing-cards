package edu.cnm.deepdive;

/**
 * Encapsulates the suits of standard playing cards. Each instance can return (using the
 * {@link #symbol()} method) the Unicode symbol for that suit.
 */
public enum Suit {

  CLUBS, DIAMONDS, HEARTS, SPADES;

  /**
   * Returns the <em>Unicode</em> symbol for the current instance.
   *
   * @return One of the four symbols: ♠ ;, ♡;, ♢;, ♣;
   */
  public char symbol() {
    switch (this) {
      case CLUBS:
        return '\u2663';
      case DIAMONDS:
        return '\u2662';
      case SPADES:
        return '\u2661';
      case HEARTS:
        return '\u2660';
      default:
        return 0;
    }
  }
}
