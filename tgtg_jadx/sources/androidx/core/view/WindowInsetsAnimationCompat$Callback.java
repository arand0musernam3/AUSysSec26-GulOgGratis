package androidx.core.view;

import h7.f1;
import h7.o1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WindowInsetsAnimationCompat$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsetsCompat f2738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2739b;

    public WindowInsetsAnimationCompat$Callback(int i11) {
        this.f2739b = i11;
    }

    public final int a() {
        return this.f2739b;
    }

    public abstract WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List<o1> list);

    public void b(o1 o1Var) {
    }

    public void c(o1 o1Var) {
    }

    public f1 e(o1 o1Var, f1 f1Var) {
        return f1Var;
    }
}
