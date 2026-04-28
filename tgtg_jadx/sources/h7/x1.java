package h7;

import android.graphics.Rect;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsetsCompat f21623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x6.d[] f21624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[][] f21625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect[][] f21626d;

    public x1(WindowInsetsCompat windowInsetsCompat) {
        this.f21625c = new Rect[10][];
        this.f21626d = new Rect[10][];
        this.f21623a = windowInsetsCompat;
        c(windowInsetsCompat);
    }

    public final void a() {
        x6.d[] dVarArr = this.f21624b;
        if (dVarArr != null) {
            x6.d dVarE = dVarArr[0];
            x6.d dVarE2 = dVarArr[1];
            WindowInsetsCompat windowInsetsCompat = this.f21623a;
            if (dVarE2 == null) {
                dVarE2 = windowInsetsCompat.e(2);
            }
            if (dVarE == null) {
                dVarE = windowInsetsCompat.e(1);
            }
            h(x6.d.a(dVarE, dVarE2));
            x6.d dVar = this.f21624b[h2.d(16)];
            if (dVar != null) {
                g(dVar);
            }
            x6.d dVar2 = this.f21624b[h2.d(32)];
            if (dVar2 != null) {
                e(dVar2);
            }
            x6.d dVar3 = this.f21624b[h2.d(64)];
            if (dVar3 != null) {
                i(dVar3);
            }
        }
    }

    public abstract WindowInsetsCompat b();

    public void c(WindowInsetsCompat windowInsetsCompat) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            List<Rect> listF = windowInsetsCompat.f2741a.f(i11);
            int iD = h2.d(i11);
            this.f21625c[iD] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i11 != 8) {
                List<Rect> listG = windowInsetsCompat.f2741a.g(i11);
                this.f21626d[iD] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i11, x6.d dVar) {
        if (this.f21624b == null) {
            this.f21624b = new x6.d[10];
        }
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((i11 & i12) != 0) {
                this.f21624b[h2.d(i12)] = dVar;
            }
        }
    }

    public abstract void f(x6.d dVar);

    public abstract void h(x6.d dVar);

    public x1() {
        this(new WindowInsetsCompat((WindowInsetsCompat) null));
    }

    public void e(x6.d dVar) {
    }

    public void g(x6.d dVar) {
    }

    public void i(x6.d dVar) {
    }
}
