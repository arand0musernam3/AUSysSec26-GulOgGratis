package p30;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.common.internal.q;
import java.util.Arrays;
import w2.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f34242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f34243g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i11 = vz.e.f42632a;
        i0.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f34238b = str;
        this.f34237a = str2;
        this.f34239c = str3;
        this.f34240d = str4;
        this.f34241e = str5;
        this.f34242f = str6;
        this.f34243g = str7;
    }

    public static i a(Context context) {
        z zVar = new z(context);
        String strT = zVar.t("google_app_id");
        if (TextUtils.isEmpty(strT)) {
            return null;
        }
        return new i(strT, zVar.t("google_api_key"), zVar.t("firebase_database_url"), zVar.t("ga_trackingId"), zVar.t("gcm_defaultSenderId"), zVar.t("google_storage_bucket"), zVar.t("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return i0.k(this.f34238b, iVar.f34238b) && i0.k(this.f34237a, iVar.f34237a) && i0.k(this.f34239c, iVar.f34239c) && i0.k(this.f34240d, iVar.f34240d) && i0.k(this.f34241e, iVar.f34241e) && i0.k(this.f34242f, iVar.f34242f) && i0.k(this.f34243g, iVar.f34243g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34238b, this.f34237a, this.f34239c, this.f34240d, this.f34241e, this.f34242f, this.f34243g});
    }

    public final String toString() {
        q qVar = new q(this);
        qVar.b(this.f34238b, "applicationId");
        qVar.b(this.f34237a, "apiKey");
        qVar.b(this.f34239c, "databaseUrl");
        qVar.b(this.f34241e, "gcmSenderId");
        qVar.b(this.f34242f, "storageBucket");
        qVar.b(this.f34243g, "projectId");
        return qVar.toString();
    }
}
