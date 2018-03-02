package kz.greetgo.blog.stand.bean_containers;
public final class StandBeanContainerAutomaticallyGeneratedImplementation implements kz.greetgo.blog.stand.bean_containers.StandBeanContainer{

  private final java.lang.Object forSynchronizedBlocks = new java.lang.Object();

  //
  // Bean container methods
  //

  @java.lang.Override
  public kz.greetgo.blog.stand.beans.StandServer standServer() {
    return getter_native_StandServer_1.get();
  }

  //
  // Bean creations
  //

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.beans.StandServer> cachedValue_native_StandServer_1 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.beans.StandServer> getter_native_StandServer_1 = this::get_native_StandServer_1;
  private kz.greetgo.blog.stand.beans.StandServer get_native_StandServer_1 () {
    {
      kz.greetgo.blog.stand.beans.StandServer x = cachedValue_native_StandServer_1.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.beans.StandServer x = cachedValue_native_StandServer_1.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.beans.StandServer localValue = new kz.greetgo.blog.stand.beans.StandServer();
        localValue.webAppContextRegistration = (kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration>>)(java.lang.Object)getter_ref_list_WebAppContextRegistration_3;
        localValue.afterInject();
        cachedValue_native_StandServer_1.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  private final java.util.concurrent.atomic.AtomicReference<kz.greetgo.blog.stand.beans.Utf8FilterRegistration> cachedValue_native_Utf8FilterRegistration_2 = new java.util.concurrent.atomic.AtomicReference<>(null);
  private final kz.greetgo.depinject.core.BeanGetter<kz.greetgo.blog.stand.beans.Utf8FilterRegistration> getter_native_Utf8FilterRegistration_2 = this::get_native_Utf8FilterRegistration_2;
  private kz.greetgo.blog.stand.beans.Utf8FilterRegistration get_native_Utf8FilterRegistration_2 () {
    {
      kz.greetgo.blog.stand.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_2.get();
      if (x != null) return x;
    }
    synchronized (forSynchronizedBlocks) {
      {
        kz.greetgo.blog.stand.beans.Utf8FilterRegistration x = cachedValue_native_Utf8FilterRegistration_2.get();
        if (x != null) return x;
      }
      try {
        kz.greetgo.blog.stand.beans.Utf8FilterRegistration localValue = new kz.greetgo.blog.stand.beans.Utf8FilterRegistration();
        cachedValue_native_Utf8FilterRegistration_2.set(localValue);
        return localValue;
      } catch (java.lang.Exception e) {
        if (e instanceof java.lang.RuntimeException) throw (java.lang.RuntimeException) e;
        throw new java.lang.RuntimeException(e);
      }
    }
  }

  //
  // Bean references
  //

  private final kz.greetgo.depinject.core.BeanGetter<java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration>> getter_ref_list_WebAppContextRegistration_3 = this::get_ref_list_WebAppContextRegistration_3;
  private java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration> get_ref_list_WebAppContextRegistration_3() {
    java.util.List<kz.greetgo.blog.stand.utils.WebAppContextRegistration> list = new java.util.ArrayList<>();
    list.add(getter_native_Utf8FilterRegistration_2.get());
    return list;
  }
  
  //
  // Getter creations
  //
}
