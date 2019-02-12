/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;
import CGAL.Kernel.Point_2; import java.util.Iterator; import java.util.Collection;  import CGAL.Triangulation_2.Constraint;
public class Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2 extends Internal_Contrained_triangulation_2_Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2 {
  private transient long swigCPtr;

  public Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2(long cPtr, boolean cMemoryOwn) {
    super(CGAL_Triangulation_2JNI.Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2() {
    this(CGAL_Triangulation_2JNI.new_Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2__SWIG_0(), true);
  }

  public Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2(Iterator<Constraint> range) {
    this(CGAL_Triangulation_2JNI.new_Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2__SWIG_1(range), true);
  }

  public Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2 clone() {
    return new Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2(CGAL_Triangulation_2JNI.Internal_Constrained_Delaunay_triangulation_2_Constrained_Delaunay_triangulation_plus_2_clone(swigCPtr, this), true);
  }

}
