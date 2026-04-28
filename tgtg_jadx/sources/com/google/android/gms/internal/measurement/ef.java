package com.google.android.gms.internal.measurement;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ef extends bf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sf f11392f;

    public ef(String str, bf bfVar, sf sfVar, xf xfVar) {
        super(str, bfVar, xfVar);
        na0.a.Y(sfVar.f11858c);
        this.f11392f = sfVar;
    }

    @Override // com.google.android.gms.internal.measurement.yf
    public final sf d() {
        return sf.a(this.f11392f, l());
    }

    public ef(String str, UUID uuid, String str2, sf sfVar, xf xfVar) {
        super(str, uuid, str2, xfVar);
        na0.a.Y(sfVar.f11858c);
        this.f11392f = sfVar;
    }
}
