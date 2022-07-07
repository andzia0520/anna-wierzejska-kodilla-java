public class Adder {
    public int sumAllFromOneTillX(int x) {
        int suma = 0;
        for (int i = 1; i <= x; i++) {
            suma += i;
        }
        return suma;
    }
}
