package oa0;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f32405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f32406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32407g;

    public z(String str, boolean z11, int i11) {
        this.f32404d = i11;
        switch (i11) {
            case 1:
                a aVar = a.f32262b;
                Objects.requireNonNull(str, "name == null");
                this.f32405e = str;
                this.f32406f = aVar;
                this.f32407g = z11;
                break;
            case 2:
                a aVar2 = a.f32262b;
                Objects.requireNonNull(str, "name == null");
                this.f32405e = str;
                this.f32406f = aVar2;
                this.f32407g = z11;
                break;
            default:
                a aVar3 = a.f32262b;
                Objects.requireNonNull(str, "name == null");
                this.f32405e = str;
                this.f32406f = aVar3;
                this.f32407g = z11;
                break;
        }
    }

    @Override // oa0.u0
    public final void a(k0 k0Var, Object obj) {
        switch (this.f32404d) {
            case 0:
                if (obj != null) {
                    this.f32406f.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        k0Var.a(this.f32405e, string, this.f32407g);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f32406f.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        k0Var.b(this.f32405e, string2, this.f32407g);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f32406f.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        k0Var.d(this.f32405e, string3, this.f32407g);
                        break;
                    }
                }
                break;
        }
    }
}
