package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Objects;
import o00.v1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzo extends ArrayAdapter {
    final /* synthetic */ zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzp zzpVar, Context context) {
        super(context, zze.zzg(zzpVar.zza()), zze.zzh(zzpVar.zza()), new ArrayList());
        Objects.requireNonNull(zzpVar);
        this.zza = zzpVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            zzp zzpVar = this.zza;
            LayoutInflater layoutInflater = zzpVar.getLayoutInflater();
            zzd zzdVarZza = zzpVar.zza();
            view = layoutInflater.inflate((XmlPullParser) zzdVarZza.zza.getXml(zze.zzg(zzdVarZza)), viewGroup, false);
        }
        v1 v1Var = (v1) getItem(i11);
        if (v1Var != null) {
            ((TextView) view.findViewById(zze.zzh(this.zza.zza()))).setText(v1Var.f31757a);
        }
        return view;
    }
}
