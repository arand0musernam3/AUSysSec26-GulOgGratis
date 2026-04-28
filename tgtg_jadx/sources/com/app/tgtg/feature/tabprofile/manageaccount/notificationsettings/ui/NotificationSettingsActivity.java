package com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.ui;

import ah.n;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.activity.e0;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.g1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.google.firebase.messaging.r;
import e70.c;
import f70.k;
import g3.y0;
import hs.b;
import hs.f;
import hs.g;
import hs.h;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import m3.i;
import m3.k1;
import mv.d;
import mv.r0;
import v80.f0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationSettingsActivity extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9422k = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActivityResultLauncher f9424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n1 f9425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f9426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f9427j;

    public NotificationSettingsActivity() {
        super(19);
        this.f9425h = new n1(Reflection.getOrCreateKotlinClass(h.class), new b(this, 1), new b(this, 0), new b(this, 2));
        this.f9426i = i.w(Boolean.FALSE);
        this.f9427j = new e0(this, 24);
    }

    public final h a0() {
        return (h) this.f9425h.getValue();
    }

    public final boolean b0() {
        return ((Boolean) this.f9426i.getValue()).booleanValue();
    }

    public final boolean c0() {
        if (Build.VERSION.SDK_INT < 33 || ft.c.E() || a0().f22473b.a()) {
            return true;
        }
        ActivityResultLauncher activityResultLauncher = this.f9424g;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.a(new String[]{"android.permission.POST_NOTIFICATIONS"}, null);
        return false;
    }

    public final void d0(boolean z11) {
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        if (!r0.u(applicationContext)) {
            Toast.makeText(this, R.string.generic_error_unable_to_connect_to_internet_please_try_again_later, 0).show();
            return;
        }
        a0().d(b0());
        h hVarA0 = a0();
        hVarA0.getClass();
        f0.B(m1.d(hVarA0), null, null, new g(hVarA0, null), 3);
        if (z11) {
            r0.m(this, (6 & 2) == 0, (6 & 4) == 0);
        }
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        o30.f0.S(this, false);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this.f9427j);
        c cVar = this.f9423f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        this.f9424g = registerForActivityResult(new g1(2), new e.b(this, 15));
        h hVarA0 = a0();
        HashMap map = (HashMap) hVarA0.f22475d.a("DEEPLINK_PARAMETERS_MAP");
        if ((map == null || (str = (String) map.get("optOut")) == null) ? false : Intrinsics.areEqual(StringsKt.c0(str), Boolean.TRUE)) {
            h hVarA02 = a0();
            if (hVarA02.f22473b.a() == hVarA02.f22472a.m().wantsPushNotifications()) {
                new Handler(Looper.getMainLooper()).postDelayed(new r(21, hVarA02, this), 500L);
            }
            boolean zB0 = b0();
            PushNotificationsSettings pushNotificationsSettings = hVarA0.f22482k;
            pushNotificationsSettings.setCalendarAlerts(zB0);
            DailyReminder dailyReminder = pushNotificationsSettings.getDailyReminder();
            if (dailyReminder != null) {
                dailyReminder.setMonday(h.a(hVarA0, "reminderMonday", dailyReminder.getMonday()));
                dailyReminder.setTuesday(h.a(hVarA0, "reminderTuesday", dailyReminder.getTuesday()));
                dailyReminder.setWednesday(h.a(hVarA0, "reminderWednesday", dailyReminder.getWednesday()));
                dailyReminder.setThursday(h.a(hVarA0, "reminderThursday", dailyReminder.getThursday()));
                dailyReminder.setFriday(h.a(hVarA0, "reminderFriday", dailyReminder.getFriday()));
                dailyReminder.setSaturday(h.a(hVarA0, "reminderSaturday", dailyReminder.getSaturday()));
                dailyReminder.setSunday(h.a(hVarA0, "reminderSunday", dailyReminder.getSunday()));
            }
            d0(false);
        } else {
            h hVarA03 = a0();
            hVarA03.getClass();
            f0.B(m1.d(hVarA03), null, null, new f(hVarA03, null), 3);
        }
        if (Intrinsics.areEqual((Boolean) a0().f22475d.a("OPEN_SYSTEM_SETTINGS"), Boolean.TRUE)) {
            a0().f22476e.f13425a.a(k.f17493a);
        }
        h hVarA04 = a0();
        cv.i iVar = cv.i.SCREEN_NOTIFICATION_SETTINGS;
        hVarA04.getClass();
        iVar.getClass();
        cs.b bVar = hVarA04.f22474c;
        bVar.getClass();
        bVar.f13426a.c(iVar, null);
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f9426i.setValue(Boolean.valueOf(d.o(this)));
        h hVarA0 = a0();
        a2 a2Var = hVarA0.f22485o;
        Boolean boolValueOf = Boolean.valueOf(hVarA0.f22473b.a());
        a2Var.getClass();
        a2Var.k(null, boolValueOf);
        hVarA0.b(b0());
        e.f.a(this, new u3.d(new y0(this, 16), true, 1714364807));
    }
}
