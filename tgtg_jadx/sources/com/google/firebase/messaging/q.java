package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import m2.c2;
import m2.f2;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30.g f12867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f12868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oz.b f12869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t40.b f12870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t40.b f12871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u40.e f12872f;

    public q(p30.g gVar, t tVar, t40.b bVar, t40.b bVar2, u40.e eVar) {
        gVar.a();
        oz.b bVar3 = new oz.b(gVar.f34222a);
        this.f12867a = gVar;
        this.f12868b = tVar;
        this.f12869c = bVar3;
        this.f12870d = bVar;
        this.f12871e = bVar2;
        this.f12872f = eVar;
    }

    public final Task a(Task task) {
        return task.i(new l0.b(0), new c50.w(this));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i11;
        String str3;
        String strEncodeToString;
        boolean zE;
        r40.f fVar;
        PackageInfo packageInfoC;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        p30.g gVar = this.f12867a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f34224c.f34238b);
        t tVar = this.f12868b;
        synchronized (tVar) {
            try {
                if (tVar.f12882d == 0 && (packageInfoC = tVar.c("com.google.android.gms")) != null) {
                    tVar.f12882d = packageInfoC.versionCode;
                }
                i11 = tVar.f12882d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i11));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f12868b.a());
        t tVar2 = this.f12868b;
        synchronized (tVar2) {
            try {
                if (tVar2.f12881c == null) {
                    tVar2.e();
                }
                str3 = tVar2.f12881c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        p30.g gVar2 = this.f12867a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(gVar2.f34223b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String str4 = ((u40.a) Tasks.await(((u40.d) this.f12872f).d())).f40739a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e5) {
            e = e5;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(((u40.d) this.f12872f).c()));
        bundle.putString("cliv", "fcm-25.0.1");
        r40.g gVar3 = (r40.g) this.f12871e.get();
        a50.b bVar = (a50.b) this.f12870d.get();
        if (gVar3 == null || bVar == null) {
            return;
        }
        r40.c cVar = (r40.c) gVar3;
        synchronized (cVar) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            r40.h hVar = (r40.h) cVar.f37617a.get();
            synchronized (hVar) {
                zE = hVar.e(r40.h.f37622b, jCurrentTimeMillis);
            }
            if (zE) {
                synchronized (hVar) {
                    hVar.f37625a.a(new c2(25, hVar, hVar.b(System.currentTimeMillis())));
                }
                fVar = r40.f.GLOBAL;
            } else {
                fVar = r40.f.NONE;
            }
        }
        if (fVar != r40.f.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(fVar.a()));
            bundle.putString("Firebase-Client", bVar.a());
        }
    }

    public final Task c(String str, String str2, Bundle bundle) {
        int i11;
        try {
            b(str, str2, bundle);
            oz.b bVar = this.f12869c;
            oz.h hVar = oz.h.f33818c;
            f2 f2Var = bVar.f33805c;
            if (f2Var.w() < 12000000) {
                return f2Var.x() != 0 ? bVar.a(bundle).j(hVar, new oz.m(1, bVar, bundle)) : Tasks.c(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            oz.o oVarD = oz.o.d(bVar.f33804b);
            synchronized (oVarD) {
                i11 = oVarD.f33844a;
                oVarD.f33844a = i11 + 1;
            }
            return oVarD.e(new oz.n(i11, 1, bundle, 1)).i(hVar, oz.d.f33811b);
        } catch (InterruptedException | ExecutionException e5) {
            return Tasks.c(e5);
        }
    }
}
