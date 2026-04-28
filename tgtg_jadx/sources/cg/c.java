package cg;

import com.app.tgtg.feature.logincharity.ui.model.Country;
import g3.w6;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7942e;

    public /* synthetic */ c(boolean z11, List list, Function1 function1, Function0 function0, int i11) {
        this.f7938a = 10;
        this.f7939b = z11;
        this.f7941d = list;
        this.f7942e = function1;
        this.f7940c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7938a) {
            case 0:
                ((Integer) obj2).getClass();
                j.a((w6) this.f7941d, this.f7939b, (Function1) this.f7942e, (Function0) this.f7940c, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                cp.a.h((b4.t) this.f7941d, this.f7939b, (i4.o) this.f7942e, (Function0) this.f7940c, (m3.n) obj, m3.i.F(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                m0.c.L((b4.t) this.f7941d, (Integer) this.f7942e, (Integer) this.f7940c, this.f7939b, (m3.n) obj, m3.i.F(3079));
                break;
            case 3:
                ((Integer) obj2).getClass();
                g3.s0.e(this.f7939b, (Function1) this.f7942e, (b4.t) this.f7941d, (u3.d) this.f7940c, (m3.n) obj, m3.i.F(3121));
                break;
            case 4:
                ((Integer) obj2).getClass();
                a.a.s((String) this.f7941d, (String) this.f7942e, this.f7939b, (b4.t) this.f7940c, (m3.n) obj, m3.i.F(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lp.d.f((b4.t) this.f7941d, this.f7939b, (Function0) this.f7940c, (Function1) this.f7942e, (m3.n) obj, m3.i.F(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                lp.r.b((hp.g) this.f7941d, this.f7939b, (Function0) this.f7940c, (b4.t) this.f7942e, (m3.n) obj, m3.i.F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                pm.a.f((b4.t) this.f7941d, (Function0) this.f7940c, this.f7939b, (u3.d) this.f7942e, (m3.n) obj, m3.i.F(3073));
                break;
            case 8:
                ((Integer) obj2).getClass();
                w0.e.d((r9.d) this.f7941d, this.f7939b, (Function0) this.f7940c, (Function0) this.f7942e, (m3.n) obj, m3.i.F(1));
                break;
            case 9:
                vj.c cVar = (vj.c) this.f7941d;
                sk.d dVar = (sk.d) this.f7942e;
                String str = (String) this.f7940c;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = sVar.h(dVar);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zH || objM == fVar) {
                        objM = new rv.a(dVar, 4);
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    boolean zH2 = sVar.h(dVar) | sVar.f(str);
                    boolean z11 = this.f7939b;
                    boolean zG = zH2 | sVar.g(z11);
                    Object objM2 = sVar.M();
                    if (zG || objM2 == fVar) {
                        objM2 = new bn.d(dVar, str, z11);
                        sVar.k0(objM2);
                    }
                    Function2 function2 = (Function2) objM2;
                    boolean zH3 = sVar.h(dVar) | sVar.f(str) | sVar.h(cVar);
                    Object objM3 = sVar.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new lw.o(dVar, str, cVar, 20);
                        sVar.k0(objM3);
                    }
                    yj.a.f(z11, cVar, function0, function2, (Function0) objM3, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                yj.a.d(this.f7939b, (List) this.f7941d, (Function1) this.f7942e, (Function0) this.f7940c, (m3.n) obj, m3.i.F(3457));
                break;
            default:
                ((Integer) obj2).getClass();
                yl.a.b((b4.t) this.f7941d, (Country) this.f7940c, this.f7939b, (Function1) this.f7942e, (m3.n) obj, m3.i.F(3079));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(b4.t tVar, Object obj, boolean z11, u70.f fVar, int i11, int i12) {
        this.f7938a = i12;
        this.f7941d = tVar;
        this.f7940c = obj;
        this.f7939b = z11;
        this.f7942e = fVar;
    }

    public /* synthetic */ c(Object obj, boolean z11, Object obj2, Function0 function0, int i11, int i12) {
        this.f7938a = i12;
        this.f7941d = obj;
        this.f7939b = z11;
        this.f7942e = obj2;
        this.f7940c = function0;
    }

    public /* synthetic */ c(Object obj, boolean z11, Function0 function0, Object obj2, int i11, int i12) {
        this.f7938a = i12;
        this.f7941d = obj;
        this.f7939b = z11;
        this.f7940c = function0;
        this.f7942e = obj2;
    }

    public /* synthetic */ c(String str, String str2, boolean z11, b4.t tVar, int i11) {
        this.f7938a = 4;
        this.f7941d = str;
        this.f7942e = str2;
        this.f7939b = z11;
        this.f7940c = tVar;
    }

    public /* synthetic */ c(b4.t tVar, Integer num, Integer num2, boolean z11, int i11) {
        this.f7938a = 2;
        this.f7941d = tVar;
        this.f7942e = num;
        this.f7940c = num2;
        this.f7939b = z11;
    }

    public /* synthetic */ c(boolean z11, Function1 function1, b4.t tVar, u3.d dVar, int i11) {
        this.f7938a = 3;
        this.f7939b = z11;
        this.f7942e = function1;
        this.f7941d = tVar;
        this.f7940c = dVar;
    }

    public /* synthetic */ c(boolean z11, vj.c cVar, sk.d dVar, String str) {
        this.f7938a = 9;
        this.f7939b = z11;
        this.f7941d = cVar;
        this.f7942e = dVar;
        this.f7940c = str;
    }
}
