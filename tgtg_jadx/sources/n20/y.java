package n20;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f30433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f30434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f30435g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f30436h = new ArrayList();

    public y() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f11, float f12, float f13, float f14, float f15, float f16) {
        u uVar = new u(f11, f12, f13, f14);
        uVar.f30422f = f15;
        uVar.f30423g = f16;
        this.f30435g.add(uVar);
        s sVar = new s(uVar);
        float f17 = f15 + f16;
        boolean z11 = f16 < 0.0f;
        if (z11) {
            f15 = (f15 + 180.0f) % 360.0f;
        }
        float f18 = z11 ? (180.0f + f17) % 360.0f : f17;
        b(f15);
        this.f30436h.add(sVar);
        this.f30433e = f18;
        double d3 = f17;
        this.f30431c = (((f13 - f11) / 2.0f) * ((float) Math.cos(Math.toRadians(d3)))) + ((f11 + f13) * 0.5f);
        this.f30432d = (((f14 - f12) / 2.0f) * ((float) Math.sin(Math.toRadians(d3)))) + ((f12 + f14) * 0.5f);
    }

    public final void b(float f11) {
        float f12 = this.f30433e;
        if (f12 == f11) {
            return;
        }
        float f13 = ((f11 - f12) + 360.0f) % 360.0f;
        if (f13 > 180.0f) {
            return;
        }
        float f14 = this.f30431c;
        float f15 = this.f30432d;
        u uVar = new u(f14, f15, f14, f15);
        uVar.f30422f = this.f30433e;
        uVar.f30423g = f13;
        this.f30436h.add(new s(uVar));
        this.f30433e = f11;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f30435g;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((w) arrayList.get(i11)).a(matrix, path);
        }
    }

    public final void d(float f11, float f12) {
        v vVar = new v();
        vVar.f30424b = f11;
        vVar.f30425c = f12;
        this.f30435g.add(vVar);
        t tVar = new t(vVar, this.f30431c, this.f30432d);
        float fB = tVar.b() + 270.0f;
        float fB2 = tVar.b() + 270.0f;
        b(fB);
        this.f30436h.add(tVar);
        this.f30433e = fB2;
        this.f30431c = f11;
        this.f30432d = f12;
    }

    public final void e(float f11, float f12, float f13, float f14) {
        this.f30429a = f11;
        this.f30430b = f12;
        this.f30431c = f11;
        this.f30432d = f12;
        this.f30433e = f13;
        this.f30434f = (f13 + f14) % 360.0f;
        this.f30435g.clear();
        this.f30436h.clear();
    }
}
