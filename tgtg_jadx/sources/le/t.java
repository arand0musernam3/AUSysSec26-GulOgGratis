package le;

import he.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v80.l f27752b;

    public /* synthetic */ t(v80.l lVar, int i11) {
        this.f27751a = i11;
        this.f27752b = lVar;
    }

    @Override // he.c0
    public final void onResult(Object obj) {
        int i11 = this.f27751a;
        v80.l lVar = this.f27752b;
        switch (i11) {
            case 0:
                if (!lVar.x()) {
                    u70.o oVar = u70.q.f40850b;
                    lVar.resumeWith(obj);
                }
                break;
            default:
                Throwable th2 = (Throwable) obj;
                if (!lVar.x()) {
                    u70.o oVar2 = u70.q.f40850b;
                    th2.getClass();
                    lVar.resumeWith(new u70.p(th2));
                }
                break;
        }
    }
}
