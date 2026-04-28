package ss;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at.o f39173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f39174c;

    public /* synthetic */ f0(at.o oVar, w0 w0Var, int i11) {
        this.f39172a = i11;
        this.f39173b = oVar;
        this.f39174c = w0Var;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        switch (this.f39172a) {
            case 0:
                Object objCollect = this.f39173b.collect(new e0(jVar, this.f39174c, 0), cVar);
                if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f39173b.collect(new e0(jVar, this.f39174c, 1), cVar);
                if (objCollect2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f39173b.collect(new e0(jVar, this.f39174c, 2), cVar);
                if (objCollect3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
