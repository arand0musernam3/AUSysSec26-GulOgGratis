package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f3011a;

    public m1(Unsafe unsafe) {
        this.f3011a = unsafe;
    }

    public final int a(Class cls) {
        return this.f3011a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f3011a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j9, Object obj);

    public abstract double d(long j9, Object obj);

    public abstract float e(long j9, Object obj);

    public final int f(long j9, Object obj) {
        return this.f3011a.getInt(obj, j9);
    }

    public final long g(long j9, Object obj) {
        return this.f3011a.getLong(obj, j9);
    }

    public final Object h(long j9, Object obj) {
        return this.f3011a.getObject(obj, j9);
    }

    public final long i(Field field) {
        return this.f3011a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j9, boolean z11);

    public abstract void k(Object obj, long j9, byte b8);

    public abstract void l(Object obj, long j9, double d3);

    public abstract void m(Object obj, long j9, float f11);

    public final void n(int i11, long j9, Object obj) {
        this.f3011a.putInt(obj, j9, i11);
    }

    public final void o(Object obj, long j9, long j11) {
        this.f3011a.putLong(obj, j9, j11);
    }

    public final void p(long j9, Object obj, Object obj2) {
        this.f3011a.putObject(obj, j9, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f3011a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            n1.a(th2);
            return false;
        }
    }

    public abstract boolean r();
}
