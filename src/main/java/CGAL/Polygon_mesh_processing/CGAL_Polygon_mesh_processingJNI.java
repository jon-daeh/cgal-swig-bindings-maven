/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Polygon_mesh_processing;

import java.util.Iterator;
import java.util.Collection;
import CGAL.Polyhedron_3.Polyhedron_3;
import CGAL.Polyhedron_3.Polyhedron_3_Facet_handle;
import CGAL.Polyhedron_3.Polyhedron_3_Vertex_handle;
import CGAL.Polyhedron_3.Polyhedron_3_Halfedge_handle;
import CGAL.Kernel.Point_3;
import CGAL.Kernel.Vector_3;
import CGAL.Kernel.Plane_3;
import CGAL.Kernel.Bbox_3;

public class CGAL_Polygon_mesh_processingJNI {

    static {
      try {
          System.loadLibrary("CGAL_Polygon_mesh_processing");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Polygon_mesh_processing failed to load. \n" + e);
        throw e;
      }
    }
  

    static{
      try {
          System.loadLibrary("CGAL_Java");
      } catch (UnsatisfiedLinkError e) {
        System.err.println("Native code library CGAL_Java failed to load. \n" + e);
        throw e;
      }
    }
  
  public final static native long new_Polygon_mesh_slicer(long jarg1, Polyhedron_3 jarg1_);
  public final static native void Polygon_mesh_slicer_slice(long jarg1, Polygon_mesh_slicer jarg1_, long jarg2, Plane_3 jarg2_, long jarg3, Polylines jarg3_);
  public final static native void delete_Polygon_mesh_slicer(long jarg1);
  public final static native long new_Side_of_triangle_mesh(long jarg1, Polyhedron_3 jarg1_);
  public final static native int Side_of_triangle_mesh_bounded_side(long jarg1, Side_of_triangle_mesh jarg1_, long jarg2, Point_3 jarg2_);
  public final static native void delete_Side_of_triangle_mesh(long jarg1);
  public final static native void Integer_triple_first_set(long jarg1, Integer_triple jarg1_, int jarg2);
  public final static native int Integer_triple_first_get(long jarg1, Integer_triple jarg1_);
  public final static native void Integer_triple_second_set(long jarg1, Integer_triple jarg1_, int jarg2);
  public final static native int Integer_triple_second_get(long jarg1, Integer_triple jarg1_);
  public final static native void Integer_triple_third_set(long jarg1, Integer_triple jarg1_, int jarg2);
  public final static native int Integer_triple_third_get(long jarg1, Integer_triple jarg1_);
  public final static native long new_Integer_triple__SWIG_0();
  public final static native long new_Integer_triple__SWIG_1(int jarg1, int jarg2, int jarg3);
  public final static native long Integer_triple_clone__SWIG_0(long jarg1, Integer_triple jarg1_);
  public final static native void Integer_triple_clone__SWIG_1(long jarg1, Integer_triple jarg1_, long jarg2, Integer_triple jarg2_);
  public final static native void delete_Integer_triple(long jarg1);
  public final static native long new_Facet_pair__SWIG_0();
  public final static native long new_Facet_pair__SWIG_1(long jarg1, Polyhedron_3_Facet_handle jarg1_, long jarg2, Polyhedron_3_Facet_handle jarg2_);
  public final static native long new_Facet_pair__SWIG_2(long jarg1, Facet_pair jarg1_);
  public final static native void Facet_pair_first_set(long jarg1, Facet_pair jarg1_, long jarg2, Polyhedron_3_Facet_handle jarg2_);
  public final static native long Facet_pair_first_get(long jarg1, Facet_pair jarg1_);
  public final static native void Facet_pair_second_set(long jarg1, Facet_pair jarg1_, long jarg2, Polyhedron_3_Facet_handle jarg2_);
  public final static native long Facet_pair_second_get(long jarg1, Facet_pair jarg1_);
  public final static native void delete_Facet_pair(long jarg1);
  public final static native long new_Halfedge_pair__SWIG_0();
  public final static native long new_Halfedge_pair__SWIG_1(long jarg1, Polyhedron_3_Halfedge_handle jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_);
  public final static native long new_Halfedge_pair__SWIG_2(long jarg1, Halfedge_pair jarg1_);
  public final static native void Halfedge_pair_first_set(long jarg1, Halfedge_pair jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_);
  public final static native long Halfedge_pair_first_get(long jarg1, Halfedge_pair jarg1_);
  public final static native void Halfedge_pair_second_set(long jarg1, Halfedge_pair jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_);
  public final static native long Halfedge_pair_second_get(long jarg1, Halfedge_pair jarg1_);
  public final static native void delete_Halfedge_pair(long jarg1);
  public final static native long new_Point_3_Vector__SWIG_0();
  public final static native long new_Point_3_Vector__SWIG_1(long jarg1);
  public final static native long Point_3_Vector_size(long jarg1, Point_3_Vector jarg1_);
  public final static native long Point_3_Vector_capacity(long jarg1, Point_3_Vector jarg1_);
  public final static native void Point_3_Vector_reserve(long jarg1, Point_3_Vector jarg1_, long jarg2);
  public final static native boolean Point_3_Vector_isEmpty(long jarg1, Point_3_Vector jarg1_);
  public final static native void Point_3_Vector_clear(long jarg1, Point_3_Vector jarg1_);
  public final static native void Point_3_Vector_add(long jarg1, Point_3_Vector jarg1_, long jarg2, Point_3 jarg2_);
  public final static native long Point_3_Vector_get(long jarg1, Point_3_Vector jarg1_, int jarg2);
  public final static native void Point_3_Vector_set(long jarg1, Point_3_Vector jarg1_, int jarg2, long jarg3, Point_3 jarg3_);
  public final static native void delete_Point_3_Vector(long jarg1);
  public final static native long new_Int_Vector__SWIG_0();
  public final static native long new_Int_Vector__SWIG_1(long jarg1);
  public final static native long Int_Vector_size(long jarg1, Int_Vector jarg1_);
  public final static native long Int_Vector_capacity(long jarg1, Int_Vector jarg1_);
  public final static native void Int_Vector_reserve(long jarg1, Int_Vector jarg1_, long jarg2);
  public final static native boolean Int_Vector_isEmpty(long jarg1, Int_Vector jarg1_);
  public final static native void Int_Vector_clear(long jarg1, Int_Vector jarg1_);
  public final static native void Int_Vector_add(long jarg1, Int_Vector jarg1_, int jarg2);
  public final static native int Int_Vector_get(long jarg1, Int_Vector jarg1_, int jarg2);
  public final static native void Int_Vector_set(long jarg1, Int_Vector jarg1_, int jarg2, int jarg3);
  public final static native void delete_Int_Vector(long jarg1);
  public final static native long new_Polygon_Vector__SWIG_0();
  public final static native long new_Polygon_Vector__SWIG_1(long jarg1);
  public final static native long Polygon_Vector_size(long jarg1, Polygon_Vector jarg1_);
  public final static native long Polygon_Vector_capacity(long jarg1, Polygon_Vector jarg1_);
  public final static native void Polygon_Vector_reserve(long jarg1, Polygon_Vector jarg1_, long jarg2);
  public final static native boolean Polygon_Vector_isEmpty(long jarg1, Polygon_Vector jarg1_);
  public final static native void Polygon_Vector_clear(long jarg1, Polygon_Vector jarg1_);
  public final static native void Polygon_Vector_add(long jarg1, Polygon_Vector jarg1_, long jarg2, Int_Vector jarg2_);
  public final static native long Polygon_Vector_get(long jarg1, Polygon_Vector jarg1_, int jarg2);
  public final static native void Polygon_Vector_set(long jarg1, Polygon_Vector jarg1_, int jarg2, long jarg3, Int_Vector jarg3_);
  public final static native void delete_Polygon_Vector(long jarg1);
  public final static native long new_Polylines__SWIG_0();
  public final static native long new_Polylines__SWIG_1(long jarg1);
  public final static native long Polylines_size(long jarg1, Polylines jarg1_);
  public final static native long Polylines_capacity(long jarg1, Polylines jarg1_);
  public final static native void Polylines_reserve(long jarg1, Polylines jarg1_, long jarg2);
  public final static native boolean Polylines_isEmpty(long jarg1, Polylines jarg1_);
  public final static native void Polylines_clear(long jarg1, Polylines jarg1_);
  public final static native void Polylines_add(long jarg1, Polylines jarg1_, long jarg2, Point_3_Vector jarg2_);
  public final static native long Polylines_get(long jarg1, Polylines jarg1_, int jarg2);
  public final static native void Polylines_set(long jarg1, Polylines jarg1_, int jarg2, long jarg3, Point_3_Vector jarg3_);
  public final static native void delete_Polylines(long jarg1);
  public final static native void fair__SWIG_0(long jarg1, Polyhedron_3 jarg1_, Iterator<Polyhedron_3_Vertex_handle> jarg2);
  public final static native void fair__SWIG_1(long jarg1, Polyhedron_3 jarg1_, Iterator<Polyhedron_3_Vertex_handle> jarg2, int jarg3);
  public final static native void refine__SWIG_0(long jarg1, Polyhedron_3 jarg1_, Iterator<Polyhedron_3_Facet_handle> jarg2, Collection<Polyhedron_3_Facet_handle> jarg3, Collection<Polyhedron_3_Vertex_handle> jarg4);
  public final static native void refine__SWIG_1(long jarg1, Polyhedron_3 jarg1_, Iterator<Polyhedron_3_Facet_handle> jarg2, Collection<Polyhedron_3_Facet_handle> jarg3, Collection<Polyhedron_3_Vertex_handle> jarg4, double jarg5);
  public final static native void triangulate_face(long jarg1, Polyhedron_3_Facet_handle jarg1_, long jarg2, Polyhedron_3 jarg2_);
  public final static native void triangulate_faces__SWIG_0(long jarg1, Polyhedron_3 jarg1_);
  public final static native void triangulate_faces__SWIG_1(Iterator<Polyhedron_3_Facet_handle> jarg1, long jarg2, Polyhedron_3 jarg2_);
  public final static native void isotropic_remeshing__SWIG_0(Iterator<Polyhedron_3_Facet_handle> jarg1, double jarg2, long jarg3, Polyhedron_3 jarg3_, int jarg4, Iterator<Polyhedron_3_Halfedge_handle> jarg5, boolean jarg6);
  public final static native void isotropic_remeshing__SWIG_1(Iterator<Polyhedron_3_Facet_handle> jarg1, double jarg2, long jarg3, Polyhedron_3 jarg3_, int jarg4, Iterator<Polyhedron_3_Halfedge_handle> jarg5);
  public final static native void isotropic_remeshing__SWIG_2(Iterator<Polyhedron_3_Facet_handle> jarg1, double jarg2, long jarg3, Polyhedron_3 jarg3_, int jarg4);
  public final static native void isotropic_remeshing__SWIG_3(Iterator<Polyhedron_3_Facet_handle> jarg1, double jarg2, long jarg3, Polyhedron_3 jarg3_);
  public final static native void split_long_edges(Iterator<Polyhedron_3_Halfedge_handle> jarg1, double jarg2, long jarg3, Polyhedron_3 jarg3_);
  public final static native void triangulate_hole(long jarg1, Polyhedron_3 jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_, Collection<Polyhedron_3_Facet_handle> jarg3);
  public final static native void triangulate_and_refine_hole__SWIG_0(long jarg1, Polyhedron_3 jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_, Collection<Polyhedron_3_Facet_handle> jarg3, Collection<Polyhedron_3_Vertex_handle> jarg4);
  public final static native void triangulate_and_refine_hole__SWIG_1(long jarg1, Polyhedron_3 jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_, Collection<Polyhedron_3_Facet_handle> jarg3, Collection<Polyhedron_3_Vertex_handle> jarg4, double jarg5);
  public final static native void triangulate_refine_and_fair_hole__SWIG_0(long jarg1, Polyhedron_3 jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_, Collection<Polyhedron_3_Facet_handle> jarg3, Collection<Polyhedron_3_Vertex_handle> jarg4);
  public final static native void triangulate_refine_and_fair_hole__SWIG_1(long jarg1, Polyhedron_3 jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_, Collection<Polyhedron_3_Facet_handle> jarg3, Collection<Polyhedron_3_Vertex_handle> jarg4, double jarg5);
  public final static native void triangulate_refine_and_fair_hole__SWIG_2(long jarg1, Polyhedron_3 jarg1_, long jarg2, Polyhedron_3_Halfedge_handle jarg2_, Collection<Polyhedron_3_Facet_handle> jarg3, Collection<Polyhedron_3_Vertex_handle> jarg4, double jarg5, int jarg6);
  public final static native void triangulate_hole_polyline__SWIG_0(Iterator<Point_3> jarg1, Iterator<Point_3> jarg2, Collection<Integer_triple> jarg3);
  public final static native void triangulate_hole_polyline__SWIG_1(Iterator<Point_3> jarg1, Collection<Integer_triple> jarg2);
  public final static native boolean does_self_intersect(long jarg1, Polyhedron_3 jarg1_);
  public final static native void self_intersections(long jarg1, Polyhedron_3 jarg1_, Collection<Facet_pair> jarg2);
  public final static native boolean is_outward_oriented(long jarg1, Polyhedron_3 jarg1_);
  public final static native void reverse_face_orientations__SWIG_0(long jarg1, Polyhedron_3 jarg1_);
  public final static native void reverse_face_orientations__SWIG_1(Iterator<Polyhedron_3_Facet_handle> jarg1, long jarg2, Polyhedron_3 jarg2_);
  public final static native boolean orient_polygon_soup(long jarg1, Point_3_Vector jarg1_, long jarg2, Polygon_Vector jarg2_);
  public final static native void stitch_borders__SWIG_0(long jarg1, Polyhedron_3 jarg1_);
  public final static native void stitch_borders__SWIG_1(long jarg1, Polyhedron_3 jarg1_, Iterator<Halfedge_pair> jarg2);
  public final static native void polygon_soup_to_polygon_mesh__SWIG_0(long jarg1, Point_3_Vector jarg1_, long jarg2, Polygon_Vector jarg2_, long jarg3, Polyhedron_3 jarg3_);
  public final static native void remove_isolated_vertices(long jarg1, Polyhedron_3 jarg1_);
  public final static native long compute_face_normal__SWIG_0(long jarg1, Polyhedron_3_Facet_handle jarg1_, long jarg2, Polyhedron_3 jarg2_);
  public final static native void compute_face_normal__SWIG_1(long jarg1, Polyhedron_3_Facet_handle jarg1_, long jarg2, Polyhedron_3 jarg2_, long jarg3, Vector_3 jarg3_);
  public final static native void compute_face_normals(long jarg1, Polyhedron_3 jarg1_, Collection<Vector_3> jarg2);
  public final static native long compute_vertex_normal__SWIG_0(long jarg1, Polyhedron_3_Vertex_handle jarg1_, long jarg2, Polyhedron_3 jarg2_);
  public final static native void compute_vertex_normal__SWIG_1(long jarg1, Polyhedron_3_Vertex_handle jarg1_, long jarg2, Polyhedron_3 jarg2_, long jarg3, Vector_3 jarg3_);
  public final static native void compute_vertex_normals(long jarg1, Polyhedron_3 jarg1_, Collection<Vector_3> jarg2);
  public final static native void connected_component(long jarg1, Polyhedron_3_Facet_handle jarg1_, long jarg2, Polyhedron_3 jarg2_, Collection<Polyhedron_3_Facet_handle> jarg3);
  public final static native int[] connected_components(long jarg1, Polyhedron_3 jarg1_);
  public final static native int keep_large_connected_components(long jarg1, Polyhedron_3 jarg1_, int jarg2);
  public final static native int keep_largest_connected_components(long jarg1, Polyhedron_3 jarg1_, int jarg2);
  public final static native void keep_connected_components__SWIG_0(long jarg1, Polyhedron_3 jarg1_, Iterator<Polyhedron_3_Facet_handle> jarg2);
  public final static native void keep_connected_components__SWIG_1(long jarg1, Polyhedron_3 jarg1_, int[] jarg2, int[] jarg3);
  public final static native void remove_connected_components__SWIG_0(long jarg1, Polyhedron_3 jarg1_, Iterator<Polyhedron_3_Facet_handle> jarg2);
  public final static native void remove_connected_components__SWIG_1(long jarg1, Polyhedron_3 jarg1_, int[] jarg2, int[] jarg3);
  public final static native double face_area(long jarg1, Polyhedron_3_Facet_handle jarg1_, long jarg2, Polyhedron_3 jarg2_);
  public final static native double area__SWIG_1(Iterator<Polyhedron_3_Facet_handle> jarg1, long jarg2, Polyhedron_3 jarg2_);
  public final static native double area__SWIG_2(long jarg1, Polyhedron_3 jarg1_);
  public final static native double volume(long jarg1, Polyhedron_3 jarg1_);
  public final static native double edge_length(long jarg1, Polyhedron_3_Halfedge_handle jarg1_, long jarg2, Polyhedron_3 jarg2_);
  public final static native double face_border_length(long jarg1, Polyhedron_3_Halfedge_handle jarg1_, long jarg2, Polyhedron_3 jarg2_);
  public final static native long bbox(long jarg1, Polyhedron_3 jarg1_);
  public final static native void border_halfedges(Iterator<Polyhedron_3_Facet_handle> jarg1, long jarg2, Polyhedron_3 jarg2_, Collection<Polyhedron_3_Halfedge_handle> jarg3);
  public final static native void polygon_soup_to_polygon_mesh__SWIG_1(double[] jarg1, int[] jarg2, long jarg3, Polyhedron_3 jarg3_);
}
