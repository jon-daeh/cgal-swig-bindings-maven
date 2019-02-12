/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Alpha_shape_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Alpha_shape_2_Edge_circulator implements   Iterable<Alpha_shape_2_Edge>, Iterator<Alpha_shape_2_Edge>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Alpha_shape_2_Edge_circulator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Alpha_shape_2_Edge_circulator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Alpha_shape_2_Edge_circulator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Alpha_shape_2_Edge> iterator() {
      return this;
    }
    
    //we store an object of type Alpha_shape_2_Edge to avoid
    //creation and allocation of a java object at each iteration.
    private Alpha_shape_2_Edge objectInstance = new Alpha_shape_2_Edge();
    public Alpha_shape_2_Edge next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Alpha_shape_2_Edge_circulator() {
    this(CGAL_Alpha_shape_2JNI.new_Alpha_shape_2_Edge_circulator(), true);
  }

  public Alpha_shape_2_Edge slow_next() {
    return new Alpha_shape_2_Edge(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_slow_next(swigCPtr, this), true);
  }

  public void next(Alpha_shape_2_Edge r) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_next(swigCPtr, this, Alpha_shape_2_Edge.getCPtr(r), r);
  }

  public Alpha_shape_2_Edge_circulator clone() {
    return new Alpha_shape_2_Edge_circulator(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Alpha_shape_2_Edge_circulator other) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_clone__SWIG_1(swigCPtr, this, Alpha_shape_2_Edge_circulator.getCPtr(other), other);
  }

  public Alpha_shape_2_Edge prev() {
    return new Alpha_shape_2_Edge(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_prev(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_hasNext(swigCPtr, this);
  }

  public boolean equals(Alpha_shape_2_Edge_circulator p) {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_equals(swigCPtr, this, Alpha_shape_2_Edge_circulator.getCPtr(p), p);
  }

  public boolean not_equals(Alpha_shape_2_Edge_circulator p) {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Edge_circulator_not_equals(swigCPtr, this, Alpha_shape_2_Edge_circulator.getCPtr(p), p);
  }

}