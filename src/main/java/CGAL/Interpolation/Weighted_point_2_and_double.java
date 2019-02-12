/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Interpolation;
import CGAL.Kernel.Weighted_point_2;
public class Weighted_point_2_and_double {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Weighted_point_2_and_double(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Weighted_point_2_and_double obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_InterpolationJNI.delete_Weighted_point_2_and_double(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Weighted_point_2_and_double() {
    this(CGAL_InterpolationJNI.new_Weighted_point_2_and_double__SWIG_0(), true);
  }

  public Weighted_point_2_and_double(Weighted_point_2 first, double second) {
    this(CGAL_InterpolationJNI.new_Weighted_point_2_and_double__SWIG_1(Weighted_point_2.getCPtr(first), first, second), true);
  }

  public Weighted_point_2_and_double(Weighted_point_2_and_double p) {
    this(CGAL_InterpolationJNI.new_Weighted_point_2_and_double__SWIG_2(Weighted_point_2_and_double.getCPtr(p), p), true);
  }

  public void setFirst(Weighted_point_2 value) {
    CGAL_InterpolationJNI.Weighted_point_2_and_double_first_set(swigCPtr, this, Weighted_point_2.getCPtr(value), value);
  }

  public Weighted_point_2 getFirst() {
    long cPtr = CGAL_InterpolationJNI.Weighted_point_2_and_double_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Weighted_point_2(cPtr, false);
  }

  public void setSecond(double value) {
    CGAL_InterpolationJNI.Weighted_point_2_and_double_second_set(swigCPtr, this, value);
  }

  public double getSecond() {
    return CGAL_InterpolationJNI.Weighted_point_2_and_double_second_get(swigCPtr, this);
  }

}
