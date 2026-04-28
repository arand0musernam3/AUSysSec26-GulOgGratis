package bn;

import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal;
import com.app.tgtg.model.remote.mapService.response.FilterChipOption;
import com.app.tgtg.model.remote.mapService.response.MapFilters;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import d2.y2;
import g3.w6;
import g3.x5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6403h;

    public /* synthetic */ a0(BasketItem basketItem, BasketManager basketManager, int i11, um.u uVar, ym.z zVar, Map map, i80.n nVar, int i12) {
        this.f6396a = 12;
        this.f6401f = basketItem;
        this.f6397b = basketManager;
        this.f6398c = i11;
        this.f6399d = uVar;
        this.f6400e = zVar;
        this.f6402g = map;
        this.f6403h = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6396a;
        int i12 = this.f6398c;
        Object obj3 = this.f6403h;
        Object obj4 = this.f6402g;
        Object obj5 = this.f6400e;
        Object obj6 = this.f6397b;
        Object obj7 = this.f6399d;
        Object obj8 = this.f6401f;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                lx.u.i((BaseItemMnuV2) obj8, (String) obj6, (String) obj7, (String) obj5, (String) obj4, (ym.y) obj3, (m3.n) obj, m3.i.F(1 | i12));
                break;
            case 1:
                ((Integer) obj2).getClass();
                cg.j.j((b4.t) obj8, (String) obj6, this.f6398c, (u0) obj4, (u0) obj3, (String) obj7, (String) obj5, (m3.n) obj, m3.i.F(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                em.a.b((b4.t) obj8, (List) obj6, (b1) obj7, (Function0) obj5, (Function2) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1 | i12));
                break;
            case 3:
                ((Integer) obj2).getClass();
                fi.e.c((g4.v) obj8, (String) obj6, (CharityIdError) obj7, (Function1) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1 | i12));
                break;
            case 4:
                Function2 function2 = (Function2) obj8;
                u3.d dVar = (u3.d) obj6;
                Function2 function22 = (Function2) obj7;
                Function2 function23 = (Function2) obj5;
                i3.d0 d0Var = (i3.d0) obj4;
                Function2 function24 = (Function2) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z11 = (iIntValue & 3) != 2;
                int i13 = 1 & iIntValue;
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(i13, z11)) {
                    x5.b(this.f6398c, function2, dVar, function22, function23, d0Var, function24, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                x5.b(this.f6398c, (Function2) obj8, (u3.d) obj6, (Function2) obj7, (Function2) obj5, (y2) obj4, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                dx.f.g((l1.d) obj8, (b4.t) obj6, (l1.c) obj7, (b4.f) obj5, (z4.m) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1 | i12));
                break;
            case 7:
                ((Integer) obj2).getClass();
                lj.d.a((FilterChipOption) obj8, (MapFilters) obj6, (List) obj7, (gj.c0) obj5, (jj.c) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1 | i12));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i14 = ManufacturerOrderActivity.f9167q;
                ((ManufacturerOrderActivity) obj8).b0((Order) obj6, (Function0) obj7, (Function0) obj5, (Function0) obj4, (i80.n) obj3, (m3.n) obj, m3.i.F(1 | i12));
                break;
            case 9:
                ((Integer) obj2).getClass();
                b0.z.j((String) obj6, (kn.c) obj8, (Function0) obj7, (Function1) obj5, (Function0) obj4, this.f6398c, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                oo.a.I((Order) obj8, (b4.t) obj6, (fo.b) obj7, (w6) obj5, (v80.b0) obj4, this.f6398c, (Function0) obj3, (m3.n) obj, m3.i.F(1572865));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((u3.d) obj8).a(this.f6397b, (Boolean) obj7, this.f6400e, this.f6402g, this.f6403h, (m3.n) obj, 1 | m3.i.F(i12));
                break;
            case 12:
                ((Integer) obj2).getClass();
                jf.e.c((BasketItem) obj8, (BasketManager) obj6, this.f6398c, (um.u) obj7, (ym.z) obj5, (Map) obj4, (i80.n) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                wi.a.h((cj.q) obj8, (jg.c) obj6, (UserAddress) obj7, (Function0) obj5, (Function0) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1 | i12));
                break;
            default:
                ((Integer) obj2).getClass();
                wi.p.a((ArrayList) obj8, (DeliveryOptionsLocal) obj6, (List) obj7, (i80.n) obj5, (g9.d0) obj4, (wi.e) obj3, this.f6398c, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a0(int i11, Function2 function2, u3.d dVar, Function2 function22, Function2 function23, i3.d0 d0Var, Function2 function24) {
        this.f6396a = 4;
        this.f6398c = i11;
        this.f6401f = function2;
        this.f6397b = dVar;
        this.f6399d = function22;
        this.f6400e = function23;
        this.f6402g = d0Var;
        this.f6403h = function24;
    }

    public /* synthetic */ a0(b4.t tVar, String str, int i11, u0 u0Var, u0 u0Var2, String str2, String str3, int i12) {
        this.f6396a = 1;
        this.f6401f = tVar;
        this.f6397b = str;
        this.f6398c = i11;
        this.f6402g = u0Var;
        this.f6403h = u0Var2;
        this.f6399d = str2;
        this.f6400e = str3;
    }

    public /* synthetic */ a0(int i11, Function2 function2, u3.d dVar, Function2 function22, Function2 function23, y2 y2Var, Function2 function24, int i12) {
        this.f6396a = 5;
        this.f6398c = i11;
        this.f6401f = function2;
        this.f6397b = dVar;
        this.f6399d = function22;
        this.f6400e = function23;
        this.f6402g = y2Var;
        this.f6403h = function24;
    }

    public /* synthetic */ a0(Order order, b4.t tVar, fo.b bVar, w6 w6Var, v80.b0 b0Var, int i11, Function0 function0, int i12) {
        this.f6396a = 10;
        this.f6401f = order;
        this.f6397b = tVar;
        this.f6399d = bVar;
        this.f6400e = w6Var;
        this.f6402g = b0Var;
        this.f6398c = i11;
        this.f6403h = function0;
    }

    public /* synthetic */ a0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11, int i12) {
        this.f6396a = i12;
        this.f6401f = obj;
        this.f6397b = obj2;
        this.f6399d = obj3;
        this.f6400e = obj4;
        this.f6402g = obj5;
        this.f6403h = obj6;
        this.f6398c = i11;
    }

    public /* synthetic */ a0(String str, kn.c cVar, Function0 function0, Function1 function1, Function0 function02, int i11, Function0 function03, int i12) {
        this.f6396a = 9;
        this.f6397b = str;
        this.f6401f = cVar;
        this.f6399d = function0;
        this.f6400e = function1;
        this.f6402g = function02;
        this.f6398c = i11;
        this.f6403h = function03;
    }

    public /* synthetic */ a0(ArrayList arrayList, DeliveryOptionsLocal deliveryOptionsLocal, List list, i80.n nVar, g9.d0 d0Var, wi.e eVar, int i11, int i12) {
        this.f6396a = 14;
        this.f6401f = arrayList;
        this.f6397b = deliveryOptionsLocal;
        this.f6399d = list;
        this.f6400e = nVar;
        this.f6402g = d0Var;
        this.f6403h = eVar;
        this.f6398c = i11;
    }

    public /* synthetic */ a0(u3.d dVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i11) {
        this.f6396a = 11;
        this.f6401f = dVar;
        this.f6397b = obj;
        this.f6399d = bool;
        this.f6400e = obj2;
        this.f6402g = obj3;
        this.f6403h = obj4;
        this.f6398c = i11;
    }
}
