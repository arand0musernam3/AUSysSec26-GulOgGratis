package cn;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.ElementMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ElementMnuV2 f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym.y f8575d;

    public q(ElementMnuV2 elementMnuV2, BaseItemMnuV2 baseItemMnuV2, String str, ym.y yVar) {
        this.f8572a = elementMnuV2;
        this.f8573b = baseItemMnuV2;
        this.f8574c = str;
        this.f8575d = yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            jf.e.d(this.f8572a, this.f8573b, this.f8574c, this.f8575d, sVar, 0);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
