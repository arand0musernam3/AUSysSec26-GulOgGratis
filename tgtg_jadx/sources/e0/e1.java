package e0;

import android.os.Build;
import android.util.Size;
import com.braze.h2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f15331a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f15332b = new e1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f15333c = new e1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f15334d = new e1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f15335e = new e1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e1 f15336f = new e1();

    public static b1 a(int i11, int i12, Size size, c1 c1Var, d1 d1Var, e1 e1Var, f1 f1Var, g1 g1Var, String str) {
        int i13 = i12 & 8;
        e1 e1Var2 = f15331a;
        e1 e1Var3 = i13 != 0 ? e1Var2 : e1Var;
        c1 c1Var2 = (i12 & 64) != 0 ? null : c1Var;
        f1 f1Var2 = (i12 & 128) != 0 ? null : f1Var;
        g1 g1Var2 = (i12 & 256) != 0 ? null : g1Var;
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        size.getClass();
        n0Var.getClass();
        if (Intrinsics.areEqual(e1Var3, f15333c) || Intrinsics.areEqual(e1Var3, f15332b) || ((Intrinsics.areEqual(e1Var3, f15335e) || Intrinsics.areEqual(e1Var3, f15336f)) && Build.VERSION.SDK_INT >= 35)) {
            return new z0(size, i11, str, e1Var3, d1Var, c1Var2, f1Var2, g1Var2, n0Var);
        }
        if (Intrinsics.areEqual(e1Var3, e1Var2)) {
            return new a1(size, i11, str, d1Var, c1Var2, f1Var2, g1Var2, n0Var);
        }
        h2.b("Check failed.");
        return null;
    }
}
