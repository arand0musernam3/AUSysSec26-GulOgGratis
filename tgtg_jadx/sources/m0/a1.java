package m0;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f28462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f28463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f28464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28465g;

    public a1(n0 n0Var, Size size, k0 k0Var) {
        super(n0Var);
        this.f28462d = new Object();
        if (size == null) {
            this.f28464f = this.f28503b.b();
            this.f28465g = this.f28503b.getHeight();
        } else {
            this.f28464f = size.getWidth();
            this.f28465g = size.getHeight();
        }
        this.f28463e = k0Var;
    }

    @Override // m0.f0, m0.n0
    public final k0 Y() {
        return this.f28463e;
    }

    @Override // m0.f0, m0.n0
    public final int b() {
        return this.f28464f;
    }

    @Override // m0.f0, m0.n0
    public final int getHeight() {
        return this.f28465g;
    }
}
