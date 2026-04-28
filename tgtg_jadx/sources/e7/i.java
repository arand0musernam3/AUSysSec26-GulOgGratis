package e7;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f15832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15837f;

    public i(String str, String str2) {
        this.f15832a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f15833b = 0;
        this.f15834c = 400;
        this.f15835d = false;
        this.f15836e = str2;
        this.f15837f = 0;
    }

    public i(Uri uri, int i11, int i12, boolean z11, String str, int i13) {
        uri.getClass();
        this.f15832a = uri;
        this.f15833b = i11;
        this.f15834c = i12;
        this.f15835d = z11;
        this.f15836e = str;
        this.f15837f = i13;
    }
}
