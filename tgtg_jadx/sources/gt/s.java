package gt;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f20888c;

    public /* synthetic */ s(String str, w wVar, int i11) {
        this.f20886a = i11;
        this.f20887b = str;
        this.f20888c = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20886a) {
            case 0:
                return w.r(this.f20887b, this.f20888c, (ha.a) obj);
            default:
                return w.q(this.f20887b, this.f20888c, (ha.a) obj);
        }
    }
}
