package at;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y80.w f4793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f4794c;

    public /* synthetic */ l(y80.w wVar, b0 b0Var, int i11) {
        this.f4792a = i11;
        this.f4793b = wVar;
        this.f4794c = b0Var;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) throws Throwable {
        switch (this.f4792a) {
            case 0:
                Object objCollect = this.f4793b.collect(new k(jVar, this.f4794c, 0), cVar);
                if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f4793b.collect(new k(jVar, this.f4794c, 1), cVar);
                if (objCollect2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f4793b.collect(new k(jVar, this.f4794c, 2), cVar);
                if (objCollect3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
