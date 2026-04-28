package e0;

import com.adyen.checkout.components.core.Address;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f15375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f15378j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f15379k;
    public final List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f15380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w0 f15381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f15382o;

    public n(String str, List list, List list2, ArrayList arrayList, d0 d0Var, int i11, LinkedHashMap linkedHashMap, int i12, v70.i iVar, List list3, List list4, p pVar) {
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        w0 w0Var = new w0();
        str.getClass();
        list.getClass();
        list2.getClass();
        iVar.getClass();
        list3.getClass();
        list4.getClass();
        this.f15369a = str;
        this.f15370b = list;
        this.f15371c = list2;
        this.f15372d = arrayList;
        this.f15373e = d0Var;
        this.f15374f = i11;
        this.f15375g = linkedHashMap;
        this.f15376h = i12;
        this.f15377i = 1;
        this.f15378j = iVar;
        this.f15379k = list3;
        this.l = list4;
        this.f15380m = o0Var;
        this.f15381n = w0Var;
        this.f15382o = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f15369a, nVar.f15369a) && Intrinsics.areEqual(this.f15370b, nVar.f15370b) && Intrinsics.areEqual(this.f15371c, nVar.f15371c) && Intrinsics.areEqual(this.f15372d, nVar.f15372d) && Intrinsics.areEqual(this.f15373e, nVar.f15373e) && this.f15374f == nVar.f15374f && Intrinsics.areEqual(this.f15375g, nVar.f15375g) && this.f15376h == nVar.f15376h && this.f15377i == nVar.f15377i && Intrinsics.areEqual(this.f15378j, nVar.f15378j) && Intrinsics.areEqual(this.f15379k, nVar.f15379k) && Intrinsics.areEqual(this.l, nVar.l) && Intrinsics.areEqual(this.f15380m, nVar.f15380m) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f15381n, nVar.f15381n) && Intrinsics.areEqual(this.f15382o, nVar.f15382o);
    }

    public final int hashCode() {
        int iC = f.c(this.f15371c, f.c(this.f15370b, this.f15369a.hashCode() * 31, 31), 31);
        ArrayList arrayList = this.f15372d;
        int iHashCode = (iC + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        d0 d0Var = this.f15373e;
        return (this.f15382o.hashCode() + ((this.f15381n.hashCode() + w.a0.f(this.f15380m, f.c(this.l, f.c(this.f15379k, w.a0.f(this.f15378j, r8.k.b(this.f15377i, r8.k.b(this.f15376h, w.a0.f(this.f15375g, r8.k.b(this.f15374f, (iHashCode + (d0Var != null ? d0Var.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) s.b(this.f15369a)) + ", streams=" + this.f15370b + ", exclusiveStreamGroups=" + this.f15371c + ", input=" + this.f15372d + ", postviewStream=" + this.f15373e + ", sessionTemplate=" + ((Object) m1.b(this.f15374f)) + ", sessionParameters=" + this.f15375g + ", sessionMode=" + ((Object) o00.h0.G(this.f15376h)) + ", defaultTemplate=" + ((Object) m1.b(this.f15377i)) + ", defaultParameters=" + this.f15378j + ", defaultListeners=" + this.f15379k + ", graphStateListeners=" + this.l + ", requiredParameters=" + this.f15380m + ", cameraBackendId=" + ((Object) Address.ADDRESS_NULL_PLACEHOLDER) + ", customCameraBackend=null, metadataTransform=" + this.f15381n + ", flags=" + this.f15382o + ", sessionColorSpace=" + ((Object) Address.ADDRESS_NULL_PLACEHOLDER) + ')';
    }
}
