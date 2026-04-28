package g9;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f20250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f20251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20255f;

    public y(z zVar, Bundle bundle, boolean z11, int i11, boolean z12, int i12) {
        this.f20250a = zVar;
        this.f20251b = bundle;
        this.f20252c = z11;
        this.f20253d = i11;
        this.f20254e = z12;
        this.f20255f = i12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(y yVar) {
        yVar.getClass();
        boolean z11 = this.f20252c;
        if (z11 && !yVar.f20252c) {
            return 1;
        }
        if (!z11 && yVar.f20252c) {
            return -1;
        }
        int i11 = yVar.f20253d;
        boolean z12 = yVar.f20254e;
        Bundle bundle = yVar.f20251b;
        int i12 = this.f20253d - i11;
        if (i12 > 0) {
            return 1;
        }
        if (i12 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f20251b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            bundle2.getClass();
            int size = bundle2.size();
            bundle.getClass();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z13 = this.f20254e;
        if (z13 && !z12) {
            return 1;
        }
        if (z13 || !z12) {
            return this.f20255f - yVar.f20255f;
        }
        return -1;
    }
}
