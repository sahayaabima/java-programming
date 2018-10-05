class digitnum {
  public static void main(String[] args) {
  int count = 0, num = 345256;
    while(num != 0)
        {
            num /= 10;
            ++count;
        }

        System.out.println(count);
  }
}