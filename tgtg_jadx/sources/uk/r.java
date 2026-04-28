package uk;

import android.content.SharedPreferences;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.z1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import mv.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luk/r;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.b f41371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f41372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.j f41373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv.b f41374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f41375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z1 f41376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f41377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f41378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o0 f41379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f41380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f41381k;
    public final o0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f41382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f41383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41384o;

    public r(se.b bVar, g3 g3Var, ft.j jVar, cv.b bVar2, c1 c1Var, z1 z1Var, u uVar) {
        g3Var.getClass();
        jVar.getClass();
        bVar2.getClass();
        c1Var.getClass();
        z1Var.getClass();
        uVar.getClass();
        this.f41371a = bVar;
        this.f41372b = g3Var;
        this.f41373c = jVar;
        this.f41374d = bVar2;
        this.f41375e = c1Var;
        this.f41376f = z1Var;
        this.f41377g = uVar;
        o0 o0Var = new o0();
        this.f41378h = o0Var;
        this.f41379i = o0Var;
        o0 o0Var2 = new o0();
        this.f41380j = o0Var2;
        this.f41381k = o0Var2;
        o0 o0Var3 = new o0();
        this.l = o0Var3;
        this.f41382m = o0Var3;
    }

    public static double a() {
        double dJ = ft.c.j();
        return dJ == 0.0d ? mv.d.A() ? xk.d.DEFAULT.a() * 1.609d : xk.c.DEFAULT.a() : dJ;
    }

    public final void b(boolean z11, boolean z12) {
        dv.b bVar = new dv.b();
        if (z11) {
            bVar.b(dv.a.TYPE, "GPS");
        } else {
            bVar.b(dv.a.TYPE, z12 ? "Search" : "Map");
        }
        SharedPreferences.Editor editorEdit = ft.c.x().edit();
        String strY = ft.c.y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putBoolean(strY + "isFromGPS", z11);
        editorEdit.apply();
        bVar.b(dv.a.DISTANCE_KM, Integer.valueOf(j80.c.a(a())));
        cv.i iVar = cv.i.ACTION_LOCATION_PICKED;
        cv.b bVar2 = this.f41374d;
        bVar2.c(iVar, bVar);
        bVar2.b(cv.i.BRAZE_ACTION_LOCATION_SET);
        Map mapB = w0.b(new Pair(dv.a.CURRENT_DISTANCE_KM_CHOSEN, Integer.valueOf(j80.c.a(a()))));
        mapB.getClass();
        bVar2.f13428a.c(mapB);
    }
}
