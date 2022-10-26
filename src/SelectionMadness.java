public class SelectionMadness {
    public SelectionMadness() { }

    public boolean flipCoin() {
        int random = (int) (Math.random() * 2) + 1;
        return random > 1;
    }

    public int largest(int num1, int num2, int num3) {
        if (num1 >= num2) {
            if (num1 >= num3) {
                return num1;
            }
        }
        if (num2 >= num1){
            if (num2 >= num3){
                return num2;
            }
        }
        return num3;
    }

    public boolean rightTriangle(int side1, int side2, int side3) {
        if (largest(side1, side2, side3) == side1){
            if (Math.pow(side1,2) == Math.pow(side2,2) + Math.pow(side3, 2)){
                return true;
            }
            return false;
        }
        if (largest(side1, side2, side3) == side2){
            if (Math.pow(side2,2) == Math.pow(side1,2) + Math.pow(side3, 2)){
                return true;
            }
            return false;
        }
        if (largest(side1, side2, side3) == side3){
            if (Math.pow(side3,2) == Math.pow(side1,2) + Math.pow(side2, 2)){
                return true;
            }
            return false;
        }
        return true;
    }

}
