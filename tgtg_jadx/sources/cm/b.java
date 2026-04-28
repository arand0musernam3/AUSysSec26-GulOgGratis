package cm;

import cv.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f8458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f8459c;

    public /* synthetic */ b(Function1 function1, Function0 function0, int i11) {
        this.f8457a = i11;
        this.f8458b = function1;
        this.f8459c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8457a) {
            case 0:
                this.f8458b.invoke(i.CHARITY_LOGIN_LEARN_MORE);
                this.f8459c.invoke();
                break;
            default:
                this.f8458b.invoke(i.CHARITY_LOGIN_BACK);
                this.f8459c.invoke();
                break;
        }
        return Unit.f26487a;
    }
}
