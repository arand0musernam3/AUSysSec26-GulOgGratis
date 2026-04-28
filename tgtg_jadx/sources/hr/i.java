package hr;

import android.os.Bundle;
import androidx.lifecycle.l1;
import ao.g3;
import ao.r1;
import ao.v;
import at.c0;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import kotlin.Pair;
import mv.u;
import v80.b0;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lhr/i;", "Landroidx/lifecycle/l1;", "hr/f", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f22429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f22430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f22431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg.d f22432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r1 f22433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ln.i f22434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f22435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hv.b f22436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yr.a f22437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0 f22438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f22439k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1 f22440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f22441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1 f22442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f22443p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f22444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f22445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f22446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f22447t;

    public i(g3 g3Var, cv.b bVar, v vVar, rg.d dVar, r1 r1Var, ln.i iVar, mv.b bVar2, b0 b0Var, hv.b bVar3, yr.a aVar, c0 c0Var, u uVar) {
        g3Var.getClass();
        bVar.getClass();
        vVar.getClass();
        dVar.getClass();
        r1Var.getClass();
        iVar.getClass();
        bVar2.getClass();
        b0Var.getClass();
        bVar3.getClass();
        aVar.getClass();
        c0Var.getClass();
        uVar.getClass();
        this.f22429a = g3Var;
        this.f22430b = bVar;
        this.f22431c = vVar;
        this.f22432d = dVar;
        this.f22433e = r1Var;
        this.f22434f = iVar;
        this.f22435g = b0Var;
        this.f22436h = bVar3;
        this.f22437i = aVar;
        this.f22438j = c0Var;
        this.f22439k = uVar;
        bVar.b(cv.i.SCREEN_ACCOUNT);
        Boolean bool = Boolean.FALSE;
        a2 a2VarC = r.c(bool);
        this.l = a2VarC;
        this.f22440m = new h1(a2VarC);
        a2 a2VarC2 = r.c(bool);
        this.f22441n = a2VarC2;
        this.f22442o = new h1(a2VarC2);
        a2 a2VarC3 = r.c(bool);
        this.f22443p = a2VarC3;
        this.f22444q = new h1(a2VarC3);
        a2 a2VarC4 = r.c(Boolean.valueOf(ft.c.n()));
        this.f22445r = a2VarC4;
        this.f22446s = new h1(a2VarC4);
        this.f22447t = ((hv.j) bVar3).f22541n;
    }

    public static void b(i iVar, int i11) {
        boolean z11 = (i11 & 1) == 0;
        boolean z12 = (i11 & 2) == 0;
        f70.g gVar = iVar.f22437i.f46334a;
        Bundle bundleX = jb.u.x(new Pair("ORIGIN", f70.i.MANAGE_ACCOUNT));
        if (z11) {
            bundleX.putBoolean("GO_TO_STORE_SIGNUP_WEB", true);
        }
        if (z12) {
            bundleX.putBoolean("GO_TO_RECOMMEND_STORE", true);
        }
        gVar.a(new f70.b(StoreLoginActivity.class, bundleX, false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_STORE_SIGNUP), null, null, null, false, 988));
    }

    public final void a(ek.b bVar) {
        bVar.getClass();
        yr.a aVar = this.f22437i;
        aVar.getClass();
        aVar.f46334a.a(new f70.b(HelpCenterActivity.class, jb.u.x(new Pair("OPENED_FROM", "Manage_Account"), new Pair("DESTINATION", bVar)), false, false, false, null, null, null, null, false, 1020));
    }
}
