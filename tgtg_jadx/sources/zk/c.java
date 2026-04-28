package zk;

import com.app.tgtg.model.remote.user.response.Address;
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
    public final String f47959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f47960b;

    public /* synthetic */ c(int i11, String str, Address address) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, a.f47958a.getDescriptor());
            throw null;
        }
        this.f47959a = str;
        this.f47960b = address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f47959a, cVar.f47959a) && Intrinsics.areEqual(this.f47960b, cVar.f47960b);
    }

    public final int hashCode() {
        return this.f47960b.hashCode() + (this.f47959a.hashCode() * 31);
    }

    public final String toString() {
        return "UserPointOfInterest(type=" + this.f47959a + ", address=" + this.f47960b + ")";
    }

    public c(String str, Address address) {
        str.getClass();
        this.f47959a = str;
        this.f47960b = address;
    }
}
