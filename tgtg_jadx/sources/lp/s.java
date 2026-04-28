package lp;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f28089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28090c;

    public /* synthetic */ s(int i11, Function1 function1) {
        this.f28088a = 3;
        this.f28090c = i11;
        this.f28089b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function1 function1;
        switch (this.f28088a) {
            case 0:
                this.f28089b.invoke(Integer.valueOf(this.f28090c));
                break;
            case 1:
                this.f28089b.invoke(Integer.valueOf(this.f28090c));
                break;
            case 2:
                this.f28089b.invoke(Integer.valueOf(this.f28090c));
                break;
            default:
                if (this.f28090c > 0 && (function1 = this.f28089b) != null) {
                    function1.invoke(-1);
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ s(int i11, int i12, Function1 function1) {
        this.f28088a = i12;
        this.f28089b = function1;
        this.f28090c = i11;
    }
}
