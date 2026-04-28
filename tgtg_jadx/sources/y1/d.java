package y1;

import b0.z;
import b4.q;
import b4.t;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.z1;
import g9.f0;
import i80.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import m3.b1;
import m3.s;
import op.l;
import x2.y;
import x60.h;
import x60.m;
import xj.k;
import yi.r;
import yj.i;
import yk.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f45353e;

    public /* synthetic */ d(List list, Function1 function1, Function2 function2, k kVar) {
        this.f45349a = 2;
        this.f45351c = kVar;
        this.f45352d = list;
        this.f45353e = function1;
        this.f45350b = function2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j jVar;
        switch (this.f45349a) {
            case 0:
                Function2 function2 = (Function2) this.f45350b;
                e eVar = (e) this.f45351c;
                n nVar = (n) this.f45352d;
                Function0 function0 = (Function0) this.f45353e;
                c cVar = (c) obj;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar2).f(cVar) ? 4 : 2;
                }
                s sVar = (s) nVar2;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) function2.invoke(sVar, 0);
                    if (StringsKt.H(str)) {
                        c2.a.c("Label must not be blank");
                    }
                    eVar.getClass();
                    b.f45342a.invoke(q.f5711a, str, Boolean.TRUE, cVar, nVar, function0, sVar, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    sVar.U();
                }
                break;
            case 1:
                r rVar = (r) this.f45350b;
                String str2 = (String) this.f45351c;
                b1 b1Var = (b1) this.f45352d;
                b1 b1Var2 = (b1) this.f45353e;
                z1 z1Var = (z1) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((s) nVar3).f(z1Var) ? 4 : 2;
                }
                s sVar2 = (s) nVar3;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    f0 f0Var = rVar.f46018i;
                    f0Var.getClass();
                    float f11 = 12;
                    t tVarY = d2.c.y(d2.c.D(v1.n.j(q.f5711a, ((h) sVar2.j(PantryThemeKt.getLocalPantryColor())).f43905a, l2.g.c(f11, f11, 0.0f, 0.0f, 12)), 0.0f, ((m) sVar2.j(PantryThemeKt.getLocalPantrySpacing())).f44015k, 0.0f, 0.0f, 13), z1Var);
                    boolean zF = sVar2.f(str2) | sVar2.h(rVar);
                    Object objM = sVar2.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new y(1, str2, rVar, b1Var, b1Var2);
                        sVar2.k0(objM);
                    }
                    z.h(f0Var, "checkout_flow", tVarY, null, "Parent", null, null, null, null, (Function1) objM, sVar2, 24624, 1000);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                k kVar = (k) this.f45351c;
                List list = (List) this.f45352d;
                Function1 function1 = (Function1) this.f45353e;
                Function2 function22 = (Function2) this.f45350b;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                s sVar3 = (s) ((m3.n) obj2);
                boolean zH = sVar3.h(kVar);
                Object objM2 = sVar3.M();
                if (zH || objM2 == m3.m.f29332a) {
                    objM2 = new yj.d(kVar, 1);
                    sVar3.k0(objM2);
                }
                nv.c.a((Function0) objM2, u3.e.e(2073988740, sVar3, new i(list, function1, function22, kVar)), sVar3, 48);
                break;
            case 3:
                yk.h hVar = (yk.h) this.f45350b;
                b1 b1Var3 = (b1) this.f45351c;
                tg.i iVar = (tg.i) this.f45352d;
                vg.a aVar = (vg.a) this.f45353e;
                jl.c cVar2 = (jl.c) obj;
                jl.a aVar2 = (jl.a) obj2;
                l lVar = (l) obj3;
                cVar2.getClass();
                jl.b bVar = cVar2.f25299a;
                aVar2.getClass();
                int i11 = yk.c.$EnumSwitchMapping$0[aVar2.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        hVar.c(bVar);
                        iVar.e(cVar2, aVar);
                        b1Var3.setValue(bVar == jl.b.STATIONS ? j.STATIONS_PICKER : j.ADDRESS_PICKER);
                    } else if (i11 != 3) {
                        e40.a.f();
                    } else {
                        if (bVar != jl.b.STATIONS) {
                            lVar = null;
                        }
                        hVar.d(bVar, lVar);
                    }
                    break;
                } else {
                    hVar.c(bVar);
                    if (bVar == jl.b.GPS) {
                        hVar.d(bVar, null);
                        hVar.f(cVar2, jl.a.SELECT, null);
                    } else if (bVar != jl.b.SELECTED) {
                        if (bVar == jl.b.STATIONS) {
                            jVar = j.STATIONS_PICKER;
                        } else {
                            iVar.e(cVar2, aVar);
                            jVar = j.ADDRESS_PICKER;
                        }
                        b1Var3.setValue(jVar);
                    }
                }
                break;
            default:
                xo.a aVar3 = (xo.a) this.f45350b;
                yo.d dVar = (yo.d) this.f45351c;
                qo.h hVar2 = (qo.h) this.f45352d;
                xo.b bVar2 = (xo.b) this.f45353e;
                m3.n nVar4 = (m3.n) obj2;
                ((Integer) obj3).getClass();
                ((s1.z) obj).getClass();
                BaseItemMnuV2 baseItemMnuV2 = aVar3.f44473a;
                if (baseItemMnuV2 == null) {
                    s sVar4 = (s) nVar4;
                    sVar4.a0(-408306800);
                    sVar4.q(false);
                } else {
                    s sVar5 = (s) nVar4;
                    sVar5.a0(-408306799);
                    String phoneCountryCode = dVar.f46328a.m().getPhoneCountryCode();
                    boolean zH2 = sVar5.h(hVar2);
                    Object objM3 = sVar5.M();
                    if (zH2 || objM3 == m3.m.f29332a) {
                        objM3 = new zo.c(hVar2, 1);
                        sVar5.k0(objM3);
                    }
                    h0.g.k(baseItemMnuV2, phoneCountryCode, (Function0) objM3, bVar2.f44478a, bVar2.f44482e, null, sVar5, 0);
                    sVar5.q(false);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(int i11, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f45349a = i11;
        this.f45350b = obj;
        this.f45351c = obj2;
        this.f45352d = obj3;
        this.f45353e = obj4;
    }

    public /* synthetic */ d(Function2 function2, e eVar, n nVar, Function0 function0) {
        this.f45349a = 0;
        this.f45350b = function2;
        this.f45351c = eVar;
        this.f45352d = nVar;
        this.f45353e = function0;
    }
}
