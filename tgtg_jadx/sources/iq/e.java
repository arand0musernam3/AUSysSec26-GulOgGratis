package iq;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f24105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24106c;

    public /* synthetic */ e(Function1 function1, String str, int i11) {
        this.f24104a = i11;
        this.f24105b = function1;
        this.f24106c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f24104a) {
            case 0:
                this.f24105b.invoke(this.f24106c);
                break;
            case 1:
                this.f24105b.invoke(this.f24106c);
                break;
            case 2:
                this.f24105b.invoke(this.f24106c);
                break;
            default:
                this.f24105b.invoke(this.f24106c);
                break;
        }
        return Unit.f26487a;
    }
}
