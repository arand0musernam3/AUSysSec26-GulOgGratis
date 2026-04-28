package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f11464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f11467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f11468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f11470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f11471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ob f11472k;

    public hd(boolean z11, k30.h hVar, u0 u0Var, String str, String str2, k30.h hVar2, k30.h hVar3, boolean z12, boolean z13, boolean z14, ob obVar) {
        hVar.getClass();
        u0Var.getClass();
        str.getClass();
        str2.getClass();
        hVar2.getClass();
        hVar3.getClass();
        obVar.getClass();
        this.f11462a = z11;
        this.f11463b = hVar;
        this.f11464c = u0Var;
        this.f11465d = str;
        this.f11466e = str2;
        this.f11467f = hVar2;
        this.f11468g = hVar3;
        this.f11469h = z12;
        this.f11470i = z13;
        this.f11471j = z14;
        this.f11472k = obVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return this.f11462a == hdVar.f11462a && Intrinsics.areEqual(this.f11463b, hdVar.f11463b) && Intrinsics.areEqual(this.f11464c, hdVar.f11464c) && Intrinsics.areEqual(this.f11465d, hdVar.f11465d) && Intrinsics.areEqual(this.f11466e, hdVar.f11466e) && Intrinsics.areEqual(this.f11467f, hdVar.f11467f) && Intrinsics.areEqual(this.f11468g, hdVar.f11468g) && this.f11469h == hdVar.f11469h && this.f11470i == hdVar.f11470i && this.f11471j == hdVar.f11471j && Intrinsics.areEqual(this.f11472k, hdVar.f11472k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f11462a), this.f11463b, this.f11464c, this.f11465d, this.f11466e, this.f11467f, this.f11468g, Boolean.valueOf(this.f11469h), Boolean.valueOf(this.f11470i), Boolean.valueOf(this.f11471j));
    }

    public final String toString() {
        boolean z11 = this.f11462a;
        int length = String.valueOf(z11).length();
        List list = this.f11463b;
        int length2 = String.valueOf(list).length();
        u0 u0Var = this.f11464c;
        int length3 = String.valueOf(u0Var).length();
        String str = this.f11465d;
        int length4 = String.valueOf(str).length();
        String str2 = this.f11466e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f11467f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.f11468g;
        int length7 = String.valueOf(list3).length();
        boolean z12 = this.f11469h;
        int length8 = String.valueOf(z12).length();
        boolean z13 = this.f11470i;
        int length9 = String.valueOf(z13).length();
        boolean z14 = this.f11471j;
        int length10 = String.valueOf(z14).length();
        ob obVar = this.f11472k;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(obVar).length() + 1);
        sb2.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb2.append(z11);
        sb2.append(", enabledBackings=");
        sb2.append(list);
        sb2.append(", secret=");
        sb2.append(u0Var);
        sb2.append(", dirPath=");
        sb2.append(str);
        sb2.append(", gmsCoreDirPath=");
        sb2.append(str2);
        sb2.append(", includeStaticConfigPackages=");
        sb2.append(list2);
        sb2.append(", excludeStaticConfigPackages=");
        sb2.append(list3);
        sb2.append(", hasStorageInfoFromGms=");
        sb2.append(z12);
        sb2.append(", allowEmptySnapshotToken=");
        sb2.append(z13);
        sb2.append(", enableCommitV2Api=");
        sb2.append(z14);
        sb2.append(", clientFlags=");
        sb2.append(obVar);
        sb2.append(")");
        return sb2.toString();
    }
}
