package lh;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.internal.Intrinsics;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BasicItem f27789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f27791g;

    public f(BasicItem basicItem, int i11, String str) {
        basicItem.getClass();
        this.f27789e = basicItem;
        this.f27790f = i11;
        this.f27791g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f27789e, fVar.f27789e) && this.f27790f == fVar.f27790f && Intrinsics.areEqual(this.f27791g, fVar.f27791g);
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f27790f, this.f27789e.hashCode() * 31, 31);
        String str = this.f27791g;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackImpression(item=");
        sb2.append(this.f27789e);
        sb2.append(", index=");
        sb2.append(this.f27790f);
        sb2.append(", fillerType=");
        return r8.k.p(sb2, this.f27791g, ")");
    }
}
