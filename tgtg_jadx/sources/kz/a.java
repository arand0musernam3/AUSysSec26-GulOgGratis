package kz;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.l;
import zz.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26726a = 1;

    public final synchronized int c() {
        int i11;
        try {
            i11 = f26726a;
            if (i11 == 1) {
                Context applicationContext = getApplicationContext();
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.f11044d;
                int iB = googleApiAvailability.b(applicationContext, 12451000);
                if (iB == 0) {
                    i11 = 4;
                    f26726a = 4;
                } else if (googleApiAvailability.a(applicationContext, null, iB) != null || d.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i11 = 2;
                    f26726a = 2;
                } else {
                    i11 = 3;
                    f26726a = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i11;
    }
}
