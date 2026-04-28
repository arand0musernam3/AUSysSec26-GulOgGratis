package qa;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.e f36639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f36640b;

    public a0(b0 b0Var, q1.e eVar) {
        this.f36640b = b0Var;
        this.f36639a = eVar;
    }

    @Override // qa.z, qa.w
    public final void c(y yVar) {
        ((ArrayList) this.f36639a.get(this.f36640b.f36642b)).remove(yVar);
        yVar.F(this);
    }
}
