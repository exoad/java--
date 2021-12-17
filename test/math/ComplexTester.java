package test.math;

import jlibxx.math.Complex;
import test.TesterTools;

public class ComplexTester extends TesterTools {
  public static void main(String[] args) {
    Complex complex = new Complex(3.0, 4.0);
    toString((complex.abs() == 5.0 ? "Passed | " + complex.abs() : "Failed | " + complex.abs()));

    complex = new Complex(0, 1);
    toString((complex.arg() == 0.0 ? "Passed | " + complex.arg() : "Failed | " + complex.arg()));
  }
}
