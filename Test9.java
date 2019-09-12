class SameConstantBinaryExpressions {
  public void test() {
    int a = 8;
    if (a == 8) {
      return;
    }
    if (a <= 8) {
      return;
    }
    if (a >= 8) {
      return;
    }
    if (8 != a) {
      return;
    }
    foo();
  }
}
