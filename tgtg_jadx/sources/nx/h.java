package nx;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import u70.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f31434b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile h f31435c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31436a = u70.l.b(g.f31433a);

    public final SharedPreferences a() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            Object value = this.f31436a.getValue();
            value.getClass();
            return (SharedPreferences) value;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public final void b(Activity activity) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            activity.getClass();
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            intent.getClass();
            c(data, intent);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:5:0x000a, B:20:0x003b, B:29:0x0051, B:32:0x0057, B:18:0x0035, B:23:0x0044, B:26:0x004b, B:9:0x001a, B:12:0x0021, B:16:0x002d), top: B:43:0x000a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #2 {all -> 0x0067, blocks: (B:5:0x000a, B:20:0x003b, B:29:0x0051, B:32:0x0057, B:18:0x0035, B:23:0x0044, B:26:0x004b, B:9:0x001a, B:12:0x0021, B:16:0x002d), top: B:43:0x000a, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.net.Uri r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.util.Set r0 = yx.a.f46339a
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto La
            goto L69
        La:
            r6.getClass()     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "al_applink_data"
            r2 = 0
            java.lang.String r3 = "campaign_ids"
            if (r0 == 0) goto L1a
        L18:
            r5 = r2
            goto L39
        L1a:
            java.lang.String r5 = r5.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L2b
            if (r5 != 0) goto L21
            goto L18
        L21:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r5 = r0.getString(r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L39
        L2b:
            r5 = move-exception
            goto L35
        L2d:
            java.lang.String r5 = "AppLinkManager"
            java.lang.String r0 = "Fail to parse Applink data from Uri"
            android.util.Log.d(r5, r0)     // Catch: java.lang.Throwable -> L2b
            goto L18
        L35:
            yx.a.a(r4, r5)     // Catch: java.lang.Throwable -> L67
            goto L18
        L39:
            if (r5 != 0) goto L55
            java.util.Set r5 = yx.a.f46339a     // Catch: java.lang.Throwable -> L67
            boolean r5 = r5.contains(r4)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L44
            goto L54
        L44:
            android.os.Bundle r5 = r6.getBundleExtra(r1)     // Catch: java.lang.Throwable -> L50
            if (r5 != 0) goto L4b
            goto L54
        L4b:
            java.lang.String r2 = r5.getString(r3)     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r5 = move-exception
            yx.a.a(r4, r5)     // Catch: java.lang.Throwable -> L67
        L54:
            r5 = r2
        L55:
            if (r5 == 0) goto L69
            android.content.SharedPreferences r6 = r4.a()     // Catch: java.lang.Throwable -> L67
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L67
            android.content.SharedPreferences$Editor r5 = r6.putString(r3, r5)     // Catch: java.lang.Throwable -> L67
            r5.apply()     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r5 = move-exception
            goto L6a
        L69:
            return
        L6a:
            yx.a.a(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.h.c(android.net.Uri, android.content.Intent):void");
    }
}
