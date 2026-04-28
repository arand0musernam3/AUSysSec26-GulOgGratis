package g6;

import b3.i;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f20008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8.h f20009c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20007a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20010d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f20011e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f20012f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f20013g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20014h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20015i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20016j = false;

    public a(b bVar, a8.h hVar) {
        this.f20008b = bVar;
        this.f20009c = hVar;
    }

    public final void a(h hVar, float f11, boolean z11) {
        if (f11 <= -0.001f || f11 >= 0.001f) {
            int i11 = this.f20014h;
            b bVar = this.f20008b;
            if (i11 == -1) {
                this.f20014h = 0;
                this.f20013g[0] = f11;
                this.f20011e[0] = hVar.f20045b;
                this.f20012f[0] = -1;
                hVar.l++;
                hVar.a(bVar);
                this.f20007a++;
                if (this.f20016j) {
                    return;
                }
                int i12 = this.f20015i + 1;
                this.f20015i = i12;
                int[] iArr = this.f20011e;
                if (i12 >= iArr.length) {
                    this.f20016j = true;
                    this.f20015i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i13 = -1;
            for (int i14 = 0; i11 != -1 && i14 < this.f20007a; i14++) {
                int i15 = this.f20011e[i11];
                int i16 = hVar.f20045b;
                if (i15 == i16) {
                    float[] fArr = this.f20013g;
                    float f12 = fArr[i11] + f11;
                    if (f12 > -0.001f && f12 < 0.001f) {
                        f12 = 0.0f;
                    }
                    fArr[i11] = f12;
                    if (f12 == 0.0f) {
                        int i17 = this.f20014h;
                        int[] iArr2 = this.f20012f;
                        if (i11 == i17) {
                            this.f20014h = iArr2[i11];
                        } else {
                            iArr2[i13] = iArr2[i11];
                        }
                        if (z11) {
                            hVar.c(bVar);
                        }
                        if (this.f20016j) {
                            this.f20015i = i11;
                        }
                        hVar.l--;
                        this.f20007a--;
                        return;
                    }
                    return;
                }
                if (i15 < i16) {
                    i13 = i11;
                }
                i11 = this.f20012f[i11];
            }
            int length = this.f20015i;
            int i18 = length + 1;
            if (this.f20016j) {
                int[] iArr3 = this.f20011e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i18;
            }
            int[] iArr4 = this.f20011e;
            if (length >= iArr4.length && this.f20007a < iArr4.length) {
                int i19 = 0;
                while (true) {
                    int[] iArr5 = this.f20011e;
                    if (i19 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i19] == -1) {
                        length = i19;
                        break;
                    }
                    i19++;
                }
            }
            int[] iArr6 = this.f20011e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i21 = this.f20010d * 2;
                this.f20010d = i21;
                this.f20016j = false;
                this.f20015i = length - 1;
                this.f20013g = Arrays.copyOf(this.f20013g, i21);
                this.f20011e = Arrays.copyOf(this.f20011e, this.f20010d);
                this.f20012f = Arrays.copyOf(this.f20012f, this.f20010d);
            }
            this.f20011e[length] = hVar.f20045b;
            this.f20013g[length] = f11;
            int[] iArr7 = this.f20012f;
            if (i13 != -1) {
                iArr7[length] = iArr7[i13];
                iArr7[i13] = length;
            } else {
                iArr7[length] = this.f20014h;
                this.f20014h = length;
            }
            hVar.l++;
            hVar.a(bVar);
            this.f20007a++;
            if (!this.f20016j) {
                this.f20015i++;
            }
            int i22 = this.f20015i;
            int[] iArr8 = this.f20011e;
            if (i22 >= iArr8.length) {
                this.f20016j = true;
                this.f20015i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i11 = this.f20014h;
        for (int i12 = 0; i11 != -1 && i12 < this.f20007a; i12++) {
            h hVar = ((h[]) this.f20009c.f975d)[this.f20011e[i11]];
            if (hVar != null) {
                hVar.c(this.f20008b);
            }
            i11 = this.f20012f[i11];
        }
        this.f20014h = -1;
        this.f20015i = -1;
        this.f20016j = false;
        this.f20007a = 0;
    }

    public final float c(h hVar) {
        int i11 = this.f20014h;
        for (int i12 = 0; i11 != -1 && i12 < this.f20007a; i12++) {
            if (this.f20011e[i11] == hVar.f20045b) {
                return this.f20013g[i11];
            }
            i11 = this.f20012f[i11];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f20007a;
    }

    public final h e(int i11) {
        int i12 = this.f20014h;
        for (int i13 = 0; i12 != -1 && i13 < this.f20007a; i13++) {
            if (i13 == i11) {
                return ((h[]) this.f20009c.f975d)[this.f20011e[i12]];
            }
            i12 = this.f20012f[i12];
        }
        return null;
    }

    public final float f(int i11) {
        int i12 = this.f20014h;
        for (int i13 = 0; i12 != -1 && i13 < this.f20007a; i13++) {
            if (i13 == i11) {
                return this.f20013g[i12];
            }
            i12 = this.f20012f[i12];
        }
        return 0.0f;
    }

    public final void g(h hVar, float f11) {
        if (f11 == 0.0f) {
            h(hVar, true);
            return;
        }
        int i11 = this.f20014h;
        b bVar = this.f20008b;
        if (i11 == -1) {
            this.f20014h = 0;
            this.f20013g[0] = f11;
            this.f20011e[0] = hVar.f20045b;
            this.f20012f[0] = -1;
            hVar.l++;
            hVar.a(bVar);
            this.f20007a++;
            if (this.f20016j) {
                return;
            }
            int i12 = this.f20015i + 1;
            this.f20015i = i12;
            int[] iArr = this.f20011e;
            if (i12 >= iArr.length) {
                this.f20016j = true;
                this.f20015i = iArr.length - 1;
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.f20007a; i14++) {
            int i15 = this.f20011e[i11];
            int i16 = hVar.f20045b;
            if (i15 == i16) {
                this.f20013g[i11] = f11;
                return;
            }
            if (i15 < i16) {
                i13 = i11;
            }
            i11 = this.f20012f[i11];
        }
        int length = this.f20015i;
        int i17 = length + 1;
        if (this.f20016j) {
            int[] iArr2 = this.f20011e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i17;
        }
        int[] iArr3 = this.f20011e;
        if (length >= iArr3.length && this.f20007a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f20011e;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    length = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f20011e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i19 = this.f20010d * 2;
            this.f20010d = i19;
            this.f20016j = false;
            this.f20015i = length - 1;
            this.f20013g = Arrays.copyOf(this.f20013g, i19);
            this.f20011e = Arrays.copyOf(this.f20011e, this.f20010d);
            this.f20012f = Arrays.copyOf(this.f20012f, this.f20010d);
        }
        this.f20011e[length] = hVar.f20045b;
        this.f20013g[length] = f11;
        int[] iArr6 = this.f20012f;
        if (i13 != -1) {
            iArr6[length] = iArr6[i13];
            iArr6[i13] = length;
        } else {
            iArr6[length] = this.f20014h;
            this.f20014h = length;
        }
        hVar.l++;
        hVar.a(bVar);
        int i21 = this.f20007a + 1;
        this.f20007a = i21;
        if (!this.f20016j) {
            this.f20015i++;
        }
        int[] iArr7 = this.f20011e;
        if (i21 >= iArr7.length) {
            this.f20016j = true;
        }
        if (this.f20015i >= iArr7.length) {
            this.f20016j = true;
            this.f20015i = iArr7.length - 1;
        }
    }

    public final float h(h hVar, boolean z11) {
        int i11 = this.f20014h;
        if (i11 == -1) {
            return 0.0f;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.f20007a) {
            if (this.f20011e[i11] == hVar.f20045b) {
                int i14 = this.f20014h;
                int[] iArr = this.f20012f;
                if (i11 == i14) {
                    this.f20014h = iArr[i11];
                } else {
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    hVar.c(this.f20008b);
                }
                hVar.l--;
                this.f20007a--;
                this.f20011e[i11] = -1;
                if (this.f20016j) {
                    this.f20015i = i11;
                }
                return this.f20013g[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.f20012f[i11];
        }
        return 0.0f;
    }

    public final String toString() {
        int i11 = this.f20014h;
        String string = "";
        for (int i12 = 0; i11 != -1 && i12 < this.f20007a; i12++) {
            StringBuilder sbO = i.o(string.concat(" -> "));
            sbO.append(this.f20013g[i11]);
            sbO.append(" : ");
            StringBuilder sbO2 = i.o(sbO.toString());
            sbO2.append(((h[]) this.f20009c.f975d)[this.f20011e[i11]]);
            string = sbO2.toString();
            i11 = this.f20012f[i11];
        }
        return string;
    }
}
