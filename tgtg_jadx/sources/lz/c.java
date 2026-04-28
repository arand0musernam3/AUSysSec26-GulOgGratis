package lz;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.i0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import qz.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a3.j f28434c = new a3.j("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f28436b;

    public c(String str) {
        i0.e(str);
        this.f28435a = str;
        this.f28436b = new s(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a3.j jVar = f28434c;
        Status status = Status.f11056g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f28435a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f11054e;
            } else {
                Log.e((String) jVar.f399c, ((String) jVar.f400d).concat("Unable to revoke access!"));
            }
            jVar.h("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e5) {
            Log.e((String) jVar.f399c, ((String) jVar.f400d).concat("IOException when revoking access: ".concat(String.valueOf(e5.toString()))));
        } catch (Exception e11) {
            Log.e((String) jVar.f399c, ((String) jVar.f400d).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.f28436b.e(status);
    }
}
