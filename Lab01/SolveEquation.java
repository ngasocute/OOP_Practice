public class SolveEquation {
    public void firstDegree(double a, double b) {
        // solve equation ax + b = 0
        // result is x = -b/a
        System.out.println("Result of equation " + a + "x + " + b + " = 0 is x = " + (-b / a));
    }

    public void secondDegree(double a, double b, double c) {
        // solve equation ax^2 + bx + c = 0
        // result is x1 = (-b + sqrt(b^2 - 4ac))/2a, x2 = (-b - sqrt(b^2 - 4ac))/2a
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("The equation " + a + "x^2 + " + b + "x + " + c + " = 0 has no solution");
        } else if (delta == 0) {
            System.out.println("Result of equation " + a + "x^2 + " + b + "x + " + c + " = 0 is x1 = "
                    + (-b / (2 * a)));
        } else {
            System.out.println("Result of equation " + a + "x^2 + " + b + "x + " + c + " = 0 is x1 = "
                    + (-b + Math.sqrt(delta)) / (2 * a) + " and x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }

    public void systemFistDegressWithTwoVariable(double a11, double a12, double a21, double a22, double b1,
            double b2) {
        // solve equation a11x + a12y = b1, a21x + a22y = b2
        double D, D1, D2, x, y;
        D = a11 * a22 - a12 * a21;
        D1 = b1 * a22 - b2 * a12;
        D2 = a11 * b2 - a21 * b1;
        if (D != 0) {
            x = D1 / D;
            y = D2 / D;
            System.out.println("Result of equation " + a11 + "x + " + a12 + "y = " + b1 + ", " + a21 + "x + " + a22
                    + "y = " + b2 + " is x = " + x + " and y = " + y);
        } else {
            if (D == D1 && D1 == D2) {
                System.out.println("The equation" + a11 + "x + " + a12 + "y = " + b1 + ", " + a21 + "x + " + a22
                        + "y = " + b2 + " has infinity solution");

            } else {
                System.out.println("The equation" + a11 + "x + " + a12 + "y = " + b1 + ", " + a21 + "x + " + a22
                        + "y = " + b2 + " has no solution");
            }
        }
    }

    public static void main(String[] args) {
        SolveEquation solve = new SolveEquation();
        solve.firstDegree(1, 2);
        solve.secondDegree(1, 2, 3);
        solve.systemFistDegressWithTwoVariable(1, 2, 3, 4, 5, 6);
    }
}
