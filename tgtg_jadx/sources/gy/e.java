package gy;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.StatFs;
import d40.t1;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ky.o;
import lz.i;
import u70.l;
import u70.p;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f20922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Context context, int i11) {
        super(0);
        this.f20921a = i11;
        this.f20922b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f20921a;
        StatFs statFs = null;
        Context context = this.f20922b;
        switch (i11) {
            case 0:
                ContentResolver contentResolver = context.getContentResolver();
                contentResolver.getClass();
                return contentResolver;
            case 1:
                return new RingtoneManager(context);
            case 2:
                AssetManager assets = context.getAssets();
                assets.getClass();
                return assets;
            case 3:
                Resources resources = context.getResources();
                resources.getClass();
                Configuration configuration = resources.getConfiguration();
                configuration.getClass();
                return configuration;
            case 4:
                Object systemService = context.getSystemService("device_policy");
                systemService.getClass();
                return (DevicePolicyManager) systemService;
            case 5:
                Object systemService2 = context.getSystemService("keyguard");
                systemService2.getClass();
                return (KeyguardManager) systemService2;
            case 6:
                int i12 = g.f20926a;
                qb.e eVar = new qb.e();
                Object objH = t1.H(1000L, new e(context, 10));
                if (objH instanceof p) {
                    objH = null;
                }
                ActivityManager activityManager = (ActivityManager) objH;
                Object objH2 = t1.H(1000L, f.f20924c);
                if (objH2 instanceof p) {
                    objH2 = null;
                }
                StatFs statFs2 = (StatFs) objH2;
                Object objH3 = t1.H(1000L, new e(context, 11));
                if (objH3 instanceof p) {
                    objH3 = null;
                }
                k8.d dVar = new k8.d(3, activityManager, statFs2);
                Object objH4 = t1.H(1000L, new e(context, 13));
                if (objH4 instanceof p) {
                    objH4 = null;
                }
                jb.b bVar = new jb.b((SensorManager) objH4);
                Object objH5 = t1.H(1000L, new e(context, 9));
                if (objH5 instanceof p) {
                    objH5 = null;
                }
                jd.f fVar = new jd.f((InputManager) objH5, 5);
                ky.b bVar2 = new ky.b(context, (short) 0);
                int i13 = 29;
                n20.f fVar2 = new n20.f(29);
                Object objH6 = t1.H(1000L, new e(context, 7));
                if (objH6 instanceof p) {
                    objH6 = null;
                }
                se.d dVar2 = new se.d((ActivityManager) objH6, 26);
                r40.d dVar3 = new r40.d();
                Object objH7 = t1.H(1000L, f.f20923b);
                if (objH7 instanceof p) {
                    objH7 = null;
                }
                i iVar = new i((MediaCodecList) objH7, i13);
                Object objH8 = t1.H(1000L, new e(context, 4));
                if (objH8 instanceof p) {
                    objH8 = null;
                }
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) objH8;
                Object objH9 = t1.H(1000L, new e(context, 5));
                if (objH9 instanceof p) {
                    objH9 = null;
                }
                k8.d dVar4 = new k8.d(2, devicePolicyManager, (KeyguardManager) objH9);
                Object objH10 = t1.H(1000L, new e(context, 12));
                if (objH10 instanceof p) {
                    objH10 = null;
                }
                o oVar = new o((PackageManager) objH10, 0);
                Object objH11 = t1.H(1000L, new e(context, 14));
                if (objH11 instanceof p) {
                    objH11 = null;
                }
                se.d dVar5 = new se.d((ContentResolver) objH11, 27);
                Object objH12 = t1.H(1000L, new e(context, 1));
                if (objH12 instanceof p) {
                    objH12 = null;
                }
                RingtoneManager ringtoneManager = (RingtoneManager) objH12;
                Object objH13 = t1.H(1000L, new e(context, 2));
                if (objH13 instanceof p) {
                    objH13 = null;
                }
                AssetManager assetManager = (AssetManager) objH13;
                Object objH14 = t1.H(1000L, new e(context, 3));
                if (objH14 instanceof p) {
                    objH14 = null;
                }
                j30.g gVar = new j30.g(ringtoneManager, assetManager, (Configuration) objH14, 8);
                Object objH15 = t1.H(1000L, new f(0, 2));
                if (objH15 instanceof p) {
                    objH15 = null;
                }
                a0.e eVar2 = new a0.e(eVar, dVar, bVar, fVar, bVar2, fVar2, dVar2, dVar3, iVar, dVar4, oVar, dVar5, gVar, new jb.b((z6.a) objH15));
                Object objH16 = t1.H(1000L, new e(context, 8));
                if (objH16 instanceof p) {
                    objH16 = null;
                }
                se.b bVar3 = new se.b((ContentResolver) objH16, 24);
                Object objH17 = t1.H(1000L, new e(context, 0));
                i iVar2 = new i((ContentResolver) (objH17 instanceof p ? null : objH17), 18);
                n20.f fVar3 = new n20.f(19);
                q2 q2Var = new q2();
                q2Var.f48333a = bVar3;
                q2Var.f48334b = iVar2;
                q2Var.f48335c = fVar3;
                q2Var.f48336d = l.b(new iy.b(q2Var, 1));
                q2Var.f48337e = l.b(new iy.b(q2Var, 0));
                q2Var.f48338f = l.b(new iy.b(q2Var, 2));
                return new h(eVar2, q2Var);
            case 7:
                Object systemService3 = context.getSystemService("activity");
                systemService3.getClass();
                return (ActivityManager) systemService3;
            case 8:
                ContentResolver contentResolver2 = context.getContentResolver();
                contentResolver2.getClass();
                return contentResolver2;
            case 9:
                Object systemService4 = context.getSystemService("input");
                systemService4.getClass();
                return (InputManager) systemService4;
            case 10:
                Object systemService5 = context.getSystemService("activity");
                systemService5.getClass();
                return (ActivityManager) systemService5;
            case 11:
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    if (!externalFilesDir.canRead()) {
                        externalFilesDir = null;
                    }
                    if (externalFilesDir != null) {
                        String absolutePath = externalFilesDir.getAbsolutePath();
                        absolutePath.getClass();
                        statFs = new StatFs(absolutePath);
                    }
                }
                statFs.getClass();
                return statFs;
            case 12:
                PackageManager packageManager = context.getPackageManager();
                packageManager.getClass();
                return packageManager;
            case 13:
                Object systemService6 = context.getSystemService("sensor");
                systemService6.getClass();
                return (SensorManager) systemService6;
            default:
                ContentResolver contentResolver3 = context.getContentResolver();
                contentResolver3.getClass();
                return contentResolver3;
        }
    }
}
