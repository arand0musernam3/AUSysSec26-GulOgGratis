package z70;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends a {
    public g(x70.c cVar) {
        super(cVar);
        if (cVar == null || cVar.getContext() == kotlin.coroutines.g.f26549a) {
            return;
        }
        i4.a.f("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f26549a;
    }
}
