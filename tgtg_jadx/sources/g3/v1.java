package g3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19613g;

    public /* synthetic */ v1(List list, List list2, List list3, boolean z11, Function1 function1, Function1 function12) {
        this.f19607a = 2;
        this.f19609c = list;
        this.f19610d = list2;
        this.f19611e = list3;
        this.f19608b = z11;
        this.f19612f = function1;
        this.f19613g = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r5.d0 d0Var;
        z4.z zVar;
        z4.z zVar2;
        switch (this.f19607a) {
            case 0:
                String str = (String) this.f19609c;
                String str2 = (String) this.f19610d;
                String str3 = (String) this.f19611e;
                bg.b bVar = (bg.b) this.f19612f;
                c5.f3 f3Var = (c5.f3) this.f19613g;
                j5.b0 b0Var = (j5.b0) obj;
                if (Intrinsics.areEqual("PrimaryNotEditable", "SecondaryEditable")) {
                    j5.z.m(b0Var, 0);
                    if (!this.f19608b) {
                        str = str2;
                    }
                    j5.z.o(str, b0Var);
                    j5.z.h(str3, b0Var);
                } else {
                    j5.z.m(b0Var, 6);
                }
                j5.z.c(b0Var, new ep.l(10, bVar, f3Var));
                break;
            case 1:
                m2.e1 e1Var = (m2.e1) this.f19609c;
                m3.k1 k1Var = e1Var.f28831o;
                c5.x3 x3Var = (c5.x3) this.f19610d;
                a3.l3 l3Var = (a3.l3) this.f19611e;
                r5.y yVar = (r5.y) this.f19612f;
                r5.s sVar = (r5.s) this.f19613g;
                z4.z zVar3 = (z4.z) obj;
                e1Var.f28825h = zVar3;
                m2.a2 a2VarD = e1Var.d();
                if (a2VarD != null) {
                    a2VarD.f28763b = zVar3;
                }
                if (this.f19608b) {
                    if (e1Var.a() == m2.u0.Selection) {
                        if (((Boolean) e1Var.l.getValue()).booleanValue() && ((c5.q2) x3Var).b()) {
                            l3Var.r();
                        } else {
                            l3Var.o();
                        }
                        e1Var.f28829m.setValue(Boolean.valueOf(m0.c.e0(l3Var, true)));
                        e1Var.f28830n.setValue(Boolean.valueOf(m0.c.e0(l3Var, false)));
                        k1Var.setValue(Boolean.valueOf(m5.t0.d(yVar.f37715b)));
                    } else if (e1Var.a() == m2.u0.Cursor) {
                        k1Var.setValue(Boolean.valueOf(m0.c.e0(l3Var, true)));
                    }
                    m2.g0.B(e1Var, yVar, sVar);
                    m2.a2 a2VarD2 = e1Var.d();
                    if (a2VarD2 != null && (d0Var = e1Var.f28822e) != null && e1Var.b() && (zVar = a2VarD2.f28763b) != null && zVar.n() && (zVar2 = a2VarD2.f28764c) != null) {
                        m5.q0 q0Var = a2VarD2.f28762a;
                        a3.f2 f2Var = new a3.f2(zVar, 5);
                        h4.c cVarC = a3.l2.c(zVar);
                        h4.c cVarV = zVar.v(zVar2, false);
                        if (Intrinsics.areEqual((r5.d0) d0Var.f37665a.f37718b.get(), d0Var)) {
                            d0Var.f37666b.h(yVar, sVar, q0Var, f2Var, cVarC, cVarV);
                        }
                    }
                }
                break;
            case 2:
                List list = (List) this.f19609c;
                List list2 = (List) this.f19610d;
                List list3 = (List) this.f19611e;
                Function1 function1 = (Function1) this.f19612f;
                Function1 function12 = (Function1) this.f19613g;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                boolean zIsEmpty = list.isEmpty();
                boolean z11 = this.f19608b;
                if (!zIsEmpty) {
                    f2.l.q(lVar, null, tp.b.f40374a, 3);
                    lVar.r(list.size(), null, new cn.n(list, 23), new u3.d(new ph.f(list, list3, z11, function1), true, 802480018));
                }
                f2.l.q(lVar, null, tp.b.f40375b, 3);
                if (list2 != null) {
                    lVar.r(list2.size(), null, new cn.n(list2, 24), new u3.d(new tp.e(list2, z11, function12), true, 802480018));
                }
                f2.l.q(lVar, null, tp.b.f40376c, 3);
                break;
            default:
                List list4 = (List) this.f19609c;
                Function1 function13 = (Function1) this.f19610d;
                op.c cVar = (op.c) this.f19611e;
                List list5 = (List) this.f19612f;
                Function1 function14 = (Function1) this.f19613g;
                f2.l lVar2 = (f2.l) obj;
                lVar2.getClass();
                f2.l.q(lVar2, null, tp.b.f40379f, 3);
                lVar2.r(list4.size(), null, new cn.n(list4, 26), new u3.d(new tp.h(list4, this.f19608b, function13, cVar, list5, function14), true, 802480018));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ v1(Object obj, boolean z11, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f19607a = i11;
        this.f19609c = obj;
        this.f19608b = z11;
        this.f19610d = obj2;
        this.f19611e = obj3;
        this.f19612f = obj4;
        this.f19613g = obj5;
    }

    public /* synthetic */ v1(boolean z11, String str, String str2, String str3, bg.b bVar, c5.f3 f3Var) {
        this.f19607a = 0;
        this.f19608b = z11;
        this.f19609c = str;
        this.f19610d = str2;
        this.f19611e = str3;
        this.f19612f = bVar;
        this.f19613g = f3Var;
    }
}
