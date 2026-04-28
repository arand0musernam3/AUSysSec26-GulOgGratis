package hs;

import a3.f3;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import ao.g3;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import cv.i;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import v80.f0;
import y80.a2;
import y80.h1;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhs/h;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNotificationSettingsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSettingsViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/notificationsettings/ui/NotificationSettingsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1834#2,4:222\n*S KotlinDebug\n*F\n+ 1 NotificationSettingsViewModel.kt\ncom/app/tgtg/feature/tabprofile/manageaccount/notificationsettings/ui/NotificationSettingsViewModel\n*L\n188#1:222,4\n*E\n"})
public final class h extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3 f22472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gs.a f22473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cs.b f22474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1 f22475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cs.a f22476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f22477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f22478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f22479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h1 f22480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PushNotificationsSettings f22482k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f22483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f22484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f22485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f22486p;

    public h(g3 g3Var, gs.a aVar, cs.b bVar, c1 c1Var, cs.a aVar2) {
        g3Var.getClass();
        aVar.getClass();
        bVar.getClass();
        c1Var.getClass();
        aVar2.getClass();
        this.f22472a = g3Var;
        this.f22473b = aVar;
        this.f22474c = bVar;
        this.f22475d = c1Var;
        this.f22476e = aVar2;
        a2 a2VarC = r.c(null);
        this.f22477f = a2VarC;
        this.f22478g = a2VarC;
        a2 a2VarC2 = r.c(Boolean.FALSE);
        this.f22479h = a2VarC2;
        this.f22480i = new h1(a2VarC2);
        this.f22481j = g3Var.m().wantsNewsletter();
        this.f22482k = aVar.b();
        a2 a2VarC3 = r.c(null);
        this.f22483m = a2VarC3;
        this.f22484n = new h1(a2VarC3);
        a2 a2VarC4 = r.c(Boolean.valueOf(aVar.a()));
        this.f22485o = a2VarC4;
        this.f22486p = new h1(a2VarC4);
    }

    public static final boolean a(h hVar, String str, boolean z11) {
        String str2;
        Boolean boolC0;
        HashMap map = (HashMap) hVar.f22475d.a("DEEPLINK_PARAMETERS_MAP");
        return (map == null || (str2 = (String) map.get(str)) == null || (boolC0 = StringsKt.c0(str2)) == null) ? z11 : boolC0.booleanValue();
    }

    public final void b(boolean z11) {
        boolean z12;
        gs.a aVar = this.f22473b;
        boolean zA = aVar.a();
        x70.c cVar = null;
        boolean z13 = true;
        if (zA != this.f22472a.m().wantsPushNotifications()) {
            f0.B(m1.d(this), null, null, new f3(this, zA, cVar, 5), 3);
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != this.f22482k.getCalendarAlerts()) {
            this.f22482k.setCalendarAlerts(z11);
            f0.B(m1.d(this), null, null, new g(this, null), 3);
        } else {
            z13 = z12;
        }
        Boolean boolValueOf = Boolean.valueOf(aVar.a());
        a2 a2Var = this.f22485o;
        a2Var.getClass();
        a2Var.k(null, boolValueOf);
        if (z13) {
            d(z11);
        }
    }

    public final boolean c() {
        if (((Boolean) this.f22479h.getValue()).booleanValue()) {
            return false;
        }
        return (this.f22472a.m().wantsNewsletter() == this.f22481j && Intrinsics.areEqual(this.f22473b.b(), this.f22482k)) ? false : true;
    }

    public final void d(boolean z11) {
        boolean z12 = this.f22481j;
        gs.a aVar = this.f22473b;
        boolean zA = aVar.a();
        boolean z13 = aVar.a() && this.f22482k.getTransactional();
        boolean z14 = aVar.a() && this.f22482k.getAnnouncements();
        boolean z15 = aVar.a() && this.f22482k.getSupplyAlerts();
        boolean z16 = aVar.a() && this.l > 0;
        int i11 = aVar.a() ? this.l : 0;
        cs.b bVar = this.f22474c;
        bVar.getClass();
        i iVar = i.CORE_NOTIFICATIONS_SAVED;
        Pair pair = new Pair(dv.a.EMAIL_OPTIN_STATUS, new dv.c(Boolean.valueOf(z12)));
        Pair pair2 = new Pair(dv.a.PUSH_OPTIN_STATUS, new dv.c(Boolean.valueOf(zA)));
        Pair pair3 = new Pair(dv.a.CALENDAR_OPTIN_STATUS, new dv.c(Boolean.valueOf(z11)));
        Pair pair4 = new Pair(dv.a.PUSH_IMPORTANT_UPDATES_STATUS, new dv.c(Boolean.valueOf(z13)));
        Pair pair5 = new Pair(dv.a.PUSH_MARKETING_STATUS, new dv.c(Boolean.valueOf(z14)));
        Pair pair6 = new Pair(dv.a.PUSH_BAG_ALERTS_STATUS, new dv.c(Boolean.valueOf(z15)));
        Pair pair7 = new Pair(dv.a.PUSH_DAILY_REMINDER_STATUS, new dv.c(Boolean.valueOf(z16)));
        Pair pair8 = new Pair(dv.a.PUSH_DAILY_REMINDER_DAY_COUNT, new dv.c(Integer.valueOf(i11)));
        dv.a aVar2 = dv.a.SCREEN;
        dv.d dVar = dv.d.NOTIFICATIONS_SETTINGS;
        dv.b bVarE = h0.g.E(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(aVar2, new dv.c(dVar != null ? dVar.a() : null)));
        iVar.getClass();
        bVar.f13426a.c(iVar, bVarE);
    }
}
