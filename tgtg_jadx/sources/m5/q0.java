package m5;

import android.graphics.RectF;
import android.text.Layout;
import androidx.lifecycle.n1;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f29617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f29618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f29622f;

    public q0(p0 p0Var, r rVar, long j9) {
        this.f29617a = p0Var;
        this.f29618b = rVar;
        this.f29619c = j9;
        ArrayList arrayList = rVar.f29630h;
        float fD = 0.0f;
        this.f29620d = arrayList.isEmpty() ? 0.0f : ((t) arrayList.get(0)).f29641a.f29514d.d(0);
        if (!arrayList.isEmpty()) {
            t tVar = (t) CollectionsKt.W(arrayList);
            fD = tVar.f29641a.f29514d.d(r4.f30532g - 1) + tVar.f29646f;
        }
        this.f29621e = fD;
        this.f29622f = rVar.f29629g;
    }

    public static int f(q0 q0Var, int i11) {
        return q0Var.f29618b.c(i11, false);
    }

    public final x5.j a(int i11) {
        r rVar = this.f29618b;
        rVar.l(i11);
        int length = ((h) rVar.f29623a.f3499a).f29538b.length();
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(i11 == length ? kotlin.collections.d0.g(arrayList) : k0.e(i11, arrayList));
        return tVar.f29641a.f29514d.f30531f.isRtlCharAt(tVar.d(i11)) ? x5.j.Rtl : x5.j.Ltr;
    }

    public final h4.c b(int i11) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        r rVar = this.f29618b;
        rVar.k(i11);
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(k0.e(i11, arrayList));
        b bVar = tVar.f29641a;
        int iD = tVar.d(i11);
        CharSequence charSequence = bVar.f29515e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(iD, "offset(", ") is out of bounds [0,");
            sbK.append(charSequence.length());
            sbK.append(')');
            s5.a.a(sbK.toString());
        }
        n5.i iVar = bVar.f29514d;
        Layout layout = iVar.f30531f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = iVar.g(lineForOffset);
        float fE = iVar.e(lineForOffset);
        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z11 || zIsRtlCharAt) {
            if (z11 && zIsRtlCharAt) {
                fH = iVar.i(iD, false);
                fH2 = iVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = iVar.h(iD, false);
                fH2 = iVar.h(iD + 1, true);
            } else {
                fI = iVar.i(iD, false);
                fI2 = iVar.i(iD + 1, true);
            }
            float f11 = fH;
            fI = fH2;
            fI2 = f11;
        } else {
            fI = iVar.h(iD, false);
            fI2 = iVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return tVar.a(new h4.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final h4.c c(int i11) {
        r rVar = this.f29618b;
        rVar.l(i11);
        int length = ((h) rVar.f29623a.f3499a).f29538b.length();
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(i11 == length ? kotlin.collections.d0.g(arrayList) : k0.e(i11, arrayList));
        b bVar = tVar.f29641a;
        int iD = tVar.d(i11);
        CharSequence charSequence = bVar.f29515e;
        n5.i iVar = bVar.f29514d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(iD, "offset(", ") is out of bounds [0,");
            sbK.append(charSequence.length());
            sbK.append(']');
            s5.a.a(sbK.toString());
        }
        float fH = iVar.h(iD, false);
        int lineForOffset = iVar.f30531f.getLineForOffset(iD);
        return tVar.a(new h4.c(fH, iVar.g(lineForOffset), fH, iVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j9 = this.f29619c;
        float f11 = (int) (j9 >> 32);
        r rVar = this.f29618b;
        return f11 < rVar.f29626d || rVar.f29625c || ((float) ((int) (j9 & 4294967295L))) < rVar.f29627e;
    }

    public final float e(int i11, boolean z11) {
        r rVar = this.f29618b;
        rVar.l(i11);
        int length = ((h) rVar.f29623a.f3499a).f29538b.length();
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(i11 == length ? kotlin.collections.d0.g(arrayList) : k0.e(i11, arrayList));
        b bVar = tVar.f29641a;
        int iD = tVar.d(i11);
        n5.i iVar = bVar.f29514d;
        return z11 ? iVar.h(iD, false) : iVar.i(iD, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f29617a, q0Var.f29617a) && Intrinsics.areEqual(this.f29618b, q0Var.f29618b) && z5.l.a(this.f29619c, q0Var.f29619c) && this.f29620d == q0Var.f29620d && this.f29621e == q0Var.f29621e && Intrinsics.areEqual(this.f29622f, q0Var.f29622f);
    }

    public final float g(int i11) {
        r rVar = this.f29618b;
        rVar.m(i11);
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(k0.f(i11, arrayList));
        b bVar = tVar.f29641a;
        int i12 = i11 - tVar.f29644d;
        n5.i iVar = bVar.f29514d;
        return iVar.f30531f.getLineLeft(i12) + (i12 == iVar.f30532g + (-1) ? iVar.f30535j : 0.0f);
    }

    public final float h(int i11) {
        r rVar = this.f29618b;
        rVar.m(i11);
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(k0.f(i11, arrayList));
        b bVar = tVar.f29641a;
        int i12 = i11 - tVar.f29644d;
        n5.i iVar = bVar.f29514d;
        return iVar.f30531f.getLineRight(i12) + (i12 == iVar.f30532g + (-1) ? iVar.f30536k : 0.0f);
    }

    public final int hashCode() {
        return this.f29622f.hashCode() + r8.k.a(r8.k.a(e0.f.b((this.f29618b.hashCode() + (this.f29617a.hashCode() * 31)) * 31, 31, this.f29619c), this.f29620d, 31), this.f29621e, 31);
    }

    public final int i(int i11) {
        r rVar = this.f29618b;
        rVar.m(i11);
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(k0.f(i11, arrayList));
        b bVar = tVar.f29641a;
        return bVar.f29514d.f30531f.getLineStart(i11 - tVar.f29644d) + tVar.f29642b;
    }

    public final x5.j j(int i11) {
        r rVar = this.f29618b;
        rVar.l(i11);
        int length = ((h) rVar.f29623a.f3499a).f29538b.length();
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(i11 == length ? kotlin.collections.d0.g(arrayList) : k0.e(i11, arrayList));
        b bVar = tVar.f29641a;
        int iD = tVar.d(i11);
        n5.i iVar = bVar.f29514d;
        return iVar.f30531f.getParagraphDirection(iVar.f30531f.getLineForOffset(iD)) == 1 ? x5.j.Ltr : x5.j.Rtl;
    }

    public final i4.h k(int i11, int i12) {
        r rVar = this.f29618b;
        n1 n1Var = rVar.f29623a;
        if (i11 < 0 || i11 > i12 || i12 > ((h) n1Var.f3499a).f29538b.length()) {
            StringBuilder sbR = r8.k.r(i11, i12, "Start(", ") or End(", ") is out of range [0..");
            sbR.append(((h) n1Var.f3499a).f29538b.length());
            sbR.append("), or start > end!");
            s5.a.a(sbR.toString());
        }
        if (i11 == i12) {
            return i4.l.a();
        }
        i4.h hVarA = i4.l.a();
        k0.h(rVar.f29630h, k0.b(i11, i12), new q(hVarA, i11, i12, 0));
        return hVarA;
    }

    public final long l(int i11) {
        int iH;
        int iY;
        int iY2;
        r rVar = this.f29618b;
        rVar.l(i11);
        int length = ((h) rVar.f29623a.f3499a).f29538b.length();
        ArrayList arrayList = rVar.f29630h;
        t tVar = (t) arrayList.get(i11 == length ? kotlin.collections.d0.g(arrayList) : k0.e(i11, arrayList));
        b bVar = tVar.f29641a;
        int iD = tVar.d(i11);
        mv.b0 b0VarJ = bVar.f29514d.j();
        if (b0VarJ.v(b0VarJ.H(iD))) {
            b0VarJ.h(iD);
            iH = iD;
            while (iH != -1 && (!b0VarJ.v(iH) || b0VarJ.r(iH))) {
                iH = b0VarJ.H(iH);
            }
        } else {
            b0VarJ.h(iD);
            iH = b0VarJ.u(iD) ? (!b0VarJ.s(iD) || b0VarJ.q(iD)) ? b0VarJ.H(iD) : iD : b0VarJ.q(iD) ? b0VarJ.H(iD) : -1;
        }
        if (iH == -1) {
            iH = iD;
        }
        if (b0VarJ.r(b0VarJ.y(iD))) {
            b0VarJ.h(iD);
            iY = iD;
            while (iY != -1 && (b0VarJ.v(iY) || !b0VarJ.r(iY))) {
                iY = b0VarJ.y(iY);
            }
        } else {
            b0VarJ.h(iD);
            if (b0VarJ.q(iD)) {
                if (!b0VarJ.s(iD) || b0VarJ.u(iD)) {
                    iY2 = b0VarJ.y(iD);
                    iY = iY2;
                } else {
                    iY = iD;
                }
            } else if (b0VarJ.u(iD)) {
                iY2 = b0VarJ.y(iD);
                iY = iY2;
            } else {
                iY = -1;
            }
        }
        if (iY != -1) {
            iD = iY;
        }
        return tVar.b(k0.b(iH, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f29617a + ", multiParagraph=" + this.f29618b + ", size=" + ((Object) z5.l.b(this.f29619c)) + ", firstBaseline=" + this.f29620d + ", lastBaseline=" + this.f29621e + ", placeholderRects=" + this.f29622f + ')';
    }
}
