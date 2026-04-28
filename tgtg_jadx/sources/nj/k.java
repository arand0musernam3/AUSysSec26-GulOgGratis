package nj;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at.o f30929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f30930c;

    public /* synthetic */ k(at.o oVar, t tVar, int i11) {
        this.f30928a = i11;
        this.f30929b = oVar;
        this.f30930c = tVar;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        switch (this.f30928a) {
            case 0:
                Object objCollect = this.f30929b.collect(new j(jVar, this.f30930c, 0), cVar);
                if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f30929b.collect(new j(jVar, this.f30930c, 1), cVar);
                if (objCollect2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f30929b.collect(new j(jVar, this.f30930c, 2), cVar);
                if (objCollect3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
