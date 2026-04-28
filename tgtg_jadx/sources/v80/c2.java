package v80;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends a90.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(CoroutineContext coroutineContext, x70.c cVar, int i11) {
        super(coroutineContext, cVar);
        this.f42076e = i11;
    }

    @Override // v80.s1
    public final boolean w(Throwable th2) {
        switch (this.f42076e) {
            case 0:
                return false;
            default:
                if (th2 instanceof ChildCancelledException) {
                    return true;
                }
                return q(th2);
        }
    }
}
