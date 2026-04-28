package y80;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements y1, i, z80.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f45488a;

    public h1(a2 a2Var) {
        this.f45488a = a2Var;
    }

    @Override // z80.q
    public final i a(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || aVar != x80.a.DROP_OLDEST) ? r.t(this, coroutineContext, i11, aVar) : this;
    }

    @Override // y80.i
    public final Object collect(j jVar, x70.c cVar) {
        return this.f45488a.collect(jVar, cVar);
    }

    @Override // y80.y1
    public final Object getValue() {
        return this.f45488a.getValue();
    }
}
