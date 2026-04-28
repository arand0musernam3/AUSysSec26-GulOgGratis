package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f11988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f11989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v2 f11990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f11992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f11993f;

    static {
        boolean z11;
        v2 v2Var;
        Unsafe unsafeL = l();
        f11988a = unsafeL;
        int i11 = p0.f11740a;
        f11989b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        v2 t2Var = null;
        if (unsafeL != null) {
            if (zM) {
                t2Var = new u2(unsafeL);
            } else if (zM2) {
                t2Var = new t2(unsafeL);
            }
        }
        f11990c = t2Var;
        if (t2Var != null) {
            try {
                Class<?> cls3 = ((Unsafe) t2Var.f11956a).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th2) {
                Logger.getLogger(w2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        v2 v2Var2 = f11990c;
        if (v2Var2 == null) {
            z11 = false;
        } else {
            try {
                Class<?> cls4 = ((Unsafe) v2Var2.f11956a).getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z11 = true;
            } catch (Throwable th3) {
                Logger.getLogger(w2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z11 = false;
            }
        }
        f11991d = z11;
        f11992e = p(byte[].class);
        p(boolean[].class);
        q(boolean[].class);
        p(int[].class);
        q(int[].class);
        p(long[].class);
        q(long[].class);
        p(float[].class);
        q(float[].class);
        p(double[].class);
        q(double[].class);
        p(Object[].class);
        q(Object[].class);
        Field fieldA = a();
        if (fieldA != null && (v2Var = f11990c) != null) {
            ((Unsafe) v2Var.f11956a).objectFieldOffset(fieldA);
        }
        f11993f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field a() {
        Field declaredField;
        Field declaredField2;
        int i11 = p0.f11740a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void b(Object obj, long j9, byte b8) {
        Unsafe unsafe = (Unsafe) f11990c.f11956a;
        long j11 = (-4) & j9;
        int i11 = unsafe.getInt(obj, j11);
        int i12 = ((~((int) j9)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b8) << i12) | (i11 & (~(255 << i12))));
    }

    public static void c(Object obj, long j9, byte b8) {
        Unsafe unsafe = (Unsafe) f11990c.f11956a;
        long j11 = (-4) & j9;
        int i11 = (((int) j9) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b8) << i11) | (unsafe.getInt(obj, j11) & (~(255 << i11))));
    }

    public static Object d(Class cls) {
        try {
            return f11988a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int e(long j9, Object obj) {
        return ((Unsafe) f11990c.f11956a).getInt(obj, j9);
    }

    public static void f(int i11, long j9, Object obj) {
        ((Unsafe) f11990c.f11956a).putInt(obj, j9, i11);
    }

    public static long g(long j9, Object obj) {
        return ((Unsafe) f11990c.f11956a).getLong(obj, j9);
    }

    public static void h(Object obj, long j9, long j11) {
        ((Unsafe) f11990c.f11956a).putLong(obj, j9, j11);
    }

    public static Object i(long j9, Object obj) {
        return ((Unsafe) f11990c.f11956a).getObject(obj, j9);
    }

    public static void j(long j9, Object obj, Object obj2) {
        ((Unsafe) f11990c.f11956a).putObject(obj, j9, obj2);
    }

    public static void k(byte[] bArr, byte b8, long j9) {
        f11990c.b(bArr, f11992e + j9, b8);
    }

    public static Unsafe l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new s2());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(w2.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean m(Class cls) {
        int i11 = p0.f11740a;
        try {
            Class cls2 = f11989b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean n(long j9, Object obj) {
        return ((byte) ((((Unsafe) f11990c.f11956a).getInt(obj, (-4) & j9) >>> ((int) (((~j9) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean o(long j9, Object obj) {
        return ((byte) ((((Unsafe) f11990c.f11956a).getInt(obj, (-4) & j9) >>> ((int) ((j9 & 3) << 3))) & 255)) != 0;
    }

    public static int p(Class cls) {
        if (f11991d) {
            return ((Unsafe) f11990c.f11956a).arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void q(Class cls) {
        if (f11991d) {
            ((Unsafe) f11990c.f11956a).arrayIndexScale(cls);
        }
    }
}
