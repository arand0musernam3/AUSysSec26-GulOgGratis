package el;

import f70.h;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16077b;

    public a(boolean z11, boolean z12) {
        this.f16076a = z11;
        this.f16077b = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16076a == aVar.f16076a && this.f16077b == aVar.f16077b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16077b) + k.e(Boolean.hashCode(true) * 31, 31, this.f16076a);
    }

    public final String toString() {
        return "GoToCookies(isFromAppStart=true, isFromDeepLink=" + this.f16076a + ", isLoggedIn=" + this.f16077b + ")";
    }
}
