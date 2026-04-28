package g9;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f20217b;

    public /* synthetic */ t(Bundle bundle, int i11) {
        this.f20216a = i11;
        this.f20217b = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        String str = (String) obj;
        switch (this.f20216a) {
            case 0:
                str.getClass();
                zContainsKey = this.f20217b.containsKey(str);
                break;
            default:
                str.getClass();
                zContainsKey = this.f20217b.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
