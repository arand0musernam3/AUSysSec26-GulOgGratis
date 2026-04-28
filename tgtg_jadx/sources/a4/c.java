package a4;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import m3.e2;
import m3.f2;
import m3.l2;
import m3.p;
import m3.q2;
import m3.v;
import m3.x;
import q1.g0;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a4.b, a4.m] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [m3.a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List a(q2 q2Var, Integer num, int i11, Integer num2) {
        int iG;
        int iS;
        o0 o0Var;
        if (q2Var.f29403w || q2Var.p() == 0) {
            return n0.f26529a;
        }
        ?? mVar = new m(q2Var);
        if (num2 != null) {
            iG = num2.intValue();
        } else {
            iG = q2Var.f29402v;
            if (iG < 0) {
                iG = q2Var.G(i11, q2Var.f29383b);
            }
        }
        if (num == 0) {
            int iP = q2Var.f29390i - q2Var.P(q2Var.r(i11), q2Var.f29383b);
            g0 g0Var = q2Var.f29399s;
            num = Integer.valueOf(iP + ((g0Var == null || (o0Var = (o0) g0Var.b(i11)) == null) ? 0 : o0Var.f35722b));
        }
        int iR = q2Var.r(i11) * 5;
        int[] iArr = q2Var.f29383b;
        if (iR < iArr.length) {
            iS = q2Var.s(i11);
        } else {
            int iG2 = iG >= 0 ? q2Var.G(iG, iArr) : iG;
            iS = q2Var.s(iG);
            int i12 = iG;
            iG = iG2;
            i11 = i12;
        }
        while (i11 >= 0) {
            mVar.c(iS, (q2Var.f29383b[(q2Var.r(i11) * 5) + 1] & 536870912) != 0 ? q2Var.t(i11) : m3.m.f29332a, q2Var.Q(i11), num);
            num = q2Var.b(i11);
            if (iG >= 0) {
                int iG3 = q2Var.G(iG, q2Var.f29383b);
                iS = q2Var.s(iG);
                int i13 = iG;
                iG = iG3;
                i11 = i13;
            } else {
                i11 = iG;
            }
        }
        return mVar.f681a;
    }

    public static final Integer b(l2 l2Var, x xVar, int i11, int i12) {
        Integer numB;
        int[] iArr = l2Var.f29320b;
        while (true) {
            if (i11 >= i12) {
                return null;
            }
            int i13 = iArr[(i11 * 5) + 3] + i11;
            if (l2Var.j(i11) && l2Var.i(i11) == 206 && Intrinsics.areEqual(l2Var.p(i11, iArr), v.f29461e)) {
                Object objH = l2Var.h(i11, 0);
                f2 f2Var = objH instanceof f2 ? (f2) objH : null;
                e2 e2Var = f2Var != null ? f2Var.f29279a : null;
                p pVar = e2Var instanceof p ? (p) e2Var : null;
                if (pVar != null && Intrinsics.areEqual(pVar.f29358a, xVar)) {
                    return Integer.valueOf(i11);
                }
            }
            if (l2Var.d(i11) && (numB = b(l2Var, xVar, i11 + 1, i13)) != null) {
                return Integer.valueOf(numB.intValue());
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a4.b, a4.m] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList c(l2 l2Var, int i11, Integer num) {
        ?? mVar = new m(l2Var);
        int iQ = l2Var.q(i11);
        m3.a aVarA = l2Var.a(i11);
        while (i11 >= 0) {
            mVar.c(l2Var.i(i11), l2Var.k(i11) ? l2Var.p(i11, l2Var.f29320b) : m3.m.f29332a, l2Var.f29319a.i(i11), num);
            if (iQ >= 0) {
                m3.a aVar = aVarA;
                aVarA = l2Var.a(iQ);
                i11 = iQ;
                iQ = l2Var.q(iQ);
                num = aVar;
            } else {
                i11 = iQ;
                num = aVarA;
            }
        }
        return mVar.f681a;
    }
}
