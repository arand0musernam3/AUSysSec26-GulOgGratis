package th;

import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.response.CateringItem;
import f70.h;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CateringItem f40179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40182d;

    public a(CateringItem cateringItem, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f40179a = cateringItem;
        this.f40180b = AppConstants.RETURN_URL_CATERING_ADYEN;
        this.f40181c = str;
        this.f40182d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f40179a, aVar.f40179a) && Intrinsics.areEqual(this.f40180b, aVar.f40180b) && Intrinsics.areEqual(this.f40181c, aVar.f40181c) && this.f40182d == aVar.f40182d;
    }

    public final int hashCode() {
        int iB = l1.b(this.f40179a.hashCode() * 31, 31, this.f40180b);
        String str = this.f40181c;
        return Long.hashCode(this.f40182d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "GoToCheckout(item=" + this.f40179a + ", returnUrl=" + this.f40180b + ", fillerType=" + this.f40181c + ", timestamp=" + this.f40182d + ")";
    }
}
