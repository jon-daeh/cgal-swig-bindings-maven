/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Ref_int {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Ref_int(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Ref_int obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Ref_int(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Ref_int() {
    this(CGAL_KernelJNI.new_Ref_int__SWIG_0(), true);
  }

  public Ref_int(int k) {
    this(CGAL_KernelJNI.new_Ref_int__SWIG_1(k), true);
  }

  public void set(int t) {
    CGAL_KernelJNI.Ref_int_set(swigCPtr, this, t);
  }

  public int object() {
    return CGAL_KernelJNI.Ref_int_object(swigCPtr, this);
  }

  public Ref_int clone() {
    return new Ref_int(CGAL_KernelJNI.Ref_int_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Ref_int other) {
    CGAL_KernelJNI.Ref_int_clone__SWIG_1(swigCPtr, this, Ref_int.getCPtr(other), other);
  }

}
