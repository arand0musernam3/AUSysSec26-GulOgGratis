package u70;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends b implements x70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o90.s f40829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Unit f40830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x70.c f40831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f40832d;

    @Override // x70.c
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f26549a;
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        this.f40831c = null;
        this.f40832d = obj;
    }
}
