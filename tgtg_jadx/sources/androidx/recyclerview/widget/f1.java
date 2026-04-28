package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f3728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3729b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3730c = new Rect();

    public f1(y1 y1Var) {
        this.f3728a = y1Var;
    }

    public static f1 a(y1 y1Var, int i11) {
        if (i11 == 0) {
            return new d1(y1Var);
        }
        if (i11 == 1) {
            return new e1(y1Var);
        }
        i4.a.f("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i11);
}
