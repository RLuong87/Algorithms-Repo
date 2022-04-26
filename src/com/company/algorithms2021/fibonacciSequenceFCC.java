
// Fibonacci Sequence Java challenege with our instructor Gabe(CareerDevs) 

public int fib(int pos) {

    if (pos == 0) return 0;
    if (pos == 1) return 1;
    int a = 0;
    int b = 1;
    int c = 0;

    for (int i = 0; i < pos; i++) {
        System.out.println(a);
        c = a + b;
        a = b;
        b = c;

    }
    return a;