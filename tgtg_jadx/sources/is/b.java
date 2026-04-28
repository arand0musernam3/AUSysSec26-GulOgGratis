package is;

import b2.l;
import b4.t;
import i80.n;
import m3.m;
import m3.s;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f24154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24155c;

    public b(boolean z11, c cVar, boolean z12) {
        this.f24153a = z11;
        this.f24154b = cVar;
        this.f24155c = z12;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = (t) obj;
        ((Number) obj3).intValue();
        tVar.getClass();
        s sVar = (s) ((m3.n) obj2);
        sVar.a0(1702118549);
        Object objM = sVar.M();
        if (objM == m.f29332a) {
            objM = a0.g(sVar);
        }
        t tVarB = androidx.compose.foundation.b.b(tVar, (l) objM, null, false, null, null, new a(this.f24153a, this.f24154b, this.f24155c), 28);
        sVar.q(false);
        return tVarB;
    }
}
