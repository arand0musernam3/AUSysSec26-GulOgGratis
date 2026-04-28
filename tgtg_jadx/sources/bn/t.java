package bn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f6514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6515c;

    public /* synthetic */ t(BaseItemMnuV2 baseItemMnuV2, String str, int i11, int i12) {
        this.f6513a = i12;
        this.f6514b = baseItemMnuV2;
        this.f6515c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6513a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                lx.u.n(this.f6514b, this.f6515c, nVar, m3.i.F(1));
                break;
            default:
                m0.c.R(this.f6514b, this.f6515c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
