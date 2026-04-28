package ev;

import a3.y;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.app.tgtg.model.remote.user.requests.DietaryPreferences;
import com.app.tgtg.model.remote.user.requests.UserGender;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.BrazeUser;
import com.braze.configuration.BrazeConfig;
import com.braze.enums.Gender;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16490c;

    public e(Context context, mv.b bVar) {
        bVar.getClass();
        this.f16488a = context;
        try {
            String resourceEntryName = context.getResources().getResourceEntryName(2131231545);
            BrazeConfig.Builder firebaseCloudMessagingSenderIdKey = new BrazeConfig.Builder().setApiKey(bVar.f30152c.getProduction() ? "90698c68-805e-49b1-b827-4dec1c8d8c0b" : "9c521d91-18ec-4fda-9372-2bf2d6a23cc6").setCustomEndpoint("sdk.fra-01.braze.eu").setIsFirebaseCloudMessagingRegistrationEnabled(true).setFirebaseCloudMessagingSenderIdKey("291323069543");
            resourceEntryName.getClass();
            Braze.INSTANCE.configure(context, firebaseCloudMessagingSenderIdKey.setSmallNotificationIcon(resourceEntryName).setLargeNotificationIcon(resourceEntryName).setHandlePushDeepLinksAutomatically(true).setPushDeepLinkBackStackActivityEnabled(true).setIsInAppMessageAccessibilityExclusiveModeEnabled(true).build());
            BrazeLogger.setLogLevel(Integer.MAX_VALUE);
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(true, true, null, null, 12, null));
            }
            sa0.a.f38953a.f("Started successfully initialized", new Object[0]);
            this.f16489b = true;
        } catch (Throwable th2) {
            this.f16489b = false;
            sa0.a.f38953a.d(th2);
        }
    }

    public final void a(boolean z11) {
        if (!this.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
        } else {
            if (!z11) {
                e("00000000-0000-0000-0000-000000000000", true);
                return;
            }
            c90.f fVar = p0.f42144a;
            f0.B(f0.b(c90.e.f7834b), null, null, new y(this, (x70.c) null, 6), 3);
        }
    }

    public final void b(DietaryPreferences dietaryPreferences) {
        if (!this.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
            return;
        }
        if (dietaryPreferences != null) {
            try {
                BrazeUser currentUser = Braze.INSTANCE.getInstance(this.f16488a).getCurrentUser();
                if (currentUser != null) {
                    currentUser.setCustomUserAttribute(cv.a.DEMOGRAPHIC_DIETARY_PREFERENCES.a(), dietaryPreferences.name());
                }
            } catch (Throwable th2) {
                this.f16489b = false;
                sa0.a.f38953a.d(th2);
            }
        }
    }

    public final void c(UserGender userGender) {
        if (!this.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
            return;
        }
        int i11 = userGender == null ? -1 : d.$EnumSwitchMapping$0[userGender.ordinal()];
        Gender gender = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? Gender.UNKNOWN : Gender.PREFER_NOT_TO_SAY : Gender.OTHER : Gender.NOT_APPLICABLE : Gender.MALE : Gender.FEMALE;
        try {
            BrazeUser currentUser = Braze.INSTANCE.getInstance(this.f16488a).getCurrentUser();
            if (currentUser != null) {
                currentUser.setGender(gender);
            }
        } catch (Throwable th2) {
            this.f16489b = false;
            sa0.a.f38953a.d(th2);
        }
    }

    public final void d(String str) {
        if (!this.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
            return;
        }
        if (str != null) {
            SharedPreferences sharedPreferencesX = ft.c.x();
            String strY = ft.c.y();
            if (strY == null) {
                strY = null;
            }
            String string = sharedPreferencesX.getString(strY + "_trackedBrazeUserCountry", "");
            string.getClass();
            if (Intrinsics.areEqual(string, str)) {
                return;
            }
            try {
                BrazeUser currentUser = Braze.INSTANCE.getInstance(this.f16488a).getCurrentUser();
                if (currentUser != null) {
                    currentUser.setCountry(str);
                }
            } catch (Throwable th2) {
                this.f16489b = false;
                sa0.a.f38953a.d(th2);
            }
            SharedPreferences.Editor editorEdit = ft.c.x().edit();
            String strY2 = ft.c.y();
            editorEdit.putString((strY2 != null ? strY2 : null) + "_trackedBrazeUserCountry", str);
            editorEdit.apply();
        }
    }

    public final void e(String str, boolean z11) {
        if (!this.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
        } else {
            if (Intrinsics.areEqual(this.f16490c, str)) {
                return;
            }
            sa0.a.f38953a.f("Setting GAID: ".concat(str), new Object[0]);
            Braze.INSTANCE.getInstance(this.f16488a).setGoogleAdvertisingId(str, z11);
            this.f16490c = str;
        }
    }

    public final void f(boolean z11) {
        Boolean boolValueOf;
        if (!this.f16489b) {
            sa0.a.f38953a.i("Not tracking to Braze", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = ft.e.f17920a;
        SharedPreferences sharedPreferences2 = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
            sharedPreferences = null;
        }
        if (sharedPreferences.contains("lastPushOptInSent")) {
            SharedPreferences sharedPreferences3 = ft.e.f17920a;
            if (sharedPreferences3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
                sharedPreferences3 = null;
            }
            boolValueOf = Boolean.valueOf(sharedPreferences3.getBoolean("lastPushOptInSent", false));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.valueOf(z11))) {
            return;
        }
        Context context = this.f16488a;
        try {
            if (z11) {
                BrazeUser currentUser = Braze.INSTANCE.getInstance(context).getCurrentUser();
                if (currentUser != null) {
                    currentUser.setPushNotificationSubscriptionType(NotificationSubscriptionType.SUBSCRIBED);
                }
            } else {
                BrazeUser currentUser2 = Braze.INSTANCE.getInstance(context).getCurrentUser();
                if (currentUser2 != null) {
                    currentUser2.setPushNotificationSubscriptionType(NotificationSubscriptionType.UNSUBSCRIBED);
                }
            }
            Braze.INSTANCE.getInstance(context).requestImmediateDataFlush();
        } catch (Throwable th2) {
            this.f16489b = false;
            sa0.a.f38953a.d(th2);
        }
        SharedPreferences sharedPreferences4 = ft.e.f17920a;
        if (sharedPreferences4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
        } else {
            sharedPreferences2 = sharedPreferences4;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
        editorEdit.putBoolean("lastPushOptInSent", z11);
        editorEdit.apply();
    }
}
