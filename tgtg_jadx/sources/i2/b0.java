package i2;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import t1.j1;
import z1.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f22788k;
    public final /* synthetic */ e0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f22789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f22790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t1.i f22791o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, int i11, float f11, t1.i iVar, x70.c cVar) {
        super(2, cVar);
        this.l = e0Var;
        this.f22789m = i11;
        this.f22790n = f11;
        this.f22791o = iVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b0 b0Var = new b0(this.l, this.f22789m, this.f22790n, this.f22791o, cVar);
        b0Var.f22788k = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((q2) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object obj2 = y70.a.COROUTINE_SUSPENDED;
        int i12 = this.f22787j;
        if (i12 == 0) {
            ba0.g.M(obj);
            q2 q2Var = (q2) this.f22788k;
            e0 e0Var = this.l;
            f2.x xVar = new f2.x(q2Var, e0Var, 1);
            this.f22787j = 1;
            float f11 = g0.f22857a;
            int i13 = this.f22789m;
            e0Var.f22836s.i(e0Var.k(new Integer(i13).intValue()));
            boolean z11 = i13 > e0Var.f22823e;
            int iE = (xVar.e() - e0Var.f22823e) + 1;
            if (((z11 && i13 > xVar.e()) || (!z11 && i13 < e0Var.f22823e)) && Math.abs(i13 - e0Var.f22823e) >= 3) {
                if (z11) {
                    i11 = i13 - iE;
                    int i14 = e0Var.f22823e;
                    if (i11 < i14) {
                        i11 = i14;
                    }
                } else {
                    int i15 = iE + i13;
                    i11 = e0Var.f22823e;
                    if (i15 <= i11) {
                        i11 = i15;
                    }
                }
                xVar.f(i11, 0);
            }
            Object objC = j1.c(0.0f, xVar.b(i13) + this.f22790n, this.f22791o, new gn.i(8, new Ref.FloatRef(), xVar), this, 4);
            if (objC != obj2) {
                objC = Unit.f26487a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i12 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Unit.f26487a;
    }
}
