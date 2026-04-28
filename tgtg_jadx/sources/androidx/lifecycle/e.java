package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f3426c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3427a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3428b = new HashMap();

    public static void b(HashMap map, d dVar, w wVar, Class cls) {
        w wVar2 = (w) map.get(dVar);
        if (wVar2 == null || wVar == wVar2) {
            if (wVar2 == null) {
                map.put(dVar, wVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + dVar.f3422b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + wVar2 + ", new value " + wVar);
    }

    public final c a(Class cls, Method[] methodArr) {
        int i11;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f3427a;
        if (superclass != null) {
            c cVarA = (c) map2.get(superclass);
            if (cVarA == null) {
                cVarA = a(superclass, null);
            }
            map.putAll(cVarA.f3418b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            c cVarA2 = (c) map2.get(cls2);
            if (cVarA2 == null) {
                cVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : cVarA2.f3418b.entrySet()) {
                b(map, (d) entry.getKey(), (w) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z11 = false;
        for (Method method : methodArr) {
            q0 q0Var = (q0) method.getAnnotation(q0.class);
            if (q0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i11 = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        i4.a.f("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i11 = 1;
                }
                w wVarValue = q0Var.value();
                if (parameterTypes.length > 1) {
                    if (!w.class.isAssignableFrom(parameterTypes[1])) {
                        i4.a.f("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (wVarValue != w.ON_ANY) {
                        i4.a.f("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i11 = 2;
                }
                if (parameterTypes.length > 2) {
                    i4.a.f("cannot have more than 2 params");
                    return null;
                }
                b(map, new d(method, i11), wVarValue, cls);
                z11 = true;
            }
        }
        c cVar = new c(map);
        map2.put(cls, cVar);
        this.f3428b.put(cls, Boolean.valueOf(z11));
        return cVar;
    }
}
