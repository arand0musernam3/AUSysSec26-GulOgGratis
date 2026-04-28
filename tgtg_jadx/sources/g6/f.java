package g6;

import a60.r;
import dn.k;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h[] f20040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h[] f20041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k f20043i;

    @Override // g6.b
    public final h d(boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.f20042h; i12++) {
            h[] hVarArr = this.f20040f;
            h hVar = hVarArr[i12];
            if (!zArr[hVar.f20045b]) {
                k kVar = this.f20043i;
                kVar.f15018b = hVar;
                int i13 = 8;
                if (i11 == -1) {
                    while (i13 >= 0) {
                        float f11 = ((h) kVar.f15018b).f20051h[i13];
                        if (f11 <= 0.0f) {
                            if (f11 < 0.0f) {
                                i11 = i12;
                                break;
                            }
                            i13--;
                        }
                    }
                } else {
                    h hVar2 = hVarArr[i11];
                    while (true) {
                        if (i13 >= 0) {
                            float f12 = hVar2.f20051h[i13];
                            float f13 = ((h) kVar.f15018b).f20051h[i13];
                            if (f13 == f12) {
                                i13--;
                            } else if (f13 < f12) {
                            }
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.f20040f[i11];
    }

    @Override // g6.b
    public final boolean e() {
        return this.f20042h == 0;
    }

    @Override // g6.b
    public final void i(c cVar, b bVar, boolean z11) {
        h hVar = bVar.f20017a;
        if (hVar == null) {
            return;
        }
        float[] fArr = hVar.f20051h;
        a aVar = bVar.f20020d;
        int iD = aVar.d();
        for (int i11 = 0; i11 < iD; i11++) {
            h hVarE = aVar.e(i11);
            float f11 = aVar.f(i11);
            k kVar = this.f20043i;
            kVar.f15018b = hVarE;
            if (hVarE.f20044a) {
                boolean z12 = true;
                for (int i12 = 0; i12 < 9; i12++) {
                    float[] fArr2 = ((h) kVar.f15018b).f20051h;
                    float f12 = (fArr[i12] * f11) + fArr2[i12];
                    fArr2[i12] = f12;
                    if (Math.abs(f12) < 1.0E-4f) {
                        ((h) kVar.f15018b).f20051h[i12] = 0.0f;
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    ((f) kVar.f15019c).k((h) kVar.f15018b);
                }
            } else {
                for (int i13 = 0; i13 < 9; i13++) {
                    float f13 = fArr[i13];
                    if (f13 != 0.0f) {
                        float f14 = f13 * f11;
                        if (Math.abs(f14) < 1.0E-4f) {
                            f14 = 0.0f;
                        }
                        ((h) kVar.f15018b).f20051h[i13] = f14;
                    } else {
                        ((h) kVar.f15018b).f20051h[i13] = 0.0f;
                    }
                }
                j(hVarE);
            }
            this.f20018b = (bVar.f20018b * f11) + this.f20018b;
        }
        k(hVar);
    }

    public final void j(h hVar) {
        int i11;
        h[] hVarArr;
        int i12 = this.f20042h + 1;
        h[] hVarArr2 = this.f20040f;
        if (i12 > hVarArr2.length) {
            h[] hVarArr3 = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
            this.f20040f = hVarArr3;
            this.f20041g = (h[]) Arrays.copyOf(hVarArr3, hVarArr3.length * 2);
        }
        h[] hVarArr4 = this.f20040f;
        int i13 = this.f20042h;
        hVarArr4[i13] = hVar;
        int i14 = i13 + 1;
        this.f20042h = i14;
        if (i14 > 1 && hVarArr4[i13].f20045b > hVar.f20045b) {
            int i15 = 0;
            while (true) {
                i11 = this.f20042h;
                hVarArr = this.f20041g;
                if (i15 >= i11) {
                    break;
                }
                hVarArr[i15] = this.f20040f[i15];
                i15++;
            }
            Arrays.sort(hVarArr, 0, i11, new r(9));
            for (int i16 = 0; i16 < this.f20042h; i16++) {
                this.f20040f[i16] = this.f20041g[i16];
            }
        }
        hVar.f20044a = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i11 = 0;
        while (i11 < this.f20042h) {
            if (this.f20040f[i11] == hVar) {
                while (true) {
                    int i12 = this.f20042h;
                    if (i11 >= i12 - 1) {
                        this.f20042h = i12 - 1;
                        hVar.f20044a = false;
                        return;
                    } else {
                        h[] hVarArr = this.f20040f;
                        int i13 = i11 + 1;
                        hVarArr[i11] = hVarArr[i13];
                        i11 = i13;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    @Override // g6.b
    public final String toString() {
        k kVar = this.f20043i;
        String str = " goal -> (" + this.f20018b + ") : ";
        for (int i11 = 0; i11 < this.f20042h; i11++) {
            kVar.f15018b = this.f20040f[i11];
            str = str + kVar + " ";
        }
        return str;
    }
}
