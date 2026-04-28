package qw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f37275b;

    public /* synthetic */ a(com.braze.triggers.actions.a aVar, int i11) {
        this.f37274a = i11;
        this.f37275b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37274a) {
            case 0:
                return com.braze.triggers.managers.a.a(this.f37275b);
            case 1:
                return com.braze.triggers.managers.b.b(this.f37275b);
            case 2:
                return com.braze.triggers.managers.b.c(this.f37275b);
            case 3:
                return com.braze.triggers.managers.f.d(this.f37275b);
            case 4:
                return com.braze.triggers.managers.f.f(this.f37275b);
            case 5:
                return com.braze.triggers.managers.f.g(this.f37275b);
            case 6:
                return com.braze.triggers.managers.f.c(this.f37275b);
            case 7:
                return com.braze.triggers.managers.h.a(this.f37275b);
            case 8:
                return com.braze.triggers.managers.h.b(this.f37275b);
            case 9:
                return com.braze.triggers.managers.h.c(this.f37275b);
            default:
                return com.braze.events.a.a(this.f37275b);
        }
    }
}
