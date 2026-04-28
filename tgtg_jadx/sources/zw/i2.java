package zw;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i2 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f48241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f48242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f48243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j2 f48244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f48246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f48248h;

    public i2(q2 q2Var, mv.b0 b0Var) {
        ArrayList arrayList = new ArrayList();
        this.f48241a = arrayList;
        this.f48244d = null;
        this.f48245e = false;
        this.f48246f = true;
        this.f48247g = -1;
        if (b0Var == null) {
            return;
        }
        b0Var.o(this);
        if (this.f48248h) {
            this.f48244d.b((j2) arrayList.get(this.f48247g));
            arrayList.set(this.f48247g, this.f48244d);
            this.f48248h = false;
        }
        j2 j2Var = this.f48244d;
        if (j2Var != null) {
            arrayList.add(j2Var);
        }
    }

    @Override // zw.r0
    public final void a(float f11, float f12, float f13, float f14) {
        this.f48244d.a(f11, f12);
        this.f48241a.add(this.f48244d);
        this.f48244d = new j2(f13, f14, f13 - f11, f14 - f12);
        this.f48248h = false;
    }

    @Override // zw.r0
    public final void b(float f11, float f12) {
        boolean z11 = this.f48248h;
        ArrayList arrayList = this.f48241a;
        if (z11) {
            this.f48244d.b((j2) arrayList.get(this.f48247g));
            arrayList.set(this.f48247g, this.f48244d);
            this.f48248h = false;
        }
        j2 j2Var = this.f48244d;
        if (j2Var != null) {
            arrayList.add(j2Var);
        }
        this.f48242b = f11;
        this.f48243c = f12;
        this.f48244d = new j2(f11, f12, 0.0f, 0.0f);
        this.f48247g = arrayList.size();
    }

    @Override // zw.r0
    public final void c(float f11, float f12, float f13, float f14, float f15, float f16) {
        if (this.f48246f || this.f48245e) {
            this.f48244d.a(f11, f12);
            this.f48241a.add(this.f48244d);
            this.f48245e = false;
        }
        this.f48244d = new j2(f15, f16, f15 - f13, f16 - f14);
        this.f48248h = false;
    }

    @Override // zw.r0
    public final void close() {
        this.f48241a.add(this.f48244d);
        e(this.f48242b, this.f48243c);
        this.f48248h = true;
    }

    @Override // zw.r0
    public final void d(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15) {
        this.f48245e = true;
        this.f48246f = false;
        j2 j2Var = this.f48244d;
        q2.h(j2Var.f48256a, j2Var.f48257b, f11, f12, f13, z11, z12, f14, f15, this);
        this.f48246f = true;
        this.f48248h = false;
    }

    @Override // zw.r0
    public final void e(float f11, float f12) {
        this.f48244d.a(f11, f12);
        this.f48241a.add(this.f48244d);
        j2 j2Var = this.f48244d;
        this.f48244d = new j2(f11, f12, f11 - j2Var.f48256a, f12 - j2Var.f48257b);
        this.f48248h = false;
    }
}
