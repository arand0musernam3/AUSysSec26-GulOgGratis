package n3;

import java.util.ArrayList;
import m3.o2;
import m3.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f30489c = new u(1, 0, 2);

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        int[] iArr;
        m3.a aVar;
        int iC;
        int iD = sVar.d(0);
        if (q2Var.f29394n != 0) {
            m3.v.a("Cannot move a group while inserting");
        }
        if (iD < 0) {
            m3.v.a("Parameter offset is out of bounds");
        }
        if (iD == 0) {
            return;
        }
        int i11 = q2Var.f29400t;
        int i12 = q2Var.f29402v;
        int i13 = q2Var.f29401u;
        int i14 = i11;
        while (true) {
            iArr = q2Var.f29383b;
            if (iD <= 0) {
                break;
            }
            i14 += iArr[(q2Var.r(i14) * 5) + 3];
            if (i14 > i13) {
                m3.v.a("Parameter offset is out of bounds");
            }
            iD--;
        }
        int i15 = iArr[(q2Var.r(i14) * 5) + 3];
        int iG = q2Var.g(q2Var.r(q2Var.f29400t), q2Var.f29383b);
        int iG2 = q2Var.g(q2Var.r(i14), q2Var.f29383b);
        int i16 = i14 + i15;
        int iG3 = q2Var.g(q2Var.r(i16), q2Var.f29383b);
        int i17 = iG3 - iG2;
        q2Var.x(i17, Math.max(q2Var.f29400t - 1, 0));
        q2Var.w(i15);
        int[] iArr2 = q2Var.f29383b;
        int iR = q2Var.r(i16) * 5;
        kotlin.collections.x.f(q2Var.r(i11) * 5, iArr2, iR, (i15 * 5) + iR, iArr2);
        if (i17 > 0) {
            Object[] objArr = q2Var.f29384c;
            int iH = q2Var.h(iG2 + i17);
            System.arraycopy(objArr, iH, objArr, iG, q2Var.h(iG3 + i17) - iH);
        }
        int i18 = iG2 + i17;
        int i19 = i18 - iG;
        int i21 = q2Var.f29392k;
        int i22 = q2Var.l;
        int length = q2Var.f29384c.length;
        int i23 = q2Var.f29393m;
        int i24 = i11 + i15;
        int i25 = i11;
        while (i25 < i24) {
            int iR2 = q2Var.r(i25);
            int i26 = i19;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = q2.i(q2.i(q2Var.g(iR2, iArr2) - i26, i23 < iR2 ? 0 : i21, i22, length), q2Var.f29392k, q2Var.l, q2Var.f29384c.length);
            i25++;
            i19 = i26;
            iArr2 = iArr3;
            i21 = i21;
        }
        int i27 = i16 + i15;
        int iP = q2Var.p();
        int iA = o2.a(q2Var.f29385d, i16, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < q2Var.f29385d.size() && (iC = q2Var.c((aVar = (m3.a) q2Var.f29385d.get(iA)))) >= i16 && iC < i27) {
                arrayList.add(aVar);
            }
        }
        int i28 = i11 - i16;
        int size = arrayList.size();
        for (int i29 = 0; i29 < size; i29++) {
            m3.a aVar2 = (m3.a) arrayList.get(i29);
            int iC2 = q2Var.c(aVar2) + i28;
            if (iC2 >= q2Var.f29388g) {
                aVar2.f29174a = -(iP - iC2);
            } else {
                aVar2.f29174a = iC2;
            }
            q2Var.f29385d.add(o2.a(q2Var.f29385d, iC2, iP), aVar2);
        }
        if (q2Var.K(i16, i15)) {
            m3.v.a("Unexpectedly removed anchors");
        }
        q2Var.m(i12, q2Var.f29401u, i11);
        if (i17 > 0) {
            q2Var.L(i18, i17, i16 - 1);
        }
    }
}
