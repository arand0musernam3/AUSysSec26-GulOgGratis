package d2;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13900g;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f13894a = i11;
        this.f13895b = obj;
        this.f13896c = obj2;
        this.f13897d = obj3;
        this.f13898e = obj4;
        this.f13899f = obj5;
        this.f13900g = obj6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13894a) {
            case 0:
                z4.m1[] m1VarArr = (z4.m1[]) this.f13895b;
                List list = (List) this.f13896c;
                z4.w0 w0Var = (z4.w0) this.f13897d;
                Ref.IntRef intRef = (Ref.IntRef) this.f13898e;
                Ref.IntRef intRef2 = (Ref.IntRef) this.f13899f;
                s sVar = (s) this.f13900g;
                z4.l1 l1Var = (z4.l1) obj;
                int length = m1VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i12 < length) {
                    z4.m1 m1Var = m1VarArr[i12];
                    m1Var.getClass();
                    p.b(l1Var, m1Var, (z4.t0) list.get(i11), w0Var.getLayoutDirection(), intRef.element, intRef2.element, sVar.f13913a);
                    i12++;
                    i11++;
                }
                break;
            case 1:
                m3.b1 b1Var = (m3.b1) this.f13895b;
                v80.b0 b0Var = (v80.b0) this.f13896c;
                m3.b1 b1Var2 = (m3.b1) this.f13897d;
                Function0 function0 = (Function0) this.f13898e;
                Function1 function1 = (Function1) this.f13899f;
                m3.b1 b1Var3 = (m3.b1) this.f13900g;
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 8) {
                    StringBuilder sb2 = new StringBuilder();
                    int length2 = str.length();
                    for (int i13 = 0; i13 < length2; i13++) {
                        char cCharAt = str.charAt(i13);
                        if (Character.isDigit(cCharAt)) {
                            sb2.append(cCharAt);
                        }
                    }
                    b1Var2.setValue(sb2.toString());
                    v80.i1 i1Var = (v80.i1) b1Var.getValue();
                    if (i1Var != null) {
                        i1Var.a(null);
                    }
                    b1Var.setValue(v80.f0.B(b0Var, null, null, new al.n(function0, function1, b1Var2, b1Var3, (x70.c) null, 13), 3));
                }
                break;
            case 2:
                List list2 = (List) this.f13896c;
                m3.b1 b1Var4 = (m3.b1) this.f13895b;
                Set set = (Set) this.f13897d;
                ArrayList arrayList = (ArrayList) this.f13898e;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f13899f;
                Function1 function12 = (Function1) this.f13900g;
                g2.i iVar = (g2.i) obj;
                iVar.getClass();
                g2.i.q(iVar, list2.size(), new u3.d(new lp.e(list2, 4), true, -1152499440));
                g2.i.q(iVar, (((YearMonth) b1Var4.getValue()).atDay(1).getDayOfWeek().getValue() + 6) % 7, ti.t.f40276e);
                g2.i.q(iVar, ((YearMonth) b1Var4.getValue()).lengthOfMonth(), new u3.d(new ep.d(set, arrayList, objectRef, b1Var4, function12, 2), true, -2023161400));
                break;
            case 3:
                g9.f0 f0Var = (g9.f0) this.f13895b;
                ii.j0 j0Var = (ii.j0) this.f13896c;
                pi.m mVar = (pi.m) this.f13897d;
                m3.b1 b1Var5 = (m3.b1) this.f13898e;
                m3.b1 b1Var6 = (m3.b1) this.f13899f;
                Function0 function02 = (Function0) this.f13900g;
                g9.c0 c0Var = (g9.c0) obj;
                c0Var.getClass();
                f0Var.getClass();
                j0Var.getClass();
                mVar.getClass();
                b1Var5.getClass();
                b1Var6.getClass();
                zz.f.z(c0Var, ii.e.INSTANCE, Reflection.getOrCreateKotlinClass(xh.h.class), new bg.a1(f0Var, j0Var, mVar, b1Var5, b1Var6, 9));
                function02.getClass();
                zz.f.z(c0Var, xh.f0.INSTANCE, Reflection.getOrCreateKotlinClass(xh.c0.class), new dq.e(function02, f0Var));
                break;
            default:
                List list3 = (List) this.f13896c;
                f2.c0 c0Var2 = (f2.c0) this.f13895b;
                x60.h hVar = (x60.h) this.f13897d;
                Function1 function13 = (Function1) this.f13898e;
                Function1 function14 = (Function1) this.f13899f;
                Function1 function15 = (Function1) this.f13900g;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                lVar.r(list3.size(), new ao.p2(27, new w2.g0(27), list3), new vm.p(list3, 1), new u3.d(new dp.h(list3, c0Var2, hVar, function13, function14, function15), true, 802480018));
                f2.l.q(lVar, null, yj.a.f46043c, 3);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ r(List list, Object obj, Object obj2, Object obj3, Object obj4, Function1 function1, int i11) {
        this.f13894a = i11;
        this.f13896c = list;
        this.f13895b = obj;
        this.f13897d = obj2;
        this.f13898e = obj3;
        this.f13899f = obj4;
        this.f13900g = function1;
    }
}
