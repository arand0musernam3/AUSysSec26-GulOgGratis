package rg;

import android.content.Context;
import com.app.tgtg.favWidget.WidgetUpdateWorker;
import ib.e0;
import ib.y;
import ib.z;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt.c f38000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb.s f38001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f38002d;

    public d(Context context, kt.c cVar, jb.s sVar, w wVar) {
        cVar.getClass();
        wVar.getClass();
        this.f37999a = context;
        this.f38000b = cVar;
        this.f38001c = sVar;
        this.f38002d = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof rg.c
            if (r0 == 0) goto L13
            r0 = r6
            rg.c r0 = (rg.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            rg.c r0 = new rg.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f37997j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L40
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            return r3
        L32:
            ba0.g.M(r6)
            r0.l = r4
            kt.c r6 = r5.f38000b
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            u70.o r0 = u70.q.f40850b
            boolean r0 = r6 instanceof u70.p
            if (r0 != 0) goto L6a
            r0 = r6
            com.app.tgtg.model.remote.widgets.response.FavouriteWidgetResponse r0 = (com.app.tgtg.model.remote.widgets.response.FavouriteWidgetResponse) r0
            android.content.SharedPreferences r1 = ft.c.x()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = ft.c.y()
            if (r2 != 0) goto L58
            r2 = r3
        L58:
            java.lang.String r4 = "_favouriteWidgetData"
            java.lang.String r2 = r8.k.l(r2, r4)
            if (r0 == 0) goto L64
            java.lang.String r3 = r0.toJson()
        L64:
            r1.putString(r2, r3)
            r1.apply()
        L6a:
            java.lang.Throwable r0 = u70.q.a(r6)
            if (r0 != 0) goto L9e
            com.app.tgtg.model.remote.widgets.response.FavouriteWidgetResponse r6 = (com.app.tgtg.model.remote.widgets.response.FavouriteWidgetResponse) r6
            r6.getClass()
            java.util.List r0 = r6.getItems()
            boolean r0 = com.google.android.gms.internal.measurement.cg.q(r0)
            if (r0 == 0) goto L8d
            rg.g r0 = new rg.g
            java.lang.String r1 = r6.getCurrentTime()
            java.util.List r6 = r6.getItems()
            r0.<init>(r1, r6)
            return r0
        L8d:
            int r6 = r6.getNoOfFavourites()
            if (r6 != 0) goto L96
            rg.k r6 = rg.k.INSTANCE
            return r6
        L96:
            rg.q r6 = new rg.q
            java.lang.String r0 = ""
            r6.<init>(r0)
            return r6
        L9e:
            mv.m0 r6 = sa0.a.f38953a
            r6.b(r0)
            rg.h r6 = rg.h.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.d.a(z70.c):java.lang.Object");
    }

    public final void b(String str) {
        str.getClass();
        TimeUnit.HOURS.getClass();
        z zVar = new z(WidgetUpdateWorker.class, 1);
        qb.o oVar = (qb.o) zVar.f23742b;
        oVar.getClass();
        int i11 = qb.o.f36827z;
        oVar.f36835h = 3600000L;
        oVar.f36836i = n80.p.d(3600000L, 300000L, 3600000L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", str);
        ib.h hVar = new ib.h(linkedHashMap);
        ex.i.L(hVar);
        ((qb.o) zVar.f23742b).f36832e = hVar;
        ib.l lVar = ib.l.KEEP;
        e0 e0Var = (e0) zVar.a();
        ib.l lVar2 = ib.l.UPDATE;
        jb.s sVar = this.f38001c;
        if (lVar != lVar2) {
            new jb.o(sVar, str, ib.m.KEEP, Collections.singletonList(e0Var), 0).a();
            return;
        }
        y yVar = sVar.f24925b.f23703m;
        String strConcat = "enqueueUniquePeriodic_".concat(str);
        rb.k kVar = sVar.f24927d.f38956a;
        kVar.getClass();
        jf.e.I(yVar, strConcat, kVar, new a0.g(sVar, str, e0Var, 25));
    }

    public final void c() {
        w wVar = this.f38002d;
        try {
            b("smallWidget");
            wVar.a("smallWidget");
            b("largeWidget");
            wVar.a("largeWidget");
        } catch (Exception unused) {
        }
    }
}
