package x2;

import a3.l2;
import m2.t0;
import m5.q0;
import w2.c0;
import w2.o1;
import w2.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final long a(s1 s1Var, w wVar, o1 o1Var, long j9) {
        long j11;
        long jN = wVar.n();
        if ((9223372034707292159L & jN) != 9205357640488583168L && s1Var.d().f41928c.length() != 0) {
            long j12 = s1Var.d().f41929d;
            t0 t0VarL = wVar.l();
            int i11 = t0VarL == null ? -1 : e.$EnumSwitchMapping$0[t0VarL.ordinal()];
            if (i11 != -1) {
                if (i11 == 1 || i11 == 2) {
                    int i12 = m5.t0.f29649c;
                    j11 = j12 >> 32;
                } else {
                    if (i11 != 3) {
                        e40.a.f();
                        return 0L;
                    }
                    int i13 = m5.t0.f29649c;
                    j11 = j12 & 4294967295L;
                }
                int i14 = (int) j11;
                q0 q0VarG = o1Var.f43008b.g();
                if (q0VarG != null) {
                    m5.r rVar = q0VarG.f29618b;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jN >> 32));
                    int iD = rVar.d(i14);
                    float fG = q0VarG.g(iD);
                    float fH = q0VarG.h(iD);
                    float fB = n80.p.b(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
                    if (z5.l.a(j9, 0L) || Math.abs(fIntBitsToFloat - fB) <= ((int) (j9 >> 32)) / 2) {
                        float f11 = rVar.f(iD);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((rVar.b(iD) - f11) / 2) + f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(fB)) << 32);
                        z4.z zVarD = o1Var.d();
                        h4.b bVar = null;
                        if (zVarD != null) {
                            if (!zVarD.n()) {
                                zVarD = null;
                            }
                            if (zVarD != null) {
                                jFloatToRawIntBits = c0.i(jFloatToRawIntBits, l2.c(zVarD));
                            }
                        }
                        z4.z zVarD2 = o1Var.d();
                        if (zVarD2 != null) {
                            if (!zVarD2.n()) {
                                zVarD2 = null;
                            }
                            if (zVarD2 != null) {
                                z4.z zVar = (z4.z) o1Var.f43010d.getValue();
                                if (zVar != null) {
                                    if (!zVar.n()) {
                                        zVar = null;
                                    }
                                    if (zVar != null) {
                                        bVar = new h4.b(zVar.g(zVarD2, jFloatToRawIntBits));
                                    }
                                }
                                if (bVar != null) {
                                    return bVar.f21378a;
                                }
                            }
                        }
                        return jFloatToRawIntBits;
                    }
                }
            }
        }
        return 9205357640488583168L;
    }
}
