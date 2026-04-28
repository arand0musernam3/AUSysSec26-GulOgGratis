package o00;

import com.braze.Constants;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends ox.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Unsafe f31671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f31672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f31673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f31674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f31675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f31676i;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e5) {
                a40.d0.o("Could not initialize intrinsics", e5.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(k1.f31700a);
        }
        try {
            f31673f = unsafe.objectFieldOffset(j1.class.getDeclaredField("c"));
            f31672e = unsafe.objectFieldOffset(j1.class.getDeclaredField("b"));
            f31674g = unsafe.objectFieldOffset(j1.class.getDeclaredField(Constants.BRAZE_PUSH_CONTENT_KEY));
            f31675h = unsafe.objectFieldOffset(i1.class.getDeclaredField(Constants.BRAZE_PUSH_CONTENT_KEY));
            f31676i = unsafe.objectFieldOffset(i1.class.getDeclaredField("b"));
            f31671d = unsafe;
        } catch (NoSuchFieldException e11) {
            org.bouncycastle.jce.provider.a.m(e11);
        }
    }

    @Override // ox.h
    public final void W(i1 i1Var, Thread thread) {
        f31671d.putObject(i1Var, f31675h, thread);
    }

    @Override // ox.h
    public final void X(i1 i1Var, i1 i1Var2) {
        f31671d.putObject(i1Var, f31676i, i1Var2);
    }

    @Override // ox.h
    public final boolean Y(j1 j1Var, i1 i1Var, i1 i1Var2) {
        return e1.a(f31671d, j1Var, f31673f, i1Var, i1Var2);
    }

    @Override // ox.h
    public final i1 Z(t1 t1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.f31678c;
        do {
            i1Var = t1Var.f31692c;
            if (i1Var2 == i1Var) {
                break;
            }
        } while (!Y(t1Var, i1Var, i1Var2));
        return i1Var;
    }

    @Override // ox.h
    public final b1 a0(t1 t1Var) {
        b1 b1Var;
        b1 b1Var2 = b1.f31625b;
        do {
            b1Var = t1Var.f31691b;
            if (b1Var2 == b1Var) {
                break;
            }
        } while (!f1.a(f31671d, t1Var, f31672e, b1Var));
        return b1Var;
    }

    @Override // ox.h
    public final boolean b0(j1 j1Var, Object obj, Object obj2) {
        return g1.a(f31671d, j1Var, f31674g, obj, obj2);
    }
}
