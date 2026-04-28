package w2;

import a3.l3;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import c5.u3;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import m2.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static int a(s1 s1Var, HandwritingGesture handwritingGesture) {
        v2.h hVar = s1Var.f43043a;
        y2.c cVar = y2.c.MergeIfPossible;
        hVar.f41936b.a().m();
        v2.a aVar = hVar.f41936b;
        aVar.f41925g = null;
        s1Var.l(aVar);
        v2.h.a(hVar, true, cVar);
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        s1.h(s1Var, fallbackText, null, false, 12);
        return 5;
    }

    public static int b(HandwritingGesture handwritingGesture, sg.c cVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cVar.invoke(new r5.a(fallbackText, 1));
        return 5;
    }

    public static void c(s1 s1Var, long j9, int i11) {
        if (m5.t0.d(j9)) {
            v2.h hVar = s1Var.f43043a;
            y2.c cVar = y2.c.MergeIfPossible;
            hVar.f41936b.a().m();
            v2.a aVar = hVar.f41936b;
            aVar.f41925g = null;
            s1Var.l(aVar);
            v2.h.a(hVar, true, cVar);
            return;
        }
        long jE = s1Var.e(j9);
        v2.h hVar2 = s1Var.f43043a;
        y2.c cVar2 = y2.c.MergeIfPossible;
        hVar2.f41936b.a().m();
        v2.a aVar2 = hVar2.f41936b;
        int i12 = (int) (jE >> 32);
        int i13 = (int) (jE & 4294967295L);
        k0 k0Var = aVar2.f41920b;
        if (i12 >= i13) {
            i4.a.f(r8.k.k("Do not set reversed or empty range: ", i12, i13, " > "));
            return;
        }
        aVar2.f41925g = new Pair(new v2.i(i11), new m5.t0(m5.k0.b(n80.p.c(i12, 0, k0Var.length()), n80.p.c(i13, 0, k0Var.length()))));
        v2.h.a(hVar2, true, cVar2);
    }

    public static void d(long j9, m5.h hVar, boolean z11, sg.c cVar) {
        if (z11) {
            j9 = c0.a(j9, hVar);
        }
        int i11 = (int) (4294967295L & j9);
        cVar.invoke(new u(new r5.g[]{new r5.x(i11, i11), new r5.e(m5.t0.e(j9), 0)}));
    }

    public static int e(m2.e1 e1Var, HandwritingGesture handwritingGesture, l3 l3Var, u3 u3Var, sg.c cVar) {
        int i11;
        a2 a2VarD;
        a2 a2VarD2;
        m5.h hVar = e1Var.f28827j;
        if (hVar == null) {
            return 3;
        }
        a2 a2VarD3 = e1Var.d();
        if (!Intrinsics.areEqual(hVar, a2VarD3 != null ? a2VarD3.f28762a.f29617a.f29603a : null)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jN = c0.n(e1Var, i4.g0.F(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (m5.t0.d(jN)) {
                return b(selectGesture, cVar);
            }
            cVar.invoke(new r5.x((int) (jN >> 32), (int) (jN & 4294967295L)));
            if (l3Var != null) {
                l3Var.h(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i12 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jN2 = c0.n(e1Var, i4.g0.F(deleteGesture.getDeletionArea()), i12);
                if (m5.t0.d(jN2)) {
                    return b(deleteGesture, cVar);
                }
                d(jN2, hVar, i12 == 1, cVar);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i13 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jC = c0.c(e1Var, i4.g0.F(deleteRangeGesture.getDeletionStartArea()), i4.g0.F(deleteRangeGesture.getDeletionEndArea()), i13);
                    if (m5.t0.d(jC)) {
                        return b(deleteRangeGesture, cVar);
                    }
                    d(jC, hVar, i13 == 1, cVar);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (u3Var == null) {
                        return b(joinOrSplitGesture, cVar);
                    }
                    long jH = c0.h(joinOrSplitGesture.getJoinOrSplitPoint());
                    a2 a2VarD4 = e1Var.d();
                    int iM = a2VarD4 != null ? c0.m(a2VarD4.f28762a.f29618b, jH, e1Var.c(), u3Var) : -1;
                    if (iM == -1 || ((a2VarD2 = e1Var.d()) != null && c0.e(a2VarD2.f28762a, iM))) {
                        return b(joinOrSplitGesture, cVar);
                    }
                    long jF = c0.f(iM, hVar);
                    if (!m5.t0.d(jF)) {
                        d(jF, hVar, false, cVar);
                        return 1;
                    }
                    int i14 = (int) (jF >> 32);
                    cVar.invoke(new u(new r5.g[]{new r5.x(i14, i14), new r5.a(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (u3Var == null) {
                        return b(insertGesture, cVar);
                    }
                    long jH2 = c0.h(insertGesture.getInsertionPoint());
                    a2 a2VarD5 = e1Var.d();
                    int iM2 = a2VarD5 != null ? c0.m(a2VarD5.f28762a.f29618b, jH2, e1Var.c(), u3Var) : -1;
                    if (iM2 == -1 || ((a2VarD = e1Var.d()) != null && c0.e(a2VarD.f28762a, iM2))) {
                        return b(insertGesture, cVar);
                    }
                    cVar.invoke(new u(new r5.g[]{new r5.x(iM2, iM2), new r5.a(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                a2 a2VarD6 = e1Var.d();
                long jB = c0.b(a2VarD6 != null ? a2VarD6.f28762a : null, c0.h(removeSpaceGesture.getStartPoint()), c0.h(removeSpaceGesture.getEndPoint()), e1Var.c(), u3Var);
                if (m5.t0.d(jB)) {
                    return b(removeSpaceGesture, cVar);
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = -1;
                Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = -1;
                String strF = new Regex("\\s+").f(m5.k0.l(jB, hVar), new s(intRef, intRef2, 0));
                int i15 = intRef.element;
                if (i15 == -1 || (i11 = intRef2.element) == -1) {
                    return b(removeSpaceGesture, cVar);
                }
                int i16 = (int) (jB >> 32);
                cVar.invoke(new u(new r5.g[]{new r5.x(i16 + i15, i16 + i11), new r5.a(strF.substring(i15, strF.length() - (m5.t0.e(jB) - intRef2.element)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jC2 = c0.c(e1Var, i4.g0.F(selectRangeGesture.getSelectionStartArea()), i4.g0.F(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (m5.t0.d(jC2)) {
                return b(selectRangeGesture, cVar);
            }
            cVar.invoke(new r5.x((int) (jC2 >> 32), (int) (jC2 & 4294967295L)));
            if (l3Var != null) {
                l3Var.h(true);
            }
        }
        return 1;
    }

    public static int f(s1 s1Var, HandwritingGesture handwritingGesture, o1 o1Var, Function0 function0, u3 u3Var) {
        int i11;
        m5.q0 q0VarG;
        int i12;
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jO = c0.o(o1Var, i4.g0.F(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (m5.t0.d(jO)) {
                return a(s1Var, selectGesture);
            }
            s1Var.j(jO);
            if (function0 != null) {
                function0.invoke();
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                i12 = deleteGesture.getGranularity() == 1 ? 1 : 0;
                long jO2 = c0.o(o1Var, i4.g0.F(deleteGesture.getDeletionArea()), i12);
                if (m5.t0.d(jO2)) {
                    return a(s1Var, deleteGesture);
                }
                if (i12 == 1) {
                    jO2 = c0.a(jO2, s1Var.d());
                }
                s1.i(s1Var, "", jO2, false, 12);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    i12 = deleteRangeGesture.getGranularity() == 1 ? 1 : 0;
                    long jD = c0.d(o1Var, i4.g0.F(deleteRangeGesture.getDeletionStartArea()), i4.g0.F(deleteRangeGesture.getDeletionEndArea()), i12);
                    if (m5.t0.d(jD)) {
                        return a(s1Var, deleteRangeGesture);
                    }
                    if (i12 == 1) {
                        jD = c0.a(jD, s1Var.d());
                    }
                    s1.i(s1Var, "", jD, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (s1Var.f43043a.b() != s1Var.f43043a.b()) {
                        return 3;
                    }
                    long jH = c0.h(joinOrSplitGesture.getJoinOrSplitPoint());
                    m5.q0 q0VarG2 = o1Var.f43008b.g();
                    int iM = q0VarG2 != null ? c0.m(q0VarG2.f29618b, jH, o1Var.d(), u3Var) : -1;
                    if (iM == -1 || ((q0VarG = o1Var.f43008b.g()) != null && c0.e(q0VarG, iM))) {
                        return a(s1Var, joinOrSplitGesture);
                    }
                    long jF = c0.f(iM, s1Var.d());
                    if (m5.t0.d(jF)) {
                        s1.i(s1Var, " ", jF, false, 12);
                        return 1;
                    }
                    s1.i(s1Var, "", jF, false, 12);
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    long jH2 = c0.h(insertGesture.getInsertionPoint());
                    m5.q0 q0VarG3 = o1Var.f43008b.g();
                    int iM2 = q0VarG3 != null ? c0.m(q0VarG3.f29618b, jH2, o1Var.d(), u3Var) : -1;
                    if (iM2 == -1) {
                        return a(s1Var, insertGesture);
                    }
                    s1.i(s1Var, insertGesture.getTextToInsert(), m5.k0.b(iM2, iM2), false, 12);
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                long jB = c0.b(o1Var.f43008b.g(), c0.h(removeSpaceGesture.getStartPoint()), c0.h(removeSpaceGesture.getEndPoint()), o1Var.d(), u3Var);
                if (m5.t0.d(jB)) {
                    return a(s1Var, removeSpaceGesture);
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = -1;
                Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = -1;
                String strF = new Regex("\\s+").f(m5.k0.l(jB, s1Var.d()), new s(intRef, intRef2, 1));
                int i13 = intRef.element;
                if (i13 == -1 || (i11 = intRef2.element) == -1) {
                    return a(s1Var, removeSpaceGesture);
                }
                int i14 = (int) (jB >> 32);
                s1.i(s1Var, strF.substring(intRef.element, strF.length() - (m5.t0.e(jB) - intRef2.element)), m5.k0.b(i13 + i14, i14 + i11), false, 12);
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jD2 = c0.d(o1Var, i4.g0.F(selectRangeGesture.getSelectionStartArea()), i4.g0.F(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (m5.t0.d(jD2)) {
                return a(s1Var, selectRangeGesture);
            }
            s1Var.j(jD2);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return 1;
    }

    public static boolean g(m2.e1 e1Var, PreviewableHandwritingGesture previewableHandwritingGesture, l3 l3Var, CancellationSignal cancellationSignal) {
        m5.h hVar = e1Var.f28827j;
        if (hVar != null) {
            a2 a2VarD = e1Var.d();
            if (Intrinsics.areEqual(hVar, a2VarD != null ? a2VarD.f28762a.f29617a.f29603a : null)) {
                if (previewableHandwritingGesture instanceof SelectGesture) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (l3Var != null) {
                        long jN = c0.n(e1Var, i4.g0.F(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        m2.e1 e1Var2 = l3Var.f451d;
                        if (e1Var2 != null) {
                            e1Var2.f(jN);
                        }
                        m2.e1 e1Var3 = l3Var.f451d;
                        if (e1Var3 != null) {
                            e1Var3.e(m5.t0.f29648b);
                        }
                        if (!m5.t0.d(jN)) {
                            l3Var.t(false);
                            l3Var.q(m2.u0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (l3Var != null) {
                        long jN2 = c0.n(e1Var, i4.g0.F(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        m2.e1 e1Var4 = l3Var.f451d;
                        if (e1Var4 != null) {
                            e1Var4.e(jN2);
                        }
                        m2.e1 e1Var5 = l3Var.f451d;
                        if (e1Var5 != null) {
                            e1Var5.f(m5.t0.f29648b);
                        }
                        if (!m5.t0.d(jN2)) {
                            l3Var.t(false);
                            l3Var.q(m2.u0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (l3Var != null) {
                        long jC = c0.c(e1Var, i4.g0.F(selectRangeGesture.getSelectionStartArea()), i4.g0.F(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        m2.e1 e1Var6 = l3Var.f451d;
                        if (e1Var6 != null) {
                            e1Var6.f(jC);
                        }
                        m2.e1 e1Var7 = l3Var.f451d;
                        if (e1Var7 != null) {
                            e1Var7.e(m5.t0.f29648b);
                        }
                        if (!m5.t0.d(jC)) {
                            l3Var.t(false);
                            l3Var.q(m2.u0.None);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (l3Var != null) {
                        long jC2 = c0.c(e1Var, i4.g0.F(deleteRangeGesture.getDeletionStartArea()), i4.g0.F(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        m2.e1 e1Var8 = l3Var.f451d;
                        if (e1Var8 != null) {
                            e1Var8.e(jC2);
                        }
                        m2.e1 e1Var9 = l3Var.f451d;
                        if (e1Var9 != null) {
                            e1Var9.f(m5.t0.f29648b);
                        }
                        if (!m5.t0.d(jC2)) {
                            l3Var.t(false);
                            l3Var.q(m2.u0.None);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new i5.e(l3Var, 2));
                }
                return true;
            }
        }
        return false;
    }

    public static boolean h(s1 s1Var, PreviewableHandwritingGesture previewableHandwritingGesture, o1 o1Var, CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
            c(s1Var, c0.o(o1Var, i4.g0.F(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else if (previewableHandwritingGesture instanceof DeleteGesture) {
            DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
            c(s1Var, c0.o(o1Var, i4.g0.F(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() == 1 ? 1 : 0), 1);
        } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
            c(s1Var, c0.d(o1Var, i4.g0.F(selectRangeGesture.getSelectionStartArea()), i4.g0.F(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1), 0);
        } else {
            if (!(previewableHandwritingGesture instanceof DeleteRangeGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
            c(s1Var, c0.d(o1Var, i4.g0.F(deleteRangeGesture.getDeletionStartArea()), i4.g0.F(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() == 1 ? 1 : 0), 1);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new i5.e(s1Var, 1));
        }
        return true;
    }
}
