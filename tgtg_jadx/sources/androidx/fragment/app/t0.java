package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1.k1 f3334a = new q1.k1(0);

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        q1.k1 k1Var = f3334a;
        q1.k1 k1Var2 = (q1.k1) k1Var.get(classLoader);
        if (k1Var2 == null) {
            k1Var2 = new q1.k1(0);
            k1Var.put(classLoader, k1Var2);
        }
        Class cls = (Class) k1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        k1Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e5) {
            throw new Fragment.InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e5);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) c(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e5) {
            throw new Fragment.InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (InstantiationException e11) {
            throw new Fragment.InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new Fragment.InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new Fragment.InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
