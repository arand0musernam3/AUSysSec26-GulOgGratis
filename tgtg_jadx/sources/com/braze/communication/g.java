package com.braze.communication;

import com.braze.support.BrazeLogger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9636a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f9637b;

    static {
        try {
            f9637b = new f();
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f9636a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new p9.a(17), 4, (Object) null);
        }
    }

    public static final String b() {
        return "Exception setting TLS socket factory on url connection.";
    }

    public final HttpURLConnection a(URL url) throws IOException {
        url.getClass();
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (Intrinsics.areEqual(url.getProtocol(), "https")) {
            try {
                uRLConnectionOpenConnection.getClass();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                f fVar = f9637b;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("socketFactory");
                    fVar = null;
                }
                httpsURLConnection.setSSLSocketFactory(fVar);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new p9.a(18), 4, (Object) null);
            }
        }
        uRLConnectionOpenConnection.getClass();
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }

    public static final String a() {
        return "Exception initializing static TLS socket factory.";
    }
}
