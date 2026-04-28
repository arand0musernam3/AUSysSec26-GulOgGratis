package bn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.h1;
import m3.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f6482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f6483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym.z f6484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f6485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i1 f6486f;

    public /* synthetic */ l(b1 b1Var, h1 h1Var, ym.z zVar, BaseItemMnuV2 baseItemMnuV2, i1 i1Var, int i11) {
        this.f6481a = i11;
        this.f6482b = b1Var;
        this.f6483c = h1Var;
        this.f6484d = zVar;
        this.f6485e = baseItemMnuV2;
        this.f6486f = i1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6481a;
        Boolean bool = (Boolean) obj;
        bool.getClass();
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                this.f6482b.setValue(bool);
                this.f6483c.i(iIntValue);
                i1 i1Var = this.f6486f;
                i1Var.i(i1Var.h() + 1);
                ym.z zVar = this.f6484d;
                if (zVar != null) {
                    zVar.i(this.f6485e.m393getItemIdFvU5WIY(), iIntValue, false);
                }
                break;
            default:
                this.f6482b.setValue(bool);
                h1 h1Var = this.f6483c;
                h1Var.i(iIntValue);
                i1 i1Var2 = this.f6486f;
                i1Var2.i(i1Var2.h() + 1);
                ym.z zVar2 = this.f6484d;
                if (zVar2 != null) {
                    zVar2.i(this.f6485e.m393getItemIdFvU5WIY(), h1Var.h(), false);
                }
                break;
        }
        return Unit.f26487a;
    }
}
