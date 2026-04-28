package aa;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements y80.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y80.i f1144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y9.v f1145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f1147d;

    public n(y80.i iVar, y9.v vVar, boolean z11, Function1 function1) {
        this.f1144a = iVar;
        this.f1145b = vVar;
        this.f1146c = z11;
        this.f1147d = function1;
    }

    @Override // y80.i
    public final Object collect(y80.j jVar, x70.c cVar) {
        Object objCollect = this.f1144a.collect(new m(jVar, this.f1145b, this.f1146c, this.f1147d, 0), cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }
}
