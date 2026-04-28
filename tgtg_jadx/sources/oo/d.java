package oo;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import d2.h2;
import d2.i2;
import d2.m2;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f32751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32752e;

    public /* synthetic */ d(BaseItemMnuV2 baseItemMnuV2, float f11, BasketManager basketManager, um.u uVar) {
        this.f32748a = 2;
        this.f32749b = baseItemMnuV2;
        this.f32751d = f11;
        this.f32750c = basketManager;
        this.f32752e = uVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f32748a) {
            case 0:
                Ref.FloatRef floatRef = (Ref.FloatRef) this.f32749b;
                Ref.FloatRef floatRef2 = (Ref.FloatRef) this.f32750c;
                Ref.FloatRef floatRef3 = (Ref.FloatRef) this.f32752e;
                i4.h hVar = (i4.h) obj;
                h4.e eVar = (h4.e) obj2;
                hVar.getClass();
                ((z5.m) obj3).getClass();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f21392a >> 32));
                int i11 = (int) (eVar.f21392a & 4294967295L);
                h4.c cVarR = na0.a.R(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11) - floatRef.element)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
                float f11 = floatRef2.element;
                i4.h.c(hVar, nx.d.l((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L), cVarR));
                float f12 = floatRef3.element;
                float f13 = this.f32751d;
                hVar.f(f12 + f13, Float.intBitsToFloat(i11) - floatRef.element);
                hVar.e((floatRef3.element / 2) + f13, Float.intBitsToFloat(i11));
                hVar.e(f13, Float.intBitsToFloat(i11) - floatRef.element);
                break;
            case 1:
                Ref.FloatRef floatRef4 = (Ref.FloatRef) this.f32749b;
                Ref.FloatRef floatRef5 = (Ref.FloatRef) this.f32750c;
                Ref.FloatRef floatRef6 = (Ref.FloatRef) this.f32752e;
                i4.h hVar2 = (i4.h) obj;
                h4.e eVar2 = (h4.e) obj2;
                hVar2.getClass();
                ((z5.m) obj3).getClass();
                h4.c cVarR2 = na0.a.R((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(floatRef4.element + 0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar2.f21392a >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar2.f21392a & 4294967295L)))) & 4294967295L));
                float f14 = floatRef5.element;
                i4.h.c(hVar2, nx.d.l((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), cVarR2));
                float f15 = floatRef6.element;
                float f16 = this.f32751d;
                float f17 = 0;
                hVar2.f(f15 + f16, floatRef4.element + f17);
                hVar2.e((floatRef6.element / 2) + f16, 0.0f);
                hVar2.e(f16, f17 + floatRef4.element);
                break;
            default:
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f32749b;
                BasketManager basketManager = (BasketManager) this.f32750c;
                um.u uVar = (um.u) this.f32752e;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d2.z) obj).getClass();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f18 = lv.t.f28249c;
                    b4.q qVar = b4.q.f5711a;
                    b4.t tVarZ = d2.c.z(qVar, f18);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar3);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    float f19 = this.f32751d;
                    nx.d.d(baseItemMnuV2, f19, sVar, 48);
                    d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
                    nx.d.f(baseItemMnuV2, f19, basketManager, uVar, sVar, 48);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f11, Ref.FloatRef floatRef3, int i11) {
        this.f32748a = i11;
        this.f32749b = floatRef;
        this.f32750c = floatRef2;
        this.f32751d = f11;
        this.f32752e = floatRef3;
    }
}
