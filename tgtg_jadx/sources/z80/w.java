package z80;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x80.x f47406a;

    public w(x80.u uVar) {
        this.f47406a = uVar;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        Object objF = this.f47406a.f(obj, cVar);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : Unit.f26487a;
    }
}
