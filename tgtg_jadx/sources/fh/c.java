package fh;

import com.app.tgtg.model.remote.item.LatLngInfo;
import i90.h;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LatLngInfo f17742b;

    public /* synthetic */ c(int i11, String str, LatLngInfo latLngInfo) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, a.f17740a.getDescriptor());
            throw null;
        }
        this.f17741a = str;
        if ((i11 & 2) == 0) {
            this.f17742b = null;
        } else {
            this.f17742b = latLngInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f17741a, cVar.f17741a) && Intrinsics.areEqual(this.f17742b, cVar.f17742b);
    }

    public final int hashCode() {
        int iHashCode = this.f17741a.hashCode() * 31;
        LatLngInfo latLngInfo = this.f17742b;
        return iHashCode + (latLngInfo == null ? 0 : latLngInfo.hashCode());
    }

    public final String toString() {
        return "UserBadgeDetailsRequest(userBadgeId=" + this.f17741a + ", origin=" + this.f17742b + ")";
    }

    public c(String str, LatLngInfo latLngInfo) {
        str.getClass();
        this.f17741a = str;
        this.f17742b = latLngInfo;
    }
}
