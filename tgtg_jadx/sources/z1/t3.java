package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f46703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46704k;
    public final /* synthetic */ i80.n l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k2 f46705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w4.v f46706n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(i80.n nVar, k2 k2Var, w4.v vVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46703j = i11;
        this.l = nVar;
        this.f46705m = k2Var;
        this.f46706n = vVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f46703j) {
            case 0:
                return new t3(this.l, this.f46705m, this.f46706n, cVar, 0);
            default:
                return new t3(this.l, this.f46705m, this.f46706n, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f46703j) {
        }
        return ((t3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f46703j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f46704k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    h4.b bVar = new h4.b(this.f46706n.f43180c);
                    this.f46704k = 1;
                    if (this.l.invoke(this.f46705m, bVar, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f46704k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    h4.b bVar2 = new h4.b(this.f46706n.f43180c);
                    this.f46704k = 1;
                    if (this.l.invoke(this.f46705m, bVar2, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
