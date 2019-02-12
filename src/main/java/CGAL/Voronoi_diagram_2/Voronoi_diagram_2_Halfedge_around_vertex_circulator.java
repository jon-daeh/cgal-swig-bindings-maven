/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Voronoi_diagram_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Voronoi_diagram_2_Halfedge_around_vertex_circulator implements   Iterable<Voronoi_diagram_2_Halfedge_handle>, Iterator<Voronoi_diagram_2_Halfedge_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Voronoi_diagram_2_Halfedge_around_vertex_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Voronoi_diagram_2_Halfedge_around_vertex_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Voronoi_diagram_2JNI.delete_Voronoi_diagram_2_Halfedge_around_vertex_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Voronoi_diagram_2_Halfedge_handle> iterator() {
      return this;
    }
    
    //we store an object of type Voronoi_diagram_2_Halfedge_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Voronoi_diagram_2_Halfedge_handle objectInstance = new Voronoi_diagram_2_Halfedge_handle();
    public Voronoi_diagram_2_Halfedge_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Voronoi_diagram_2_Halfedge_around_vertex_circulator() {
    this(CGAL_Voronoi_diagram_2JNI.new_Voronoi_diagram_2_Halfedge_around_vertex_circulator(), true);
  }

  public Voronoi_diagram_2_Halfedge_handle slow_next() {
    return new Voronoi_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Voronoi_diagram_2_Halfedge_handle r) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_next(swigCPtr, this, Voronoi_diagram_2_Halfedge_handle.getCPtr(r), r);
  }

  public Voronoi_diagram_2_Halfedge_around_vertex_circulator clone() {
    return new Voronoi_diagram_2_Halfedge_around_vertex_circulator(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Voronoi_diagram_2_Halfedge_around_vertex_circulator other) {
    CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_clone__SWIG_1(swigCPtr, this, Voronoi_diagram_2_Halfedge_around_vertex_circulator.getCPtr(other), other);
  }

  public Voronoi_diagram_2_Halfedge_handle prev() {
    return new Voronoi_diagram_2_Halfedge_handle(CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_hasNext(swigCPtr, this);
  }

  public boolean equals(Voronoi_diagram_2_Halfedge_around_vertex_circulator p) {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_equals(swigCPtr, this, Voronoi_diagram_2_Halfedge_around_vertex_circulator.getCPtr(p), p);
  }

  public boolean not_equals(Voronoi_diagram_2_Halfedge_around_vertex_circulator p) {
    return CGAL_Voronoi_diagram_2JNI.Voronoi_diagram_2_Halfedge_around_vertex_circulator_not_equals(swigCPtr, this, Voronoi_diagram_2_Halfedge_around_vertex_circulator.getCPtr(p), p);
  }

}
