package a3;

import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z1.b4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f375j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f376k;
    public final /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f381q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(u uVar, String str, long j9, m5.t0 t0Var, l3 l3Var, r5.s sVar, x70.c cVar) {
        super(2, cVar);
        this.f378n = uVar;
        this.f377m = str;
        this.l = j9;
        this.f379o = t0Var;
        this.f380p = l3Var;
        this.f381q = sVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f375j) {
            case 0:
                return new h3((u) this.f378n, (String) this.f377m, this.l, (m5.t0) this.f379o, (l3) this.f380p, (r5.s) this.f381q, cVar);
            case 1:
                return new h3((cj.s0) this.f378n, this.l, (PaymentMethods) this.f379o, (String) this.f377m, (String) this.f380p, (List) this.f381q, cVar);
            default:
                h3 h3Var = new h3((b4) this.f377m, (z1.z) this.f379o, (z1.u) this.f380p, this.l, (v80.i1) this.f381q, cVar);
                h3Var.f378n = obj;
                return h3Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f375j) {
            case 0:
                return ((h3) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((h3) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((h3) create((z1.k3) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objE;
        switch (this.f375j) {
            case 0:
                r5.s sVar = (r5.s) this.f381q;
                String str = (String) this.f377m;
                l3 l3Var = (l3) this.f380p;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f376k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                        objE = obj;
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    u uVar = (u) this.f378n;
                    this.f376k = 1;
                    objE = ((b0) uVar).e(str, this.l, this);
                    if (objE == aVar) {
                    }
                }
                m5.t0 t0Var = (m5.t0) objE;
                if (t0Var != null) {
                    long j9 = t0Var.f29650a;
                    long jB = m5.k0.b(sVar.i((int) (j9 >> 32)), sVar.i((int) (j9 & 4294967295L)));
                    if (!m5.t0.b(jB, (m5.t0) this.f379o) && Intrinsics.areEqual(l3Var.n().f37714a.f29538b, str) && sVar == l3Var.f449b) {
                        l3Var.f450c.invoke(l3.e(l3Var.n().f37714a, jB));
                        l3Var.f468v = new m5.t0(jB);
                    }
                }
                break;
            case 1:
                cj.s0 s0Var = (cj.s0) this.f378n;
                Object obj2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f376k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    Boolean bool = (Boolean) s0Var.f8385a.a("isMultiItem");
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    aj.c cVarE = s0Var.e();
                    String strF = s0Var.f();
                    String strJ = s0Var.j();
                    strJ.getClass();
                    ResumePaymentData resumePaymentData = new ResumePaymentData(this.l, (PaymentMethods) this.f379o, (String) this.f377m, (String) this.f380p, strF, zBooleanValue, cVarE, strJ, (List) this.f381q, null);
                    ui.m3 m3Var = s0Var.f8386b;
                    this.f376k = 1;
                    m3Var.getClass();
                    sa0.a.f38953a.a("insertResumePaymentData -> " + resumePaymentData, new Object[0]);
                    gt.y yVar = m3Var.f41243b;
                    Object objC = o00.x0.C(this, yVar.f20899a, false, true, new ek.a(22, yVar, resumePaymentData));
                    if (objC != obj2) {
                        objC = Unit.f26487a;
                    }
                    if (objC != obj2) {
                        objC = Unit.f26487a;
                    }
                    if (objC == obj2) {
                    }
                }
                break;
            default:
                z1.u uVar2 = (z1.u) this.f380p;
                z1.z zVar = (z1.z) this.f379o;
                b4 b4Var = (b4) this.f377m;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f376k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    z1.k3 k3Var = (z1.k3) this.f378n;
                    b4Var.f46427e = z1.z.L0(zVar, uVar2, this.l);
                    yj.k kVar = new yj.k(zVar, b4Var, (v80.i1) this.f381q, k3Var);
                    yj.l lVar = new yj.l(zVar, b4Var, uVar2, 4);
                    this.f376k = 1;
                    if (b4Var.a(kVar, lVar, this) == aVar2) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(cj.s0 s0Var, long j9, PaymentMethods paymentMethods, String str, String str2, List list, x70.c cVar) {
        super(2, cVar);
        this.f378n = s0Var;
        this.l = j9;
        this.f379o = paymentMethods;
        this.f377m = str;
        this.f380p = str2;
        this.f381q = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(b4 b4Var, z1.z zVar, z1.u uVar, long j9, v80.i1 i1Var, x70.c cVar) {
        super(2, cVar);
        this.f377m = b4Var;
        this.f379o = zVar;
        this.f380p = uVar;
        this.l = j9;
        this.f381q = i1Var;
    }
}
