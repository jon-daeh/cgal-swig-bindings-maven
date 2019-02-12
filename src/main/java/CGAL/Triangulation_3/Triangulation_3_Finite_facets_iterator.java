/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_3;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Triangulation_3_Finite_facets_iterator implements   Iterable<Triangulation_3_Facet>, Iterator<Triangulation_3_Facet>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Triangulation_3_Finite_facets_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Triangulation_3_Finite_facets_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_3JNI.delete_Triangulation_3_Finite_facets_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Triangulation_3_Facet> iterator() {
      return this;
    }
    
    //we store an object of type Triangulation_3_Facet to avoid
    //creation and allocation of a java object at each iteration.
    private Triangulation_3_Facet objectInstance = new Triangulation_3_Facet();
    public Triangulation_3_Facet next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Triangulation_3_Finite_facets_iterator() {
    this(CGAL_Triangulation_3JNI.new_Triangulation_3_Finite_facets_iterator(), true);
  }

  public Triangulation_3_Facet slow_next() {
    return new Triangulation_3_Facet(CGAL_Triangulation_3JNI.Triangulation_3_Finite_facets_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Triangulation_3_Facet r) {
    CGAL_Triangulation_3JNI.Triangulation_3_Finite_facets_iterator_next(swigCPtr, this, Triangulation_3_Facet.getCPtr(r), r);
  }

  public Triangulation_3_Finite_facets_iterator clone() {
    return new Triangulation_3_Finite_facets_iterator(CGAL_Triangulation_3JNI.Triangulation_3_Finite_facets_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Triangulation_3_Finite_facets_iterator other) {
    CGAL_Triangulation_3JNI.Triangulation_3_Finite_facets_iterator_clone__SWIG_1(swigCPtr, this, Triangulation_3_Finite_facets_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_3JNI.Triangulation_3_Finite_facets_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Triangulation_3_Finite_facets_iterator p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Finite_facets_iterator_equals(swigCPtr, this, Triangulation_3_Finite_facets_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Triangulation_3_Finite_facets_iterator p) {
    return CGAL_Triangulation_3JNI.Triangulation_3_Finite_facets_iterator_not_equals(swigCPtr, this, Triangulation_3_Finite_facets_iterator.getCPtr(p), p);
  }

}
