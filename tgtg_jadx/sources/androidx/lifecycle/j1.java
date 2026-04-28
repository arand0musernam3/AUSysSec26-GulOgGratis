package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f3464a = kotlin.collections.d0.h(Application.class, c1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f3465b = kotlin.collections.c0.c(c1.class);

    public static final Constructor a(Class cls, List list) {
        cls.getClass();
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listT = kotlin.collections.y.T(parameterTypes);
            if (Intrinsics.areEqual(list, listT)) {
                return constructor;
            }
            if (list.size() == listT.size() && listT.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final l1 b(Class cls, Constructor constructor, Object... objArr) {
        cls.getClass();
        try {
            return (l1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            a40.d0.o(w.a0.k(cls, "Failed to access "), e5);
            return null;
        } catch (InstantiationException e11) {
            a40.d0.o(w.a0.n("A ", cls, " cannot be instantiated."), e11);
            return null;
        } catch (InvocationTargetException e12) {
            a40.d0.o(w.a0.k(cls, "An exception happened in constructor of "), e12.getCause());
            return null;
        }
    }
}
