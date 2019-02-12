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
  
public class Alpha_shape_2_Finite_faces_iterator implements   Iterable<Alpha_shape_2_Face_handle>, Iterator<Alpha_shape_2_Face_handle>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Alpha_shape_2_Finite_faces_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Alpha_shape_2_Finite_faces_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Alpha_shape_2JNI.delete_Alpha_shape_2_Finite_faces_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Alpha_shape_2_Face_handle> iterator() {
      return this;
    }
    
    //we store an object of type Alpha_shape_2_Face_handle to avoid
    //creation and allocation of a java object at each iteration.
    private Alpha_shape_2_Face_handle objectInstance = new Alpha_shape_2_Face_handle();
    public Alpha_shape_2_Face_handle next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Alpha_shape_2_Finite_faces_iterator() {
    this(CGAL_Alpha_shape_2JNI.new_Alpha_shape_2_Finite_faces_iterator(), true);
  }

  public Alpha_shape_2_Face_handle slow_next() {
    return new Alpha_shape_2_Face_handle(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Finite_faces_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Alpha_shape_2_Face_handle r) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Finite_faces_iterator_next(swigCPtr, this, Alpha_shape_2_Face_handle.getCPtr(r), r);
  }

  public Alpha_shape_2_Finite_faces_iterator clone() {
    return new Alpha_shape_2_Finite_faces_iterator(CGAL_Alpha_shape_2JNI.Alpha_shape_2_Finite_faces_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Alpha_shape_2_Finite_faces_iterator other) {
    CGAL_Alpha_shape_2JNI.Alpha_shape_2_Finite_faces_iterator_clone__SWIG_1(swigCPtr, this, Alpha_shape_2_Finite_faces_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Finite_faces_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Alpha_shape_2_Finite_faces_iterator p) {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Finite_faces_iterator_equals(swigCPtr, this, Alpha_shape_2_Finite_faces_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Alpha_shape_2_Finite_faces_iterator p) {
    return CGAL_Alpha_shape_2JNI.Alpha_shape_2_Finite_faces_iterator_not_equals(swigCPtr, this, Alpha_shape_2_Finite_faces_iterator.getCPtr(p), p);
  }

}
