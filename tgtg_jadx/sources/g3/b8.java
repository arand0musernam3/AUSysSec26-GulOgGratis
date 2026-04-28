package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b8 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f18374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18375k;
    public final /* synthetic */ t1.b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f18376m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c8 f18377n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8(t1.b bVar, float f11, c8 c8Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f18374j = i11;
        this.l = bVar;
        this.f18376m = f11;
        this.f18377n = c8Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f18374j) {
            case 0:
                return new b8(this.l, this.f18376m, this.f18377n, cVar, 0);
            default:
                return new b8(this.l, this.f18376m, this.f18377n, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f18374j) {
        }
        return ((b8) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f18374j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f18375k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    z5.f fVar = new z5.f(this.f18376m);
                    t1.b1 b1Var = this.f18377n.f18422r;
                    this.f18375k = 1;
                    if (t1.b.c(this.l, fVar, b1Var, null, this, 12) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f18375k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    z5.f fVar2 = new z5.f(this.f18376m);
                    t1.b1 b1Var2 = this.f18377n.f18422r;
                    this.f18375k = 1;
                    if (t1.b.c(this.l, fVar2, b1Var2, null, this, 12) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
