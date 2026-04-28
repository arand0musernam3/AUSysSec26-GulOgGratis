package bn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f6437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6439d;

    public /* synthetic */ e0(BaseItemMnuV2 baseItemMnuV2, String str, int i11, int i12) {
        this.f6436a = i12;
        this.f6437b = baseItemMnuV2;
        this.f6438c = str;
        this.f6439d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6436a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                m0.c.Q(this.f6437b, this.f6438c, nVar, m3.i.F(this.f6439d | 1));
                break;
            default:
                o30.e0.m(this.f6437b, this.f6438c, nVar, m3.i.F(this.f6439d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
