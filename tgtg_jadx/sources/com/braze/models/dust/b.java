package com.braze.models.dust;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f10140c = f.DISCONNECT_AND_RETRY;

    public b(long j9, String str) {
        this.f10138a = j9;
        this.f10139b = str;
    }

    @Override // com.braze.models.dust.g
    public final f a() {
        return this.f10140c;
    }
}
