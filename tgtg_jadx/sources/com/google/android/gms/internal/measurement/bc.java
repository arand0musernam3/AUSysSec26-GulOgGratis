package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class bc extends fc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f11286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11287f;

    public bc(String str, rc rcVar, boolean z11) {
        super(str, rcVar);
        this.f11287f = z11;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.f11287f);
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.f11286e);
    }

    @Override // com.google.android.gms.internal.measurement.fc
    public final /* synthetic */ void e(Object obj) {
        this.f11286e = ((Boolean) obj).booleanValue();
    }
}
