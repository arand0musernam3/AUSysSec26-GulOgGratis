package lh;

import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at.o f27808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f27809c;

    public /* synthetic */ m(at.o oVar, w wVar, int i11) {
        this.f27807a = i11;
        this.f27808b = oVar;
        this.f27809c = wVar;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        switch (this.f27807a) {
            case 0:
                Object objCollect = this.f27808b.collect(new l(jVar, this.f27809c, 0), cVar);
                if (objCollect != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f27808b.collect(new l(jVar, this.f27809c, 2), cVar);
                if (objCollect2 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
