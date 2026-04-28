package nk;

import f0.f2;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at.o f31023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f31024c;

    public /* synthetic */ n(at.o oVar, f2 f2Var, int i11) {
        this.f31022a = i11;
        this.f31023b = oVar;
        this.f31024c = f2Var;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        switch (this.f31022a) {
            case 0:
                Object objCollect = this.f31023b.collect(new m(jVar, this.f31024c, 0), cVar);
                if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f31023b.collect(new m(jVar, this.f31024c, 1), cVar);
                if (objCollect2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f31023b.collect(new m(jVar, this.f31024c, 2), cVar);
                if (objCollect3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f31023b.collect(new m(jVar, this.f31024c, 3), cVar);
                if (objCollect4 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f31023b.collect(new m(jVar, this.f31024c, 4), cVar);
                if (objCollect5 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f31023b.collect(new m(jVar, this.f31024c, 5), cVar);
                if (objCollect6 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect7 = this.f31023b.collect(new m(jVar, this.f31024c, 6), cVar);
                if (objCollect7 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
