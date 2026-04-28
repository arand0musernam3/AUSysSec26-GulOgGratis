package mg;

import com.app.tgtg.model.remote.OrderId;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f29929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f29931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f29933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f29935h;

    public a(String str, j jVar, String str2, String str3, boolean z11, boolean z12, int i11) {
        z11 = (i11 & 32) != 0 ? true : z11;
        str.getClass();
        jVar.getClass();
        this.f29928a = str;
        this.f29929b = jVar;
        this.f29930c = str2;
        this.f29931d = null;
        this.f29932e = str3;
        this.f29933f = z11;
        this.f29934g = false;
        this.f29935h = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return OrderId.m213equalsimpl0(this.f29928a, aVar.f29928a) && this.f29929b == aVar.f29929b && Intrinsics.areEqual(this.f29930c, aVar.f29930c) && Intrinsics.areEqual(this.f29931d, aVar.f29931d) && Intrinsics.areEqual(this.f29932e, aVar.f29932e) && this.f29933f == aVar.f29933f && this.f29934g == aVar.f29934g && this.f29935h == aVar.f29935h;
    }

    public final int hashCode() {
        int iHashCode = (this.f29929b.hashCode() + (OrderId.m214hashCodeimpl(this.f29928a) * 31)) * 31;
        String str = this.f29930c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f29931d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f29932e;
        return Boolean.hashCode(this.f29935h) + k.e(k.e((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f29933f), 31, this.f29934g);
    }

    public final String toString() {
        String strM215toStringimpl = OrderId.m215toStringimpl(this.f29928a);
        j jVar = this.f29929b;
        Integer num = this.f29931d;
        String str = this.f29932e;
        boolean z11 = this.f29934g;
        StringBuilder sb2 = new StringBuilder("NpsItem(orderId=");
        sb2.append(strM215toStringimpl);
        sb2.append(", viewState=");
        sb2.append(jVar);
        sb2.append(", itemName=");
        sb2.append(this.f29930c);
        sb2.append(", rating=");
        sb2.append(num);
        sb2.append(", feedback=");
        k.z(sb2, str, ", showItemName=", this.f29933f, ", itemShown=");
        sb2.append(z11);
        sb2.append(", isMultiItem=");
        sb2.append(this.f29935h);
        sb2.append(")");
        return sb2.toString();
    }
}
