package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q40.c f12854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c50.w f12856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f12857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f12858e;

    public o(FirebaseMessaging firebaseMessaging, q40.c cVar) {
        this.f12858e = firebaseMessaging;
        this.f12854a = cVar;
    }

    public final synchronized void a() {
        try {
            if (this.f12855b) {
                return;
            }
            Boolean boolB = b();
            this.f12857d = boolB;
            if (boolB == null) {
                c50.w wVar = new c50.w(14);
                this.f12856c = wVar;
                u30.j jVar = (u30.j) this.f12854a;
                jVar.a(jVar.f40697c, wVar);
            }
            this.f12855b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final Boolean b() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        p30.g gVar = this.f12858e.firebaseApp;
        gVar.a();
        Context context = gVar.f34222a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
