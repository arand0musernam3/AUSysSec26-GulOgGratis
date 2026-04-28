package h2;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21247k;
    public final /* synthetic */ b0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(b0 b0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f21246j = i11;
        this.l = b0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f21246j) {
            case 0:
                return new y(this.l, cVar, 0);
            case 1:
                return new y(this.l, cVar, 1);
            case 2:
                return new y(this.l, cVar, 2);
            case 3:
                return new y(this.l, cVar, 3);
            default:
                return new y(this.l, cVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f21246j) {
        }
        return ((y) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f21246j;
        b0 b0Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f21247k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar = b0Var.f21057p;
                    Float f11 = new Float(1.0f);
                    this.f21247k = 1;
                    if (bVar.f(f11, this) == aVar) {
                    }
                } else if (i12 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f21247k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar2 = b0Var.f21056o;
                    z5.j jVar = new z5.j(0L);
                    this.f21247k = 1;
                    if (bVar2.f(jVar, this) == aVar2) {
                    }
                } else if (i13 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                int i14 = b0.f21042t;
                b0Var.g(0L);
                b0Var.f(false);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f21247k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar3 = b0Var.f21056o;
                    this.f21247k = 1;
                    if (bVar3.g(this) == aVar3) {
                    }
                } else if (i15 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f21247k;
                if (i16 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar4 = b0Var.f21057p;
                    this.f21247k = 1;
                    if (bVar4.g(this) == aVar4) {
                    }
                } else if (i16 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
            default:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f21247k;
                if (i17 == 0) {
                    ba0.g.M(obj);
                    t1.b bVar5 = b0Var.f21057p;
                    this.f21247k = 1;
                    if (bVar5.g(this) == aVar5) {
                    }
                } else if (i17 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                break;
        }
        return Unit.f26487a;
    }
}
