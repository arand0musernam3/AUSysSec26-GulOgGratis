package gj;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f20482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f20483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f20484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f20485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f20489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Pair f20490k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f20491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f20492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f20494p;

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(List list, boolean z11, Set set, Set set2, String str, Pair pair, int i11) {
        List list2 = (i11 & 1) != 0 ? n0.f26529a : list;
        boolean z12 = (i11 & 2) != 0 ? false : z11;
        Set set3 = (i11 & 4) != 0 ? p0.f26531a : set;
        p0 p0Var = p0.f26531a;
        this(list2, z12, set3, p0Var, (i11 & 16) != 0 ? p0Var : set2, p0Var, (i11 & 64) != 0 ? null : str, null, null, false, (i11 & 1024) != 0 ? null : pair, 0, 0, null, false, n0.f26529a);
    }

    public static c0 a(c0 c0Var, ArrayList arrayList, boolean z11, Set set, Set set2, Set set3, Set set4, String str, String str2, String str3, boolean z12, Pair pair, int i11, int i12, a aVar, boolean z13, ArrayList arrayList2, int i13) {
        List list = (i13 & 1) != 0 ? c0Var.f20480a : arrayList;
        boolean z14 = (i13 & 2) != 0 ? c0Var.f20481b : z11;
        Set set5 = (i13 & 4) != 0 ? c0Var.f20482c : set;
        Set set6 = (i13 & 8) != 0 ? c0Var.f20483d : set2;
        Set set7 = (i13 & 16) != 0 ? c0Var.f20484e : set3;
        Set set8 = (i13 & 32) != 0 ? c0Var.f20485f : set4;
        String str4 = (i13 & 64) != 0 ? c0Var.f20486g : str;
        String str5 = (i13 & 128) != 0 ? c0Var.f20487h : str2;
        String str6 = (i13 & 256) != 0 ? c0Var.f20488i : str3;
        boolean z15 = (i13 & 512) != 0 ? c0Var.f20489j : z12;
        Pair pair2 = (i13 & 1024) != 0 ? c0Var.f20490k : pair;
        int i14 = (i13 & NewHope.SENDB_BYTES) != 0 ? c0Var.l : i11;
        int i15 = (i13 & 4096) != 0 ? c0Var.f20491m : i12;
        a aVar2 = (i13 & 8192) != 0 ? c0Var.f20492n : aVar;
        List list2 = list;
        boolean z16 = (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? c0Var.f20493o : z13;
        List list3 = (i13 & 32768) != 0 ? c0Var.f20494p : arrayList2;
        c0Var.getClass();
        list2.getClass();
        set5.getClass();
        set6.getClass();
        set7.getClass();
        set8.getClass();
        list3.getClass();
        return new c0(list2, z14, set5, set6, set7, set8, str4, str5, str6, z15, pair2, i14, i15, aVar2, z16, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.areEqual(this.f20480a, c0Var.f20480a) && this.f20481b == c0Var.f20481b && Intrinsics.areEqual(this.f20482c, c0Var.f20482c) && Intrinsics.areEqual(this.f20483d, c0Var.f20483d) && Intrinsics.areEqual(this.f20484e, c0Var.f20484e) && Intrinsics.areEqual(this.f20485f, c0Var.f20485f) && Intrinsics.areEqual(this.f20486g, c0Var.f20486g) && Intrinsics.areEqual(this.f20487h, c0Var.f20487h) && Intrinsics.areEqual(this.f20488i, c0Var.f20488i) && this.f20489j == c0Var.f20489j && Intrinsics.areEqual(this.f20490k, c0Var.f20490k) && this.l == c0Var.l && this.f20491m == c0Var.f20491m && this.f20492n == c0Var.f20492n && this.f20493o == c0Var.f20493o && Intrinsics.areEqual(this.f20494p, c0Var.f20494p);
    }

    public final int hashCode() {
        int iHashCode = (this.f20485f.hashCode() + ((this.f20484e.hashCode() + ((this.f20483d.hashCode() + ((this.f20482c.hashCode() + r8.k.e(this.f20480a.hashCode() * 31, 31, this.f20481b)) * 31)) * 31)) * 31)) * 31;
        String str = this.f20486g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20487h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20488i;
        int iE = r8.k.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f20489j);
        Pair pair = this.f20490k;
        int iB = r8.k.b(this.f20491m, r8.k.b(this.l, (iE + (pair == null ? 0 : pair.hashCode())) * 31, 31), 31);
        a aVar = this.f20492n;
        return this.f20494p.hashCode() + r8.k.e((iB + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f20493o);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComplexFilterUiState(selectedChips=");
        sb2.append(this.f20480a);
        sb2.append(", soldOutDraft=");
        sb2.append(this.f20481b);
        sb2.append(", selectedCategoryIds=");
        sb2.append(this.f20482c);
        sb2.append(", categoryDraftIds=");
        sb2.append(this.f20483d);
        sb2.append(", selectedDietIds=");
        sb2.append(this.f20484e);
        sb2.append(", dietDraftIds=");
        sb2.append(this.f20485f);
        sb2.append(", selectedSortOptionId=");
        j4.s.A(sb2, this.f20486g, ", sortDraftId=", this.f20487h, ", defaultSortOptionId=");
        r8.k.z(sb2, this.f20488i, ", sortResetEnabled=", this.f20489j, ", selectedCollectionTimeHours=");
        sb2.append(this.f20490k);
        sb2.append(", collectionTimeDraftStartHour=");
        sb2.append(this.l);
        sb2.append(", collectionTimeDraftEndHour=");
        sb2.append(this.f20491m);
        sb2.append(", collectionTimeDraftDay=");
        sb2.append(this.f20492n);
        sb2.append(", collectionTimeResetEnabled=");
        sb2.append(this.f20493o);
        sb2.append(", chipRecencyOrder=");
        sb2.append(this.f20494p);
        sb2.append(")");
        return sb2.toString();
    }

    public c0(List list, boolean z11, Set set, Set set2, Set set3, Set set4, String str, String str2, String str3, boolean z12, Pair pair, int i11, int i12, a aVar, boolean z13, List list2) {
        list.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        list2.getClass();
        this.f20480a = list;
        this.f20481b = z11;
        this.f20482c = set;
        this.f20483d = set2;
        this.f20484e = set3;
        this.f20485f = set4;
        this.f20486g = str;
        this.f20487h = str2;
        this.f20488i = str3;
        this.f20489j = z12;
        this.f20490k = pair;
        this.l = i11;
        this.f20491m = i12;
        this.f20492n = aVar;
        this.f20493o = z13;
        this.f20494p = list2;
    }
}
