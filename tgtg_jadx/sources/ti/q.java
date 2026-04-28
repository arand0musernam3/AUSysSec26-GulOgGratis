package ti;

import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f40257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40258b;

    public q(s sVar, int i11) {
        this.f40257a = sVar;
        this.f40258b = i11;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b4.t tVar = (b4.t) obj;
        ((Number) obj3).intValue();
        tVar.getClass();
        m3.s sVar = (m3.s) ((m3.n) obj2);
        sVar.a0(1702118549);
        Object objM = sVar.M();
        if (objM == m3.m.f29332a) {
            objM = a0.g(sVar);
        }
        b4.t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new p(this.f40257a, this.f40258b), 28);
        sVar.q(false);
        return tVarB;
    }
}
