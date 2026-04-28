package com.google.android.gms.oss.licenses;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzf implements Runnable {
    final /* synthetic */ OssLicensesActivity zza;

    public zzf(OssLicensesActivity ossLicensesActivity) {
        Objects.requireNonNull(ossLicensesActivity);
        this.zza = ossLicensesActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OssLicensesActivity ossLicensesActivity = this.zza;
        ossLicensesActivity.zza().scrollTo(0, ossLicensesActivity.zzb().getLayout().getLineTop(ossLicensesActivity.zzb().getLayout().getLineForOffset(ossLicensesActivity.zzc())));
    }
}
