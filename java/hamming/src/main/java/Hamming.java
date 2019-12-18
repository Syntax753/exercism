class Hamming {

    private String leftStrand;
    private String rightStrand;
    private int ham;

    Hamming(String leftStrand, String rightStrand) {

        if (!(leftStrand.isEmpty() && rightStrand.isEmpty()))
            if (leftStrand.isEmpty()) {
                throw new IllegalArgumentException("left strand must not be empty.");
            } else if (rightStrand.isEmpty()) {
                throw new IllegalArgumentException("right strand must not be empty.");
            } else if (leftStrand.length() != rightStrand.length()) {
                throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
            }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.codePointAt(i) != rightStrand.codePointAt(i)) {
                ham++;
            }
        }

        return ham;
    }
}
