package bn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import d2.m2;
import d2.n1;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f6478b;

    public /* synthetic */ j(BaseItemMnuV2 baseItemMnuV2, int i11) {
        this.f6477a = i11;
        this.f6478b = baseItemMnuV2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s1.z zVar = (s1.z) obj;
        m3.n nVar = (m3.n) obj2;
        Integer num = (Integer) obj3;
        switch (this.f6477a) {
            case 0:
                num.intValue();
                zVar.getClass();
                jb.u.p(this.f6478b, nVar, 0);
                break;
            default:
                num.getClass();
                zVar.getClass();
                ManufacturerItemProperties manufacturerItemProperties = this.f6478b.getManufacturerItemProperties();
                Brand brand = null;
                Brand brand2 = manufacturerItemProperties != null ? manufacturerItemProperties.getBrand() : null;
                if (brand2 == null) {
                    m3.s sVar = (m3.s) nVar;
                    sVar.a0(-469203869);
                    sVar.q(false);
                } else {
                    m3.s sVar2 = (m3.s) nVar;
                    sVar2.a0(-469203868);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    nx.d.a(brand2, new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar2, 0);
                    sVar2.q(false);
                    brand = brand2;
                }
                if (brand == null) {
                    m3.s sVar3 = (m3.s) nVar;
                    sVar3.a0(-469087463);
                    b4.t tVarE = m2.e(b4.q.f5711a, lv.t.f28248b);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    d2.c.f(tVarE.then(new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), sVar3);
                    sVar3.q(false);
                } else {
                    m3.s sVar4 = (m3.s) nVar;
                    sVar4.a0(-1400609949);
                    sVar4.q(false);
                }
                break;
        }
        return Unit.f26487a;
    }
}
