package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
final class Java16RecordComponentsLoader {

    @NotNull
    public static final Java16RecordComponentsLoader INSTANCE = new Java16RecordComponentsLoader();

    @Nullable
    private static Cache _cache;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Cache {

        @Nullable
        private final Method getAccessor;

        @Nullable
        private final Method getType;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.getType = method;
            this.getAccessor = method2;
        }

        @Nullable
        public final Method getGetAccessor() {
            return this.getAccessor;
        }

        @Nullable
        public final Method getGetType() {
            return this.getType;
        }
    }

    private Java16RecordComponentsLoader() {
    }

    private final Cache buildCache(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    private final Cache initCache(Object obj) {
        Cache cache = _cache;
        if (cache != null) {
            return cache;
        }
        Cache cacheBuildCache = buildCache(obj);
        _cache = cacheBuildCache;
        return cacheBuildCache;
    }

    @Nullable
    public final Method loadGetAccessor(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method getAccessor = initCache(obj).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object objInvoke = getAccessor.invoke(obj, null);
        objInvoke.getClass();
        return (Method) objInvoke;
    }

    @Nullable
    public final Class<?> loadGetType(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
        obj.getClass();
        Method getType = initCache(obj).getGetType();
        if (getType == null) {
            return null;
        }
        Object objInvoke = getType.invoke(obj, null);
        objInvoke.getClass();
        return (Class) objInvoke;
    }
}
