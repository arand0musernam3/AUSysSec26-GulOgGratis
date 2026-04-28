package cn;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasketManager f8531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f8532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f8533d;

    public h(boolean z11, BasketManager basketManager, BaseItemMnuV2 baseItemMnuV2, Function1 function1) {
        this.f8530a = z11;
        this.f8531b = basketManager;
        this.f8532c = baseItemMnuV2;
        this.f8533d = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (!this.f8530a) {
            int quantity = this.f8531b.getQuantity(this.f8532c.m393getItemIdFvU5WIY());
            Function1 function1 = this.f8533d;
            if (quantity == 0) {
                if (function1 != null) {
                    function1.invoke(1);
                }
            } else if (function1 != null) {
                function1.invoke(0);
            }
        }
        return Unit.f26487a;
    }
}
