package i9;

import com.app.tgtg.model.remote.user.response.charity.LocalDivergenceDay;
import f2.c0;
import g3.g7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.c3;
import m3.h1;
import q1.m0;
import s1.x0;
import s1.y0;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23540a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c3 f23546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1 f23547h;

    public /* synthetic */ s(Function1 function1, c0 c0Var, h1 h1Var, h1 h1Var2, h1 h1Var3, h1 h1Var4, h1 h1Var5) {
        this.f23541b = function1;
        this.f23542c = c0Var;
        this.f23543d = h1Var;
        this.f23544e = h1Var2;
        this.f23545f = h1Var3;
        this.f23546g = h1Var4;
        this.f23547h = h1Var5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f11;
        int i11 = this.f23540a;
        Object obj2 = this.f23545f;
        Object obj3 = this.f23544e;
        Object obj4 = this.f23541b;
        Object obj5 = this.f23543d;
        b1 b1Var = this.f23547h;
        c3 c3Var = this.f23546g;
        Object obj6 = this.f23542c;
        int i12 = 1;
        switch (i11) {
            case 0:
                m0 m0Var = (m0) obj6;
                i iVar = (i) obj5;
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) obj3;
                Function1 function13 = (Function1) obj2;
                s1.s sVar = (s1.s) obj;
                if (((List) c3Var.getValue()).contains(sVar.a())) {
                    String str = ((g9.l) sVar.a()).f20167f;
                    int iA = m0Var.a(str);
                    if (iA >= 0) {
                        f11 = m0Var.f35859c[iA];
                    } else {
                        m0Var.f(str, 0.0f);
                        f11 = 0.0f;
                    }
                    if (!Intrinsics.areEqual(((g9.l) sVar.c()).f20167f, ((g9.l) sVar.a()).f20167f)) {
                        f11 = (((Boolean) iVar.f23515c.getValue()).booleanValue() || ((Boolean) b1Var.getValue()).booleanValue()) ? f11 - 1.0f : f11 + 1.0f;
                    }
                    m0Var.f(((g9.l) sVar.c()).f20167f, f11);
                } else {
                    x0 x0Var = x0.f38729b;
                    y0 y0Var = y0.f38731b;
                    int i13 = s1.i.f38614b;
                }
                break;
            case 1:
                c0 c0Var = (c0) obj6;
                h1 h1Var = (h1) obj5;
                h1 h1Var2 = (h1) obj3;
                h1 h1Var3 = (h1) obj2;
                h1 h1Var4 = (h1) c3Var;
                h1 h1Var5 = (h1) b1Var;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                ((Function1) obj4).invoke(num);
                int iH = h1Var.h();
                if (iH == 0) {
                    h1Var2.i(c0Var.h());
                    h1Var3.i(c0Var.i());
                } else if (iH == 1) {
                    h1Var4.i(c0Var.h());
                    h1Var5.i(c0Var.i());
                }
                h1Var.i(iIntValue);
                break;
            default:
                ti.s sVar2 = (ti.s) obj6;
                c3 c3Var2 = (c3) obj5;
                b0 b0Var = (b0) obj4;
                String str2 = (String) obj3;
                g7 g7Var = (g7) obj2;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                f2.l.q(lVar, null, new u3.d(new ti.j(sVar2, c3Var, 0), true, 413075885), 3);
                f2.l.q(lVar, null, new u3.d(new oo.s(6, sVar2, b1Var), true, 1590297124), 3);
                List<LocalDivergenceDay> list = (List) c3Var2.getValue();
                ArrayList arrayList = new ArrayList();
                for (LocalDivergenceDay localDivergenceDay : list) {
                    if (localDivergenceDay.isAvailable()) {
                        localDivergenceDay = null;
                    }
                    if (localDivergenceDay != null) {
                        arrayList.add(localDivergenceDay);
                    }
                }
                List<LocalDivergenceDay> list2 = (List) c3Var2.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (LocalDivergenceDay localDivergenceDay2 : list2) {
                    if (!localDivergenceDay2.isAvailable()) {
                        localDivergenceDay2 = null;
                    }
                    if (localDivergenceDay2 != null) {
                        arrayList2.add(localDivergenceDay2);
                    }
                }
                f2.l.q(lVar, null, new u3.d(new ji.a(i12, arrayList), true, 1692774117), 3);
                List listG = ti.t.g(arrayList);
                lVar.r(listG.size(), null, new ti.n(listG, 0), new u3.d(new ti.o(listG, sVar2, b0Var, str2, arrayList, g7Var, 0), true, 2039820996));
                f2.l.q(lVar, null, new u3.d(new ji.a(2, arrayList2), true, 1795251110), 3);
                List listG2 = ti.t.g(arrayList2);
                lVar.r(listG2.size(), null, new ti.n(listG2, 1), new u3.d(new ti.o(listG2, sVar2, b0Var, str2, arrayList2, g7Var, 1), true, 2039820996));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ s(m0 m0Var, i iVar, Function1 function1, Function1 function12, Function1 function13, c3 c3Var, b1 b1Var) {
        this.f23542c = m0Var;
        this.f23543d = iVar;
        this.f23541b = function1;
        this.f23544e = function12;
        this.f23545f = function13;
        this.f23546g = c3Var;
        this.f23547h = b1Var;
    }

    public /* synthetic */ s(ti.s sVar, c3 c3Var, b1 b1Var, c3 c3Var2, b0 b0Var, String str, g7 g7Var) {
        this.f23542c = sVar;
        this.f23546g = c3Var;
        this.f23547h = b1Var;
        this.f23543d = c3Var2;
        this.f23541b = b0Var;
        this.f23544e = str;
        this.f23545f = g7Var;
    }
}
