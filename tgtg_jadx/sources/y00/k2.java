package y00;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f44890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f44892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f44893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f44894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f44895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f44896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f44897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t2 f44898i;

    public k2(t2 t2Var, String str, String str2, long j9, long j11, Bundle bundle, boolean z11, boolean z12, boolean z13) {
        this.f44890a = str;
        this.f44891b = str2;
        this.f44892c = j9;
        this.f44893d = j11;
        this.f44894e = bundle;
        this.f44895f = z11;
        this.f44896g = z12;
        this.f44897h = z13;
        this.f44898i = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f44898i.y(this.f44890a, this.f44891b, this.f44892c, this.f44893d, this.f44894e, this.f44895f, this.f44896g, this.f44897h);
    }
}
