package pc;

import ed.o;
import kotlin.coroutines.CoroutineContext;
import v80.y;
import v80.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.coroutines.a implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f34654a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(y.f42175a);
        this.f34654a = hVar;
    }

    @Override // v80.z
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        o oVar = this.f34654a.f34659e;
        if (oVar == null || oVar.getLevel() > 6) {
            return;
        }
        oVar.log("RealImageLoader", 6, null, th2);
    }
}
