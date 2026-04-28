package w2;

import android.content.ClipData;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import kotlin.jvm.internal.Intrinsics;
import m3.v2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements j7.c, v2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f42992b = new n0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42993a;

    public n0(p0 p0Var) {
        this.f42993a = 1;
    }

    public static long c(long j9, j0 j0Var, m0 m0Var) {
        long jB;
        int i11 = m5.t0.f29649c;
        long jA = j0Var.a((int) (j9 >> 32), true);
        long jA2 = m5.t0.d(j9) ? jA : j0Var.a((int) (j9 & 4294967295L), true);
        t1 t1Var = null;
        t1 t1Var2 = m0Var != null ? m0Var.f42983a : null;
        if (m5.t0.d(j9)) {
            t1Var = t1Var2;
        } else if (m0Var != null) {
            t1Var = m0Var.f42984b;
        }
        if (t1Var2 != null && !m5.t0.d(jA)) {
            int i12 = p1.$EnumSwitchMapping$0[t1Var2.ordinal()];
            if (i12 == 1) {
                int i13 = (int) (jA >> 32);
                jA = m5.k0.b(i13, i13);
            } else {
                if (i12 != 2) {
                    e40.a.f();
                    return 0L;
                }
                int i14 = (int) (jA & 4294967295L);
                jA = m5.k0.b(i14, i14);
            }
        }
        if (t1Var != null && !m5.t0.d(jA2)) {
            int i15 = p1.$EnumSwitchMapping$0[t1Var.ordinal()];
            if (i15 == 1) {
                int i16 = (int) (jA2 >> 32);
                jB = m5.k0.b(i16, i16);
            } else {
                if (i15 != 2) {
                    e40.a.f();
                    return 0L;
                }
                int i17 = (int) (jA2 & 4294967295L);
                jB = m5.k0.b(i17, i17);
            }
            jA2 = jB;
        }
        int iMin = Math.min(m5.t0.g(jA), m5.t0.g(jA2));
        int iMax = Math.max(m5.t0.f(jA), m5.t0.f(jA2));
        return m5.t0.h(j9) ? m5.k0.b(iMax, iMin) : m5.k0.b(iMin, iMax);
    }

    @Override // m3.v2
    public boolean a(Object obj, Object obj2) {
        switch (this.f42993a) {
            case 2:
                i1 i1Var = (i1) obj;
                i1 i1Var2 = (i1) obj2;
                if (i1Var == null || i1Var2 == null) {
                    if ((i1Var == null) ^ (i1Var2 == null)) {
                    }
                } else if (i1Var.f42939e != i1Var2.f42939e || i1Var.f42940f != i1Var2.f42940f || i1Var.f42936b != i1Var2.f42936b || !Intrinsics.areEqual(i1Var.f42937c, i1Var2.f42937c) || !z5.a.c(i1Var.f42938d, i1Var2.f42938d)) {
                }
                break;
            default:
                j1 j1Var = (j1) obj;
                j1 j1Var2 = (j1) obj2;
                if (j1Var == null || j1Var2 == null) {
                    if ((j1Var == null) ^ (j1Var2 == null)) {
                    }
                } else if (j1Var.f42948a != j1Var2.f42948a || !Intrinsics.areEqual(j1Var.f42949b, j1Var2.f42949b) || j1Var.f42950c != j1Var2.f42950c || j1Var.f42951d != j1Var2.f42951d || j1Var.f42952e != j1Var2.f42952e) {
                }
                break;
        }
        return true;
    }

    @Override // j7.c
    public boolean b(se.b bVar, int i11, Bundle bundle) {
        if ((i11 & 1) != 0) {
            try {
                ((InputContentInfo) ((lz.i) bVar.f39010b).f28446b).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((lz.i) bVar.f39010b).f28446b;
                inputContentInfo.getClass();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e5) {
                e5.toString();
                return false;
            }
        }
        lz.i iVar = (lz.i) bVar.f39010b;
        lz.i iVar2 = (lz.i) bVar.f39010b;
        new ClipData(((InputContentInfo) iVar.f28446b).getDescription(), new ClipData.Item(((InputContentInfo) iVar2.f28446b).getContentUri()));
        ((InputContentInfo) iVar2.f28446b).getDescription();
        ((InputContentInfo) iVar2.f28446b).getLinkUri();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        return false;
    }

    public String toString() {
        switch (this.f42993a) {
            case 0:
                return "SingleLineCodepointTransformation";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n0(int i11) {
        this.f42993a = i11;
    }
}
