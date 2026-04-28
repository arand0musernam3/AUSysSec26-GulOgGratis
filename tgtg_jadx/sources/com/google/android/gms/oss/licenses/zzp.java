package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import b9.a;
import c9.e;
import com.google.android.gms.common.internal.i0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends Fragment implements a {
    private ListView zza;
    private ArrayAdapter zzb;
    private zzd zzc;
    private String zzd;
    private zze zze;
    private Context zzf;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.zzf = context;
        this.zze = zze.zza(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            this.zzd = arguments.getString("license_activity_package_name");
        }
        if (this.zzd == null) {
            this.zzd = this.zzf.getPackageName();
        }
        this.zzc = zze.zzb(this.zzf, this.zzd);
    }

    @Override // b9.a
    public final e onCreateLoader(int i11, Bundle bundle) {
        return new zzm(this.zzf, this.zze);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzd zzdVar = this.zzc;
        return layoutInflater.inflate(zzdVar.zza.getIdentifier("license_menu_fragment", "layout", zzdVar.zzb), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        o0 activity = getActivity();
        if (activity != null) {
            activity.getSupportLoaderManager().a();
        }
    }

    @Override // b9.a
    public final /* bridge */ /* synthetic */ void onLoadFinished(e eVar, Object obj) {
        this.zzb.clear();
        this.zzb.addAll((List) obj);
        this.zzb.notifyDataSetChanged();
    }

    @Override // b9.a
    public final void onLoaderReset(e eVar) {
        this.zzb.clear();
        this.zzb.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        o0 activity = getActivity();
        i0.h(activity);
        activity.getSupportLoaderManager().c(54321, this);
        zzd zzdVar = this.zzc;
        this.zza = (ListView) view.findViewById(zzdVar.zza.getIdentifier("license_list", "id", zzdVar.zzb));
        zzo zzoVar = new zzo(this, activity);
        this.zzb = zzoVar;
        this.zza.setAdapter((ListAdapter) zzoVar);
        this.zza.setOnItemClickListener(new zzn(this));
    }

    public final /* synthetic */ zzd zza() {
        return this.zzc;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzf;
    }
}
