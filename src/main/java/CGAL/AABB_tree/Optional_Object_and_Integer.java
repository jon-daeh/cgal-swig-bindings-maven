/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.AABB_tree;

public class Optional_Object_and_Integer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Optional_Object_and_Integer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Optional_Object_and_Integer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_AABB_treeJNI.delete_Optional_Object_and_Integer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Optional_Object_and_Integer() {
    this(CGAL_AABB_treeJNI.new_Optional_Object_and_Integer(), true);
  }

  public boolean empty() {
    return CGAL_AABB_treeJNI.Optional_Object_and_Integer_empty(swigCPtr, this);
  }

  public Object_and_Integer value() {
    return new Object_and_Integer(CGAL_AABB_treeJNI.Optional_Object_and_Integer_value(swigCPtr, this), false);
  }

  public Optional_Object_and_Integer clone() {
    return new Optional_Object_and_Integer(CGAL_AABB_treeJNI.Optional_Object_and_Integer_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Optional_Object_and_Integer other) {
    CGAL_AABB_treeJNI.Optional_Object_and_Integer_clone__SWIG_1(swigCPtr, this, Optional_Object_and_Integer.getCPtr(other), other);
  }

}
