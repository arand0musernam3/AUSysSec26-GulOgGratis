package xo;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import z5.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseItemMnuV2 f44473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f44476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f44477e;

    public a(BaseItemMnuV2 baseItemMnuV2, boolean z11, boolean z12, float f11, Function1 function1) {
        function1.getClass();
        this.f44473a = baseItemMnuV2;
        this.f44474b = z11;
        this.f44475c = z12;
        this.f44476d = f11;
        this.f44477e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f44473a, aVar.f44473a) && this.f44474b == aVar.f44474b && this.f44475c == aVar.f44475c && f.c(this.f44476d, aVar.f44476d) && Intrinsics.areEqual(this.f44477e, aVar.f44477e);
    }

    public final int hashCode() {
        BaseItemMnuV2 baseItemMnuV2 = this.f44473a;
        return this.f44477e.hashCode() + k.a(k.e(k.e((baseItemMnuV2 == null ? 0 : baseItemMnuV2.hashCode()) * 31, 31, this.f44474b), 31, this.f44475c), this.f44476d, 31);
    }

    public final String toString() {
        return "RecommendationState(item=" + this.f44473a + ", showRecommendation=" + this.f44474b + ", showManufacturerItems=" + this.f44475c + ", cardMeasuredHeight=" + f.d(this.f44476d) + ", onHeightMeasured=" + this.f44477e + ")";
    }
}
