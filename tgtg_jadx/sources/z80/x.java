package z80;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements x70.c, z70.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x70.c f47407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f47408b;

    public x(CoroutineContext coroutineContext, x70.c cVar) {
        this.f47407a = cVar;
        this.f47408b = coroutineContext;
    }

    @Override // z70.d
    public final z70.d getCallerFrame() {
        x70.c cVar = this.f47407a;
        if (cVar instanceof z70.d) {
            return (z70.d) cVar;
        }
        return null;
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return this.f47408b;
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        this.f47407a.resumeWith(obj);
    }
}
