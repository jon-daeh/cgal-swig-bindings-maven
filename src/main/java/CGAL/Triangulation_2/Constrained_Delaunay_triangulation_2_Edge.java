/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

public class Constrained_Delaunay_triangulation_2_Edge {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Constrained_Delaunay_triangulation_2_Edge(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constrained_Delaunay_triangulation_2_Edge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Constrained_Delaunay_triangulation_2_Edge(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Constrained_Delaunay_triangulation_2_Edge() {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_2_Edge__SWIG_0(), true);
  }

  public Constrained_Delaunay_triangulation_2_Edge(Constrained_Delaunay_triangulation_2_Face_handle first, int second) {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_2_Edge__SWIG_1(Constrained_Delaunay_triangulation_2_Face_handle.getCPtr(first), first, second), true);
  }

  public Constrained_Delaunay_triangulation_2_Edge(Constrained_Delaunay_triangulation_2_Edge p) {
    this(CGAL_Triangulation_2JNI.new_Constrained_Delaunay_triangulation_2_Edge__SWIG_2(Constrained_Delaunay_triangulation_2_Edge.getCPtr(p), p), true);
  }

  public void setFirst(Constrained_Delaunay_triangulation_2_Face_handle value) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_2_Edge_first_set(swigCPtr, this, Constrained_Delaunay_triangulation_2_Face_handle.getCPtr(value), value);
  }

  public Constrained_Delaunay_triangulation_2_Face_handle getFirst() {
    long cPtr = CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_2_Edge_first_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Constrained_Delaunay_triangulation_2_Face_handle(cPtr, false);
  }

  public void setSecond(int value) {
    CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_2_Edge_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return CGAL_Triangulation_2JNI.Constrained_Delaunay_triangulation_2_Edge_second_get(swigCPtr, this);
  }

}
