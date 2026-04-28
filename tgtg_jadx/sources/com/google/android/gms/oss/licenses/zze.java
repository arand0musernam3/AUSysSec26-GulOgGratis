package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ky.o;
import o00.l1;
import o00.t1;
import o00.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zze {
    private static zze zza;
    private zzk zzb;
    private final Context zzc;

    private zze(Context context) {
        this.zzc = context.getApplicationContext();
    }

    public static zze zza(Context context) {
        if (zza == null) {
            zze zzeVar = new zze(context);
            zza = zzeVar;
            zzeVar.zzb = new zzk(zzeVar.zzc);
        }
        return zza;
    }

    public static zzd zzb(Context context, String str) {
        try {
            return new zzd(context.getPackageManager().getResourcesForApplication(str), str, null);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 52);
            sb2.append("Unable to get resources for ");
            sb2.append(str);
            sb2.append(", using local resources.");
            Log.w("OssLicenses", sb2.toString());
            return new zzd(context.getResources(), context.getPackageName(), null);
        }
    }

    public static final int zzf(zzd zzdVar) {
        return zzdVar.zza.getIdentifier("license_fragment_container", "id", zzdVar.zzb);
    }

    public static final int zzg(zzd zzdVar) {
        return zzdVar.zza.getIdentifier("libraries_social_licenses_license", "layout", zzdVar.zzb);
    }

    public static final int zzh(zzd zzdVar) {
        return zzdVar.zza.getIdentifier("license", "id", zzdVar.zzb);
    }

    public final zzk zzc() {
        return this.zzb;
    }

    public final String zzd(String str) {
        try {
            zzk zzkVar = this.zzb;
            Task taskDoRead = zzkVar.doRead(new zzh(zzkVar, str));
            t1 t1Var = new t1();
            t1Var.f31746h = taskDoRead;
            taskDoRead.c(l1.zza, new o(t1Var, 7));
            return (String) t1Var.get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            Log.w("OssLicenses", "Failed to get package name from OssLicensesClient", e5);
            return str;
        }
    }

    public final String zze(v1 v1Var) {
        try {
            zzk zzkVar = this.zzb;
            Task taskDoRead = zzkVar.doRead(new zzi(zzkVar, v1Var));
            t1 t1Var = new t1();
            t1Var.f31746h = taskDoRead;
            taskDoRead.c(l1.zza, new o(t1Var, 7));
            return (String) t1Var.get(2L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            Log.w("OssLicenses", "Failed to get license detail from OssLicensesClient", e5);
            return "";
        }
    }
}
