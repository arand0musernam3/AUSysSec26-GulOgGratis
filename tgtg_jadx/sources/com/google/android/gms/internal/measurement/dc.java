package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class dc extends fc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f11346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11347f;

    public dc(String str, rc rcVar, long j9) {
        super(str, rcVar);
        this.f11347f = j9;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object a() {
        return Long.valueOf(this.f11347f);
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object d() {
        return Long.valueOf(this.f11346e);
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ void e(Object obj) {
        this.f11346e = ((Long) obj).longValue();
    }
}
