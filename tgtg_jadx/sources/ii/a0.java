package ii;

import c5.d2;
import com.app.tgtg.model.remote.item.QuickFilter;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import com.app.tgtg.model.remote.user.response.charity.CharityPlanCollectorType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mv.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f23880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f23881c;

    public /* synthetic */ a0(List list, Function1 function1, int i11) {
        this.f23879a = i11;
        this.f23880b = list;
        this.f23881c = function1;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        int i12;
        int i13;
        switch (this.f23879a) {
            case 0:
                f2.d dVar = (f2.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.n nVar = (m3.n) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = (((m3.s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= ((m3.s) nVar).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
                    CharityItem charityItem = (CharityItem) this.f23880b.get(iIntValue);
                    sVar.a0(106939375);
                    b4.t tVarA = f2.d.a(dVar, null, null, 7);
                    Function1 function1 = this.f23881c;
                    boolean zF = sVar.f(function1);
                    Object objM = sVar.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new gn.n(function1, 1);
                        sVar.k0(objM);
                    }
                    l.a(tVarA, charityItem, (Function1) objM, sVar, 0);
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                f2.d dVar2 = (f2.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m3.n nVar2 = (m3.n) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i12 = (((m3.s) nVar2).f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i12 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i12 |= ((m3.s) nVar2).d(iIntValue3) ? 32 : 16;
                }
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
                    QuickFilter quickFilter = (QuickFilter) this.f23880b.get(iIntValue3);
                    sVar2.a0(-1118125037);
                    String text = quickFilter.getText();
                    boolean enabled = quickFilter.getEnabled();
                    Function1 function12 = this.f23881c;
                    boolean zF2 = sVar2.f(function12) | sVar2.f(quickFilter);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == m3.m.f29332a) {
                        objM2 = new bn.b0(11, function12, quickFilter);
                        sVar2.k0(objM2);
                    }
                    zz.f.g(text, enabled, (Function0) objM2, sVar2, 0);
                    sVar2.q(false);
                } else {
                    sVar2.U();
                }
                break;
            default:
                f2.d dVar3 = (f2.d) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m3.n nVar3 = (m3.n) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i13 = (((m3.s) nVar3).f(dVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i13 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i13 |= ((m3.s) nVar3).d(iIntValue5) ? 32 : 16;
                }
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(i13 & 1, (i13 & 147) != 146)) {
                    CharityDayScheduleStore charityDayScheduleStore = (CharityDayScheduleStore) this.f23880b.get(iIntValue5);
                    sVar3.a0(1928541161);
                    b4.t tVarJ = d2.j(b4.q.f5711a, "CharityPlanStore");
                    String strF = p0.f(p0.F(charityDayScheduleStore.getStartTime()));
                    String strF2 = p0.f(p0.F(charityDayScheduleStore.getEndTime()));
                    String logo = charityDayScheduleStore.getLogo();
                    String name = charityDayScheduleStore.getName();
                    String storeBranch = charityDayScheduleStore.getStoreBranch();
                    CharityPlanCollectorType collectorType = charityDayScheduleStore.getCollectorType();
                    Function1 function13 = this.f23881c;
                    boolean zF3 = sVar3.f(function13) | sVar3.f(charityDayScheduleStore);
                    Object objM3 = sVar3.M();
                    if (zF3 || objM3 == m3.m.f29332a) {
                        objM3 = new bn.b0(17, function13, charityDayScheduleStore);
                        sVar3.k0(objM3);
                    }
                    zz.f.b(tVarJ, strF, strF2, logo, name, storeBranch, collectorType, (Function0) objM3, sVar3, 6);
                    sVar3.q(false);
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
