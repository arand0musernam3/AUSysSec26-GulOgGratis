package m5;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.lifecycle.n1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f29623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f29627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f29629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f29630h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public r(n1 n1Var, long j9, int i11, int i12) {
        boolean z11;
        int i13;
        int iH;
        int i14;
        this.f29623a = n1Var;
        this.f29624b = i11;
        if (z5.a.k(j9) != 0 || z5.a.j(j9) != 0) {
            s5.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) n1Var.f3503e;
        int size = arrayList2.size();
        float f11 = 0.0f;
        int i15 = 0;
        int i16 = 0;
        while (i15 < size) {
            u uVar = (u) arrayList2.get(i15);
            u5.d dVar = uVar.f29651a;
            int i17 = z5.a.i(j9);
            if (z5.a.d(j9)) {
                i13 = i15;
                iH = z5.a.h(j9) - ((int) Math.ceil(f11));
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                i13 = i15;
                iH = z5.a.h(j9);
            }
            b bVar = new b(dVar, this.f29624b - i16, i12, z5.b.b(i17, iH, 5));
            float fB = bVar.b() + f11;
            n5.i iVar = bVar.f29514d;
            int i18 = i16 + iVar.f30532g;
            arrayList.add(new t(bVar, uVar.f29652b, uVar.f29653c, i16, i18, f11, fB));
            if (!iVar.f30529d) {
                if (i18 == this.f29624b) {
                    i14 = i13;
                    if (i14 != kotlin.collections.d0.g((ArrayList) this.f29623a.f3503e)) {
                    }
                } else {
                    i14 = i13;
                }
                i15 = i14 + 1;
                i16 = i18;
                f11 = fB;
            }
            z11 = true;
            i16 = i18;
            f11 = fB;
            break;
        }
        z11 = false;
        this.f29627e = f11;
        this.f29628f = i16;
        this.f29625c = z11;
        this.f29630h = arrayList;
        this.f29626d = z5.a.i(j9);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i19 = 0; i19 < size2; i19++) {
            t tVar = (t) arrayList.get(i19);
            ?? r72 = tVar.f29641a.f29516f;
            ArrayList arrayList4 = new ArrayList(r72.size());
            int size3 = r72.size();
            for (int i21 = 0; i21 < size3; i21++) {
                h4.c cVar = (h4.c) r72.get(i21);
                arrayList4.add(cVar != null ? tVar.a(cVar) : null);
            }
            kotlin.collections.i0.s(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f29623a.f3500b).size()) {
            int size4 = ((List) this.f29623a.f3500b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i22 = 0; i22 < size4; i22++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.d0(arrayList5, arrayList3);
        }
        this.f29629g = arrayList3;
    }

    public static void i(r rVar, i4.t tVar, long j9, i4.u0 u0Var, x5.l lVar, k4.e eVar) {
        tVar.e();
        ArrayList arrayList = rVar.f29630h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            t tVar2 = (t) arrayList.get(i11);
            tVar2.f29641a.f(tVar, j9, u0Var, lVar, eVar);
            tVar.n(0.0f, tVar2.f29641a.b());
        }
        tVar.o();
    }

    public static void j(r rVar, i4.t tVar, i4.r rVar2, float f11, i4.u0 u0Var, x5.l lVar, k4.e eVar) {
        tVar.e();
        ArrayList arrayList = rVar.f29630h;
        if (arrayList.size() <= 1 || (rVar2 instanceof i4.x0)) {
            u5.a.a(rVar, tVar, rVar2, f11, u0Var, lVar, eVar);
        } else {
            if (!(rVar2 instanceof i4.t0)) {
                e40.a.f();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                t tVar2 = (t) arrayList.get(i11);
                fB += tVar2.f29641a.b();
                fMax = Math.max(fMax, tVar2.f29641a.d());
            }
            Shader shaderB = ((i4.t0) rVar2).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = ((t) arrayList.get(i12)).f29641a;
                bVar.g(tVar, new i4.s(shaderB), f11, u0Var, lVar, eVar);
                tVar.n(0.0f, bVar.b());
                matrix.setTranslate(0.0f, -bVar.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        tVar.o();
    }

    public final void a(long j9, float[] fArr) {
        k(t0.g(j9));
        l(t0.f(j9));
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        k0.h(this.f29630h, j9, new k3.l(j9, fArr, intRef, new Ref.FloatRef()));
    }

    public final float b(int i11) {
        m(i11);
        ArrayList arrayList = this.f29630h;
        t tVar = (t) arrayList.get(k0.f(i11, arrayList));
        b bVar = tVar.f29641a;
        return bVar.f29514d.e(i11 - tVar.f29644d) + tVar.f29646f;
    }

    public final int c(int i11, boolean z11) {
        int iF;
        m(i11);
        ArrayList arrayList = this.f29630h;
        t tVar = (t) arrayList.get(k0.f(i11, arrayList));
        b bVar = tVar.f29641a;
        int i12 = i11 - tVar.f29644d;
        n5.i iVar = bVar.f29514d;
        if (z11) {
            Layout layout = iVar.f30531f;
            ThreadLocal threadLocal = n5.j.f30542a;
            if (layout.getEllipsisCount(i12) <= 0 || iVar.f30527b != TextUtils.TruncateAt.END) {
                n1 n1VarC = iVar.c();
                Layout layout2 = (Layout) n1VarC.f3499a;
                iF = n1VarC.v(layout2.getLineEnd(i12), layout2.getLineStart(i12));
            } else {
                iF = layout.getEllipsisStart(i12) + layout.getLineStart(i12);
            }
        } else {
            iF = iVar.f(i12);
        }
        return iF + tVar.f29642b;
    }

    public final int d(int i11) {
        int length = ((h) this.f29623a.f3499a).f29538b.length();
        ArrayList arrayList = this.f29630h;
        t tVar = (t) arrayList.get(i11 >= length ? kotlin.collections.d0.g(arrayList) : i11 < 0 ? 0 : k0.e(i11, arrayList));
        return tVar.f29641a.f29514d.f30531f.getLineForOffset(tVar.d(i11)) + tVar.f29644d;
    }

    public final int e(float f11) {
        ArrayList arrayList = this.f29630h;
        t tVar = (t) arrayList.get(k0.g(arrayList, f11));
        int i11 = tVar.f29643c - tVar.f29642b;
        int i12 = tVar.f29644d;
        if (i11 == 0) {
            return i12;
        }
        b bVar = tVar.f29641a;
        float f12 = f11 - tVar.f29646f;
        n5.i iVar = bVar.f29514d;
        return iVar.f30531f.getLineForVertical(((int) f12) - iVar.f30533h) + i12;
    }

    public final float f(int i11) {
        m(i11);
        ArrayList arrayList = this.f29630h;
        t tVar = (t) arrayList.get(k0.f(i11, arrayList));
        b bVar = tVar.f29641a;
        return bVar.f29514d.g(i11 - tVar.f29644d) + tVar.f29646f;
    }

    public final int g(long j9) {
        int i11 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        ArrayList arrayList = this.f29630h;
        t tVar = (t) arrayList.get(k0.g(arrayList, fIntBitsToFloat));
        int i12 = tVar.f29643c;
        int i13 = tVar.f29642b;
        if (i12 - i13 == 0) {
            return i13;
        }
        b bVar = tVar.f29641a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11) - tVar.f29646f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32);
        n5.i iVar = bVar.f29514d;
        int lineForVertical = iVar.f30531f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - iVar.f30533h);
        return iVar.f30531f.getOffsetForHorizontal(lineForVertical, (iVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i13;
    }

    public final long h(h4.c cVar, int i11, i1 i1Var) {
        long jB;
        long j9;
        float f11 = cVar.f21381b;
        ArrayList arrayList = this.f29630h;
        int iG = k0.g(arrayList, f11);
        float f12 = ((t) arrayList.get(iG)).f29647g;
        float f13 = cVar.f21383d;
        if (f12 >= f13 || iG == kotlin.collections.d0.g(arrayList)) {
            t tVar = (t) arrayList.get(iG);
            return tVar.b(tVar.f29641a.c(tVar.c(cVar), i11, i1Var), true);
        }
        int iG2 = k0.g(arrayList, f13);
        long jB2 = t0.f29648b;
        while (true) {
            jB = t0.f29648b;
            if (!t0.c(jB2, jB) || iG > iG2) {
                break;
            }
            t tVar2 = (t) arrayList.get(iG);
            jB2 = tVar2.b(tVar2.f29641a.c(tVar2.c(cVar), i11, i1Var), true);
            iG++;
        }
        if (t0.c(jB2, jB)) {
            return jB;
        }
        while (true) {
            j9 = t0.f29648b;
            if (!t0.c(jB, j9) || iG > iG2) {
                break;
            }
            t tVar3 = (t) arrayList.get(iG2);
            jB = tVar3.b(tVar3.f29641a.c(tVar3.c(cVar), i11, i1Var), true);
            iG2--;
        }
        return t0.c(jB, j9) ? jB2 : k0.b((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void k(int i11) {
        boolean z11 = false;
        n1 n1Var = this.f29623a;
        if (i11 >= 0 && i11 < ((h) n1Var.f3499a).f29538b.length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "offset(", ") is out of bounds [0, ");
        sbK.append(((h) n1Var.f3499a).f29538b.length());
        sbK.append(')');
        s5.a.a(sbK.toString());
    }

    public final void l(int i11) {
        boolean z11 = false;
        n1 n1Var = this.f29623a;
        if (i11 >= 0 && i11 <= ((h) n1Var.f3499a).f29538b.length()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "offset(", ") is out of bounds [0, ");
        sbK.append(((h) n1Var.f3499a).f29538b.length());
        sbK.append(']');
        s5.a.a(sbK.toString());
    }

    public final void m(int i11) {
        boolean z11 = false;
        int i12 = this.f29628f;
        if (i11 >= 0 && i11 < i12) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        s5.a.a("lineIndex(" + i11 + ") is out of bounds [0, " + i12 + ')');
    }
}
