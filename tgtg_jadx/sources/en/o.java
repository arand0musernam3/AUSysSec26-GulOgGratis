package en;

import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.r1;
import at.c0;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.ManufacturerItemInformation;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import ui.m3;
import v80.f0;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Len/o;", "Lmk/a;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManufacturerItemDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManufacturerItemDetailsViewModel.kt\ncom/app/tgtg/feature/main/fragments/delivery/parcelitemdetails/ManufacturerItemDetailsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,420:1\n1586#2:421\n1661#2,3:422\n1586#2:425\n1661#2,3:426\n1915#2:434\n1916#2:440\n230#3,5:429\n230#3,5:435\n*S KotlinDebug\n*F\n+ 1 ManufacturerItemDetailsViewModel.kt\ncom/app/tgtg/feature/main/fragments/delivery/parcelitemdetails/ManufacturerItemDetailsViewModel\n*L\n141#1:421\n141#1:422,3\n202#1:425\n202#1:426,3\n322#1:434\n322#1:440\n313#1:429,5\n323#1:435,5\n*E\n"})
public final class o extends mk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f16168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g3 f16169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3 f16170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xm.a f16171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f16172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BasketManager f16175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f16176k;
    public final o0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f16177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f16178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f16179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f16180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f16181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o0 f16182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f16183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o0 f16184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final o0 f16185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a2 f16186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f16187w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(mk.b bVar, r1 r1Var, g3 g3Var, m3 m3Var, xm.a aVar, c0 c0Var) {
        super(bVar);
        r1Var.getClass();
        g3Var.getClass();
        aVar.getClass();
        c0Var.getClass();
        this.f16168c = r1Var;
        this.f16169d = g3Var;
        this.f16170e = m3Var;
        this.f16171f = aVar;
        this.f16172g = c0Var;
        String strValueOf = String.valueOf(g3Var.h());
        this.f16173h = strValueOf;
        this.f16175j = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(strValueOf, g());
        o0 o0Var = new o0();
        this.l = o0Var;
        this.f16177m = o0Var;
        o0 o0Var2 = new o0();
        this.f16178n = o0Var2;
        this.f16179o = o0Var2;
        o0 o0Var3 = new o0(null);
        this.f16180p = o0Var3;
        this.f16181q = o0Var3;
        o0 o0Var4 = new o0();
        this.f16182r = o0Var4;
        this.f16183s = o0Var4;
        o0 o0Var5 = new o0();
        this.f16184t = o0Var5;
        this.f16185u = o0Var5;
        kotlin.collections.o0 o0Var6 = kotlin.collections.o0.f26530a;
        o0Var6.getClass();
        a2 a2VarC = r.c(o0Var6);
        this.f16186v = a2VarC;
        this.f16187w = a2VarC;
    }

    public final void f(int i11, Integer num, int i12) {
        ManufacturerItemInformation information;
        ManufacturerItem manufacturerItem = (ManufacturerItem) this.f16177m.d();
        if (((manufacturerItem == null || (information = manufacturerItem.getInformation()) == null) ? null : information.mo340getItemIdFvU5WIY()) == null) {
            return;
        }
        if (num != null) {
            Math.min(num.intValue(), i12);
            i12 = num.intValue();
        }
        f0.B(m1.d(this), null, null, new m(this, i11, i12, null), 3);
    }

    public final int g() {
        return this.f16169d.n().getManufacturerBasketItemsLimit();
    }

    public final void h() {
        BasketManager basketManager = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null);
        g3 g3Var = this.f16169d;
        BasketManager basketManagerRestoreBasketManager = basketManager.restoreBasketManager(String.valueOf(g3Var.h()), g());
        if (basketManagerRestoreBasketManager != null) {
            d(cv.i.BASKET_STATE, h0.g.E(new Pair(dv.a.BASKET_ID, new dv.c(basketManagerRestoreBasketManager.m184getBasketIdM00Rnn0(g3Var.m().m285getUserId8nKqa5U()))), new Pair(dv.a.CREATED_AT, new dv.c(new Date(basketManagerRestoreBasketManager.getCreatedAt()))), new Pair(dv.a.IS_EMPTY, new dv.c(Boolean.valueOf(basketManagerRestoreBasketManager.getTotalBasketItems() == 0)))));
        }
    }

    public final void i() {
        BasketManager basketManager = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null);
        g3 g3Var = this.f16169d;
        BasketManager basketManagerRestoreBasketManager = basketManager.restoreBasketManager(String.valueOf(g3Var.h()), g());
        if (basketManagerRestoreBasketManager != null) {
            String strM184getBasketIdM00Rnn0 = basketManagerRestoreBasketManager.m184getBasketIdM00Rnn0(g3Var.m().m285getUserId8nKqa5U());
            cv.i iVar = cv.i.SCREEN_BASKET_INFO;
            dv.a aVar = dv.a.TYPE;
            dv.d dVar = dv.d.PER_BASKET_LIMIT_REACHED;
            Pair pair = new Pair(aVar, new dv.c(dVar != null ? dVar.a() : null));
            Pair pair2 = new Pair(dv.a.BASKET_ID, new dv.c(strM184getBasketIdM00Rnn0));
            dv.a aVar2 = dv.a.SCREEN;
            dv.d dVar2 = dv.d.PARCEL_DETAILS;
            d(iVar, h0.g.E(pair, pair2, new Pair(aVar2, new dv.c(dVar2 != null ? dVar2.a() : null))));
        }
    }
}
