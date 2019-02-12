/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Box_intersection_d;

public class Pair_of_int {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Pair_of_int(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Pair_of_int obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Box_intersection_dJNI.delete_Pair_of_int(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Pair_of_int() {
    this(CGAL_Box_intersection_dJNI.new_Pair_of_int__SWIG_0(), true);
  }

  public Pair_of_int(int first, int second) {
    this(CGAL_Box_intersection_dJNI.new_Pair_of_int__SWIG_1(first, second), true);
  }

  public Pair_of_int(Pair_of_int p) {
    this(CGAL_Box_intersection_dJNI.new_Pair_of_int__SWIG_2(Pair_of_int.getCPtr(p), p), true);
  }

  public void setFirst(int value) {
    CGAL_Box_intersection_dJNI.Pair_of_int_first_set(swigCPtr, this, value);
  }

  public int getFirst() {
    return CGAL_Box_intersection_dJNI.Pair_of_int_first_get(swigCPtr, this);
  }

  public void setSecond(int value) {
    CGAL_Box_intersection_dJNI.Pair_of_int_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_Box_intersection_dJNI.Pair_of_int_second_get(swigCPtr, this);
  }

}
