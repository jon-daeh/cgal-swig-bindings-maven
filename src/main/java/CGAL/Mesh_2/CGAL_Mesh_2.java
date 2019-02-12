/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;
import CGAL.Triangulation_2.Constrained_Delaunay_triangulation_2; import CGAL.Triangulation_2.Constrained_Delaunay_triangulation_plus_2; import java.util.Iterator;import CGAL.Kernel.Point_2;
public class CGAL_Mesh_2 {
  public static void make_conforming_Delaunay_2(Constrained_Delaunay_triangulation_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Delaunay_2__SWIG_0(Constrained_Delaunay_triangulation_2.getCPtr(cdt), cdt);
  }

  public static void make_conforming_Gabriel_2(Constrained_Delaunay_triangulation_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Gabriel_2__SWIG_0(Constrained_Delaunay_triangulation_2.getCPtr(cdt), cdt);
  }

  public static void make_conforming_Delaunay_2(Constrained_Delaunay_triangulation_plus_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Delaunay_2__SWIG_1(Constrained_Delaunay_triangulation_plus_2.getCPtr(cdt), cdt);
  }

  public static void make_conforming_Gabriel_2(Constrained_Delaunay_triangulation_plus_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Gabriel_2__SWIG_1(Constrained_Delaunay_triangulation_plus_2.getCPtr(cdt), cdt);
  }

  public static void make_conforming_Delaunay_2(Mesh_2_Constrained_Delaunay_triangulation_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Delaunay_2__SWIG_2(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(cdt), cdt);
  }

  public static void make_conforming_Gabriel_2(Mesh_2_Constrained_Delaunay_triangulation_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Gabriel_2__SWIG_2(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(cdt), cdt);
  }

  public static void make_conforming_Delaunay_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Delaunay_2__SWIG_3(Mesh_2_Constrained_Delaunay_triangulation_plus_2.getCPtr(cdt), cdt);
  }

  public static void make_conforming_Gabriel_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2 cdt) {
    CGAL_Mesh_2JNI.make_conforming_Gabriel_2__SWIG_3(Mesh_2_Constrained_Delaunay_triangulation_plus_2.getCPtr(cdt), cdt);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t, Delaunay_mesh_size_criteria_2 criteria) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_0(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t, Delaunay_mesh_size_criteria_2.getCPtr(criteria), criteria);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t, Iterator<Point_2> range, Delaunay_mesh_size_criteria_2 criteria, boolean mark) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_1(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t, range, Delaunay_mesh_size_criteria_2.getCPtr(criteria), criteria, mark);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t, Iterator<Point_2> range, Delaunay_mesh_size_criteria_2 criteria) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_2(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t, range, Delaunay_mesh_size_criteria_2.getCPtr(criteria), criteria);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2 t, Delaunay_mesh_plus_size_criteria_2 criteria) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_3(Mesh_2_Constrained_Delaunay_triangulation_plus_2.getCPtr(t), t, Delaunay_mesh_plus_size_criteria_2.getCPtr(criteria), criteria);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2 t, Iterator<Point_2> range, Delaunay_mesh_plus_size_criteria_2 criteria, boolean mark) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_4(Mesh_2_Constrained_Delaunay_triangulation_plus_2.getCPtr(t), t, range, Delaunay_mesh_plus_size_criteria_2.getCPtr(criteria), criteria, mark);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2 t, Iterator<Point_2> range, Delaunay_mesh_plus_size_criteria_2 criteria) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_5(Mesh_2_Constrained_Delaunay_triangulation_plus_2.getCPtr(t), t, range, Delaunay_mesh_plus_size_criteria_2.getCPtr(criteria), criteria);
  }

  public static Mesh_optimization_return_code lloyd_optimize_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t) {
    return Mesh_optimization_return_code.swigToEnum(CGAL_Mesh_2JNI.lloyd_optimize_mesh_2__SWIG_0(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t));
  }

  public static Mesh_optimization_return_code lloyd_optimize_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t, Mesh_2_parameters params) {
    return Mesh_optimization_return_code.swigToEnum(CGAL_Mesh_2JNI.lloyd_optimize_mesh_2__SWIG_1(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t, Mesh_2_parameters.getCPtr(params), params));
  }

  public static Mesh_optimization_return_code lloyd_optimize_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2 t) {
    return Mesh_optimization_return_code.swigToEnum(CGAL_Mesh_2JNI.lloyd_optimize_mesh_2__SWIG_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2.getCPtr(t), t));
  }

  public static Mesh_optimization_return_code lloyd_optimize_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_plus_2 t, Mesh_2_parameters params) {
    return Mesh_optimization_return_code.swigToEnum(CGAL_Mesh_2JNI.lloyd_optimize_mesh_2__SWIG_3(Mesh_2_Constrained_Delaunay_triangulation_plus_2.getCPtr(t), t, Mesh_2_parameters.getCPtr(params), params));
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t, User_mesh_criteria_simple_2 criteria) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_6(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t, User_mesh_criteria_simple_2.getCPtr(criteria), criteria);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t, Iterator<Point_2> range, User_mesh_criteria_simple_2 criteria, boolean mark) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_7(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t, range, User_mesh_criteria_simple_2.getCPtr(criteria), criteria, mark);
  }

  public static void refine_Delaunay_mesh_2(Mesh_2_Constrained_Delaunay_triangulation_2 t, Iterator<Point_2> range, User_mesh_criteria_simple_2 criteria) {
    CGAL_Mesh_2JNI.refine_Delaunay_mesh_2__SWIG_8(Mesh_2_Constrained_Delaunay_triangulation_2.getCPtr(t), t, range, User_mesh_criteria_simple_2.getCPtr(criteria), criteria);
  }

}