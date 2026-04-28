package ia0;

import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f23630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f23631g;

    public e0(byte[] bArr, int i11, int i12, boolean z11, boolean z12) {
        bArr.getClass();
        this.f23625a = bArr;
        this.f23626b = i11;
        this.f23627c = i12;
        this.f23628d = z11;
        this.f23629e = z12;
    }

    public final e0 a() {
        e0 e0Var = this.f23630f;
        if (e0Var == this) {
            e0Var = null;
        }
        e0 e0Var2 = this.f23631g;
        e0Var2.getClass();
        e0Var2.f23630f = this.f23630f;
        e0 e0Var3 = this.f23630f;
        e0Var3.getClass();
        e0Var3.f23631g = this.f23631g;
        this.f23630f = null;
        this.f23631g = null;
        return e0Var;
    }

    public final void b(e0 e0Var) {
        e0Var.getClass();
        e0Var.f23631g = this;
        e0Var.f23630f = this.f23630f;
        e0 e0Var2 = this.f23630f;
        e0Var2.getClass();
        e0Var2.f23631g = e0Var;
        this.f23630f = e0Var;
    }

    public final e0 c() {
        this.f23628d = true;
        return new e0(this.f23625a, this.f23626b, this.f23627c, true, false);
    }

    public final void d(e0 e0Var, int i11) {
        e0Var.getClass();
        byte[] bArr = e0Var.f23625a;
        if (!e0Var.f23629e) {
            h2.b("only owner can write");
            return;
        }
        int i12 = e0Var.f23627c;
        int i13 = i12 + i11;
        if (i13 > 8192) {
            if (e0Var.f23628d) {
                i4.a.h();
                return;
            }
            int i14 = e0Var.f23626b;
            if (i13 - i14 > 8192) {
                i4.a.h();
                return;
            } else {
                kotlin.collections.x.e(0, bArr, i14, bArr, i12);
                e0Var.f23627c -= e0Var.f23626b;
                e0Var.f23626b = 0;
            }
        }
        int i15 = e0Var.f23627c;
        int i16 = this.f23626b;
        kotlin.collections.x.e(i15, this.f23625a, i16, bArr, i16 + i11);
        e0Var.f23627c += i11;
        this.f23626b += i11;
    }

    public e0() {
        this.f23625a = new byte[8192];
        this.f23629e = true;
        this.f23628d = false;
    }
}
