package z80;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {
    public h(y80.i iVar, CoroutineContext coroutineContext, int i11, x80.a aVar, int i12) {
        super((i12 & 4) != 0 ? -3 : i11, (i12 & 2) != 0 ? kotlin.coroutines.g.f26549a : coroutineContext, (i12 & 8) != 0 ? x80.a.SUSPEND : aVar, iVar);
    }

    @Override // z80.d
    public final d d(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return new h(i11, coroutineContext, aVar, this.f47369d);
    }

    @Override // z80.d
    public final y80.i e() {
        return this.f47369d;
    }

    @Override // z80.g
    public final Object g(y80.j jVar, x70.c cVar) {
        Object objCollect = this.f47369d.collect(jVar, cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }
}
