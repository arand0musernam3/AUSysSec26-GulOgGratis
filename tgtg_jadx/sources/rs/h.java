package rs;

import com.app.tgtg.model.remote.voucher.FilteredStore;
import g3.r9;
import java.util.List;
import kotlin.Unit;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f38194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x60.j f38195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x60.h f38196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x60.m f38197e;

    public /* synthetic */ h(List list, x60.j jVar, x60.h hVar, x60.m mVar, int i11) {
        this.f38193a = i11;
        this.f38194b = list;
        this.f38195c = jVar;
        this.f38196d = hVar;
        this.f38197e = mVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        switch (this.f38193a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
                }
                s sVar = (s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    FilteredStore filteredStore = (FilteredStore) this.f38194b.get(iIntValue);
                    sVar.a0(1347014587);
                    String name = filteredStore.getName();
                    if (name == null) {
                        sVar.a0(1347033805);
                        sVar.q(false);
                    } else {
                        sVar.a0(1347033806);
                        r9.d(name, null, this.f38196d.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f38195c.f43960i, sVar, 0, 0, 131066);
                        b3.i.y(b4.q.f5711a, this.f38197e.f44016m, sVar, false);
                    }
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            default:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                s sVar2 = (s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    FilteredStore filteredStore2 = (FilteredStore) this.f38194b.get(iIntValue3);
                    sVar2.a0(-42298611);
                    String name2 = filteredStore2.getName();
                    if (name2 == null) {
                        sVar2.a0(-42279393);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-42279392);
                        r9.d(name2, null, this.f38196d.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.f38195c.f43958g, sVar2, 0, 0, 131066);
                        b3.i.y(b4.q.f5711a, this.f38197e.f44016m, sVar2, false);
                    }
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
