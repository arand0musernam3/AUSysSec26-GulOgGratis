package re;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.n1;
import com.google.firebase.messaging.a0;
import he.d0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ke.p;
import ke.s;
import q1.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final ie.a J;
    public final ie.a K;
    public final HashMap L;
    public final z M;
    public final ArrayList N;
    public final ArrayList O;
    public final ke.f P;
    public final he.z Q;
    public final he.k R;
    public final qe.z S;
    public final ke.f T;
    public s U;
    public final ke.f V;
    public s W;
    public final ke.i X;
    public s Y;
    public final ke.i Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public s f37949a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ke.f f37950b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public s f37951c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public s f37952d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ke.f f37953e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ke.f f37954f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final ke.f f37955g0;

    public n(he.z zVar, h hVar) {
        a0 a0Var;
        a0 a0Var2;
        pe.a aVar;
        a0 a0Var3;
        pe.a aVar2;
        a0 a0Var4;
        pe.a aVar3;
        n1 n1Var;
        pe.a aVar4;
        n1 n1Var2;
        pe.b bVar;
        n1 n1Var3;
        pe.b bVar2;
        n1 n1Var4;
        pe.a aVar5;
        n1 n1Var5;
        pe.a aVar6;
        super(zVar, hVar);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        ie.a aVar7 = new ie.a(1, 1);
        aVar7.setStyle(Paint.Style.FILL);
        this.J = aVar7;
        ie.a aVar8 = new ie.a(1, 2);
        aVar8.setStyle(Paint.Style.STROKE);
        this.K = aVar8;
        this.L = new HashMap();
        this.M = new z((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = qe.z.INDEX;
        this.Q = zVar;
        this.R = hVar.f37923b;
        ke.f fVar = new ke.f((List) hVar.f37937q.f21216b, 2);
        this.P = fVar;
        fVar.a(this);
        f(fVar);
        oz.m mVar = hVar.f37938r;
        if (mVar != null && (n1Var5 = (n1) mVar.f33836b) != null && (aVar6 = (pe.a) n1Var5.f3499a) != null) {
            ke.e eVarG = aVar6.g();
            this.T = (ke.f) eVarG;
            eVarG.a(this);
            f(eVarG);
        }
        if (mVar != null && (n1Var4 = (n1) mVar.f33836b) != null && (aVar5 = (pe.a) n1Var4.f3500b) != null) {
            ke.e eVarG2 = aVar5.g();
            this.V = (ke.f) eVarG2;
            eVarG2.a(this);
            f(eVarG2);
        }
        if (mVar != null && (n1Var3 = (n1) mVar.f33836b) != null && (bVar2 = (pe.b) n1Var3.f3501c) != null) {
            ke.i iVarG = bVar2.g();
            this.X = iVarG;
            iVarG.a(this);
            f(iVarG);
        }
        if (mVar != null && (n1Var2 = (n1) mVar.f33836b) != null && (bVar = (pe.b) n1Var2.f3502d) != null) {
            ke.i iVarG2 = bVar.g();
            this.Z = iVarG2;
            iVarG2.a(this);
            f(iVarG2);
        }
        if (mVar != null && (n1Var = (n1) mVar.f33836b) != null && (aVar4 = (pe.a) n1Var.f3503e) != null) {
            ke.e eVarG3 = aVar4.g();
            this.f37950b0 = (ke.f) eVarG3;
            eVarG3.a(this);
            f(eVarG3);
        }
        if (mVar != null && (a0Var4 = (a0) mVar.f33837c) != null && (aVar3 = (pe.a) a0Var4.f12779b) != null) {
            ke.e eVarG4 = aVar3.g();
            this.f37953e0 = (ke.f) eVarG4;
            eVarG4.a(this);
            f(eVarG4);
        }
        if (mVar != null && (a0Var3 = (a0) mVar.f33837c) != null && (aVar2 = (pe.a) a0Var3.f12780c) != null) {
            ke.e eVarG5 = aVar2.g();
            this.f37954f0 = (ke.f) eVarG5;
            eVarG5.a(this);
            f(eVarG5);
        }
        if (mVar != null && (a0Var2 = (a0) mVar.f33837c) != null && (aVar = (pe.a) a0Var2.f12781d) != null) {
            ke.e eVarG6 = aVar.g();
            this.f37955g0 = (ke.f) eVarG6;
            eVarG6.a(this);
            f(eVarG6);
        }
        if (mVar == null || (a0Var = (a0) mVar.f33837c) == null) {
            return;
        }
        this.S = (qe.z) a0Var.f12782e;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // re.b, je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        he.k kVar = this.R;
        rectF.set(0.0f, 0.0f, kVar.f21936k.width(), kVar.f21936k.height());
    }

    @Override // re.b, oe.g
    public final void h(Object obj, ub.a aVar) {
        super.h(obj, aVar);
        PointF pointF = d0.f21873a;
        if (obj == 1) {
            s sVar = this.U;
            if (sVar != null) {
                o(sVar);
            }
            s sVar2 = new s(null, aVar);
            this.U = sVar2;
            sVar2.a(this);
            f(this.U);
            return;
        }
        if (obj == 2) {
            s sVar3 = this.W;
            if (sVar3 != null) {
                o(sVar3);
            }
            s sVar4 = new s(null, aVar);
            this.W = sVar4;
            sVar4.a(this);
            f(this.W);
            return;
        }
        if (obj == d0.f21888q) {
            s sVar5 = this.Y;
            if (sVar5 != null) {
                o(sVar5);
            }
            s sVar6 = new s(null, aVar);
            this.Y = sVar6;
            sVar6.a(this);
            f(this.Y);
            return;
        }
        if (obj == d0.f21889r) {
            s sVar7 = this.f37949a0;
            if (sVar7 != null) {
                o(sVar7);
            }
            s sVar8 = new s(null, aVar);
            this.f37949a0 = sVar8;
            sVar8.a(this);
            f(this.f37949a0);
            return;
        }
        if (obj == d0.D) {
            s sVar9 = this.f37951c0;
            if (sVar9 != null) {
                o(sVar9);
            }
            s sVar10 = new s(null, aVar);
            this.f37951c0 = sVar10;
            sVar10.a(this);
            f(this.f37951c0);
            return;
        }
        if (obj != d0.K) {
            if (obj == d0.M) {
                ke.f fVar = this.P;
                fVar.getClass();
                fVar.k(new p(new we.b(), aVar, new oe.c()));
                return;
            }
            return;
        }
        s sVar11 = this.f37952d0;
        if (sVar11 != null) {
            o(sVar11);
        }
        s sVar12 = new s(null, aVar);
        this.f37952d0 = sVar12;
        sVar12.a(this);
        f(this.f37952d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0517, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dd  */
    @Override // re.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, ve.a r34) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: re.n.k(android.graphics.Canvas, android.graphics.Matrix, int, ve.a):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String s(int i11, String str) {
        int iCodePointAt = str.codePointAt(i11);
        int iCharCount = Character.charCount(iCodePointAt) + i11;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j9 = iCodePointAt;
        z zVar = this.M;
        if (zVar.c(j9) >= 0) {
            return (String) zVar.b(j9);
        }
        StringBuilder sb2 = this.D;
        sb2.setLength(0);
        while (i11 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i11);
            sb2.appendCodePoint(iCodePointAt3);
            i11 += Character.charCount(iCodePointAt3);
        }
        String string = sb2.toString();
        zVar.h(j9, string);
        return string;
    }

    public final void t(oe.c cVar, int i11, int i12) {
        s sVar = this.U;
        ie.a aVar = this.J;
        if (sVar != null) {
            aVar.setColor(((Integer) sVar.f()).intValue());
        } else {
            ke.f fVar = this.T;
            if (fVar == null || !x(i12)) {
                aVar.setColor(cVar.f32459h);
            } else {
                aVar.setColor(((Integer) fVar.f()).intValue());
            }
        }
        s sVar2 = this.W;
        ie.a aVar2 = this.K;
        if (sVar2 != null) {
            aVar2.setColor(((Integer) sVar2.f()).intValue());
        } else {
            ke.f fVar2 = this.V;
            if (fVar2 == null || !x(i12)) {
                aVar2.setColor(cVar.f32460i);
            } else {
                aVar2.setColor(((Integer) fVar2.f()).intValue());
            }
        }
        ke.e eVar = this.f37917w.f26355p;
        int iIntValue = 100;
        int iIntValue2 = eVar == null ? 100 : ((Integer) eVar.f()).intValue();
        ke.f fVar3 = this.f37950b0;
        if (fVar3 != null && x(i12)) {
            iIntValue = ((Integer) fVar3.f()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i11) / 255.0f);
        aVar.setAlpha(iRound);
        aVar2.setAlpha(iRound);
        s sVar3 = this.Y;
        if (sVar3 != null) {
            aVar2.setStrokeWidth(((Float) sVar3.f()).floatValue());
            return;
        }
        ke.i iVar = this.X;
        if (iVar == null || !x(i12)) {
            aVar2.setStrokeWidth(ve.k.c() * cVar.f32461j);
        } else {
            aVar2.setStrokeWidth(((Float) iVar.f()).floatValue());
        }
    }

    public final m w(int i11) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i11; size++) {
            m mVar = new m();
            mVar.f37947a = "";
            mVar.f37948b = 0.0f;
            arrayList.add(mVar);
        }
        return (m) arrayList.get(i11 - 1);
    }

    public final boolean x(int i11) {
        ke.f fVar;
        int length = ((oe.c) this.P.f()).f32452a.length();
        ke.f fVar2 = this.f37953e0;
        if (fVar2 == null || (fVar = this.f37954f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) fVar2.f()).intValue(), ((Integer) fVar.f()).intValue());
        int iMax = Math.max(((Integer) fVar2.f()).intValue(), ((Integer) fVar.f()).intValue());
        ke.f fVar3 = this.f37955g0;
        if (fVar3 != null) {
            int iIntValue = ((Integer) fVar3.f()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == qe.z.INDEX) {
            return i11 >= iMin && i11 < iMax;
        }
        float f11 = (i11 / length) * 100.0f;
        return f11 >= ((float) iMin) && f11 < ((float) iMax);
    }

    public final boolean y(Canvas canvas, oe.c cVar, int i11, float f11) {
        PointF pointF = cVar.l;
        PointF pointF2 = cVar.f32463m;
        float fC = ve.k.c();
        float f12 = (i11 * cVar.f32457f * fC) + (pointF == null ? 0.0f : (cVar.f32457f * fC) + pointF.y);
        if (this.Q.f22001v && pointF2 != null && pointF != null && f12 >= pointF.y + pointF2.y + cVar.f32454c) {
            return false;
        }
        float f13 = pointF == null ? 0.0f : pointF.x;
        float f14 = pointF2 != null ? pointF2.x : 0.0f;
        int i12 = l.f37946a[cVar.f32455d.ordinal()];
        if (i12 == 1) {
            canvas.translate(f13, f12);
            return true;
        }
        if (i12 == 2) {
            canvas.translate((f13 + f14) - f11, f12);
            return true;
        }
        if (i12 != 3) {
            return true;
        }
        canvas.translate(((f14 / 2.0f) + f13) - (f11 / 2.0f), f12);
        return true;
    }

    public final List z(String str, float f11, oe.d dVar, float f12, float f13, boolean z11) {
        float fMeasureText;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (z11) {
                oe.e eVar = (oe.e) this.R.f21933h.b(oe.e.a(cCharAt, dVar.f32464a, dVar.f32466c));
                if (eVar != null) {
                    fMeasureText = (ve.k.c() * ((float) eVar.f32470c) * f12) + f13;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i14, i14 + 1)) + f13;
            }
            if (cCharAt == ' ') {
                z12 = true;
                f16 = fMeasureText;
            } else if (z12) {
                z12 = false;
                i13 = i14;
                f15 = fMeasureText;
            } else {
                f15 += fMeasureText;
            }
            f14 += fMeasureText;
            if (f11 > 0.0f && f14 >= f11 && cCharAt != ' ') {
                i11++;
                m mVarW = w(i11);
                if (i13 == i12) {
                    mVarW.f37947a = str.substring(i12, i14).trim();
                    mVarW.f37948b = (f14 - fMeasureText) - ((r10.length() - r8.length()) * f16);
                    i12 = i14;
                    i13 = i12;
                    f14 = fMeasureText;
                    f15 = f14;
                } else {
                    mVarW.f37947a = str.substring(i12, i13 - 1).trim();
                    mVarW.f37948b = ((f14 - f15) - ((r8.length() - r14.length()) * f16)) - f16;
                    f14 = f15;
                    i12 = i13;
                }
            }
        }
        if (f14 > 0.0f) {
            i11++;
            m mVarW2 = w(i11);
            mVarW2.f37947a = str.substring(i12);
            mVarW2.f37948b = f14;
        }
        return this.O.subList(0, i11);
    }
}
