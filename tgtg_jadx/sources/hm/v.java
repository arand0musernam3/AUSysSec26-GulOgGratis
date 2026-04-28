package hm;

import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.r1;
import ao.y0;
import ao.z1;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.model.local.CollectionDayModel;
import com.app.tgtg.model.local.DeeplinkC2CReferralData;
import com.app.tgtg.model.local.DietPreferenceModel;
import com.app.tgtg.model.local.SearchFilter;
import com.app.tgtg.model.remote.brief.BriefOrder;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.d2;
import v80.f0;
import v80.p0;
import y80.a1;
import y80.a2;
import y80.h1;
import y80.x1;
import y80.y1;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhm/v;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivityViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityViewModel.kt\ncom/app/tgtg/feature/main/MainActivityViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,646:1\n49#2:647\n51#2:651\n46#3:648\n51#3:650\n105#4:649\n777#5:652\n873#5,2:653\n1068#5:655\n777#5:656\n873#5,2:657\n1068#5:659\n777#5:660\n873#5,2:661\n*S KotlinDebug\n*F\n+ 1 MainActivityViewModel.kt\ncom/app/tgtg/feature/main/MainActivityViewModel\n*L\n147#1:647\n147#1:651\n147#1:648\n147#1:650\n147#1:649\n222#1:652\n222#1:653,2\n226#1:655\n228#1:656\n228#1:657,2\n231#1:659\n237#1:660\n237#1:661,2\n*E\n"})
public final class v extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ao.c f22148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f22149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f22150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.j f22151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final et.z f22152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final NotificationManagerCompat f22153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mv.u f22154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cv.b f22155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.b f22156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rg.d f22157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ln.i f22158k;
    public final r1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z1 f22159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d8.f f22160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c1 f22161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hv.b f22162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jm.b f22163q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f22164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.g f22165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f22166t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o0 f22167u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o0 f22168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BriefOrder f22169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22170x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22171y;

    public v(ao.c cVar, g3 g3Var, y0 y0Var, ft.j jVar, et.z zVar, NotificationManagerCompat notificationManagerCompat, mv.u uVar, cv.b bVar, ft.b bVar2, rg.d dVar, ln.i iVar, r1 r1Var, z1 z1Var, ij.b bVar3, d8.f fVar, c1 c1Var, hv.b bVar4, jm.b bVar5) {
        cVar.getClass();
        g3Var.getClass();
        y0Var.getClass();
        jVar.getClass();
        zVar.getClass();
        uVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        dVar.getClass();
        iVar.getClass();
        r1Var.getClass();
        z1Var.getClass();
        bVar3.getClass();
        fVar.getClass();
        c1Var.getClass();
        bVar4.getClass();
        bVar5.getClass();
        this.f22148a = cVar;
        this.f22149b = g3Var;
        this.f22150c = y0Var;
        this.f22151d = jVar;
        this.f22152e = zVar;
        this.f22153f = notificationManagerCompat;
        this.f22154g = uVar;
        this.f22155h = bVar;
        this.f22156i = bVar2;
        this.f22157j = dVar;
        this.f22158k = iVar;
        this.l = r1Var;
        this.f22159m = z1Var;
        this.f22160n = fVar;
        this.f22161o = c1Var;
        this.f22162p = bVar4;
        this.f22163q = bVar5;
        x70.c cVar2 = null;
        this.f22164r = y80.r.x(cVar.f4196d, m1.d(this), new x1(0L, LongCompanionObject.MAX_VALUE), null);
        h1 h1Var = zVar.f16475k;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        h1Var.getClass();
        gVar.getClass();
        androidx.lifecycle.n nVar = new androidx.lifecycle.n(h1Var, cVar2, rawStartTime);
        androidx.lifecycle.g gVar2 = new androidx.lifecycle.g();
        d2 d2Var = new d2(null);
        c90.f fVar2 = p0.f42144a;
        a90.d dVarB = f0.b(a90.p.f1044a.f43295e.plus(gVar).plus(d2Var));
        aa.e eVar = new aa.e(gVar2, 11);
        q2 q2Var = new q2();
        q2Var.f48333a = gVar2;
        q2Var.f48334b = nVar;
        q2Var.f48335c = dVarB;
        q2Var.f48336d = eVar;
        gVar2.f3445m = q2Var;
        boolean zI = q.a.H().f35696f.I();
        y1 y1Var = h1Var.f45488a;
        if (zI) {
            gVar2.k(y1Var.getValue());
        } else {
            gVar2.i(y1Var.getValue());
        }
        this.f22165s = gVar2;
        gt.w wVar = zVar.f16466b;
        int i11 = 5;
        this.f22166t = y80.r.x(new a1(new at.w(i11, w0.e.p(wVar.f20895a, false, new String[]{"orders"}, new gt.r(wVar, 2)), this), ((hv.j) bVar4).l, new p(this, cVar2, rawStartTime)), m1.d(this), new x1(5000L, LongCompanionObject.MAX_VALUE), a.f22107a);
        this.f22167u = new o0();
        new o0();
        this.f22168v = new o0();
        SearchFilter searchFilter = (SearchFilter) c1Var.a("FILTER");
        if (searchFilter != null) {
            if (uVar.c()) {
                bVar3.b();
                ArrayList<ItemCategory> foodTypes = searchFilter.getFoodTypes();
                ArrayList arrayList = new ArrayList();
                for (ItemCategory itemCategory : foodTypes) {
                    String strName = itemCategory == ItemCategory.SHOW_ALL ? null : itemCategory.name();
                    if (strName != null) {
                        arrayList.add(strName);
                    }
                }
                Set setV0 = CollectionsKt.v0(arrayList);
                setV0.getClass();
                a2 a2Var = bVar3.f24030c;
                a2Var.getClass();
                a2Var.k(null, setV0);
                ArrayList<DietPreferenceModel> dietPrefs = searchFilter.getDietPrefs();
                ArrayList arrayList2 = new ArrayList(e0.o(dietPrefs, 10));
                Iterator<T> it = dietPrefs.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((DietPreferenceModel) it.next()).name());
                }
                Set setV02 = CollectionsKt.v0(arrayList2);
                setV02.getClass();
                a2 a2Var2 = bVar3.f24032e;
                a2Var2.getClass();
                a2Var2.k(null, setV02);
                boolean z11 = !searchFilter.getShowOnlyAvailable();
                a2 a2Var3 = bVar3.f24041o;
                Boolean boolValueOf = Boolean.valueOf(z11);
                a2Var3.getClass();
                a2Var3.k(null, boolValueOf);
                bVar3.f24034g.j(searchFilter.getSortOption().name());
                boolean zIsEmpty = searchFilter.getCollectionDays().isEmpty();
                boolean zIsActive = searchFilter.getCollectionTimes().isActive();
                if (zIsActive || !zIsEmpty) {
                    rawStartTime = zIsActive ? (int) searchFilter.getCollectionTimes().getRawStartTime() : 0;
                    float rawEndTime = zIsActive ? searchFilter.getCollectionTimes().getRawEndTime() : 24.0f;
                    int i12 = rawEndTime >= 24.0f ? 23 : (int) rawEndTime;
                    ArrayList<CollectionDayModel> collectionDays = searchFilter.getCollectionDays();
                    CollectionDayModel collectionDayModel = CollectionDayModel.TODAY;
                    gj.a aVar = (collectionDays.contains(collectionDayModel) && searchFilter.getCollectionDays().contains(CollectionDayModel.TOMORROW)) ? gj.a.TODAY : searchFilter.getCollectionDays().contains(CollectionDayModel.TOMORROW) ? gj.a.TOMORROW : searchFilter.getCollectionDays().contains(collectionDayModel) ? gj.a.TODAY : null;
                    a2 a2Var4 = bVar3.f24038k;
                    Pair pair = new Pair(Integer.valueOf(rawStartTime), Integer.valueOf(i12));
                    a2Var4.getClass();
                    a2Var4.k(null, pair);
                    a2 a2Var5 = bVar3.f24039m;
                    if (aVar != null) {
                        a2Var5.j(aVar);
                    } else {
                        a2Var5.j(null);
                    }
                }
                this.f22156i.b(new SearchFilter(false, null, null, null, null, searchFilter.getSearchText(), null, searchFilter.isFromDeepLink(), 95, null));
            } else {
                bVar2.b(searchFilter);
            }
        }
        String str = (String) this.f22161o.a("EMAIL_VERIFICATION_TOKEN");
        if (str != null) {
            f0.B(m1.d(this), null, null, new gf.g(this, str, cVar2, 6), 3);
        }
        String code = ft.c.g().getCode();
        DeeplinkC2CReferralData deeplinkC2CReferralDataG = (code == null || code.length() == 0) ? (DeeplinkC2CReferralData) this.f22161o.a("C2C_REFERRAL_CODE") : ft.c.g();
        if (deeplinkC2CReferralDataG != null) {
            f0.B(m1.d(this), null, null, new gf.g(deeplinkC2CReferralDataG, this, cVar2, i11), 3);
        }
        ft.c.M(null);
        ft.b bVar6 = this.f22156i;
        bVar6.getClass();
        if (!ft.b.a().isFromDeepLink()) {
            bVar6.b(ft.c.a());
            bVar6.f17901a = ft.b.a();
        }
        if (this.f22151d.b() && ft.c.t() == jl.b.NONE) {
            ft.c.i0(jl.b.GPS);
        }
    }

    public final yn.g a(List list) throws Throwable {
        list.getClass();
        x70.c cVar = null;
        q qVar = new q(this, cVar, 5);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        if (!((Boolean) f0.E(gVar, qVar)).booleanValue()) {
            return new yn.e(((Order) list.get(0)).getOrderType(), ((Order) list.get(0)).isEdible(), this.f22149b.w());
        }
        if (!((Boolean) f0.E(gVar, new q(this, cVar, 3))).booleanValue()) {
            List list2 = this.f22152e.l;
            if ((list2 != null ? list2.size() : 0) > 2) {
                f0.E(kotlin.coroutines.g.f26549a, new q(this, cVar, 4));
            }
        }
        return (((Boolean) f0.E(gVar, new q(this, cVar, 3))).booleanValue() || list.isEmpty() || d0.h(OrderType.MANUFACTURER, OrderType.CATERING).contains(((Order) list.get(0)).getOrderType())) ? yn.d.f46279a : new yn.f(list.size());
    }

    public final void b() {
        this.f22163q.f25316a.a(new f70.b(OrderListActivity.class, null, false, false, false, 1000, null, null, null, false, 990));
    }

    public final boolean c() {
        return this.f22149b.n().isBusiness() && ft.c.C();
    }

    public final void d(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f22155h.c(iVar, bVar);
    }
}
