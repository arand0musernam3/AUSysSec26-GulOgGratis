package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ec extends fc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile String f11384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11385f;

    public ec(String str, rc rcVar, String str2) {
        super(str, rcVar);
        this.f11385f = str2;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object a() {
        return this.f11385f;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object c(Object obj) {
        return (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object d() {
        return this.f11384e;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ void e(Object obj) {
        this.f11384e = (String) obj;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* bridge */ /* synthetic */ Object b(String str) {
        return str;
    }
}
