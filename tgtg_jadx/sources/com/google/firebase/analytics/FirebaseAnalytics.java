package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.l6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.tasks.Tasks;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p30.g;
import q30.a;
import q30.b;
import q30.c;
import u40.d;
import u40.e;
import y00.u2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f12749b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7 f12750a;

    public FirebaseAnalytics(a7 a7Var) {
        i0.h(a7Var);
        this.f12750a = a7Var;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f12749b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f12749b == null) {
                        f12749b = new FirebaseAnalytics(a7.c(context, null));
                    }
                } finally {
                }
            }
        }
        return f12749b;
    }

    @Keep
    public static u2 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        a7 a7VarC = a7.c(context, bundle);
        if (a7VarC == null) {
            return null;
        }
        return new c(a7VarC);
    }

    public final void a(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        a7 a7Var = this.f12750a;
        a7Var.getClass();
        a7Var.a(new n6(a7Var, bundle, 1));
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = d.f40746m;
            return (String) Tasks.a(((d) g.c().b(e.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e5) {
            throw new IllegalStateException(e5);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        l6 l6VarD = l6.d(activity);
        a7 a7Var = this.f12750a;
        a7Var.getClass();
        a7Var.a(new o6(a7Var, l6VarD, str, str2));
    }
}
