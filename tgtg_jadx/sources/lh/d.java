package lh;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.jvm.internal.Intrinsics;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BasicItem f27781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f27782f;

    public d(BasicItem basicItem, String str) {
        basicItem.getClass();
        this.f27781e = basicItem;
        this.f27782f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f27781e, dVar.f27781e) && Intrinsics.areEqual(this.f27782f, dVar.f27782f);
    }

    public final int hashCode() {
        int iHashCode = this.f27781e.hashCode() * 31;
        String str = this.f27782f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ItemClick(item=" + this.f27781e + ", fillerType=" + this.f27782f + ")";
    }
}
