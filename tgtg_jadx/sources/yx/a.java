package yx;

import ax.a0;
import ax.s0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o30.f0;
import ox.h;
import vx.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f46339a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f46340b;

    public static final void a(Object obj, Throwable th2) {
        obj.getClass();
        if (f46340b) {
            f46339a.add(obj);
            a0 a0Var = a0.f4849a;
            if (s0.c()) {
                f0.x(th2);
                h.n(th2, b.CrashShield).b();
            }
        }
    }
}
