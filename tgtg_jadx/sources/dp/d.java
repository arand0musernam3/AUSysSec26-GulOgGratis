package dp;

import j5.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f6.s f15052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f6.s sVar, int i11) {
        super(1);
        this.f15051a = i11;
        this.f15052b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15051a) {
            case 0:
                f6.u.a((b0) obj, this.f15052b);
                break;
            case 1:
                f6.u.a((b0) obj, this.f15052b);
                break;
            case 2:
                f6.u.a((b0) obj, this.f15052b);
                break;
            case 3:
                f6.u.a((b0) obj, this.f15052b);
                break;
            default:
                f6.u.a((b0) obj, this.f15052b);
                break;
        }
        return Unit.f26487a;
    }
}
