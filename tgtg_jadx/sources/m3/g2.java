package m3;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends kotlin.coroutines.a implements v80.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a4.h f29282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f29283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(a4.h hVar, h2 h2Var) {
        super(v80.y.f42175a);
        this.f29282a = hVar;
        this.f29283b = h2Var;
    }

    @Override // v80.z
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        a4.h hVar = this.f29282a;
        h2 h2Var = this.f29283b;
        a4.e.b(th2, new a3.n2(2, hVar, h2Var));
        CoroutineContext coroutineContext2 = h2Var.f29294b;
        v80.y yVar = v80.y.f42175a;
        v80.z zVar = (v80.z) coroutineContext2.get(yVar);
        if (zVar != null) {
            zVar.handleException(coroutineContext, th2);
            return;
        }
        v80.z zVar2 = (v80.z) h2Var.f29293a.get(yVar);
        if (zVar2 == null) {
            throw th2;
        }
        zVar2.handleException(coroutineContext, th2);
    }
}
