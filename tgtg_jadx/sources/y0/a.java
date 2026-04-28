package y0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import m0.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f44527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f44528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f44531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1.d f44532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1 f44533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f44534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f44535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f44536j;

    public a(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, g1.d dVar, m1 m1Var, HashMap map, g gVar, g gVar2) {
        gVar.getClass();
        this.f44527a = linkedHashSet;
        this.f44528b = arrayList;
        this.f44529c = arrayList2;
        this.f44530d = arrayList3;
        this.f44531e = arrayList4;
        this.f44532f = dVar;
        this.f44533g = m1Var;
        this.f44534h = map;
        this.f44535i = gVar;
        this.f44536j = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f44527a, aVar.f44527a) && Intrinsics.areEqual(this.f44528b, aVar.f44528b) && Intrinsics.areEqual(this.f44529c, aVar.f44529c) && Intrinsics.areEqual(this.f44530d, aVar.f44530d) && Intrinsics.areEqual(this.f44531e, aVar.f44531e) && Intrinsics.areEqual(this.f44532f, aVar.f44532f) && Intrinsics.areEqual(this.f44533g, aVar.f44533g) && Intrinsics.areEqual(this.f44534h, aVar.f44534h) && Intrinsics.areEqual(this.f44535i, aVar.f44535i) && Intrinsics.areEqual(this.f44536j, aVar.f44536j);
    }

    public final int hashCode() {
        int iHashCode = (this.f44531e.hashCode() + ((this.f44530d.hashCode() + ((this.f44529c.hashCode() + ((this.f44528b.hashCode() + (this.f44527a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        g1.d dVar = this.f44532f;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m1 m1Var = this.f44533g;
        int iHashCode3 = (this.f44535i.hashCode() + ((this.f44534h.hashCode() + ((iHashCode2 + (m1Var == null ? 0 : m1Var.hashCode())) * 31)) * 31)) * 31;
        g gVar = this.f44536j;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f44527a + ", cameraUseCases=" + this.f44528b + ", cameraUseCasesToAttach=" + this.f44529c + ", cameraUseCasesToKeep=" + this.f44530d + ", cameraUseCasesToDetach=" + this.f44531e + ", streamSharing=" + this.f44532f + ", placeholderForExtensions=" + this.f44533g + ", useCaseConfigs=" + this.f44534h + ", primaryStreamSpecResult=" + this.f44535i + ", secondaryStreamSpecResult=" + this.f44536j + ')';
    }
}
