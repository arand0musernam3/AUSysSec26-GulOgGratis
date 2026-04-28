package vm;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import um.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f42464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasketManager f42465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f42466d;

    public /* synthetic */ k(BaseItemMnuV2 baseItemMnuV2, BasketManager basketManager, u uVar, int i11, int i12) {
        this.f42463a = i12;
        this.f42464b = baseItemMnuV2;
        this.f42465c = basketManager;
        this.f42466d = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f42463a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                nx.d.j(this.f42464b, this.f42465c, this.f42466d, nVar, m3.i.F(1));
                break;
            default:
                nx.d.i(this.f42464b, this.f42465c, this.f42466d, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
