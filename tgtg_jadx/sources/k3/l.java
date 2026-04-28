package k3;

import android.text.Layout;
import b5.o0;
import i3.u;
import i4.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import m3.c3;
import m5.k0;
import m5.t0;
import o00.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25842e;

    public /* synthetic */ l(long j9, float[] fArr, Ref.IntRef intRef, Ref.FloatRef floatRef) {
        this.f25838a = 1;
        this.f25839b = j9;
        this.f25840c = fArr;
        this.f25841d = intRef;
        this.f25842e = floatRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        long j9;
        float[] fArr;
        long j11;
        m5.b bVar;
        int i11;
        float fA;
        float fA2;
        switch (this.f25838a) {
            case 0:
                u uVar = (u) this.f25840c;
                c3 c3Var = (c3) this.f25841d;
                long j12 = this.f25839b;
                i4.h hVar = (i4.h) this.f25842e;
                k4.d dVar = (k4.d) obj;
                float fInvoke = uVar.invoke();
                float fMax = (Math.max(Math.min(1.0f, fInvoke) - 0.4f, 0.0f) * 5) / 3;
                float fB = n80.p.b(Math.abs(fInvoke) - 1.0f, 0.0f, 2.0f);
                float fPow = (((0.4f * fMax) - 0.25f) + (fB - (((float) Math.pow(fB, 2)) / 4))) * 0.5f;
                float f11 = 360;
                float f12 = fPow * f11;
                float f13 = ((0.8f * fMax) + fPow) * f11;
                float fMin = Math.min(1.0f, fMax);
                a aVar = new a();
                aVar.f25779a = f13;
                aVar.f25780b = fMin;
                float fFloatValue = ((Number) c3Var.getValue()).floatValue();
                long jT0 = dVar.t0();
                j30.g gVarG0 = dVar.g0();
                long jO = gVarG0.o();
                gVarG0.i().e();
                try {
                    ((jd.f) gVarG0.f24502b).n(fPow, jT0);
                    float fC0 = dVar.c0(m.f25844b);
                    float f14 = m.f25843a;
                    float fC02 = (dVar.c0(f14) / 2.0f) + fC0;
                    long jV = h0.v(dVar.d());
                    int i12 = (int) (jV >> 32);
                    try {
                        int i13 = (int) (jV & 4294967295L);
                        h4.c cVar = new h4.c(Float.intBitsToFloat(i12) - fC02, Float.intBitsToFloat(i13) - fC02, Float.intBitsToFloat(i12) + fC02, Float.intBitsToFloat(i13) + fC02);
                        try {
                            dVar.B(j12, f12, f13 - f12, cVar.f(), cVar.e(), (768 & 64) != 0 ? 1.0f : fFloatValue, new k4.h(dVar.c0(f14), 0.0f, 0, 0, null, 26));
                            m.c(dVar, hVar, cVar, j12, fFloatValue, aVar);
                            r8.k.y(gVarG0, jO);
                            return Unit.f26487a;
                        } catch (Throwable th2) {
                            th = th2;
                            j9 = jO;
                            r8.k.y(gVarG0, j9);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        j9 = jO;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    j9 = jO;
                }
                break;
            case 1:
                float[] fArr2 = (float[]) this.f25840c;
                Ref.IntRef intRef = (Ref.IntRef) this.f25841d;
                Ref.FloatRef floatRef = (Ref.FloatRef) this.f25842e;
                m5.t tVar = (m5.t) obj;
                int i14 = tVar.f29642b;
                m5.b bVar2 = tVar.f29641a;
                int iF = tVar.f29643c;
                long j13 = this.f25839b;
                int iG = i14 > t0.g(j13) ? tVar.f29642b : t0.g(j13);
                if (iF >= t0.f(j13)) {
                    iF = t0.f(j13);
                }
                long jB = k0.b(tVar.d(iG), tVar.d(iF));
                int i15 = intRef.element;
                n5.i iVar = bVar2.f29514d;
                int iG2 = t0.g(jB);
                int iF2 = t0.f(jB);
                Layout layout = iVar.f30531f;
                int length = layout.getText().length();
                if (iG2 < 0) {
                    s5.a.a("startOffset must be > 0");
                }
                if (iG2 >= length) {
                    s5.a.a("startOffset must be less than text length");
                }
                if (iF2 <= iG2) {
                    s5.a.a("endOffset must be greater than startOffset");
                }
                if (iF2 > length) {
                    s5.a.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i15 < (iF2 - iG2) * 4) {
                    s5.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iG2);
                int lineForOffset2 = layout.getLineForOffset(iF2 - 1);
                i5.h hVar2 = new i5.h(iVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        fArr = fArr2;
                        int iF3 = iVar.f(lineForOffset);
                        int iMax = Math.max(iG2, lineStart);
                        int iMin = Math.min(iF2, iF3);
                        float fG = iVar.g(lineForOffset);
                        float fE = iVar.e(lineForOffset);
                        j11 = jB;
                        bVar = bVar2;
                        boolean z11 = false;
                        boolean z12 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z12 || zIsRtlCharAt) {
                                if (z12 && zIsRtlCharAt) {
                                    z11 = false;
                                    float fA3 = hVar2.a(iMax, false, false, false);
                                    i11 = iMin;
                                    fA = hVar2.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i11 = iMin;
                                    z11 = false;
                                    if (z12 || !zIsRtlCharAt) {
                                        fA = hVar2.a(iMax, false, false, false);
                                        fA2 = hVar2.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = hVar2.a(iMax, false, false, true);
                                        fA = hVar2.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i15] = fA;
                                fArr[i15 + 1] = fG;
                                fArr[i15 + 2] = fA2;
                                fArr[i15 + 3] = fE;
                                i15 += 4;
                                iMax++;
                                iMin = i11;
                            } else {
                                fA = hVar2.a(iMax, z11, z11, true);
                                i11 = iMin;
                                fA2 = hVar2.a(iMax + 1, true, true, true);
                            }
                            z11 = false;
                            fArr[i15] = fA;
                            fArr[i15 + 1] = fG;
                            fArr[i15 + 2] = fA2;
                            fArr[i15 + 3] = fE;
                            i15 += 4;
                            iMax++;
                            iMin = i11;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            bVar2 = bVar;
                            fArr2 = fArr;
                            jB = j11;
                        }
                    }
                } else {
                    fArr = fArr2;
                    j11 = jB;
                    bVar = bVar2;
                }
                int iE = (t0.e(j11) * 4) + intRef.element;
                for (int i16 = intRef.element; i16 < iE; i16 += 4) {
                    int i17 = i16 + 1;
                    float f15 = fArr[i17];
                    float f16 = floatRef.element;
                    fArr[i17] = f15 + f16;
                    int i18 = i16 + 3;
                    fArr[i18] = fArr[i18] + f16;
                }
                intRef.element = iE;
                floatRef.element = bVar.b() + floatRef.element;
                return Unit.f26487a;
            default:
                h4.c cVar2 = (h4.c) this.f25840c;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.f25841d;
                long j14 = this.f25839b;
                w wVar = (w) this.f25842e;
                o0 o0Var = (o0) obj;
                o0Var.b();
                float f17 = cVar2.f21380a;
                float f18 = cVar2.f21381b;
                k4.b bVar3 = o0Var.f5908a;
                ((jd.f) bVar3.f25938b.f24502b).r(f17, f18);
                try {
                    k4.d.n0(o0Var, (i4.f) objectRef.element, j14, 0L, 0.0f, wVar, 0, 890);
                    ((jd.f) bVar3.f25938b.f24502b).r(-f17, -f18);
                    return Unit.f26487a;
                } catch (Throwable th5) {
                    ((jd.f) bVar3.f25938b.f24502b).r(-f17, -f18);
                    throw th5;
                }
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, long j9, Object obj3, int i11) {
        this.f25838a = i11;
        this.f25840c = obj;
        this.f25841d = obj2;
        this.f25839b = j9;
        this.f25842e = obj3;
    }
}
