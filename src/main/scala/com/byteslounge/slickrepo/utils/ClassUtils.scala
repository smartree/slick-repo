package com.byteslounge.slickrepo.utils

trait ClassUtils {
  def sameClass(obj: Any, other: Any): Boolean = {
    obj.getClass == other.getClass
  }
}
object ClassUtils extends ClassUtils