package al;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import ao.h2;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.login.onboarding.OnboardingActivity;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.model.remote.Country;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.UserSettings;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.r0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lal/p;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginViewModel.kt\ncom/app/tgtg/feature/login/LoginViewModel\n+ 2 FacebookLoginHelper.kt\ncom/app/tgtg/services/user/FacebookLoginHelper\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,750:1\n88#2:751\n110#2:752\n29#3:753\n*S KotlinDebug\n*F\n+ 1 LoginViewModel.kt\ncom/app/tgtg/feature/login/LoginViewModel\n*L\n128#1:751\n128#1:752\n403#1:753\n*E\n"})
public final class p extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.j f1563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.v f1564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f1565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ao.c f1566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ao.h f1567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb.s f1568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cv.b f1569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.s f1570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jv.e f1571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c1 f1572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mv.u f1573k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hv.b f1574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final el.d f1575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final at.c0 f1576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f1577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o0 f1578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u70.t f1579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f1580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public cl.f f1581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Country f1582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f1583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f1584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f1585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dn.k f1586y;

    public p(ft.j jVar, ao.v vVar, g3 g3Var, ao.c cVar, ao.h hVar, jb.s sVar, cv.b bVar, ft.s sVar2, jv.e eVar, c1 c1Var, mv.u uVar, String str, hv.b bVar2, el.d dVar, at.c0 c0Var) {
        jVar.getClass();
        vVar.getClass();
        g3Var.getClass();
        cVar.getClass();
        hVar.getClass();
        bVar.getClass();
        sVar2.getClass();
        eVar.getClass();
        c1Var.getClass();
        uVar.getClass();
        str.getClass();
        bVar2.getClass();
        dVar.getClass();
        c0Var.getClass();
        this.f1563a = jVar;
        this.f1564b = vVar;
        this.f1565c = g3Var;
        this.f1566d = cVar;
        this.f1567e = hVar;
        this.f1568f = sVar;
        this.f1569g = bVar;
        this.f1570h = sVar2;
        this.f1571i = eVar;
        this.f1572j = c1Var;
        this.f1573k = uVar;
        this.l = str;
        this.f1574m = bVar2;
        this.f1575n = dVar;
        this.f1576o = c0Var;
        this.f1577p = new o0();
        this.f1578q = new o0();
        this.f1579r = u70.l.b(new a3.c0(14));
        this.f1580s = new o0();
        this.f1585x = new i(this, 0);
    }

    public static final void a(p pVar, Integer num) {
        pVar.f1577p.i(new qt.a(new cl.g(num, 2)));
    }

    public static final void b(p pVar, int i11) {
        pVar.f1577p.i(new qt.a(new cl.g(Integer.valueOf(i11), 9)));
    }

    public static void g(p pVar, cv.i iVar) {
        pVar.getClass();
        iVar.getClass();
        pVar.f1569g.c(iVar, null);
    }

    public final cl.f c() {
        cl.f fVar = this.f1581t;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accessType");
        return null;
    }

    public final void d(cl.f fVar, String str) {
        String email;
        fVar.getClass();
        this.f1581t = fVar;
        f(str, false);
        x70.c cVar = null;
        if (Intrinsics.areEqual(fVar, cl.d.f8444b)) {
            ft.c.L(null);
            ft.c.a0(false);
            ft.c.O(false);
        }
        if (((hv.j) this.f1574m).b()) {
            f0.B(m1.d(this), null, null, new m(this, cVar, 1), 3);
        }
        g3 g3Var = this.f1565c;
        f0.B(g3Var.f4258b, null, null, new h2(g3Var, cVar, 1), 3);
        boolean zIsBusiness = g3Var.n().isBusiness();
        el.d dVar = this.f1575n;
        if (zIsBusiness) {
            dVar.d(mv.z.MY_STORE);
            return;
        }
        if (!g3Var.m().getNewsletterOptIn() && (email = g3Var.m().getEmail()) != null && email.length() != 0 && this.f1566d.b(g3Var.h())) {
            dVar.f16080a.a(new f70.b(OptInActivity.class, jb.u.x(new Pair("OPT_IN_TYPE", "newsletter"), new Pair("OPT_IN_CONTEXT", ll.e.LOGIN)), false, true, false, null, null, null, null, false, 1012));
            return;
        }
        if (g3Var.n().isCharityUser()) {
            dVar.f16080a.a(new f70.b(MainCharityActivity.class, null, false, true, false, null, null, null, null, false, 1014));
            return;
        }
        if (!g3Var.m().getPushNotificationOptIn()) {
            dVar.f16080a.a(new f70.b(OptInActivity.class, jb.u.x(new Pair("OPT_IN_TYPE", "push"), new Pair("OPT_IN_CONTEXT", ll.e.LOGIN)), false, true, false, null, null, null, null, false, 1012));
        } else if (this.f1563a.h() || this.f1573k.d()) {
            dVar.d(mv.z.DISCOVER);
        } else {
            dVar.f16080a.a(new f70.b(LocationPickerActivity.class, jb.u.x(new Pair("ORIGIN", f70.i.ONBOARDING)), false, true, false, null, null, null, null, false, 1012));
        }
    }

    public final void e(cl.f fVar, String str) {
        fVar.getClass();
        this.f1581t = fVar;
        g3 g3Var = this.f1565c;
        x70.c cVar = null;
        f0.B(g3Var.f4258b, null, null, new h2(g3Var, cVar, 1), 3);
        if (((hv.j) this.f1574m).b()) {
            f0.B(m1.d(this), null, null, new m(this, cVar, 1), 3);
        }
        f(str, true);
        if (Intrinsics.areEqual(fVar, cl.d.f8444b)) {
            ft.c.L(null);
            ft.c.a0(false);
            ft.c.O(false);
        }
        this.f1575n.f16080a.a(new f70.b(OnboardingActivity.class, null, false, true, false, null, null, null, null, false, 1014));
    }

    public final void f(String str, boolean z11) throws Exception {
        g3 g3Var = this.f1565c;
        String str2 = r0.v(g3Var.n().getMyStoreUrl()) ? "Consumer" : "Store";
        UserData userDataM = g3Var.m();
        UserSettings userSettingsN = g3Var.n();
        cv.b bVar = this.f1569g;
        bVar.a(userDataM, userSettingsN);
        if (z11) {
            cv.i iVar = cv.i.CORE_SIGNUP_COMPLETED;
            dv.b bVarE = h0.g.E(new Pair(dv.a.METHOD, new dv.c(c().f8447a)));
            iVar.getClass();
            bVar.c(iVar, bVarE);
            bVar.f13433f.f16494d = true;
        }
        cv.i iVar2 = cv.i.CORE_LOGGED_IN;
        dv.b bVarE2 = h0.g.E(new Pair(dv.a.METHOD, new dv.c(c().f8447a)), new Pair(dv.a.USER_TYPE, new dv.c(str2)), new Pair(dv.a.VERIFICATION_METHOD, new dv.c(str)));
        iVar2.getClass();
        bVar.c(iVar2, bVarE2);
    }
}
