/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
public class Muxer extends Container {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    Buffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected Muxer(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.Muxer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected Muxer(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.Muxer_SWIGUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(Muxer obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new Muxer object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public Muxer copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new Muxer(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof Muxer)
      equal = (((Muxer)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  
  @Override
  public String toString() {
    final StringBuilder b = new StringBuilder(super.toString());
    b.append("[")
    .append("url="+getURL()+";")
    .append("format:"+getFormat()+";")
    .append("]");
    return b.toString();
  }

/**
 * Get the URL the Muxer was opened with.<br>
 * May return null if unknown.<br>
 * @return the URL opened, or null.
 */
  public String getURL() {
    return VideoJNI.Muxer_getURL(swigCPtr, this);
  }

/**
 * Get the MuxerFormat associated with this Muxer<br>
 * or null if unknown.
 */
  protected MuxerFormat getFormat() {
    long cPtr = VideoJNI.Muxer_getFormat(swigCPtr, this);
    return (cPtr == 0) ? null : new MuxerFormat(cPtr, false);
  }

}