package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends m1 {
    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean c(long j9, Object obj) {
        return this.f3011a.getBoolean(obj, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double d(long j9, Object obj) {
        return this.f3011a.getDouble(obj, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float e(long j9, Object obj) {
        return this.f3011a.getFloat(obj, j9);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void j(Object obj, long j9, boolean z11) {
        this.f3011a.putBoolean(obj, j9, z11);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(Object obj, long j9, byte b8) {
        this.f3011a.putByte(obj, j9, b8);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(Object obj, long j9, double d3) {
        this.f3011a.putDouble(obj, j9, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void m(Object obj, long j9, float f11) {
        this.f3011a.putFloat(obj, j9, f11);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f3011a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            n1.a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean r() {
        Unsafe unsafe = this.f3011a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (n1.g() != null) {
                    try {
                        Class<?> cls3 = this.f3011a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th2) {
                        n1.a(th2);
                        return false;
                    }
                }
            } catch (Throwable th3) {
                n1.a(th3);
            }
        }
        return false;
    }
}
