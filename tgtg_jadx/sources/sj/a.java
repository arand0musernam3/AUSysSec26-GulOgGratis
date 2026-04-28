package sj;

import f70.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39039b;

    public a(int i11, boolean z11) {
        this.f39038a = i11;
        this.f39039b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f39038a == aVar.f39038a && this.f39039b == aVar.f39039b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39039b) + (Integer.hashCode(this.f39038a) * 31);
    }

    public final String toString() {
        return "GoToLoginScreen(message=" + this.f39038a + ", clearAuthPolling=" + this.f39039b + ")";
    }
}
