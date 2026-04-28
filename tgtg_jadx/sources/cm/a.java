package cm;

import b4.t;
import bx.o;
import cj.q;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import d2.f;
import d2.h;
import d2.n0;
import d2.u0;
import d2.z1;
import d6.i0;
import g3.ea;
import g3.k6;
import g3.la;
import g3.p0;
import g3.t2;
import g3.w6;
import g3.z3;
import g4.l;
import g9.d0;
import i3.r;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lp.u;
import m3.i;
import m3.n;
import o30.e0;
import pi.m;
import t1.p1;
import t1.q1;
import t1.t1;
import t1.x;
import v80.b0;
import v80.f0;
import wi.p;
import y9.w;
import ym.y;
import yn.g;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8456g;

    public /* synthetic */ a(t tVar, List list, Function1 function1, Function1 function12, Function0 function0, int i11) {
        this.f8450a = 8;
        this.f8452c = tVar;
        this.f8454e = list;
        this.f8456g = function1;
        this.f8455f = function12;
        this.f8453d = function0;
        this.f8451b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8450a) {
            case 0:
                ((Integer) obj2).getClass();
                o.o((t) this.f8452c, (Function0) this.f8453d, (Function0) this.f8454e, (Function0) this.f8455f, (Function1) this.f8456g, (n) obj, i.F(this.f8451b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                na0.a.K((HighlightedItemMnuV2) this.f8452c, (String) this.f8453d, (String) this.f8454e, (String) this.f8455f, (y) this.f8456g, (n) obj, i.F(this.f8451b | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                e0.b((BaseItemMnuV2) this.f8452c, (String) this.f8453d, (String) this.f8454e, (String) this.f8455f, (y) this.f8456g, (n) obj, i.F(this.f8451b | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iF = i.F(1);
                p30.b.a(this.f8451b, (List) this.f8452c, (g) this.f8456g, (Function0) this.f8453d, (Function0) this.f8454e, (Function0) this.f8455f, (n) obj, iF);
                break;
            case 4:
                ((Integer) obj2).getClass();
                n0.b((t) this.f8452c, (f) this.f8453d, (h) this.f8454e, (u0) this.f8455f, (u3.d) this.f8456g, (n) obj, i.F(this.f8451b | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                t2.a((p0) this.f8452c, (z3) this.f8453d, (k6) this.f8454e, (la) this.f8455f, (Function2) this.f8456g, (n) obj, i.F(this.f8451b | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                r.b((i0) this.f8453d, (u3.d) this.f8454e, (ea) this.f8455f, (t) this.f8452c, (u3.d) this.f8456g, (n) obj, i.F(this.f8451b | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                li.a.c((w6) this.f8452c, (l) this.f8454e, (String) this.f8455f, (Function2) this.f8456g, (Function0) this.f8453d, (n) obj, i.F(this.f8451b | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                u.a((t) this.f8452c, (List) this.f8454e, (Function1) this.f8456g, (Function1) this.f8455f, (Function0) this.f8453d, (n) obj, i.F(this.f8451b | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                w.c((t) this.f8452c, (m) this.f8455f, (Function0) this.f8453d, (z1) this.f8456g, (Function0) this.f8454e, (n) obj, i.F(this.f8451b | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                sn.a.e((ProfileFeature) this.f8452c, (LoyaltyCardDetails) this.f8454e, (Function1) this.f8456g, (Function0) this.f8453d, (Function1) this.f8455f, (n) obj, i.F(this.f8451b | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                t1.a((q1) this.f8452c, (p1) this.f8453d, this.f8454e, this.f8455f, (x) this.f8456g, (n) obj, i.F(this.f8451b | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                int iF2 = i.F(1);
                na0.a.E((BasketItem) this.f8452c, (BasketManager) this.f8453d, this.f8451b, (um.u) this.f8454e, (Map) this.f8455f, (i80.n) this.f8456g, (n) obj, iF2);
                break;
            case 13:
                ((Integer) obj2).intValue();
                wi.h.d((q) this.f8452c, (UserAddress) this.f8456g, (Function0) this.f8453d, (Function0) this.f8454e, (Function0) this.f8455f, (n) obj, i.F(this.f8451b | 1));
                break;
            default:
                Map map = (Map) this.f8452c;
                List list = (List) this.f8453d;
                List list2 = (List) this.f8454e;
                b0 b0Var = (b0) this.f8455f;
                d0 d0Var = (d0) this.f8456g;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                z zVar = (z) obj2;
                zVar.getClass();
                map.put(num, zVar);
                if (!list.contains(num)) {
                    int i11 = this.f8451b;
                    if (!list2.contains(Integer.valueOf(iIntValue - i11)) && p.e(zVar)) {
                        list.add(num);
                        f0.B(b0Var, null, null, new no.e0(map, iIntValue, list2, i11, d0Var, list, null), 3);
                    }
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(int i11, List list, g gVar, Function0 function0, Function0 function02, Function0 function03, int i12) {
        this.f8450a = 3;
        this.f8451b = i11;
        this.f8452c = list;
        this.f8456g = gVar;
        this.f8453d = function0;
        this.f8454e = function02;
        this.f8455f = function03;
    }

    public /* synthetic */ a(t tVar, m mVar, Function0 function0, z1 z1Var, Function0 function02, int i11) {
        this.f8450a = 9;
        this.f8452c = tVar;
        this.f8455f = mVar;
        this.f8453d = function0;
        this.f8456g = z1Var;
        this.f8454e = function02;
        this.f8451b = i11;
    }

    public /* synthetic */ a(q qVar, UserAddress userAddress, Function0 function0, Function0 function02, Function0 function03, int i11) {
        this.f8450a = 13;
        this.f8452c = qVar;
        this.f8456g = userAddress;
        this.f8453d = function0;
        this.f8454e = function02;
        this.f8455f = function03;
        this.f8451b = i11;
    }

    public /* synthetic */ a(BasketItem basketItem, BasketManager basketManager, int i11, um.u uVar, Map map, i80.n nVar, int i12) {
        this.f8450a = 12;
        this.f8452c = basketItem;
        this.f8453d = basketManager;
        this.f8451b = i11;
        this.f8454e = uVar;
        this.f8455f = map;
        this.f8456g = nVar;
    }

    public /* synthetic */ a(ProfileFeature profileFeature, LoyaltyCardDetails loyaltyCardDetails, Function1 function1, Function0 function0, Function1 function12, int i11) {
        this.f8450a = 10;
        this.f8452c = profileFeature;
        this.f8454e = loyaltyCardDetails;
        this.f8456g = function1;
        this.f8453d = function0;
        this.f8455f = function12;
        this.f8451b = i11;
    }

    public /* synthetic */ a(i0 i0Var, u3.d dVar, ea eaVar, t tVar, u3.d dVar2, int i11) {
        this.f8450a = 6;
        this.f8453d = i0Var;
        this.f8454e = dVar;
        this.f8455f = eaVar;
        this.f8452c = tVar;
        this.f8456g = dVar2;
        this.f8451b = i11;
    }

    public /* synthetic */ a(w6 w6Var, l lVar, String str, Function2 function2, Function0 function0, int i11) {
        this.f8450a = 7;
        this.f8452c = w6Var;
        this.f8454e = lVar;
        this.f8455f = str;
        this.f8456g = function2;
        this.f8453d = function0;
        this.f8451b = i11;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11, int i12) {
        this.f8450a = i12;
        this.f8452c = obj;
        this.f8453d = obj2;
        this.f8454e = obj3;
        this.f8455f = obj4;
        this.f8456g = obj5;
        this.f8451b = i11;
    }

    public /* synthetic */ a(Map map, List list, List list2, int i11, b0 b0Var, d0 d0Var) {
        this.f8450a = 14;
        this.f8452c = map;
        this.f8453d = list;
        this.f8454e = list2;
        this.f8451b = i11;
        this.f8455f = b0Var;
        this.f8456g = d0Var;
    }
}
