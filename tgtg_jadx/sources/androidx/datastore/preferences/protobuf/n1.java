package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f3016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f3017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f3018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f3019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f3020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f3021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f3022g;

    static {
        Unsafe unsafeI = i();
        f3016a = unsafeI;
        f3017b = b.f2928a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        m1 l1Var = null;
        if (unsafeI != null) {
            if (!b.a()) {
                l1Var = new l1(unsafeI);
            } else if (zH) {
                l1Var = new k1(unsafeI, 1);
            } else if (zH2) {
                l1Var = new k1(unsafeI, 0);
            }
        }
        f3018c = l1Var;
        f3019d = l1Var == null ? false : l1Var.r();
        f3020e = l1Var == null ? false : l1Var.q();
        f3021f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && l1Var != null) {
            l1Var.i(fieldG);
        }
        f3022g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static boolean b(long j9, Object obj) {
        return ((byte) ((f3018c.f((-4) & j9, obj) >>> ((int) (((~j9) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j9, Object obj) {
        return ((byte) ((f3018c.f((-4) & j9, obj) >>> ((int) ((j9 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f3016a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static int e(Class cls) {
        if (f3020e) {
            return f3018c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f3020e) {
            f3018c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (b.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean h(Class cls) {
        if (!b.a()) {
            return false;
        }
        try {
            Class cls2 = f3017b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, byte b8, long j9) {
        f3018c.k(bArr, f3021f + j9, b8);
    }

    public static void k(Object obj, long j9, byte b8) {
        long j11 = (-4) & j9;
        int iF = f3018c.f(j11, obj);
        int i11 = ((~((int) j9)) & 3) << 3;
        m(((255 & b8) << i11) | (iF & (~(255 << i11))), j11, obj);
    }

    public static void l(Object obj, long j9, byte b8) {
        long j11 = (-4) & j9;
        int i11 = (((int) j9) & 3) << 3;
        m(((255 & b8) << i11) | (f3018c.f(j11, obj) & (~(255 << i11))), j11, obj);
    }

    public static void m(int i11, long j9, Object obj) {
        f3018c.n(i11, j9, obj);
    }

    public static void n(Object obj, long j9, long j11) {
        f3018c.o(obj, j9, j11);
    }

    public static void o(long j9, Object obj, Object obj2) {
        f3018c.p(j9, obj, obj2);
    }
}
