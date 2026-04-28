package co.datadome.sdk;

import android.view.KeyEvent;
import android.webkit.ValueCallback;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f8641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f8642c;

    public /* synthetic */ a(KeyEvent.Callback callback, Serializable serializable, int i11) {
        this.f8640a = i11;
        this.f8641b = callback;
        this.f8642c = serializable;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str;
        c cVar;
        int i11 = this.f8640a;
        Serializable serializable = this.f8642c;
        KeyEvent.Callback callback = this.f8641b;
        switch (i11) {
            case 0:
                ChallengeActivity challengeActivity = (ChallengeActivity) callback;
                ArrayList arrayList = (ArrayList) serializable;
                KProperty[] kPropertyArr = ChallengeActivity.f8613m;
                if (challengeActivity.f8620g) {
                    str = challengeActivity.f8621h;
                    cVar = new c(challengeActivity, 0);
                } else {
                    str = challengeActivity.f8616c;
                    cVar = new c(challengeActivity, 1);
                }
                DataDomeUtils.d(str, arrayList, cVar);
                break;
            default:
                DataDomeWebView.a((DataDomeWebView) callback, (String) serializable);
                break;
        }
    }
}
