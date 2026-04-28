package a3;

import androidx.lifecycle.LifecycleOwner;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderVariant;
import g3.ea;
import g3.g7;
import g3.w6;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f574f;

    public /* synthetic */ t0(b4.t tVar, List list, Date date, int i11, Function1 function1, int i12) {
        this.f569a = 16;
        this.f571c = tVar;
        this.f572d = list;
        this.f574f = date;
        this.f570b = i11;
        this.f573e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f569a;
        Object obj3 = this.f572d;
        int i12 = this.f570b;
        Object obj4 = this.f573e;
        Object obj5 = this.f571c;
        Object obj6 = this.f574f;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                ex.i.f((b4.t) obj5, (i0) obj3, (Function1) obj4, (u3.d) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m0.c.N((BaseItemMnuV2) obj5, (String) obj3, (String) obj4, (ym.y) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                c6.l.a((i80.n) obj3, (b4.t) obj5, (Function1) obj4, (Function1) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                cg.j.k((List) obj3, (Function1) obj4, (b4.t) obj5, (Map) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jb.u.f((cn.b) obj5, (LatestInteractionOrigin) obj3, (Function0) obj4, (Function2) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                o00.x0.k((SortingChoice) obj5, (SortingChoice) obj3, (String) obj4, (Function2) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                p30.b.e((List) obj5, (v80.b0) obj3, (Function1) obj4, (Function1) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                cp.a.l((b4.t) obj5, (Boolean) obj3, (Function0) obj4, (Function0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                cp.a.n((z4.z) obj5, (Function0) obj3, (Function0) obj4, (Function0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                h0.g.h((b4.t) obj5, (Function0) obj3, (Function0) obj4, (Function0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 10:
                m3.n nVar = (m3.n) obj;
                ((Integer) obj2).getClass();
                int i13 = CharityOrderActivity.f9162o;
                ((CharityOrderActivity) obj5).H((Order) obj3, (List) obj6, (Function1) obj4, nVar, m3.i.F(i12 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                i3.r.f((ea) obj3, (m3.b1) obj4, (b4.t) obj5, (u3.d) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ba0.g.c((String) obj5, (String) obj3, (String) obj4, (Function0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                d40.t1.b((String) obj5, (String) obj3, (String) obj4, (String) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                w0.e.g((ArrayList) obj5, (List) obj3, (Set) obj4, (Set) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                nn.q.l((ProfileScreenResponse) obj5, (m3.b1) obj3, (mn.l) obj4, (Function0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(7);
                w0.e.a((b4.t) obj5, (List) obj3, (Date) obj6, this.f570b, (Function1) obj4, (m3.n) obj, iF);
                break;
            case 17:
                ((Integer) obj2).intValue();
                qk.j.a((nk.q0) obj5, (m1.a) obj3, (g7) obj4, (f2.c0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                PantryPageHeaderKt.a((PageHeaderVariant) obj5, (Function0) obj3, (String) obj4, (Function2) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                sn.a.f((ProfileFeature) obj5, (LoyaltyCardDetails) obj3, (Function1) obj4, (Function1) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                sn.a.d((ProfileFeature) obj5, (LoyaltyCardDetails) obj3, (Function0) obj6, (Function1) obj4, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((u3.d) obj6).b(this.f571c, this.f572d, this.f573e, (m3.n) obj, m3.i.F(i12) | 1);
                break;
            case 22:
                ((Integer) obj2).getClass();
                v1.n.e((d6.i0) obj5, (v1.u) obj3, (v80.b0) obj4, (u3.d) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                m0.c.M((BasketResponse) obj5, (w6) obj3, (BasketManager) obj4, (um.u) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                vn.b.a((ProfileFeature) obj5, (Function1) obj4, (Function1) obj3, (Function0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
            case 25:
                m3.n nVar2 = (m3.n) obj;
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(i12 | 1);
                w8.e.b((Boolean) obj5, this.f572d, (LifecycleOwner) obj6, (Function1) obj4, nVar2, iF2);
                break;
            default:
                ((Integer) obj2).intValue();
                wi.h.a((UserAddress) obj5, (jg.c) obj3, (ItemType) obj4, (Function0) obj6, (m3.n) obj, m3.i.F(i12 | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ t0(ProfileFeature profileFeature, Function1 function1, Function1 function12, Function0 function0, int i11) {
        this.f569a = 24;
        this.f571c = profileFeature;
        this.f573e = function1;
        this.f572d = function12;
        this.f574f = function0;
        this.f570b = i11;
    }

    public /* synthetic */ t0(i80.n nVar, b4.t tVar, Function1 function1, Function1 function12, int i11) {
        this.f569a = 2;
        this.f572d = nVar;
        this.f571c = tVar;
        this.f573e = function1;
        this.f574f = function12;
        this.f570b = i11;
    }

    public /* synthetic */ t0(Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12) {
        this.f569a = i12;
        this.f571c = obj;
        this.f572d = obj2;
        this.f573e = obj3;
        this.f574f = obj4;
        this.f570b = i11;
    }

    public /* synthetic */ t0(Object obj, Object obj2, b4.t tVar, Object obj3, int i11, int i12) {
        this.f569a = i12;
        this.f572d = obj;
        this.f573e = obj2;
        this.f571c = tVar;
        this.f574f = obj3;
        this.f570b = i11;
    }

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Function1 function1, int i11, int i12) {
        this.f569a = i12;
        this.f571c = obj;
        this.f572d = obj2;
        this.f574f = obj3;
        this.f573e = function1;
        this.f570b = i11;
    }

    public /* synthetic */ t0(u3.d dVar, Object obj, Object obj2, Object obj3, int i11) {
        this.f569a = 21;
        this.f574f = dVar;
        this.f571c = obj;
        this.f572d = obj2;
        this.f573e = obj3;
        this.f570b = i11;
    }
}
