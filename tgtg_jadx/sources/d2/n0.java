package d2;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static final void a(b4.t tVar, f fVar, h hVar, b4.j jVar, int i11, int i12, final u3.d dVar, m3.n nVar, final int i13, final int i14) {
        int i15;
        final b4.t tVar2;
        final f fVar2;
        final h hVar2;
        final b4.j jVar2;
        final int i16;
        m3.s sVar;
        final int i17;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1303174015);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar2.f(tVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar2.f(fVar) ? 32 : 16;
        }
        int i21 = i14 & 4;
        if (i21 != 0) {
            i15 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= sVar2.f(hVar) ? 256 : 128;
        }
        int i22 = i15 | 224256;
        if ((i13 & 1572864) == 0) {
            i22 |= sVar2.h(dVar) ? 1048576 : 524288;
        }
        if (sVar2.R(i22 & 1, (599187 & i22) != 599186)) {
            if (i18 != 0) {
                tVar = b4.q.f5711a;
            }
            b4.t tVar3 = tVar;
            if (i19 != 0) {
                fVar = i.f13801a;
            }
            if (i21 != 0) {
                hVar = i.f13803c;
            }
            h hVar3 = hVar;
            b4.j jVar3 = b4.d.f5692j;
            int i23 = (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | ((i22 << 3) & 29360128);
            f fVar3 = fVar;
            b(tVar3, fVar3, hVar3, u0.f13939b, dVar, sVar2, i23);
            jVar2 = jVar3;
            i16 = Integer.MAX_VALUE;
            hVar2 = hVar3;
            sVar = sVar2;
            i17 = Integer.MAX_VALUE;
            fVar2 = fVar3;
            tVar2 = tVar3;
        } else {
            sVar2.U();
            tVar2 = tVar;
            fVar2 = fVar;
            hVar2 = hVar;
            jVar2 = jVar;
            i16 = i12;
            sVar = sVar2;
            i17 = i11;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: d2.l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n0.a(tVar2, fVar2, hVar2, jVar2, i17, i16, dVar, (m3.n) obj, m3.i.F(i13 | 1), i14);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(b4.t tVar, f fVar, h hVar, u0 u0Var, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        int i13;
        b4.j jVar = b4.d.f5692j;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1956591841);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(fVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(hVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(jVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.d(Integer.MAX_VALUE) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.d(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(u0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.h(dVar) ? 8388608 : 4194304;
        }
        int i14 = i12;
        if (sVar.R(i14 & 1, (i14 & 4793491) != 4793490)) {
            int i15 = i14 & 3670016;
            boolean z11 = i15 == 1048576;
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (z11 || objM == fVar2) {
                objM = new r0(u0Var.f13940a);
                sVar.k0(objM);
            }
            r0 r0Var = (r0) objM;
            int i16 = i14 >> 3;
            boolean zF = ((((i16 & 14) ^ 6) > 4 && sVar.f(fVar)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && sVar.f(hVar)) || (i16 & 48) == 32) | ((((i16 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && sVar.f(jVar)) || (i16 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i16 & 7168) ^ 3072) > 2048 && sVar.d(Integer.MAX_VALUE)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && sVar.d(Integer.MAX_VALUE)) || (i16 & 24576) == 16384) | sVar.f(r0Var);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar2) {
                i13 = i15;
                t0 t0Var = new t0(fVar, hVar, fVar.a(), new d0(jVar), hVar.a(), r0Var);
                sVar.k0(t0Var);
                objM2 = t0Var;
            } else {
                i13 = i15;
            }
            t0 t0Var2 = (t0) objM2;
            boolean z12 = (i13 == 1048576) | ((i14 & 29360128) == 8388608) | ((i14 & 458752) == 131072);
            Object objM3 = sVar.M();
            Object obj = objM3;
            if (z12 || objM3 == fVar2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new u3.d(new m0(dVar, 0), true, -1192950673));
                u0Var.getClass();
                int i17 = p0.$EnumSwitchMapping$0[u0Var.f13940a.ordinal()];
                sVar.k0(arrayList);
                obj = arrayList;
            }
            u3.d dVarG = z4.c0.g((List) obj);
            boolean zF2 = sVar.f(t0Var2);
            Object objM4 = sVar.M();
            if (zF2 || objM4 == fVar2) {
                objM4 = new z4.b1(t0Var2);
                sVar.k0(objM4);
            }
            z4.u0 u0Var2 = (z4.u0) objM4;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0Var2, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r8.k.w(0, dVarG, sVar, true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(tVar, fVar, hVar, u0Var, dVar, i11, 4);
        }
    }
}
