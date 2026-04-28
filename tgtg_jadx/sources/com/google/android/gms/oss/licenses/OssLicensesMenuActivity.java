package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import java.io.IOException;
import java.io.InputStream;
import k.h;
import org.bouncycastle.i18n.MessageBundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class OssLicensesMenuActivity extends h {
    private static String zza;
    private boolean zzb;
    private zze zzc;

    @Deprecated
    public static void setActivityTitle(@NonNull String str) {
        zza = str;
    }

    public static boolean zza(@NonNull Context context, @NonNull String str) {
        InputStream inputStreamOpenRawResource = null;
        try {
            Resources resources = context.getResources();
            inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.license_list)));
            boolean z11 = inputStreamOpenRawResource.available() > 0;
            try {
                inputStreamOpenRawResource.close();
            } catch (IOException unused) {
            }
            return z11;
        } catch (Resources.NotFoundException | IOException unused2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th2) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzc = zze.zza(this);
        zza.zza(this);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity);
        boolean z11 = false;
        if (zza(this, "third_party_licenses") && zza(this, "third_party_license_metadata")) {
            z11 = true;
        }
        this.zzb = z11;
        if (zza == null) {
            Intent intent = getIntent();
            if (intent.hasExtra(MessageBundle.TITLE_ENTRY)) {
                zza = intent.getStringExtra(MessageBundle.TITLE_ENTRY);
                Log.w("OssLicensesMenuActivity", "The intent based title is deprecated. Use OssLicensesMenuActivity.setActivityTitle(title) instead.");
            }
        }
        String str = zza;
        if (str != null) {
            setTitle(str);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().n(true);
        }
        String strZzd = this.zzc.zzd(getPackageName());
        zzd zzdVarZzb = zze.zzb(this, strZzd);
        if (!this.zzb) {
            if (bundle == null) {
                zze.zza(this);
                int iZzf = zze.zzf(zzdVarZzb);
                if (((zzc) getSupportFragmentManager().findFragmentById(iZzf)) == null) {
                    zzc zzcVar = new zzc();
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    a aVar = new a(supportFragmentManager);
                    aVar.e(iZzf, zzcVar, null, 1);
                    aVar.j();
                    return;
                }
                return;
            }
            return;
        }
        if (bundle == null) {
            zze.zza(this);
            int iZzf2 = zze.zzf(zzdVarZzb);
            if (((zzp) getSupportFragmentManager().findFragmentById(iZzf2)) == null) {
                zzp zzpVar = new zzp();
                if (strZzd != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("license_activity_package_name", strZzd);
                    zzpVar.setArguments(bundle2);
                }
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                supportFragmentManager2.getClass();
                a aVar2 = new a(supportFragmentManager2);
                aVar2.e(iZzf2, zzpVar, null, 1);
                aVar2.j();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
