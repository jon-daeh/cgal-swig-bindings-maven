/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Delaunay_triangulation_2_Edge_circulator implements   Iterable<Delaunay_triangulation_2_Edge>, Iterator<Delaunay_triangulation_2_Edge>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Delaunay_triangulation_2_Edge_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Delaunay_triangulation_2_Edge_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Delaunay_triangulation_2_Edge_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Delaunay_triangulation_2_Edge> iterator() {
      return this;
    }
    
    //we store an object of type Delaunay_triangulation_2_Edge to avoid
    //creation and allocation of a java object at each iteration.
    private Delaunay_triangulation_2_Edge objectInstance = new Delaunay_triangulation_2_Edge();
    public Delaunay_triangulation_2_Edge next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Delaunay_triangulation_2_Edge_circulator() {
    this(CGAL_Triangulation_2JNI.new_Delaunay_triangulation_2_Edge_circulator(), true);
  }

  public Delaunay_triangulation_2_Edge slow_next() {
    return new Delaunay_triangulation_2_Edge(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Delaunay_triangulation_2_Edge r) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_next(swigCPtr, this, Delaunay_triangulation_2_Edge.getCPtr(r), r);
  }

  public Delaunay_triangulation_2_Edge_circulator clone() {
    return new Delaunay_triangulation_2_Edge_circulator(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Delaunay_triangulation_2_Edge_circulator other) {
    CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_clone__SWIG_1(swigCPtr, this, Delaunay_triangulation_2_Edge_circulator.getCPtr(other), other);
  }

  public Delaunay_triangulation_2_Edge prev() {
    return new Delaunay_triangulation_2_Edge(CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_hasNext(swigCPtr, this);
  }

  public boolean equals(Delaunay_triangulation_2_Edge_circulator p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_equals(swigCPtr, this, Delaunay_triangulation_2_Edge_circulator.getCPtr(p), p);
  }

  public boolean not_equals(Delaunay_triangulation_2_Edge_circulator p) {
    return CGAL_Triangulation_2JNI.Delaunay_triangulation_2_Edge_circulator_not_equals(swigCPtr, this, Delaunay_triangulation_2_Edge_circulator.getCPtr(p), p);
  }

}
