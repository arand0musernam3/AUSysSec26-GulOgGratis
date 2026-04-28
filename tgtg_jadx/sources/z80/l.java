package z80;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z70.i f47381e;

    /* JADX WARN: Multi-variable type inference failed */
    public l(i80.n nVar, y80.i iVar, CoroutineContext coroutineContext, int i11, x80.a aVar) {
        super(i11, coroutineContext, aVar, iVar);
        this.f47381e = (z70.i) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i80.n, z70.i] */
    @Override // z80.d
    public final d d(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return new l(this.f47381e, this.f47369d, coroutineContext, i11, aVar);
    }

    @Override // z80.g
    public final Object g(y80.j jVar, x70.c cVar) {
        Object objN = f0.n(new k(this, jVar, null), cVar);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }
}
