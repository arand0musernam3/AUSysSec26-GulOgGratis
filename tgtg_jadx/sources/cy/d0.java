package cy;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax.b f13495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax.l f13496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f13497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f13498d;

    public d0(ax.b bVar, ax.l lVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.f13495a = bVar;
        this.f13496b = lVar;
        this.f13497c = linkedHashSet;
        this.f13498d = linkedHashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.f13495a, d0Var.f13495a) && Intrinsics.areEqual(this.f13496b, d0Var.f13496b) && Intrinsics.areEqual(this.f13497c, d0Var.f13497c) && Intrinsics.areEqual(this.f13498d, d0Var.f13498d);
    }

    public final int hashCode() {
        int iHashCode = this.f13495a.hashCode() * 31;
        ax.l lVar = this.f13496b;
        return this.f13498d.hashCode() + ((this.f13497c.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f13495a + ", authenticationToken=" + this.f13496b + ", recentlyGrantedPermissions=" + this.f13497c + ", recentlyDeniedPermissions=" + this.f13498d + ')';
    }
}
