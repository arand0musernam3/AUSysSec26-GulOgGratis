package vm;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasketResponse f42422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BasketManager f42424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42425d;

    public b(BasketResponse basketResponse, List list, BasketManager basketManager, int i11) {
        this.f42422a = basketResponse;
        this.f42423b = list;
        this.f42424c = basketManager;
        this.f42425d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f42422a, bVar.f42422a) && Intrinsics.areEqual(this.f42423b, bVar.f42423b) && Intrinsics.areEqual(this.f42424c, bVar.f42424c) && this.f42425d == bVar.f42425d;
    }

    public final int hashCode() {
        BasketResponse basketResponse = this.f42422a;
        int iHashCode = (basketResponse == null ? 0 : basketResponse.hashCode()) * 31;
        List list = this.f42423b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BasketManager basketManager = this.f42424c;
        return Integer.hashCode(this.f42425d) + ((iHashCode2 + (basketManager != null ? basketManager.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BasketMule(basketResponse=" + this.f42422a + ", elementList=" + this.f42423b + ", basketManager=" + this.f42424c + ", maxItemLimit=" + this.f42425d + ")";
    }
}
