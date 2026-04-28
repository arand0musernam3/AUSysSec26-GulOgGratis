package a40;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import zendesk.messaging.android.internal.conversationscreen.ConversationTypingEvents;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f703g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f704h = Pattern.quote(ExpiryDateInput.SEPARATOR);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a30.j f705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u40.e f708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f710f;

    public b0(Context context, String str, u40.e eVar, x xVar) {
        if (context == null) {
            i4.a.f("appContext must not be null");
            throw null;
        }
        if (str == null) {
            i4.a.f("appIdentifier must not be null");
            throw null;
        }
        this.f706b = context;
        this.f707c = str;
        this.f708d = eVar;
        this.f709e = xVar;
        this.f705a = new a30.j();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f703g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final a0 b(boolean z11) {
        String str;
        String str2 = null;
        if (!((Boolean) new b40.d(2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u40.e eVar = this.f708d;
        if (z11) {
            try {
                str = ((u40.a) Tasks.a(((u40.d) eVar).d(), ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, timeUnit)).f40739a;
            } catch (Exception e5) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e5);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.a(((u40.d) eVar).c(), ConversationTypingEvents.TIME_INTERVAL_IN_MILLIS, timeUnit);
        } catch (Exception e11) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e11);
        }
        return new a0(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f710f;
        if (cVar != null && (cVar.f712b != null || !this.f709e.h())) {
            return this.f710f;
        }
        x30.b bVar = x30.b.f43820a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f706b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f709e.h()) {
            a0 a0VarB = b(false);
            bVar.c("Fetched Firebase Installation ID: " + a0VarB.f698a);
            if (a0VarB.f698a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                a0VarB = new a0(str, null);
            }
            if (Objects.equals(a0VarB.f698a, string)) {
                this.f710f = new c(sharedPreferences.getString("crashlytics.installation.id", null), a0VarB.f698a, a0VarB.f699b);
            } else {
                this.f710f = new c(a(sharedPreferences, a0VarB.f698a), a0VarB.f698a, a0VarB.f699b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f710f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f710f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        bVar.c("Install IDs: " + this.f710f);
        return this.f710f;
    }

    public final String d() {
        String str;
        a30.j jVar = this.f705a;
        Context context = this.f706b;
        synchronized (jVar) {
            try {
                if (jVar.f657a == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    jVar.f657a = installerPackageName;
                }
                str = "".equals(jVar.f657a) ? null : jVar.f657a;
            } finally {
            }
        }
        return str;
    }
}
