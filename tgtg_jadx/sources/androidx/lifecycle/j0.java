package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f3460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3462c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f3463d;

    public j0(k0 k0Var, p0 p0Var) {
        this.f3463d = k0Var;
        this.f3460a = p0Var;
    }

    public final void a(boolean z11) {
        if (z11 == this.f3461b) {
            return;
        }
        this.f3461b = z11;
        int i11 = z11 ? 1 : -1;
        k0 k0Var = this.f3463d;
        int i12 = k0Var.f3471c;
        k0Var.f3471c = i11 + i12;
        if (!k0Var.f3472d) {
            k0Var.f3472d = true;
            while (true) {
                try {
                    int i13 = k0Var.f3471c;
                    if (i12 == i13) {
                        break;
                    }
                    boolean z12 = i12 == 0 && i13 > 0;
                    boolean z13 = i12 > 0 && i13 == 0;
                    if (z12) {
                        k0Var.g();
                    } else if (z13) {
                        k0Var.h();
                    }
                    i12 = i13;
                } catch (Throwable th2) {
                    k0Var.f3472d = false;
                    throw th2;
                }
            }
            k0Var.f3472d = false;
        }
        if (this.f3461b) {
            k0Var.c(this);
        }
    }

    public boolean c(LifecycleOwner lifecycleOwner) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
