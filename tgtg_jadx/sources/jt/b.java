package jt;

import co.datadome.sdk.DataDomeSDKListener;
import y80.a2;
import y80.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends DataDomeSDKListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f25393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f25394b;

    public b() {
        a2 a2VarC = r.c(Boolean.FALSE);
        this.f25393a = a2VarC;
        this.f25394b = a2VarC;
    }

    @Override // co.datadome.sdk.DataDomeSDKListener
    public final void onCaptchaDismissed() {
        super.onCaptchaDismissed();
        Boolean bool = Boolean.FALSE;
        a2 a2Var = this.f25393a;
        a2Var.getClass();
        a2Var.k(null, bool);
    }

    @Override // co.datadome.sdk.DataDomeSDKListener
    public final void willDisplayCaptcha() {
        super.willDisplayCaptcha();
        Boolean bool = Boolean.TRUE;
        a2 a2Var = this.f25393a;
        a2Var.getClass();
        a2Var.k(null, bool);
    }
}
