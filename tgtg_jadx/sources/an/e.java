package an;

import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import ym.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1628a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HighlightedItemMnuV2 f1629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f1631d;

    public /* synthetic */ e(HighlightedItemMnuV2 highlightedItemMnuV2, String str, y yVar) {
        this.f1629b = highlightedItemMnuV2;
        this.f1630c = str;
        this.f1631d = yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f1628a) {
            case 0:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    na0.a.L(this.f1629b, this.f1630c, this.f1631d, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                num.getClass();
                na0.a.L(this.f1629b, this.f1630c, this.f1631d, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(HighlightedItemMnuV2 highlightedItemMnuV2, String str, y yVar, int i11) {
        this.f1629b = highlightedItemMnuV2;
        this.f1630c = str;
        this.f1631d = yVar;
    }
}
