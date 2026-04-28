package le;

import b5.h1;
import c5.l3;
import c5.o2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lle/l;", "Lb5/h1;", "Lle/m;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class l extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f27739c;

    public l(int i11, int i12) {
        this.f27738b = i11;
        this.f27739c = i12;
    }

    @Override // b5.h1
    public final b4.s create() {
        m mVar = new m();
        mVar.f27740o = this.f27738b;
        mVar.f27741p = this.f27739c;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f27738b == lVar.f27738b && this.f27739c == lVar.f27739c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27739c) + (Integer.hashCode(this.f27738b) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "Lottie Size";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(Integer.valueOf(this.f27738b), "width");
        l3Var.b(Integer.valueOf(this.f27739c), "height");
    }

    public final String toString() {
        return r8.k.g(this.f27738b, this.f27739c, "LottieAnimationSizeElement(width=", ", height=", ")");
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        m mVar = (m) sVar;
        mVar.getClass();
        mVar.f27740o = this.f27738b;
        mVar.f27741p = this.f27739c;
    }
}
