/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

public class Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle() {
    this(CGAL_Triangulation_2JNI.new_Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle__SWIG_0(), true);
  }

  public Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle(Constrained_Delaunay_triangulation_plus_2_Vertex_handle k) {
    this(CGAL_Triangulation_2JNI.new_Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle__SWIG_1(Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(k), k), true);
  }

  public void set(Constrained_Delaunay_triangulation_plus_2_Vertex_handle t) {
    CGAL_Triangulation_2JNI.Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle_set(swigCPtr, this, Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(t), t);
  }

  public Constrained_Delaunay_triangulation_plus_2_Vertex_handle object() {
    return new Constrained_Delaunay_triangulation_plus_2_Vertex_handle(CGAL_Triangulation_2JNI.Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle_object(swigCPtr, this), true);
  }

  public Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle clone() {
    return new Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle(CGAL_Triangulation_2JNI.Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle other) {
    CGAL_Triangulation_2JNI.Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle_clone__SWIG_1(swigCPtr, this, Ref_Constrained_Delaunay_triangulation_plus_2_Vertex_handle.getCPtr(other), other);
  }

}