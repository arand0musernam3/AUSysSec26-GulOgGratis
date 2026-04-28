package c5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements b5.e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Float f7163c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f7164d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j5.k f7165e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j5.k f7166f = null;

    public d3(int i11, ArrayList arrayList) {
        this.f7161a = i11;
        this.f7162b = arrayList;
    }

    @Override // b5.e2
    public final boolean p() {
        return this.f7162b.contains(this);
    }
}
