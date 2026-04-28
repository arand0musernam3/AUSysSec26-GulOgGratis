package co.datadome.sdk;

import android.webkit.ValueCallback;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8649b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f8648a = i11;
        this.f8649b = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i11 = this.f8648a;
        Object obj2 = this.f8649b;
        switch (i11) {
            case 0:
                KProperty[] kPropertyArr = ChallengeActivity.f8613m;
                ((ChallengeActivity) obj2).z();
                break;
            case 1:
                KProperty[] kPropertyArr2 = ChallengeActivity.f8613m;
                ((ChallengeActivity) obj2).z();
                break;
            default:
                ((a) obj2).onReceiveValue(Boolean.TRUE);
                break;
        }
    }
}
