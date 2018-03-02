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
        localValue.afterInject();
        cachedValue_native_StandServer_1.set(localValue);
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
  
  //
  // Getter creations
  //
}
