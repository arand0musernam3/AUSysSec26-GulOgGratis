package bn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym.y f6517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f6518c;

    public /* synthetic */ u(ym.y yVar, BaseItemMnuV2 baseItemMnuV2, int i11) {
        this.f6516a = i11;
        this.f6517b = yVar;
        this.f6518c = baseItemMnuV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6516a) {
            case 0:
                ym.y yVar = this.f6517b;
                if (yVar != null) {
                    ((ym.u) yVar).x(this.f6518c);
                }
                break;
            case 1:
                ym.y yVar2 = this.f6517b;
                if (yVar2 != null) {
                    ((ym.u) yVar2).x(this.f6518c);
                }
                break;
            default:
                ym.y yVar3 = this.f6517b;
                if (yVar3 != null) {
                    ((ym.u) yVar3).x(this.f6518c);
                }
                break;
        }
        return Unit.f26487a;
    }
}
