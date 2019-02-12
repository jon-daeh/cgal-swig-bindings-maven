/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Kernel;

public class Sphere_3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Sphere_3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Sphere_3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_KernelJNI.delete_Sphere_3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Sphere_3(Point_3 center, double squared_radius, Orientation o) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_0(Point_3.getCPtr(center), center, squared_radius, o.swigValue()), true);
  }

  public Sphere_3(Point_3 center, double squared_radius) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_1(Point_3.getCPtr(center), center, squared_radius), true);
  }

  public Sphere_3(Point_3 p, Point_3 q, Point_3 r, Point_3 s) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_2(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, Point_3.getCPtr(r), r, Point_3.getCPtr(s), s), true);
  }

  public Sphere_3(Point_3 p, Point_3 q, Point_3 r, Orientation o) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_3(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, Point_3.getCPtr(r), r, o.swigValue()), true);
  }

  public Sphere_3(Point_3 p, Point_3 q, Point_3 r) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_4(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, Point_3.getCPtr(r), r), true);
  }

  public Sphere_3(Point_3 p, Point_3 q, Orientation o) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_5(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q, o.swigValue()), true);
  }

  public Sphere_3(Point_3 p, Point_3 q) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_6(Point_3.getCPtr(p), p, Point_3.getCPtr(q), q), true);
  }

  public Sphere_3(Point_3 center) {
    this(CGAL_KernelJNI.new_Sphere_3__SWIG_7(Point_3.getCPtr(center), center), true);
  }

  public Point_3 center() {
    return new Point_3(CGAL_KernelJNI.Sphere_3_center__SWIG_0(swigCPtr, this), true);
  }

  public void center(Point_3 ref) {
    CGAL_KernelJNI.Sphere_3_center__SWIG_1(swigCPtr, this, Point_3.getCPtr(ref), ref);
  }

  public double squared_radius() {
    return CGAL_KernelJNI.Sphere_3_squared_radius(swigCPtr, this);
  }

  public Orientation orientation() {
    return Orientation.swigToEnum(CGAL_KernelJNI.Sphere_3_orientation(swigCPtr, this));
  }

  public boolean is_degenerate() {
    return CGAL_KernelJNI.Sphere_3_is_degenerate(swigCPtr, this);
  }

  public Oriented_side oriented_side(Point_3 c) {
    return Oriented_side.swigToEnum(CGAL_KernelJNI.Sphere_3_oriented_side(swigCPtr, this, Point_3.getCPtr(c), c));
  }

  public Bounded_side bounded_side(Point_3 c) {
    return Bounded_side.swigToEnum(CGAL_KernelJNI.Sphere_3_bounded_side(swigCPtr, this, Point_3.getCPtr(c), c));
  }

  public boolean has_on_positive_side(Point_3 c) {
    return CGAL_KernelJNI.Sphere_3_has_on_positive_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_negative_side(Point_3 c) {
    return CGAL_KernelJNI.Sphere_3_has_on_negative_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_boundary(Point_3 c) {
    return CGAL_KernelJNI.Sphere_3_has_on_boundary(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_bounded_side(Point_3 c) {
    return CGAL_KernelJNI.Sphere_3_has_on_bounded_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on_unbounded_side(Point_3 c) {
    return CGAL_KernelJNI.Sphere_3_has_on_unbounded_side(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public boolean has_on(Point_3 c) {
    return CGAL_KernelJNI.Sphere_3_has_on(swigCPtr, this, Point_3.getCPtr(c), c);
  }

  public Sphere_3 opposite() {
    return new Sphere_3(CGAL_KernelJNI.Sphere_3_opposite__SWIG_0(swigCPtr, this), true);
  }

  public void opposite(Sphere_3 ref) {
    CGAL_KernelJNI.Sphere_3_opposite__SWIG_1(swigCPtr, this, Sphere_3.getCPtr(ref), ref);
  }

  public Bbox_3 bbox() {
    return new Bbox_3(CGAL_KernelJNI.Sphere_3_bbox__SWIG_0(swigCPtr, this), true);
  }

  public void bbox(Bbox_3 ref) {
    CGAL_KernelJNI.Sphere_3_bbox__SWIG_1(swigCPtr, this, Bbox_3.getCPtr(ref), ref);
  }

  public boolean equals(Sphere_3 p) {
    return CGAL_KernelJNI.Sphere_3_equals(swigCPtr, this, Sphere_3.getCPtr(p), p);
  }

  public boolean not_equals(Sphere_3 p) {
    return CGAL_KernelJNI.Sphere_3_not_equals(swigCPtr, this, Sphere_3.getCPtr(p), p);
  }

  public String toString() {
    return CGAL_KernelJNI.Sphere_3_toString(swigCPtr, this);
  }

  public Sphere_3 clone() {
    return new Sphere_3(CGAL_KernelJNI.Sphere_3_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Sphere_3 other) {
    CGAL_KernelJNI.Sphere_3_clone__SWIG_1(swigCPtr, this, Sphere_3.getCPtr(other), other);
  }

}
