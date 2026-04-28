package m3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f29493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29494k;
    public final /* synthetic */ y80.i l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t1 f29495m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2(y80.i iVar, t1 t1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f29493j = i11;
        this.l = iVar;
        this.f29495m = t1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f29493j) {
            case 0:
                return new z2(this.l, this.f29495m, cVar, 0);
            default:
                return new z2(this.l, this.f29495m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f29493j) {
        }
        return ((z2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29493j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f29494k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y2 y2Var = new y2(this.f29495m, 1);
                    this.f29494k = 1;
                    if (this.l.collect(y2Var, this) == aVar) {
                    }
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f29494k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y2 y2Var2 = new y2(this.f29495m, 3);
                    this.f29494k = 1;
                    if (this.l.collect(y2Var2, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
