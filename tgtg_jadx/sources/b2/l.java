package b2;

import kotlin.Unit;
import y80.m1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f5563a = r.b(0, 16, x80.a.DROP_OLDEST, 1);

    @Override // b2.k
    public final y80.i a() {
        return this.f5563a;
    }

    public final Object b(j jVar, x70.c cVar) throws Throwable {
        Object objEmit = this.f5563a.emit(jVar, cVar);
        return objEmit == y70.a.COROUTINE_SUSPENDED ? objEmit : Unit.f26487a;
    }

    public final void c(j jVar) {
        this.f5563a.i(jVar);
    }
}
