package y80;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements i1, i, z80.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f45482a;

    public g1(m1 m1Var) {
        this.f45482a = m1Var;
    }

    @Override // z80.q
    public final i a(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return r.t(this, coroutineContext, i11, aVar);
    }

    @Override // y80.i
    public final Object collect(j jVar, x70.c cVar) {
        return this.f45482a.collect(jVar, cVar);
    }
}
