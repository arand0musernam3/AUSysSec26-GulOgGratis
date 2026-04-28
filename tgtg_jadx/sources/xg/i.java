package xg;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y80.w f44271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f44272c;

    public /* synthetic */ i(y80.w wVar, x xVar, int i11) {
        this.f44270a = i11;
        this.f44271b = wVar;
        this.f44272c = xVar;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) throws Throwable {
        switch (this.f44270a) {
            case 0:
                Object objCollect = this.f44271b.collect(new h(jVar, this.f44272c, 0), cVar);
                if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f44271b.collect(new h(jVar, this.f44272c, 1), cVar);
                if (objCollect2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f44271b.collect(new h(jVar, this.f44272c, 2), cVar);
                if (objCollect3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f44271b.collect(new h(jVar, this.f44272c, 3), cVar);
                if (objCollect4 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f44271b.collect(new h(jVar, this.f44272c, 4), cVar);
                if (objCollect5 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f44271b.collect(new h(jVar, this.f44272c, 5), cVar);
                if (objCollect6 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f44271b.collect(new h(jVar, this.f44272c, 6), cVar);
                if (objCollect7 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect8 = this.f44271b.collect(new h(jVar, this.f44272c, 7), cVar);
                if (objCollect8 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
