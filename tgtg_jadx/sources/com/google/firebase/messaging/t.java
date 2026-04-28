package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12883e = 0;

    public t(Context context) {
        this.f12879a = context;
    }

    public static String b(p30.g gVar) {
        gVar.a();
        p30.i iVar = gVar.f34224c;
        String str = iVar.f34241e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = iVar.f34238b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f12880b == null) {
                e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f12880b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.f12879a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("FirebaseMessaging", "Failed to find package " + e5);
            return null;
        }
    }

    public final boolean d() {
        int i11;
        synchronized (this) {
            i11 = this.f12883e;
            if (i11 == 0) {
                PackageManager packageManager = this.f12879a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i11 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        this.f12883e = 2;
                    } else {
                        this.f12883e = 2;
                    }
                    i11 = 2;
                }
            }
        }
        return i11 != 0;
    }

    public final synchronized void e() {
        PackageInfo packageInfoC = c(this.f12879a.getPackageName());
        if (packageInfoC != null) {
            this.f12880b = Integer.toString(packageInfoC.versionCode);
            this.f12881c = packageInfoC.versionName;
        }
    }
}
