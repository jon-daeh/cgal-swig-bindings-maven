/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Voronoi_diagram_2;

public class Power_diagram_2_Locate_result {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Power_diagram_2_Locate_result(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Power_diagram_2_Locate_result obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Voronoi_diagram_2JNI.delete_Power_diagram_2_Locate_result(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Power_diagram_2_Locate_result() {
    this(CGAL_Voronoi_diagram_2JNI.new_Power_diagram_2_Locate_result(), true);
  }

  public Power_diagram_2_Vertex_handle get_vertex_handle() {
    return new Power_diagram_2_Vertex_handle(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Locate_result_get_vertex_handle(swigCPtr, this), true);
  }

  public Power_diagram_2_Halfedge_handle get_halfedge_handle() {
    return new Power_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Locate_result_get_halfedge_handle(swigCPtr, this), true);
  }

  public Power_diagram_2_Face_handle get_face_handle() {
    return new Power_diagram_2_Face_handle(CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Locate_result_get_face_handle(swigCPtr, this), true);
  }

  public boolean is_vertex_handle() {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Locate_result_is_vertex_handle(swigCPtr, this);
  }

  public boolean is_halfedge_handle() {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Locate_result_is_halfedge_handle(swigCPtr, this);
  }

  public boolean is_face_handle() {
    return CGAL_Voronoi_diagram_2JNI.Power_diagram_2_Locate_result_is_face_handle(swigCPtr, this);
  }

}