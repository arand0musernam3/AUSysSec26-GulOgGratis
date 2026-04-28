package f3;

import com.braze.h2;
import g9.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t1.j1;
import t1.q1;
import t1.y0;
import v80.b0;
import v80.f0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f17265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17266k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f17267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f17268n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f11, y0 y0Var, l lVar, x70.c cVar) {
        super(2, cVar);
        this.f17265j = 1;
        this.l = f11;
        this.f17267m = y0Var;
        this.f17268n = lVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f17265j) {
            case 0:
                return new g((ae.c) this.f17267m, this.l, (t1.i) this.f17268n, cVar, 0);
            case 1:
                return new g(this.l, (y0) this.f17267m, (l) this.f17268n, cVar);
            case 2:
                return new g((y0) this.f17267m, this.l, (o9.d) this.f17268n, cVar, 2);
            default:
                g gVar = new g((q1) this.f17268n, cVar);
                gVar.f17267m = obj;
                return gVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f17265j) {
        }
        return ((g) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        float fH;
        b0 b0Var;
        switch (this.f17265j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f17266k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    t1.b bVar = (t1.b) ((ae.c) this.f17267m).f1244c;
                    Float f11 = new Float(this.l);
                    t1.i iVar = (t1.i) this.f17268n;
                    this.f17266k = 1;
                    if (t1.b.c(bVar, f11, iVar, null, this, 12) == aVar) {
                    }
                }
                break;
            case 1:
                y0 y0Var = (y0) this.f17267m;
                float f12 = this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f17266k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                    } else if (i12 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    if (f12 > 0.0f) {
                        this.f17266k = 1;
                        if (y0Var.y(f12, y0Var.f39606c.getValue(), this) == aVar2) {
                        }
                    }
                }
                if (f12 == 0.0f) {
                    l lVar = (l) this.f17268n;
                    this.f17266k = 2;
                    if (y0Var.B(lVar, this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f17266k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    y0 y0Var2 = (y0) this.f17267m;
                    float f13 = this.l;
                    o9.d dVar = (o9.d) this.f17268n;
                    this.f17266k = 1;
                    if (y0Var2.y(f13, dVar, this) == aVar3) {
                    }
                }
                break;
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f17266k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    b0 b0Var2 = (b0) this.f17267m;
                    fH = j1.h(b0Var2.getCoroutineContext());
                    b0Var = b0Var2;
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fH = this.l;
                    b0Var = (b0) this.f17267m;
                    ba0.g.M(obj);
                }
                while (f0.y(b0Var)) {
                    p9.e eVar = new p9.e((q1) this.f17268n, fH, 1);
                    this.f17267m = b0Var;
                    this.l = fH;
                    this.f17266k = 1;
                    if (m3.i.u(getContext()).t(eVar, this) == aVar4) {
                        break;
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, float f11, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f17265j = i11;
        this.f17267m = obj;
        this.l = f11;
        this.f17268n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q1 q1Var, x70.c cVar) {
        super(2, cVar);
        this.f17265j = 3;
        this.f17268n = q1Var;
    }
}
