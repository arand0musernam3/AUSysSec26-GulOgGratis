package cn;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasketManager f8542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f8543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f8544d;

    public i(boolean z11, BasketManager basketManager, BaseItemMnuV2 baseItemMnuV2, Function1 function1) {
        this.f8541a = z11;
        this.f8542b = basketManager;
        this.f8543c = baseItemMnuV2;
        this.f8544d = function1;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b4.t tVar = (b4.t) obj;
        ((Number) obj3).intValue();
        tVar.getClass();
        m3.s sVar = (m3.s) ((m3.n) obj2);
        sVar.a0(1702118549);
        Object objM = sVar.M();
        if (objM == m3.m.f29332a) {
            objM = w.a0.g(sVar);
        }
        b4.t tVarB = androidx.compose.foundation.b.b(tVar, (b2.l) objM, null, false, null, null, new h(this.f8541a, this.f8542b, this.f8543c, this.f8544d), 28);
        sVar.q(false);
        return tVarB;
    }
}
