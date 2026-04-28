package gi;

import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharityIdError f20473b;

    public d(String str, CharityIdError charityIdError) {
        str.getClass();
        charityIdError.getClass();
        this.f20472a = str;
        this.f20473b = charityIdError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f20472a, dVar.f20472a) && this.f20473b == dVar.f20473b;
    }

    public final int hashCode() {
        return this.f20473b.hashCode() + (this.f20472a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(charityId=" + this.f20472a + ", error=" + this.f20473b + ")";
    }
}
