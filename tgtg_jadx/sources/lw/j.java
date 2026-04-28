package lw;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.storage.b f28318b;

    public /* synthetic */ j(com.braze.storage.b bVar, int i11) {
        this.f28317a = i11;
        this.f28318b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28317a) {
            case 0:
                return com.braze.storage.b.a(this.f28318b);
            default:
                return com.braze.storage.b.b(this.f28318b);
        }
    }
}
