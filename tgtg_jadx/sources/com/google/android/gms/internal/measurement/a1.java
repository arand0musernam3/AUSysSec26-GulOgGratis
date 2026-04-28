package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterable f11240c;

    public a1(n1 n1Var) {
        this.f11238a = 0;
        this.f11240c = n1Var;
        this.f11239b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11238a) {
            case 0:
                if (this.f11239b < ((n1) this.f11240c).p()) {
                }
                break;
            default:
                if (this.f11239b < ((j6.f) this.f11240c).f24739e.size()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11238a) {
            case 0:
                n1 n1Var = (n1) this.f11240c;
                int i11 = this.f11239b;
                int iP = n1Var.p();
                int i12 = this.f11239b;
                if (i11 < iP) {
                    this.f11239b = i12 + 1;
                    return n1Var.q(i12);
                }
                qc.y.h(e0.f.h(i12, "Out of bounds index: ", new StringBuilder(String.valueOf(i12).length() + 21)));
                return null;
            default:
                j6.d dVar = (j6.d) ((j6.f) this.f11240c).f24739e.get(this.f11239b);
                this.f11239b++;
                return dVar;
        }
    }

    public /* synthetic */ a1() {
        this.f11238a = 1;
    }
}
