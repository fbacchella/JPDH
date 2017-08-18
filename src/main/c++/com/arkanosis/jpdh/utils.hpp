#ifndef JPDH_UTILS_HPP_
# define JPDH_UTILS_HPP_

# include <jni.h>
# include <pdh.h>

namespace jpdh {

  void throwException(::JNIEnv* env, ::PDH_STATUS status);

} // namespace jpdh

#endif // !JPDH_UTILS_HPP_
