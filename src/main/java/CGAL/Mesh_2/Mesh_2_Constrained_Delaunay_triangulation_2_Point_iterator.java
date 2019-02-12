/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Mesh_2;

  import CGAL.Kernel.Point_2;
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator implements   Iterable<Point_2>, Iterator<Point_2>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Mesh_2JNI.delete_Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator(swigCPtr);
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
  
  public Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator() {
    this(CGAL_Mesh_2JNI.new_Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator(), true);
  }

  public Point_2 slow_next() {
    return new Point_2(CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Point_2 r) {
    CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator_next(swigCPtr, this, Point_2.getCPtr(r), r);
  }

  public Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator clone() {
    return new Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator(CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator other) {
    CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator_clone__SWIG_1(swigCPtr, this, Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator p) {
    return CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator_equals(swigCPtr, this, Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator p) {
    return CGAL_Mesh_2JNI.Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator_not_equals(swigCPtr, this, Mesh_2_Constrained_Delaunay_triangulation_2_Point_iterator.getCPtr(p), p);
  }

}
