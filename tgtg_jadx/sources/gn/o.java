package gn;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicItem f20636c;

    public /* synthetic */ o(Function1 function1, BasicItem basicItem, int i11) {
        this.f20634a = i11;
        this.f20635b = function1;
        this.f20636c = basicItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20634a) {
            case 0:
                Function1 function1 = this.f20635b;
                if (function1 != null) {
                    function1.invoke(this.f20636c);
                }
                break;
            default:
                this.f20635b.invoke(this.f20636c);
                break;
        }
        return Unit.f26487a;
    }
}
