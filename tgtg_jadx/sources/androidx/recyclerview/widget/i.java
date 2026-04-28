package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3766b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3767c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3768d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3769e = null;

    public i(c1 c1Var) {
        this.f3765a = c1Var;
    }

    @Override // androidx.recyclerview.widget.c1
    public final void a(int i11, int i12) {
        e();
        this.f3765a.a(i11, i12);
    }

    @Override // androidx.recyclerview.widget.c1
    public final void b(int i11, int i12) {
        int i13;
        if (this.f3766b == 1 && i11 >= (i13 = this.f3767c)) {
            int i14 = this.f3768d;
            if (i11 <= i13 + i14) {
                this.f3768d = i14 + i12;
                this.f3767c = Math.min(i11, i13);
                return;
            }
        }
        e();
        this.f3767c = i11;
        this.f3768d = i12;
        this.f3766b = 1;
    }

    @Override // androidx.recyclerview.widget.c1
    public final void c(int i11, int i12) {
        int i13;
        if (this.f3766b == 2 && (i13 = this.f3767c) >= i11 && i13 <= i11 + i12) {
            this.f3768d += i12;
            this.f3767c = i11;
        } else {
            e();
            this.f3767c = i11;
            this.f3768d = i12;
            this.f3766b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.c1
    public final void d(int i11, int i12, Object obj) {
        int i13;
        int i14;
        int i15;
        if (this.f3766b == 3 && i11 <= (i14 = this.f3768d + (i13 = this.f3767c)) && (i15 = i11 + i12) >= i13 && this.f3769e == obj) {
            this.f3767c = Math.min(i11, i13);
            this.f3768d = Math.max(i14, i15) - this.f3767c;
            return;
        }
        e();
        this.f3767c = i11;
        this.f3768d = i12;
        this.f3769e = obj;
        this.f3766b = 3;
    }

    public final void e() {
        int i11 = this.f3766b;
        if (i11 == 0) {
            return;
        }
        c1 c1Var = this.f3765a;
        if (i11 == 1) {
            c1Var.b(this.f3767c, this.f3768d);
        } else if (i11 == 2) {
            c1Var.c(this.f3767c, this.f3768d);
        } else if (i11 == 3) {
            c1Var.d(this.f3767c, this.f3768d, this.f3769e);
        }
        this.f3769e = null;
        this.f3766b = 0;
    }
}
