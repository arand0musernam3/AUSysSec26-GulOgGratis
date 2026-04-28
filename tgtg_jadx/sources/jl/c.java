package jl;

import com.app.tgtg.model.remote.user.response.Address;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import op.l;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Address f25302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f25304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f25306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f25307i;

    public /* synthetic */ c(b bVar, int i11, String str, boolean z11, l lVar, int i12) {
        this((i12 & 1) != 0 ? b.NONE : bVar, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? "" : str, null, (i12 & 16) != 0 ? false : z11, false, false, (i12 & 128) != 0 ? null : lVar, new ArrayList());
    }

    public static c a(c cVar, b bVar, Address address, boolean z11, boolean z12, boolean z13, l lVar, List list, int i11) {
        if ((i11 & 1) != 0) {
            bVar = cVar.f25299a;
        }
        b bVar2 = bVar;
        int i12 = cVar.f25300b;
        String str = cVar.f25301c;
        if ((i11 & 8) != 0) {
            address = cVar.f25302d;
        }
        Address address2 = address;
        boolean z14 = (i11 & 16) != 0 ? cVar.f25303e : z11;
        boolean z15 = (i11 & 32) != 0 ? cVar.f25304f : z12;
        boolean z16 = (i11 & 64) != 0 ? cVar.f25305g : z13;
        l lVar2 = (i11 & 128) != 0 ? cVar.f25306h : lVar;
        List list2 = (i11 & 256) != 0 ? cVar.f25307i : list;
        bVar2.getClass();
        str.getClass();
        list2.getClass();
        return new c(bVar2, i12, str, address2, z14, z15, z16, lVar2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25299a == cVar.f25299a && this.f25300b == cVar.f25300b && Intrinsics.areEqual(this.f25301c, cVar.f25301c) && Intrinsics.areEqual(this.f25302d, cVar.f25302d) && this.f25303e == cVar.f25303e && this.f25304f == cVar.f25304f && this.f25305g == cVar.f25305g && Intrinsics.areEqual(this.f25306h, cVar.f25306h) && Intrinsics.areEqual(this.f25307i, cVar.f25307i);
    }

    public final int hashCode() {
        int iB = l1.b(k.b(this.f25300b, this.f25299a.hashCode() * 31, 31), 31, this.f25301c);
        Address address = this.f25302d;
        int iE = k.e(k.e(k.e((iB + (address == null ? 0 : address.hashCode())) * 31, 31, this.f25303e), 31, this.f25304f), 31, this.f25305g);
        l lVar = this.f25306h;
        return this.f25307i.hashCode() + ((iE + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationOptionItem(id=");
        sb2.append(this.f25299a);
        sb2.append(", icon=");
        sb2.append(this.f25300b);
        sb2.append(", label=");
        sb2.append(this.f25301c);
        sb2.append(", annotatedAddress=");
        sb2.append(this.f25302d);
        sb2.append(", isAdded=");
        b3.i.C(sb2, this.f25303e, ", isSelected=", this.f25304f, ", isClicked=");
        sb2.append(this.f25305g);
        sb2.append(", selectedStation=");
        sb2.append(this.f25306h);
        sb2.append(", stationList=");
        return e0.f.p(sb2, this.f25307i, ")");
    }

    public c(b bVar, int i11, String str, Address address, boolean z11, boolean z12, boolean z13, l lVar, List list) {
        bVar.getClass();
        str.getClass();
        this.f25299a = bVar;
        this.f25300b = i11;
        this.f25301c = str;
        this.f25302d = address;
        this.f25303e = z11;
        this.f25304f = z12;
        this.f25305g = z13;
        this.f25306h = lVar;
        this.f25307i = list;
    }
}
