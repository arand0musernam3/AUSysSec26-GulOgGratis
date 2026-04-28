package cn;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseItemMnuV2 f8473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BasketManager f8478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8479g;

    public b(BaseItemMnuV2 baseItemMnuV2, int i11, boolean z11, int i12, boolean z12, BasketManager basketManager, boolean z13) {
        baseItemMnuV2.getClass();
        this.f8473a = baseItemMnuV2;
        this.f8474b = i11;
        this.f8475c = z11;
        this.f8476d = i12;
        this.f8477e = z12;
        this.f8478f = basketManager;
        this.f8479g = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f8473a, bVar.f8473a) && this.f8474b == bVar.f8474b && this.f8475c == bVar.f8475c && this.f8476d == bVar.f8476d && this.f8477e == bVar.f8477e && Intrinsics.areEqual(this.f8478f, bVar.f8478f) && this.f8479g == bVar.f8479g;
    }

    public final int hashCode() {
        int iE = r8.k.e(r8.k.b(this.f8476d, r8.k.e(r8.k.b(this.f8474b, this.f8473a.hashCode() * 31, 31), 31, this.f8475c), 31), 31, this.f8477e);
        BasketManager basketManager = this.f8478f;
        return Boolean.hashCode(this.f8479g) + ((iE + (basketManager == null ? 0 : basketManager.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CountButtonMule(item=");
        sb2.append(this.f8473a);
        sb2.append(", tempQuantity=");
        sb2.append(this.f8474b);
        sb2.append(", isCountExpanded=");
        sb2.append(this.f8475c);
        sb2.append(", maxItemLimit=");
        sb2.append(this.f8476d);
        sb2.append(", shouldActivateBasketFeature=");
        sb2.append(this.f8477e);
        sb2.append(", basketManager=");
        sb2.append(this.f8478f);
        sb2.append(", isRoundButtonDesign=");
        return j4.s.o(sb2, this.f8479g, ")");
    }
}
