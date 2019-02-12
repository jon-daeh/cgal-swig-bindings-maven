/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_3;

public class Mesh_3_Badness {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_3_Badness(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_3_Badness obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_3JNI.delete_Mesh_3_Badness(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Mesh_3_Badness() {
    this(CGAL_Mesh_3JNI.new_Mesh_3_Badness(), true);
  }

  public boolean empty() {
    return CGAL_Mesh_3JNI.Mesh_3_Badness_empty(swigCPtr, this);
  }

  public Mesh_3_Quality value() {
    return new Mesh_3_Quality(CGAL_Mesh_3JNI.Mesh_3_Badness_value(swigCPtr, this), false);
  }

  public Mesh_3_Badness clone() {
    return new Mesh_3_Badness(CGAL_Mesh_3JNI.Mesh_3_Badness_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_3_Badness other) {
    CGAL_Mesh_3JNI.Mesh_3_Badness_clone__SWIG_1(swigCPtr, this, Mesh_3_Badness.getCPtr(other), other);
  }

}
