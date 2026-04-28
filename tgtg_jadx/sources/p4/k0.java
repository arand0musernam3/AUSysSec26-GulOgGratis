package p4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f34371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4.r f34373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i4.r f34375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f34376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f34377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f34378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f34379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f34380k;
    public final float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f34381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f34382n;

    public k0(String str, List list, int i11, i4.r rVar, float f11, i4.r rVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
        this.f34370a = str;
        this.f34371b = list;
        this.f34372c = i11;
        this.f34373d = rVar;
        this.f34374e = f11;
        this.f34375f = rVar2;
        this.f34376g = f12;
        this.f34377h = f13;
        this.f34378i = i12;
        this.f34379j = i13;
        this.f34380k = f14;
        this.l = f15;
        this.f34381m = f16;
        this.f34382n = f17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.areEqual(this.f34370a, k0Var.f34370a) && Intrinsics.areEqual(this.f34373d, k0Var.f34373d) && this.f34374e == k0Var.f34374e && Intrinsics.areEqual(this.f34375f, k0Var.f34375f) && this.f34376g == k0Var.f34376g && this.f34377h == k0Var.f34377h && this.f34378i == k0Var.f34378i && this.f34379j == k0Var.f34379j && this.f34380k == k0Var.f34380k && this.l == k0Var.l && this.f34381m == k0Var.f34381m && this.f34382n == k0Var.f34382n && this.f34372c == k0Var.f34372c && Intrinsics.areEqual(this.f34371b, k0Var.f34371b);
    }

    public final int hashCode() {
        int iC = e0.f.c(this.f34371b, this.f34370a.hashCode() * 31, 31);
        i4.r rVar = this.f34373d;
        int iA = r8.k.a((iC + (rVar != null ? rVar.hashCode() : 0)) * 31, this.f34374e, 31);
        i4.r rVar2 = this.f34375f;
        return Integer.hashCode(this.f34372c) + r8.k.a(r8.k.a(r8.k.a(r8.k.a(r8.k.b(this.f34379j, r8.k.b(this.f34378i, r8.k.a(r8.k.a((iA + (rVar2 != null ? rVar2.hashCode() : 0)) * 31, this.f34376g, 31), this.f34377h, 31), 31), 31), this.f34380k, 31), this.l, 31), this.f34381m, 31), this.f34382n, 31);
    }
}
