package p4;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final void a(i4.h hVar, double d3, double d11, double d12, double d13, double d14, double d15, double d16, boolean z11, boolean z12) {
        double d17;
        double d18;
        double d19 = d14;
        double d21 = (d16 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d21);
        double dSin = Math.sin(d21);
        double d22 = ((d11 * dSin) + (d3 * dCos)) / d19;
        double d23 = ((d11 * dCos) + ((-d3) * dSin)) / d15;
        double d24 = ((d13 * dSin) + (d12 * dCos)) / d19;
        double d25 = ((d13 * dCos) + ((-d12) * dSin)) / d15;
        double d26 = d22 - d24;
        double d27 = d23 - d25;
        double d28 = 2;
        double d29 = (d22 + d24) / d28;
        double d31 = (d23 + d25) / d28;
        double d32 = (d27 * d27) + (d26 * d26);
        if (d32 == 0.0d) {
            return;
        }
        double d33 = (1.0d / d32) - 0.25d;
        if (d33 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d32) / 1.99999d);
            a(hVar, d3, d11, d12, d13, d19 * dSqrt, d15 * dSqrt, d16, z11, z12);
            return;
        }
        double dSqrt2 = Math.sqrt(d33);
        double d34 = d26 * dSqrt2;
        double d35 = dSqrt2 * d27;
        if (z11 == z12) {
            d17 = d29 - d35;
            d18 = d31 + d34;
        } else {
            d17 = d29 + d35;
            d18 = d31 - d34;
        }
        double dAtan2 = Math.atan2(d23 - d18, d22 - d17);
        double dAtan22 = Math.atan2(d25 - d18, d24 - d17) - dAtan2;
        if (z12 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d36 = d17 * d19;
        double d37 = d18 * d15;
        double d38 = (d36 * dCos) - (d37 * dSin);
        double d39 = (d37 * dCos) + (d36 * dSin);
        double d41 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d41) / 3.141592653589793d));
        double dCos2 = Math.cos(d21);
        double dSin2 = Math.sin(d21);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d42 = dAtan22;
        double d43 = -d19;
        double d44 = d43 * dCos2;
        double d45 = d15 * dSin2;
        double d46 = (d44 * dSin3) - (d45 * dCos3);
        double d47 = d43 * dSin2;
        double d48 = d15 * dCos2;
        double d49 = (dCos3 * d48) + (dSin3 * d47);
        double d51 = d42 / ((double) iCeil);
        double d52 = dAtan2;
        double d53 = d46;
        int i11 = 0;
        double d54 = d3;
        double d55 = d49;
        double d56 = d11;
        while (i11 < iCeil) {
            double d57 = d52 + d51;
            double dSin4 = Math.sin(d57);
            double dCos4 = Math.cos(d57);
            int i12 = i11;
            double d58 = (((d19 * dCos2) * dCos4) + d38) - (d45 * dSin4);
            int i13 = iCeil;
            double d59 = (d48 * dSin4) + (d19 * dSin2 * dCos4) + d39;
            double d61 = (d44 * dSin4) - (d45 * dCos4);
            double d62 = (dCos4 * d48) + (dSin4 * d47);
            double d63 = d57 - d52;
            double dTan = Math.tan(d63 / d28);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d41) - ((double) 1)) * Math.sin(d63)) / ((double) 3);
            hVar.f23258a.cubicTo((float) ((d53 * dSqrt3) + d54), (float) ((d55 * dSqrt3) + d56), (float) (d58 - (dSqrt3 * d61)), (float) (d59 - (dSqrt3 * d62)), (float) d58, (float) d59);
            dSin2 = dSin2;
            d54 = d58;
            i11 = i12 + 1;
            d38 = d38;
            d41 = d41;
            d52 = d57;
            d55 = d62;
            d53 = d61;
            d56 = d59;
            iCeil = i13;
            d19 = d14;
        }
    }

    public static final void b(List list, i4.h hVar) {
        Path path;
        int i11;
        float f11;
        int i12;
        b0 b0Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        List list2 = list;
        i4.h hVar2 = hVar;
        Path path2 = hVar2.f23258a;
        Path path3 = hVar2.f23258a;
        int i13 = path2.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
        path3.rewind();
        hVar2.i(i13);
        b0 b0Var2 = list2.isEmpty() ? j.f34357c : (b0) list2.get(0);
        int size = list2.size();
        float f20 = 0.0f;
        int i14 = 0;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        while (i14 < size) {
            b0 b0Var3 = (b0) list2.get(i14);
            if (b0Var3 instanceof j) {
                path3.close();
                path = path3;
                i11 = size;
                f11 = f20;
                i12 = i14;
                b0Var = b0Var3;
                f21 = f25;
                f23 = f21;
                f22 = f26;
                f24 = f22;
            } else {
                if (b0Var3 instanceof v) {
                    v vVar = (v) b0Var3;
                    float f27 = vVar.f34414c;
                    f23 += f27;
                    float f28 = vVar.f34415d;
                    f24 += f28;
                    path3.rMoveTo(f27, f28);
                    path = path3;
                    i11 = size;
                    f11 = f20;
                    i12 = i14;
                    f25 = f23;
                    f26 = f24;
                } else {
                    if (b0Var3 instanceof n) {
                        n nVar = (n) b0Var3;
                        float f29 = nVar.f34386c;
                        float f31 = nVar.f34387d;
                        hVar2.f(f29, f31);
                        f24 = f31;
                        f26 = f24;
                        path = path3;
                        f23 = f29;
                        f25 = f23;
                    } else {
                        if (b0Var3 instanceof u) {
                            u uVar = (u) b0Var3;
                            float f32 = uVar.f34413d;
                            float f33 = uVar.f34412c;
                            path3.rLineTo(f33, f32);
                            f23 += f33;
                            f24 += f32;
                        } else if (b0Var3 instanceof m) {
                            m mVar = (m) b0Var3;
                            float f34 = mVar.f34385d;
                            float f35 = mVar.f34384c;
                            hVar2.e(f35, f34);
                            f23 = f35;
                            path = path3;
                            f24 = f34;
                        } else if (b0Var3 instanceof t) {
                            float f36 = ((t) b0Var3).f34411c;
                            path3.rLineTo(f36, f20);
                            f23 += f36;
                        } else if (b0Var3 instanceof l) {
                            float f37 = ((l) b0Var3).f34383c;
                            hVar2.e(f37, f24);
                            f23 = f37;
                        } else {
                            if (b0Var3 instanceof z) {
                                f19 = ((z) b0Var3).f34426c;
                                path3.rLineTo(f20, f19);
                            } else if (b0Var3 instanceof a0) {
                                float f38 = ((a0) b0Var3).f34249c;
                                hVar2.e(f23, f38);
                                f24 = f38;
                            } else if (b0Var3 instanceof s) {
                                s sVar = (s) b0Var3;
                                path3.rCubicTo(sVar.f34405c, sVar.f34406d, sVar.f34407e, sVar.f34408f, sVar.f34409g, sVar.f34410h);
                                f21 = sVar.f34407e + f23;
                                f22 = sVar.f34408f + f24;
                                f23 += sVar.f34409g;
                                f19 = sVar.f34410h;
                            } else {
                                if (b0Var3 instanceof k) {
                                    k kVar = (k) b0Var3;
                                    path3.cubicTo(kVar.f34364c, kVar.f34365d, kVar.f34366e, kVar.f34367f, kVar.f34368g, kVar.f34369h);
                                    f21 = kVar.f34366e;
                                    f22 = kVar.f34367f;
                                    f15 = kVar.f34368g;
                                    f16 = kVar.f34369h;
                                } else if (b0Var3 instanceof x) {
                                    if (b0Var2.f34252a) {
                                        f18 = f24 - f22;
                                        f17 = f23 - f21;
                                    } else {
                                        f17 = f20;
                                        f18 = f17;
                                    }
                                    x xVar = (x) b0Var3;
                                    path3.rCubicTo(f17, f18, xVar.f34420c, xVar.f34421d, xVar.f34422e, xVar.f34423f);
                                    f21 = xVar.f34420c + f23;
                                    f22 = xVar.f34421d + f24;
                                    f23 += xVar.f34422e;
                                    f19 = xVar.f34423f;
                                } else if (b0Var3 instanceof p) {
                                    if (b0Var2.f34252a) {
                                        float f39 = 2;
                                        f23 = (f23 * f39) - f21;
                                        f24 = (f39 * f24) - f22;
                                    }
                                    p pVar = (p) b0Var3;
                                    path3.cubicTo(f23, f24, pVar.f34392c, pVar.f34393d, pVar.f34394e, pVar.f34395f);
                                    f21 = pVar.f34392c;
                                    f22 = pVar.f34393d;
                                    f15 = pVar.f34394e;
                                    f16 = pVar.f34395f;
                                } else if (b0Var3 instanceof w) {
                                    w wVar = (w) b0Var3;
                                    float f40 = wVar.f34419f;
                                    float f41 = wVar.f34418e;
                                    float f42 = wVar.f34417d;
                                    float f43 = wVar.f34416c;
                                    path3.rQuadTo(f43, f42, f41, f40);
                                    float f44 = f43 + f23;
                                    float f45 = f42 + f24;
                                    f23 += f41;
                                    f24 += f40;
                                    f21 = f44;
                                    path = path3;
                                    f22 = f45;
                                } else {
                                    if (b0Var3 instanceof o) {
                                        o oVar = (o) b0Var3;
                                        float f46 = oVar.f34391f;
                                        float f47 = oVar.f34390e;
                                        float f48 = oVar.f34389d;
                                        f14 = oVar.f34388c;
                                        path3.quadTo(f14, f48, f47, f46);
                                        path = path3;
                                        f24 = f46;
                                        f23 = f47;
                                        f22 = f48;
                                    } else if (b0Var3 instanceof y) {
                                        if (b0Var2.f34253b) {
                                            f12 = f23 - f21;
                                            f13 = f24 - f22;
                                        } else {
                                            f12 = f20;
                                            f13 = f12;
                                        }
                                        y yVar = (y) b0Var3;
                                        float f49 = yVar.f34425d;
                                        float f51 = yVar.f34424c;
                                        path3.rQuadTo(f12, f13, f51, f49);
                                        f14 = f12 + f23;
                                        float f52 = f13 + f24;
                                        f23 += f51;
                                        f24 += f49;
                                        path = path3;
                                        f22 = f52;
                                    } else if (b0Var3 instanceof q) {
                                        if (b0Var2.f34253b) {
                                            float f53 = 2;
                                            f23 = (f23 * f53) - f21;
                                            f24 = (f53 * f24) - f22;
                                        }
                                        q qVar = (q) b0Var3;
                                        float f54 = qVar.f34397d;
                                        float f55 = qVar.f34396c;
                                        path3.quadTo(f23, f24, f55, f54);
                                        path = path3;
                                        i11 = size;
                                        f11 = f20;
                                        i12 = i14;
                                        f22 = f24;
                                        b0Var = b0Var3;
                                        f24 = f54;
                                        f21 = f23;
                                        f23 = f55;
                                    } else if (b0Var3 instanceof r) {
                                        r rVar = (r) b0Var3;
                                        float f56 = rVar.f34403h + f23;
                                        float f57 = rVar.f34404i + f24;
                                        i11 = size;
                                        f11 = 0.0f;
                                        path = path3;
                                        i12 = i14;
                                        a(hVar, f23, f24, f56, f57, rVar.f34398c, rVar.f34399d, rVar.f34400e, rVar.f34401f, rVar.f34402g);
                                        f21 = f56;
                                        f23 = f21;
                                        f22 = f57;
                                        f24 = f22;
                                        b0Var = b0Var3;
                                    } else {
                                        path = path3;
                                        i11 = size;
                                        f11 = f20;
                                        i12 = i14;
                                        if (!(b0Var3 instanceof i)) {
                                            e40.a.f();
                                            return;
                                        }
                                        i iVar = (i) b0Var3;
                                        float f58 = iVar.f34356i;
                                        float f59 = iVar.f34355h;
                                        b0Var = b0Var3;
                                        a(hVar, f23, f24, f59, f58, iVar.f34350c, iVar.f34351d, iVar.f34352e, iVar.f34353f, iVar.f34354g);
                                        f22 = f58;
                                        f24 = f22;
                                        f21 = f59;
                                        f23 = f21;
                                    }
                                    i11 = size;
                                    f11 = f20;
                                    i12 = i14;
                                    b0Var = b0Var3;
                                    f21 = f14;
                                }
                                f24 = f16;
                                path = path3;
                                f23 = f15;
                            }
                            f24 += f19;
                        }
                        path = path3;
                    }
                    i11 = size;
                    f11 = f20;
                    i12 = i14;
                }
                b0Var = b0Var3;
            }
            i14 = i12 + 1;
            list2 = list;
            hVar2 = hVar;
            size = i11;
            path3 = path;
            b0Var2 = b0Var;
            f20 = f11;
        }
    }
}
