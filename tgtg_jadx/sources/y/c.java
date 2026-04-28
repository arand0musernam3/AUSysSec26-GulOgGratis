package y;

import kotlin.jvm.internal.Intrinsics;
import ky.o;
import m0.y0;
import s0.p1;
import s0.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile r1 f44524a;

    static {
        p1 p1Var = p1.f38431c;
        p1Var.f38432a.a(w.b.F(), new o(new y0(1), 19));
    }

    public static final r1 a() {
        r1 r1Var = f44524a;
        if (r1Var != null) {
            return r1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("all");
        return null;
    }
}
