package ll;

import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o0;
import ao.g3;
import at.c0;
import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.login.optin.OptInActivity;
import com.app.tgtg.feature.main.MainActivity;
import f70.i;
import ft.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mv.z;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lll/g;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f27892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f27893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final el.d f27894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f27895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final av.c f27896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final av.e f27897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f27899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f27901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f27902k;
    public final o0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f27903m;

    public g(j jVar, g3 g3Var, cv.b bVar, NotificationManagerCompat notificationManagerCompat, el.d dVar, c0 c0Var, d8.f fVar) {
        jVar.getClass();
        g3Var.getClass();
        bVar.getClass();
        dVar.getClass();
        c0Var.getClass();
        fVar.getClass();
        this.f27892a = g3Var;
        this.f27893b = bVar;
        this.f27894c = dVar;
        this.f27895d = c0Var;
        this.f27896e = new av.c();
        this.f27897f = new av.e();
        this.f27901j = jVar.h();
        this.f27902k = notificationManagerCompat.areNotificationsEnabled();
        o0 o0Var = new o0();
        this.l = o0Var;
        this.f27903m = o0Var;
    }

    public final String a() {
        e eVar = this.f27899h;
        int i11 = eVar == null ? -1 : f.$EnumSwitchMapping$0[eVar.ordinal()];
        dv.d dVar = (i11 == 1 || i11 != 2) ? dv.d.ONBOARDING : dv.d.ONBOARDING_REMINDER;
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    public final void b() {
        f0.B(m1.d(this), null, null, new gf.g(this, null, 25), 3);
    }

    public final void c(Bundle bundle) {
        g3 g3Var = this.f27892a;
        boolean zIsCharityUser = g3Var.n().isCharityUser();
        av.c cVar = this.f27896e;
        if (zIsCharityUser) {
            cVar.k(new av.a(MainCharityActivity.class, null, 62));
            return;
        }
        if (Intrinsics.areEqual(this.f27898g, "newsletter") && !g3Var.m().getPushNotificationOptIn()) {
            bundle.putString("OPT_IN_TYPE", "push");
            bundle.putSerializable("OPT_IN_CONTEXT", this.f27899h);
            cVar.k(new av.a(OptInActivity.class, bundle, 56));
        } else if (this.f27899h == e.SIGNUP || !this.f27901j) {
            bundle.putSerializable("ORIGIN", i.ONBOARDING);
            cVar.k(new av.a(LocationPickerActivity.class, bundle, 60));
        } else {
            bundle.putSerializable("DESTINATION", z.DISCOVER);
            cVar.k(new av.a(MainActivity.class, bundle, 56));
        }
    }

    public final void d() {
        boolean zAreEqual = Intrinsics.areEqual(this.f27898g, "newsletter");
        g3 g3Var = this.f27892a;
        if (zAreEqual) {
            g3Var.m().setWantsNewsletter(false);
            ft.c.W(System.currentTimeMillis());
            e(Boolean.FALSE, null);
        } else if (this.f27899h != e.REOPTIN) {
            g3Var.m().setWantsPushNotifications(false);
            ft.c.b0(System.currentTimeMillis());
            e(null, Boolean.FALSE);
        } else {
            g3Var.m().setWantsPushNotifications(false);
            ft.c.b0(System.currentTimeMillis());
            Boolean bool = Boolean.FALSE;
            e(null, bool);
            this.f27897f.k(bool);
        }
        b();
    }

    public final void e(Boolean bool, Boolean bool2) {
        dv.b bVarE = h0.g.E(new Pair(dv.a.SCREEN, new dv.c(a())));
        cv.b bVar = this.f27893b;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            bVarE.b(dv.a.EMAIL_OPTIN_STATUS, bool);
            bVar.f(zBooleanValue);
        }
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            bVarE.b(dv.a.PUSH_OPTIN_STATUS, bool2);
            bVar.f13429b.f(zBooleanValue2);
        }
        cv.i iVar = cv.i.CORE_NOTIFICATIONS_SAVED;
        iVar.getClass();
        bVar.c(iVar, bVarE);
    }
}
