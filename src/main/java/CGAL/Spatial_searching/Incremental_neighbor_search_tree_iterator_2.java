/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Spatial_searching;

  import CGAL.Kernel.Point_2;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Incremental_neighbor_search_tree_iterator_2 implements   Iterable<Point_2>, Iterator<Point_2>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Incremental_neighbor_search_tree_iterator_2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Incremental_neighbor_search_tree_iterator_2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Spatial_searchingJNI.delete_Incremental_neighbor_search_tree_iterator_2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Point_2> iterator() {
      return this;
    }
    
    //we store an object of type Point_2 to avoid
    //creation and allocation of a java object at each iteration.
    private Point_2 objectInstance = new Point_2();
    public Point_2 next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Incremental_neighbor_search_tree_iterator_2() {
    this(CGAL_Spatial_searchingJNI.new_Incremental_neighbor_search_tree_iterator_2(), true);
  }

  public Point_2 slow_next() {
    return new Point_2(CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_iterator_2_slow_next(swigCPtr, this), true);
  }

  public void next(Point_2 r) {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_iterator_2_next(swigCPtr, this, Point_2.getCPtr(r), r);
  }

  public Incremental_neighbor_search_tree_iterator_2 clone() {
    return new Incremental_neighbor_search_tree_iterator_2(CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_iterator_2_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Incremental_neighbor_search_tree_iterator_2 other) {
    CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_iterator_2_clone__SWIG_1(swigCPtr, this, Incremental_neighbor_search_tree_iterator_2.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_iterator_2_hasNext(swigCPtr, this);
  }

  public boolean equals(Incremental_neighbor_search_tree_iterator_2 p) {
    return CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_iterator_2_equals(swigCPtr, this, Incremental_neighbor_search_tree_iterator_2.getCPtr(p), p);
  }

  public boolean not_equals(Incremental_neighbor_search_tree_iterator_2 p) {
    return CGAL_Spatial_searchingJNI.Incremental_neighbor_search_tree_iterator_2_not_equals(swigCPtr, this, Incremental_neighbor_search_tree_iterator_2.getCPtr(p), p);
  }

}
