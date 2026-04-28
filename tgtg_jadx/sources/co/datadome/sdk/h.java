package co.datadome.sdk;

import android.webkit.ValueCallback;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataDomeWebView f8660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8662d;

    public /* synthetic */ h(DataDomeWebView dataDomeWebView, String str, Object obj, int i11) {
        this.f8659a = i11;
        this.f8660b = dataDomeWebView;
        this.f8661c = str;
        this.f8662d = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f8659a) {
            case 0:
                DataDomeWebView.c(this.f8660b, this.f8661c, (Map) this.f8662d);
                break;
            default:
                DataDomeWebView.b(this.f8660b, this.f8661c, (byte[]) this.f8662d);
                break;
        }
    }
}
