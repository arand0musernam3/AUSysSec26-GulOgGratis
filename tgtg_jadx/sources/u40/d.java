package u40;

import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import d10.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import ky.p;
import org.json.JSONException;
import org.json.JSONObject;
import oz.m;
import u30.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f40746m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30.g f40747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w40.c f40748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ub.a f40749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f40750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f40751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f40752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f40753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f40754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v30.j f40755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f40756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f40757k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public d(p30.g gVar, t40.b bVar, ExecutorService executorService, v30.j jVar) {
        gVar.a();
        w40.c cVar = new w40.c(gVar.f34222a, bVar);
        ub.a aVar = new ub.a((Object) gVar, false, 4);
        if (p.f26720c == null) {
            p.f26720c = new p(26);
        }
        p pVar = p.f26720c;
        if (j.f40764c == null) {
            j.f40764c = new j(pVar);
        }
        j jVar2 = j.f40764c;
        k kVar = new k(new u30.d(gVar, 2));
        h hVar = new h();
        this.f40753g = new Object();
        this.f40757k = new HashSet();
        this.l = new ArrayList();
        this.f40747a = gVar;
        this.f40748b = cVar;
        this.f40749c = aVar;
        this.f40750d = jVar2;
        this.f40751e = kVar;
        this.f40752f = hVar;
        this.f40754h = executorService;
        this.f40755i = jVar;
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        v40.b bVarE;
        synchronized (f40746m) {
            try {
                p30.g gVar = this.f40747a;
                gVar.a();
                m mVarD = m.d(gVar.f34222a);
                try {
                    bVarE = this.f40749c.E();
                    v40.d dVar = bVarE.f42007b;
                    if (dVar == v40.d.NOT_GENERATED || dVar == v40.d.ATTEMPT_MIGRATION) {
                        String strF = f(bVarE);
                        ub.a aVar = this.f40749c;
                        v40.a aVarA = bVarE.a();
                        aVarA.f41997a = strF;
                        aVarA.b(v40.d.UNREGISTERED);
                        bVarE = aVarA.a();
                        aVar.y(bVarE);
                    }
                    if (mVarD != null) {
                        mVarD.v();
                    }
                } catch (Throwable th2) {
                    if (mVarD != null) {
                        mVarD.v();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i(bVarE);
        this.f40755i.execute(new b(this, 2));
    }

    public final v40.b b(v40.b bVar) throws FirebaseInstallationsException {
        int i11;
        int responseCode;
        w40.b bVar2;
        w40.b bVarF;
        w40.c cVar = this.f40748b;
        p30.g gVar = this.f40747a;
        gVar.a();
        String str = gVar.f34224c.f34237a;
        String str2 = bVar.f42006a;
        p30.g gVar2 = this.f40747a;
        gVar2.a();
        String str3 = gVar2.f34224c.f34243g;
        String str4 = bVar.f42009d;
        ic.a aVar = cVar.f43218c;
        if (!aVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = w40.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i12 = 0; i12 <= 1; i12 = i11 + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    w40.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    aVar.c(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                i11 = i12;
            }
            if (responseCode >= 200 && responseCode < 300) {
                bVarF = w40.c.f(httpURLConnectionC);
            } else {
                w40.c.b(httpURLConnectionC, null, str, str3);
                i11 = i12;
                if (responseCode == 401 || responseCode == 404) {
                    byte b8 = (byte) (0 | 1);
                    w40.e eVar = w40.e.AUTH_ERROR;
                    if (b8 != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    bVar2 = new w40.b(null, 0L, eVar);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    bVarF = bVar2;
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        byte b11 = (byte) (0 | 1);
                        w40.e eVar2 = w40.e.BAD_CONFIG;
                        if (b11 != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        bVar2 = new w40.b(null, 0L, eVar2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVarF = bVar2;
                    }
                }
            }
            int i13 = c.f40745b[bVarF.f43213c.ordinal()];
            if (i13 == 1) {
                String str5 = bVarF.f43211a;
                long j9 = bVarF.f43212b;
                this.f40750d.f40765a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                v40.a aVarA = bVar.a();
                aVarA.f41999c = str5;
                aVarA.f42001e = j9;
                byte b12 = (byte) (aVarA.f42004h | 1);
                aVarA.f42002f = jCurrentTimeMillis;
                aVarA.f42004h = (byte) (b12 | 2);
                return aVarA.a();
            }
            if (i13 == 2) {
                v40.a aVarA2 = bVar.a();
                aVarA2.f42003g = "BAD CONFIG";
                aVarA2.b(v40.d.REGISTER_ERROR);
                return aVarA2.a();
            }
            if (i13 != 3) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f40756j = null;
            }
            v40.a aVarA3 = bVar.a();
            aVarA3.b(v40.d.NOT_GENERATED);
            return aVarA3.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final o c() {
        String str;
        e();
        synchronized (this) {
            str = this.f40756j;
        }
        if (str != null) {
            return Tasks.d(str);
        }
        d10.g gVar = new d10.g();
        g gVar2 = new g(gVar);
        synchronized (this.f40753g) {
            this.l.add(gVar2);
        }
        o oVar = gVar.f13697a;
        this.f40754h.execute(new b(this, 0));
        return oVar;
    }

    public final o d() {
        e();
        d10.g gVar = new d10.g();
        f fVar = new f(this.f40750d, gVar);
        synchronized (this.f40753g) {
            this.l.add(fVar);
        }
        o oVar = gVar.f13697a;
        this.f40754h.execute(new b(this, 1));
        return oVar;
    }

    public final void e() {
        p30.g gVar = this.f40747a;
        gVar.a();
        i0.f(gVar.f34224c.f34238b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        i0.f(gVar.f34224c.f34243g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        i0.f(gVar.f34224c.f34237a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f34224c.f34238b;
        Pattern pattern = j.f40763b;
        i0.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        i0.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f40763b.matcher(gVar.f34224c.f34237a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(v40.b r6) {
        /*
            r5 = this;
            p30.g r0 = r5.f40747a
            r0.a()
            java.lang.String r0 = r0.f34223b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            p30.g r0 = r5.f40747a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f34223b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5d
        L1e:
            v40.d r6 = r6.f42007b
            v40.d r0 = v40.d.ATTEMPT_MIGRATION
            if (r6 != r0) goto L5d
            u30.k r6 = r5.f40751e
            java.lang.Object r6 = r6.get()
            v40.c r6 = (v40.c) r6
            android.content.SharedPreferences r0 = r6.f42014a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f42014a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = r6.f42014a     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r6 = move-exception
            goto L5b
        L42:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
        L47:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L57
            u40.h r6 = r5.f40752f
            r6.getClass()
            java.lang.String r6 = u40.h.a()
            return r6
        L57:
            return r2
        L58:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r6     // Catch: java.lang.Throwable -> L40
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
        L5d:
            u40.h r6 = r5.f40752f
            r6.getClass()
            java.lang.String r6 = u40.h.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u40.d.f(v40.b):java.lang.String");
    }

    public final v40.b g(v40.b bVar) throws FirebaseInstallationsException {
        int responseCode;
        w40.a aVarE;
        String str = bVar.f42006a;
        String string = null;
        if (str != null && str.length() == 11) {
            v40.c cVar = (v40.c) this.f40751e.get();
            synchronized (cVar.f42014a) {
                try {
                    String[] strArr = v40.c.f42013c;
                    int i11 = 0;
                    while (true) {
                        if (i11 < 4) {
                            String str2 = strArr[i11];
                            String string2 = cVar.f42014a.getString("|T|" + cVar.f42015b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i11++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        w40.c cVar2 = this.f40748b;
        p30.g gVar = this.f40747a;
        gVar.a();
        String str3 = gVar.f34224c.f34237a;
        String str4 = bVar.f42006a;
        p30.g gVar2 = this.f40747a;
        gVar2.a();
        String str5 = gVar2.f34224c.f34243g;
        p30.g gVar3 = this.f40747a;
        gVar3.a();
        String str6 = gVar3.f34224c.f34238b;
        ic.a aVar = cVar2.f43218c;
        if (!aVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = w40.c.a("projects/" + str5 + "/installations");
        for (int i12 = 0; i12 <= 1; i12++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar2.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    w40.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    aVar.c(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                aVarE = w40.c.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            } else {
                w40.c.b(httpURLConnectionC, str6, str3, str5);
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    w40.a aVar2 = new w40.a(null, null, null, null, w40.d.BAD_CONFIG);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVarE = aVar2;
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            int i13 = c.f40744a[aVarE.f43210e.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                v40.a aVarA = bVar.a();
                aVarA.f42003g = "BAD CONFIG";
                aVarA.b(v40.d.REGISTER_ERROR);
                return aVarA.a();
            }
            String str7 = aVarE.f43207b;
            String str8 = aVarE.f43208c;
            this.f40750d.f40765a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            w40.b bVar2 = aVarE.f43209d;
            String str9 = bVar2.f43211a;
            long j9 = bVar2.f43212b;
            v40.a aVarA2 = bVar.a();
            aVarA2.f41997a = str7;
            aVarA2.b(v40.d.REGISTERED);
            aVarA2.f41999c = str9;
            aVarA2.f42000d = str8;
            aVarA2.f42001e = j9;
            byte b8 = (byte) (aVarA2.f42004h | 1);
            aVarA2.f42002f = jCurrentTimeMillis;
            aVarA2.f42004h = (byte) (b8 | 2);
            return aVarA2.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f40753g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(v40.b bVar) {
        synchronized (this.f40753g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
