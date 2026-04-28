package com.google.android.gms.oss.licenses;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import k.h;
import o00.v1;
import pd.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class OssLicensesActivity extends h {
    zzd zza;
    private v1 zzb;
    private String zzc = "";
    private ScrollView zzd = null;
    private TextView zze = null;
    private int zzf = 0;
    private zze zzg;

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        OssLicensesActivity ossLicensesActivity;
        super.onCreate(bundle);
        zza.zza(this);
        setContentView(R.layout.libraries_social_licenses_license_activity);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        this.zze = textView;
        textView.setText(getString(R.string.license_is_loading));
        this.zzg = zze.zza(this);
        this.zzb = (v1) getIntent().getParcelableExtra("license");
        if (getSupportActionBar() != null) {
            getSupportActionBar().r(this.zzb.f31757a);
            getSupportActionBar().o();
            getSupportActionBar().n(true);
            getSupportActionBar().p();
        }
        zzd zzdVarZzb = zze.zzb(this, this.zzg.zzd(getPackageName()));
        this.zza = zzdVarZzb;
        this.zzd = (ScrollView) findViewById(zzdVarZzb.zza.getIdentifier("license_activity_scrollview", "id", zzdVarZzb.zzb));
        zzd zzdVar = this.zza;
        this.zze = (TextView) findViewById(zzdVar.zza.getIdentifier("license_activity_textview", "id", zzdVar.zzb));
        String strZze = this.zzg.zze(this.zzb);
        this.zzc = strZze;
        if (strZze == null || strZze.isEmpty()) {
            v1 v1Var = this.zzb;
            ossLicensesActivity = this;
            ossLicensesActivity.zzc = g.P(ossLicensesActivity, "third_party_licenses", v1Var.f31758b, v1Var.f31759c, R.raw.keep_third_party_licenses);
        } else {
            ossLicensesActivity = this;
        }
        if (ossLicensesActivity.zzc == null) {
            ossLicensesActivity.zzc = getString(R.string.license_content_error);
        }
        ossLicensesActivity.zze.setText(ossLicensesActivity.zzc);
        if (ossLicensesActivity.zzf == 0) {
            return;
        }
        ossLicensesActivity.zzd.post(new zzf(this));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.zzf = bundle.getInt("scroll_pos");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TextView textView = this.zze;
        if (textView == null || this.zzd == null) {
            return;
        }
        bundle.putInt("scroll_pos", this.zze.getLayout().getLineStart(textView.getLayout().getLineForVertical(this.zzd.getScrollY())));
    }

    public final /* synthetic */ ScrollView zza() {
        return this.zzd;
    }

    public final /* synthetic */ TextView zzb() {
        return this.zze;
    }

    public final /* synthetic */ int zzc() {
        return this.zzf;
    }
}
