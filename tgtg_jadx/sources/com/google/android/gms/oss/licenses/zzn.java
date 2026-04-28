package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import java.util.Objects;
import o00.v1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzn implements AdapterView.OnItemClickListener {
    final /* synthetic */ zzp zza;

    public zzn(zzp zzpVar) {
        Objects.requireNonNull(zzpVar);
        this.zza = zzpVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        v1 v1Var = (v1) adapterView.getItemAtPosition(i11);
        zzp zzpVar = this.zza;
        Intent intent = new Intent(zzpVar.zzb(), (Class<?>) OssLicensesActivity.class);
        intent.putExtra("license", v1Var);
        zzpVar.startActivity(intent);
    }
}
