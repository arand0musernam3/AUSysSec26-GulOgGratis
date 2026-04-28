package f6;

import android.os.Handler;
import java.util.ArrayList;
import m3.e2;
import z3.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f17410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f17411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f17412c = new x(new m(this, 0));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17413d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f17414e = new m(this, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f17415f = new ArrayList();

    public n(l lVar) {
        this.f17410a = lVar;
    }

    @Override // m3.e2
    public final void c() {
        x xVar = this.f17412c;
        gn.q qVar = xVar.f47083h;
        if (qVar != null) {
            qVar.a();
        }
        xVar.a();
    }

    @Override // m3.e2
    public final void d() {
        this.f17412c.e();
    }

    @Override // m3.e2
    public final void b() {
    }
}
