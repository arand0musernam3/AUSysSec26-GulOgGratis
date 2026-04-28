package androidx.constraintlayout.widget;

import android.util.Log;
import java.util.Arrays;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f2392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f2395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f2396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f2398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f2399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f2401j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f2402k;
    public int l;

    public final void a(float f11, int i11) {
        int i12 = this.f2397f;
        int[] iArr = this.f2395d;
        if (i12 >= iArr.length) {
            this.f2395d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f2396e;
            this.f2396e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f2395d;
        int i13 = this.f2397f;
        iArr2[i13] = i11;
        float[] fArr2 = this.f2396e;
        this.f2397f = i13 + 1;
        fArr2[i13] = f11;
    }

    public final void b(int i11, int i12) {
        int i13 = this.f2394c;
        int[] iArr = this.f2392a;
        if (i13 >= iArr.length) {
            this.f2392a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f2393b;
            this.f2393b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2392a;
        int i14 = this.f2394c;
        iArr3[i14] = i11;
        int[] iArr4 = this.f2393b;
        this.f2394c = i14 + 1;
        iArr4[i14] = i12;
    }

    public final void c(int i11, String str) {
        int i12 = this.f2400i;
        int[] iArr = this.f2398g;
        if (i12 >= iArr.length) {
            this.f2398g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f2399h;
            this.f2399h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f2398g;
        int i13 = this.f2400i;
        iArr2[i13] = i11;
        String[] strArr2 = this.f2399h;
        this.f2400i = i13 + 1;
        strArr2[i13] = str;
    }

    public final void d(int i11, boolean z11) {
        int i12 = this.l;
        int[] iArr = this.f2401j;
        if (i12 >= iArr.length) {
            this.f2401j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f2402k;
            this.f2402k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f2401j;
        int i13 = this.l;
        iArr2[i13] = i11;
        boolean[] zArr2 = this.f2402k;
        this.l = i13 + 1;
        zArr2[i13] = z11;
    }

    public final void e(l lVar) {
        for (int i11 = 0; i11 < this.f2394c; i11++) {
            int i12 = this.f2392a[i11];
            int i13 = this.f2393b[i11];
            if (i12 == 6) {
                lVar.f2407e.D = i13;
            } else if (i12 == 7) {
                lVar.f2407e.E = i13;
            } else if (i12 == 8) {
                lVar.f2407e.K = i13;
            } else if (i12 == 27) {
                lVar.f2407e.F = i13;
            } else if (i12 == 28) {
                lVar.f2407e.H = i13;
            } else if (i12 == 41) {
                lVar.f2407e.W = i13;
            } else if (i12 == 42) {
                lVar.f2407e.X = i13;
            } else if (i12 == 61) {
                lVar.f2407e.A = i13;
            } else if (i12 == 62) {
                lVar.f2407e.B = i13;
            } else if (i12 == 72) {
                lVar.f2407e.f2425g0 = i13;
            } else if (i12 == 73) {
                lVar.f2407e.f2427h0 = i13;
            } else if (i12 == 2) {
                lVar.f2407e.J = i13;
            } else if (i12 == 31) {
                lVar.f2407e.L = i13;
            } else if (i12 == 34) {
                lVar.f2407e.I = i13;
            } else if (i12 == 38) {
                lVar.f2403a = i13;
            } else if (i12 == 64) {
                lVar.f2406d.f2455b = i13;
            } else if (i12 == 66) {
                lVar.f2406d.f2459f = i13;
            } else if (i12 == 76) {
                lVar.f2406d.f2458e = i13;
            } else if (i12 == 78) {
                lVar.f2405c.f2468c = i13;
            } else if (i12 == 97) {
                lVar.f2407e.f2442p0 = i13;
            } else if (i12 == 93) {
                lVar.f2407e.M = i13;
            } else if (i12 != 94) {
                switch (i12) {
                    case 11:
                        lVar.f2407e.Q = i13;
                        break;
                    case 12:
                        lVar.f2407e.R = i13;
                        break;
                    case 13:
                        lVar.f2407e.N = i13;
                        break;
                    case 14:
                        lVar.f2407e.P = i13;
                        break;
                    case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                        lVar.f2407e.S = i13;
                        break;
                    case 16:
                        lVar.f2407e.O = i13;
                        break;
                    case 17:
                        lVar.f2407e.f2420e = i13;
                        break;
                    case 18:
                        lVar.f2407e.f2422f = i13;
                        break;
                    default:
                        switch (i12) {
                            case 21:
                                lVar.f2407e.f2418d = i13;
                                break;
                            case 22:
                                lVar.f2405c.f2467b = i13;
                                break;
                            case 23:
                                lVar.f2407e.f2416c = i13;
                                break;
                            case 24:
                                lVar.f2407e.G = i13;
                                break;
                            default:
                                switch (i12) {
                                    case 54:
                                        lVar.f2407e.Y = i13;
                                        break;
                                    case 55:
                                        lVar.f2407e.Z = i13;
                                        break;
                                    case 56:
                                        lVar.f2407e.f2413a0 = i13;
                                        break;
                                    case 57:
                                        lVar.f2407e.f2415b0 = i13;
                                        break;
                                    case 58:
                                        lVar.f2407e.f2417c0 = i13;
                                        break;
                                    case 59:
                                        lVar.f2407e.f2419d0 = i13;
                                        break;
                                    default:
                                        switch (i12) {
                                            case 82:
                                                lVar.f2406d.f2456c = i13;
                                                break;
                                            case 83:
                                                lVar.f2408f.f2480i = i13;
                                                break;
                                            case 84:
                                                lVar.f2406d.f2463j = i13;
                                                break;
                                            default:
                                                switch (i12) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        lVar.f2406d.l = i13;
                                                        break;
                                                    case 89:
                                                        lVar.f2406d.f2465m = i13;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                lVar.f2407e.T = i13;
            }
        }
        for (int i14 = 0; i14 < this.f2397f; i14++) {
            int i15 = this.f2395d[i14];
            float f11 = this.f2396e[i14];
            if (i15 == 19) {
                lVar.f2407e.f2424g = f11;
            } else if (i15 == 20) {
                lVar.f2407e.f2450x = f11;
            } else if (i15 == 37) {
                lVar.f2407e.f2451y = f11;
            } else if (i15 == 60) {
                lVar.f2408f.f2473b = f11;
            } else if (i15 == 63) {
                lVar.f2407e.C = f11;
            } else if (i15 == 79) {
                lVar.f2406d.f2460g = f11;
            } else if (i15 == 85) {
                lVar.f2406d.f2462i = f11;
            } else if (i15 != 87) {
                if (i15 == 39) {
                    lVar.f2407e.V = f11;
                } else if (i15 != 40) {
                    switch (i15) {
                        case 43:
                            lVar.f2405c.f2469d = f11;
                            break;
                        case 44:
                            p pVar = lVar.f2408f;
                            pVar.f2484n = f11;
                            pVar.f2483m = true;
                            break;
                        case 45:
                            lVar.f2408f.f2474c = f11;
                            break;
                        case 46:
                            lVar.f2408f.f2475d = f11;
                            break;
                        case 47:
                            lVar.f2408f.f2476e = f11;
                            break;
                        case 48:
                            lVar.f2408f.f2477f = f11;
                            break;
                        case 49:
                            lVar.f2408f.f2478g = f11;
                            break;
                        case 50:
                            lVar.f2408f.f2479h = f11;
                            break;
                        case 51:
                            lVar.f2408f.f2481j = f11;
                            break;
                        case 52:
                            lVar.f2408f.f2482k = f11;
                            break;
                        case 53:
                            lVar.f2408f.l = f11;
                            break;
                        default:
                            switch (i15) {
                                case 67:
                                    lVar.f2406d.f2461h = f11;
                                    break;
                                case 68:
                                    lVar.f2405c.f2470e = f11;
                                    break;
                                case 69:
                                    lVar.f2407e.f2421e0 = f11;
                                    break;
                                case 70:
                                    lVar.f2407e.f2423f0 = f11;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                            break;
                    }
                } else {
                    lVar.f2407e.U = f11;
                }
            }
        }
        for (int i16 = 0; i16 < this.f2400i; i16++) {
            int i17 = this.f2398g[i16];
            String str = this.f2399h[i16];
            if (i17 == 5) {
                lVar.f2407e.f2452z = str;
            } else if (i17 == 65) {
                lVar.f2406d.f2457d = str;
            } else if (i17 == 74) {
                m mVar = lVar.f2407e;
                mVar.f2433k0 = str;
                mVar.f2431j0 = null;
            } else if (i17 == 77) {
                lVar.f2407e.f2434l0 = str;
            } else if (i17 != 87) {
                if (i17 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    lVar.f2406d.f2464k = str;
                }
            }
        }
        for (int i18 = 0; i18 < this.l; i18++) {
            int i19 = this.f2401j[i18];
            boolean z11 = this.f2402k[i18];
            if (i19 == 44) {
                lVar.f2408f.f2483m = z11;
            } else if (i19 == 75) {
                lVar.f2407e.f2440o0 = z11;
            } else if (i19 != 87) {
                if (i19 == 80) {
                    lVar.f2407e.f2436m0 = z11;
                } else if (i19 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    lVar.f2407e.f2438n0 = z11;
                }
            }
        }
    }
}
