package qw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.actions.a f37292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37293c;

    public /* synthetic */ h(com.braze.triggers.actions.a aVar, long j9, int i11) {
        this.f37291a = i11;
        this.f37292b = aVar;
        this.f37293c = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37291a) {
            case 0:
                return com.braze.triggers.managers.f.a(this.f37292b, this.f37293c);
            default:
                return com.braze.triggers.managers.h.a(this.f37292b, this.f37293c);
        }
    }
}
