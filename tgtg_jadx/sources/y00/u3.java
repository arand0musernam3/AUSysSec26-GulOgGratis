package y00;

import android.os.Looper;
import com.google.android.gms.internal.measurement.w5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u3 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w5 f45210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t10.c f45212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od.f f45213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ub.a f45214h;

    public u3(n1 n1Var) {
        super(n1Var);
        this.f45211e = true;
        this.f45212f = new t10.c(this);
        this.f45213g = new od.f(this);
        this.f45214h = new ub.a((Object) this, false, 25);
    }

    @Override // y00.i0
    public final boolean s() {
        return false;
    }

    public final void t() {
        p();
        if (this.f45210d == null) {
            this.f45210d = new w5(Looper.getMainLooper(), 0);
        }
    }
}
