package ym;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.m0;
import ao.r1;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.f0;
import v80.p0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lym/w;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeliveryFragmentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliveryFragmentViewModel.kt\ncom/app/tgtg/feature/main/fragments/delivery/parcelfeed/DeliveryFragmentViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,375:1\n230#2,5:376\n*S KotlinDebug\n*F\n+ 1 DeliveryFragmentViewModel.kt\ncom/app/tgtg/feature/main/fragments/delivery/parcelfeed/DeliveryFragmentViewModel\n*L\n242#1:376,5\n*E\n"})
public final class w extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f46253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f46254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f46255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m0 f46256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kt.j f46257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.j f46258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qb.e f46259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c1 f46260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0 f46261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f46262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f46263k;
    public final o0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f46264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f46265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f46266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f46267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f46268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SortingChoice f46271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f46272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public BasketManager f46273v;

    public w(r1 r1Var, g3 g3Var, cv.b bVar, m0 m0Var, kt.j jVar, ft.j jVar2, qb.e eVar, c1 c1Var) {
        r1Var.getClass();
        g3Var.getClass();
        bVar.getClass();
        m0Var.getClass();
        jVar.getClass();
        jVar2.getClass();
        c1Var.getClass();
        this.f46253a = r1Var;
        this.f46254b = g3Var;
        this.f46255c = bVar;
        this.f46256d = m0Var;
        this.f46257e = jVar;
        this.f46258f = jVar2;
        this.f46259g = eVar;
        this.f46260h = c1Var;
        this.f46261i = new o0();
        this.f46262j = new o0();
        this.f46263k = new o0();
        this.l = new o0();
        this.f46264m = new o0();
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        a2 a2VarC = y80.r.c(o0Var);
        this.f46265n = a2VarC;
        this.f46266o = a2VarC;
        this.f46267p = "";
        String strValueOf = String.valueOf(g3Var.h());
        this.f46272u = strValueOf;
        this.f46273v = new BasketManager(null, null, 0L, 0L, 0, null, null, 127, null).restoreBasketManager(strValueOf, b());
    }

    public final void a(String str) {
        str.getClass();
        this.f46262j.i(Boolean.TRUE);
        a9.a aVarD = m1.d(this);
        this.f46259g.getClass();
        c90.f fVar = p0.f42144a;
        f0.B(aVarD, c90.e.f7834b, null, new v(this, str, null), 2);
    }

    public final int b() {
        return this.f46254b.n().getManufacturerBasketItemsLimit();
    }

    public final String c() {
        return String.valueOf(this.f46254b.h());
    }

    public final void d() {
        this.f46253a.f4432q = 0L;
    }

    public final void e(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f46255c.c(iVar, bVar);
    }
}
