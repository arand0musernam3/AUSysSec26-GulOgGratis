package o30;

import com.braze.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends w.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Unsafe f31904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f31905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f31906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f31907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f31908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f31909h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new p());
            }
            try {
                f31906e = unsafe.objectFieldOffset(s.class.getDeclaredField("c"));
                f31905d = unsafe.objectFieldOffset(s.class.getDeclaredField("b"));
                f31907f = unsafe.objectFieldOffset(s.class.getDeclaredField(Constants.BRAZE_PUSH_CONTENT_KEY));
                f31908g = unsafe.objectFieldOffset(r.class.getDeclaredField(Constants.BRAZE_PUSH_CONTENT_KEY));
                f31909h = unsafe.objectFieldOffset(r.class.getDeclaredField("b"));
                f31904c = unsafe;
            } catch (NoSuchFieldException e5) {
                org.bouncycastle.jce.provider.a.m(e5);
            }
        } catch (PrivilegedActionException e11) {
            a40.d0.o("Could not initialize intrinsics", e11.getCause());
        }
    }

    public static /* synthetic */ Unsafe f0() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // w.b
    public final g H(j jVar) {
        g gVar;
        g gVar2 = g.f31883d;
        do {
            gVar = jVar.f31921b;
            if (gVar2 == gVar) {
                break;
            }
        } while (!v(jVar, gVar, gVar2));
        return gVar;
    }

    @Override // w.b
    public final r I(j jVar) {
        r rVar;
        r rVar2 = r.f31910c;
        do {
            rVar = jVar.f31922c;
            if (rVar2 == rVar) {
                break;
            }
        } while (!x(jVar, rVar, rVar2));
        return rVar;
    }

    @Override // w.b
    public final void X(r rVar, r rVar2) {
        f31904c.putObject(rVar, f31909h, rVar2);
    }

    @Override // w.b
    public final void Y(r rVar, Thread thread) {
        f31904c.putObject(rVar, f31908g, thread);
    }

    @Override // w.b
    public final boolean v(j jVar, g gVar, g gVar2) {
        return m.a(f31904c, jVar, f31905d, gVar, gVar2);
    }

    @Override // w.b
    public final boolean w(s sVar, Object obj, Object obj2) {
        return n.a(f31904c, sVar, f31907f, obj, obj2);
    }

    @Override // w.b
    public final boolean x(s sVar, r rVar, r rVar2) {
        return o.a(f31904c, sVar, f31906e, rVar, rVar2);
    }
}
