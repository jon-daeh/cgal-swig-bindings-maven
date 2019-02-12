/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  import CGAL.Kernel.Point_2;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Delaunay_triangulation_2_Finite_vertices_iterator implements   Iterable<Delaunay_triangulation_2_Vertex_handle>, Iterator<Delaunay_triangulation_2_Vertex_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Delaunay_triangulation_2_Finite_vertices_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_triangulation_2_Finite_vertices_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Delaunay_triangulation_2_Finite_vertices_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Delaunay_triangulation_2_Vertex_handle> iterator() {
      return this;
    }
    
    //we store an object of type Delaunay_triangulation_2_Vertex_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Delaunay_triangulation_2_Vertex_handle objectInstance = new Delaunay_triangulation_2_Vertex_handle();
    public Delaunay_triangulation_2_Vertex_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Delaunay_triangulation_2_Finite_vertices_iterator() {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Finite_vertices_iterator(), true);
  }

  public Delaunay_triangulation_2_Vertex_handle slow_next() {
    return new Delaunay_triangulation_2_Vertex_handle(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_vertices_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Delaunay_triangulation_2_Vertex_handle r) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_vertices_iterator_next(swigCPtr, this, Delaunay_triangulation_2_Vertex_handle.getCPtr(r), r);
  }

  public Delaunay_triangulation_2_Finite_vertices_iterator clone() {
    return new Delaunay_triangulation_2_Finite_vertices_iterator(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_vertices_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Delaunay_triangulation_2_Finite_vertices_iterator other) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_vertices_iterator_clone__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Finite_vertices_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_vertices_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Delaunay_triangulation_2_Finite_vertices_iterator p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_vertices_iterator_equals(swigCPtr, this, Delaunay_triangulation_2_Finite_vertices_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Delaunay_triangulation_2_Finite_vertices_iterator p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Finite_vertices_iterator_not_equals(swigCPtr, this, Delaunay_triangulation_2_Finite_vertices_iterator.getCPtr(p), p);
  }

}
