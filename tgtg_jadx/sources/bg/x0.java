package bg;

import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.TagVariant;
import d2.h2;
import d2.i2;
import d2.m2;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f6248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4.t f6249d;

    public /* synthetic */ x0(b4.t tVar, List list, Function1 function1) {
        this.f6246a = 0;
        this.f6249d = tVar;
        this.f6247b = list;
        this.f6248c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6246a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(this.f6249d, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    sVar.a0(-1189415599);
                    List list = this.f6247b;
                    Iterator it = list.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        b4.q qVar = b4.q.f5711a;
                        if (zHasNext) {
                            ItemTagInfo itemTagInfo = (ItemTagInfo) it.next();
                            if (itemTagInfo.getShortText().length() <= 0 && itemTagInfo.getId() != ItemTag.SPECIAL_OFFER_ICON) {
                                sVar.a0(-1300426198);
                                sVar.q(false);
                            } else {
                                sVar.a0(-1300676058);
                                Function1 function1 = this.f6248c;
                                boolean zF = sVar.f(function1);
                                Object objM = sVar.M();
                                if (zF || objM == m3.m.f29332a) {
                                    objM = new defpackage.d(function1, 2);
                                    sVar.k0(objM);
                                }
                                m.e(itemTagInfo, null, (Function1) objM, sVar, 0, 2);
                                d2.c.f(m2.q(qVar, 8), sVar);
                                sVar.q(false);
                            }
                        } else {
                            sVar.q(false);
                            if (list.isEmpty()) {
                                sVar.a0(1783321631);
                                m.e(new ItemTagInfo(ItemTag.X_ITEMS_LEFT, "", (String) null, (TagVariant) null, (String) null, (String) null, 60, (DefaultConstructorMarker) null), f4.g.a(qVar, 0.0f), null, sVar, 48, 4);
                                sVar.q(false);
                            } else {
                                sVar.a0(1783487884);
                                sVar.q(false);
                            }
                            sVar.q(true);
                        }
                    }
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ex.i.d(m3.i.F(1), this.f6249d, this.f6247b, this.f6248c, (m3.n) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                lp.r.g(m3.i.F(49), this.f6249d, this.f6247b, this.f6248c, (m3.n) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                pd.g.c(m3.i.F(7), this.f6249d, this.f6247b, this.f6248c, (m3.n) obj);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ x0(b4.t tVar, List list, Function1 function1, int i11, int i12) {
        this.f6246a = i12;
        this.f6249d = tVar;
        this.f6247b = list;
        this.f6248c = function1;
    }

    public /* synthetic */ x0(List list, Function1 function1, b4.t tVar, int i11) {
        this.f6246a = 1;
        this.f6247b = list;
        this.f6248c = function1;
        this.f6249d = tVar;
    }
}
