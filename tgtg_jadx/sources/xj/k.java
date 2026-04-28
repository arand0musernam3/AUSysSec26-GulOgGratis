package xj;

import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import ao.r1;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.u;
import v80.f0;
import y80.a2;
import y80.h1;
import y80.r;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxj/k;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFavoritesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoritesViewModel.kt\ncom/app/tgtg/feature/favorites/ui/FavoritesViewModel\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,421:1\n78#2:422\n111#2,2:423\n78#2:425\n111#2,2:426\n78#2:428\n111#2,2:429\n78#2:431\n111#2,2:432\n1807#3,3:434\n1586#3:437\n1661#3,3:438\n*S KotlinDebug\n*F\n+ 1 FavoritesViewModel.kt\ncom/app/tgtg/feature/favorites/ui/FavoritesViewModel\n*L\n102#1:422\n102#1:423,2\n103#1:425\n103#1:426,2\n106#1:428\n106#1:429,2\n108#1:431\n108#1:432,2\n375#1:434,3\n378#1:437\n378#1:438,3\n*E\n"})
public final class k extends l1 {
    public final h1 A;
    public final a2 B;
    public final h1 C;
    public final a2 D;
    public final h1 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public final m3.h1 K;
    public final m3.h1 L;
    public final m3.h1 M;
    public final m3.h1 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f44406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj.d f44407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rg.d f44408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gs.a f44409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.j f44410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f44411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uj.a f44412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m1.a f44413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f44414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f44415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f44416k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f44417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f44418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f44419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f44420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f44421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f44422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f44423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f44424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2 f44425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h1 f44426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f44427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f44428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a2 f44429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a2 f44430z;

    public k(r1 r1Var, wj.d dVar, rg.d dVar2, gs.a aVar, ft.j jVar, u uVar, uj.a aVar2, m1.a aVar3) {
        r1Var.getClass();
        dVar.getClass();
        dVar2.getClass();
        aVar.getClass();
        jVar.getClass();
        uVar.getClass();
        aVar2.getClass();
        this.f44406a = r1Var;
        this.f44407b = dVar;
        this.f44408c = dVar2;
        this.f44409d = aVar;
        this.f44410e = jVar;
        this.f44411f = uVar;
        this.f44412g = aVar2;
        this.f44413h = aVar3;
        a2 a2VarC = r.c(0);
        this.f44414i = a2VarC;
        this.f44415j = a2VarC;
        a2 a2VarC2 = r.c(0);
        this.f44416k = a2VarC2;
        this.l = a2VarC2;
        a2 a2VarC3 = r.c(null);
        this.f44417m = a2VarC3;
        this.f44418n = new h1(a2VarC3);
        a2 a2VarC4 = r.c(n0.f26529a);
        this.f44419o = a2VarC4;
        this.f44420p = new h1(a2VarC4);
        Boolean bool = Boolean.FALSE;
        a2 a2VarC5 = r.c(bool);
        this.f44421q = a2VarC5;
        this.f44422r = new h1(a2VarC5);
        a2 a2VarC6 = r.c(bool);
        this.f44423s = a2VarC6;
        this.f44424t = new h1(a2VarC6);
        a2 a2VarC7 = r.c(bool);
        this.f44425u = a2VarC7;
        this.f44426v = new h1(a2VarC7);
        a2 a2VarC8 = r.c(null);
        this.f44427w = a2VarC8;
        this.f44428x = new h1(a2VarC8);
        this.f44429y = r.c(ft.c.i());
        a2 a2VarC9 = r.c(null);
        this.f44430z = a2VarC9;
        this.A = new h1(a2VarC9);
        a2 a2VarC10 = r.c(bool);
        this.B = a2VarC10;
        this.C = new h1(a2VarC10);
        a2 a2VarC11 = r.c(null);
        this.D = a2VarC11;
        this.E = new h1(a2VarC11);
        this.K = new m3.h1(0);
        this.L = new m3.h1(1);
        this.M = new m3.h1(0);
        this.N = new m3.h1(0);
    }

    public final void a(String str, boolean z11) {
        str.getClass();
        if (this.f44407b.d()) {
            this.f44413h.z(str, z11, false, dv.d.ITEM_CARD);
        }
        mv.d.u(m1.d(this), new f(this, str, null, 0));
    }

    public final void b(boolean z11, boolean z12) {
        if (z11) {
            f0.B(m1.d(this), null, null, new g(z12, this, null), 3);
        } else {
            this.f44427w.j(GenericErrors.Offline.INSTANCE);
        }
    }

    public final void c() {
        f0.B(m1.d(this), null, null, new i(this, null, 0), 3);
    }

    public final void d(dv.d dVar) {
        dVar.getClass();
        m1.a aVar = this.f44413h;
        aVar.getClass();
        ((cv.b) aVar.f28697a).c(cv.i.ACTION_OPEN_FAVORITE_REMINDER_PAGE, h0.g.E(new Pair(dv.a.CLICK_FROM, new dv.c(dVar.a()))));
    }

    public final void e(dv.d dVar, BasicItem basicItem, dv.d dVar2, int i11, int i12) {
        dVar.getClass();
        basicItem.getClass();
        dv.d dVar3 = dv.d.FAVORITES_SCREEN;
        dv.d dVar4 = dv.d.CLICK;
        Locale locale = Locale.ROOT;
        String lowerCase = AnalyticsProcessor.CHANNEL_NAME.toLowerCase(locale);
        lowerCase.getClass();
        dv.d dVar5 = dv.d.FAVORITES_CAROUSEL;
        String strMo340getItemIdFvU5WIY = basicItem.getInformation().mo340getItemIdFvU5WIY();
        String lowerCase2 = basicItem.getItemType().name().toLowerCase(locale);
        lowerCase2.getClass();
        String lowerCase3 = basicItem.getInformation().getItemCategory().getTrackingName().toLowerCase(locale);
        lowerCase3.getClass();
        AverageItemRating averageItemRating = basicItem.getInformation().getAverageItemRating();
        double averageOverallRating = averageItemRating != null ? averageItemRating.getAverageOverallRating() : 0.0d;
        String storeNameAndBranch = mv.d.m(basicItem).getStoreNameAndBranch();
        if (storeNameAndBranch == null) {
            storeNameAndBranch = "";
        }
        m1.a aVar = this.f44413h;
        aVar.getClass();
        dVar3.getClass();
        dVar4.getClass();
        dVar5.getClass();
        strMo340getItemIdFvU5WIY.getClass();
        ((cv.b) aVar.f28697a).c(cv.i.UI_INTERACTION, h0.g.E(new Pair(dv.a.GENERIC_SCREEN_NAME, new dv.c(dVar3.a())), new Pair(dv.a.GENERIC_ELEMENT_NAME, new dv.c(dVar.a())), new Pair(dv.a.GENERIC_ACTION_TYPE, new dv.c(dVar4.a())), new Pair(dv.a.GENERIC_PLATFORM, new dv.c(lowerCase)), new Pair(dv.a.GENERIC_MODULE_NAME, new dv.c(dVar5.a())), new Pair(dv.a.GENERIC_ITEM_ID, new dv.c(strMo340getItemIdFvU5WIY)), new Pair(dv.a.GENERIC_ITEM_TYPE, new dv.c(lowerCase2)), new Pair(dv.a.GENERIC_ITEM_CATEGORY, new dv.c(lowerCase3)), new Pair(dv.a.GENERIC_STORE_RATING, new dv.c(Double.valueOf(averageOverallRating))), new Pair(dv.a.GENERIC_STORE_NAME, new dv.c(storeNameAndBranch)), new Pair(dv.a.GENERIC_INTERACTION_STATUS, new dv.c(dVar2 != null ? dVar2.a() : null)), new Pair(dv.a.GENERIC_INDEX, new dv.c(Integer.valueOf(i11))), new Pair(dv.a.GENERIC_TOTAL_RESULTS_COUNT, new dv.c(Integer.valueOf(i12)))));
    }

    public final void f(String str, vj.e eVar) {
        str.getClass();
        x70.c cVar = null;
        if (eVar != null) {
            boolean z11 = eVar == vj.e.SCHEDULED;
            dv.d dVar = dv.d.ITEM_CARD;
            m1.a aVar = this.f44413h;
            aVar.getClass();
            dVar.getClass();
            dv.b bVarG = m1.a.g(str, null, dVar);
            dv.a aVar2 = dv.a.REMINDER_TYPE;
            dv.d dVar2 = z11 ? dv.d.RECURRING_REMINDER : dv.d.ONE_TIME_REMINDER;
            bVarG.a(aVar2, dVar2 != null ? dVar2.a() : null);
            ((cv.b) aVar.f28697a).c(cv.i.ACTION_TURN_OFF_FAVORITE_REMINDER, bVarG);
        }
        mv.d.u(m1.d(this), new f(this, str, cVar, 1));
    }
}
