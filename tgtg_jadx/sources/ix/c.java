package ix;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import ax.a0;
import bx.g;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o80.o;
import o80.r;
import org.json.JSONObject;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f24233a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f24234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f24235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static hx.a f24236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f24237e;

    static {
        String string = c.class.toString();
        string.getClass();
        f24234b = string;
    }

    public final boolean a() {
        String str = f24234b;
        if (yx.a.f46339a.contains(this)) {
            return false;
        }
        try {
            if (!f24235c || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            hx.a aVar = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e5) {
                Log.i(str, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                hx.a aVar2 = f24236d;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e5.toString());
                aVar.a(bundle, "gps_ara_failed");
                return false;
            } catch (Exception e11) {
                Log.i(str, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                hx.a aVar3 = f24236d;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e11.toString());
                aVar.a(bundle2, "gps_ara_failed");
                return false;
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return false;
        }
    }

    public final String b(g gVar) {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = gVar.f6718a;
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                return r.k(r.n(o.b(itKeys), new androidx.fragment.app.r(jSONObject, 21)), "&");
            }
            return "";
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void c(String str, g gVar) {
        String str2 = f24234b;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                String string = gVar.f6718a.getString("_eventName");
                if (Intrinsics.areEqual(string, "_removed_")) {
                    return;
                }
                string.getClass();
                if (!StringsKt.z(string, "gps", false) && a()) {
                    Context contextA = a0.a();
                    hx.a aVar = null;
                    try {
                        MeasurementManager measurementManagerB = y.b(contextA.getSystemService(y.d()));
                        if (measurementManagerB == null) {
                            measurementManagerB = MeasurementManager.get(contextA.getApplicationContext());
                        }
                        if (measurementManagerB == null) {
                            Log.w(str2, "FAILURE_GET_MEASUREMENT_MANAGER");
                            hx.a aVar2 = f24236d;
                            if (aVar2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                                aVar2 = null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            aVar2.a(bundle, "gps_ara_failed");
                            return;
                        }
                        String strB = b(gVar);
                        StringBuilder sb2 = new StringBuilder();
                        String str3 = f24237e;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("serverUri");
                            str3 = null;
                        }
                        sb2.append(str3);
                        sb2.append("?app_id=");
                        sb2.append(str);
                        sb2.append('&');
                        sb2.append(strB);
                        Uri uri = Uri.parse(sb2.toString());
                        uri.getClass();
                        measurementManagerB.registerTrigger(uri, a0.c(), new b(0));
                    } catch (Error e5) {
                        Log.w(str2, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        hx.a aVar3 = f24236d;
                        if (aVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                        } else {
                            aVar = aVar3;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e5.toString());
                        aVar.a(bundle2, "gps_ara_failed");
                    } catch (Exception e11) {
                        Log.w(str2, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        hx.a aVar4 = f24236d;
                        if (aVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                        } else {
                            aVar = aVar4;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e11.toString());
                        aVar.a(bundle3, "gps_ara_failed");
                    }
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void d(String str, g gVar) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            a0.c().execute(new a(str, gVar, 0));
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
