package p4;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f34277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f34278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f34279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f34280j;

    public d(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, int i11) {
        str = (i11 & 1) != 0 ? "" : str;
        f11 = (i11 & 2) != 0 ? 0.0f : f11;
        f12 = (i11 & 4) != 0 ? 0.0f : f12;
        f13 = (i11 & 8) != 0 ? 0.0f : f13;
        f14 = (i11 & 16) != 0 ? 1.0f : f14;
        f15 = (i11 & 32) != 0 ? 1.0f : f15;
        f16 = (i11 & 64) != 0 ? 0.0f : f16;
        f17 = (i11 & 128) != 0 ? 0.0f : f17;
        list = (i11 & 256) != 0 ? h0.f34349a : list;
        ArrayList arrayList = new ArrayList();
        this.f34271a = str;
        this.f34272b = f11;
        this.f34273c = f12;
        this.f34274d = f13;
        this.f34275e = f14;
        this.f34276f = f15;
        this.f34277g = f16;
        this.f34278h = f17;
        this.f34279i = list;
        this.f34280j = arrayList;
    }
}
