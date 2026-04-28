package ev;

import com.appsflyer.share.LinkGenerator;
import g3.f6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements LinkGenerator.ResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6 f16484a;

    public b(f6 f6Var) {
        this.f16484a = f6Var;
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public final void onResponse(String str) {
        str.getClass();
        this.f16484a.invoke(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public final void onResponseError(String str) {
        str.getClass();
        sa0.a.f38953a.c(str, new Object[0]);
    }
}
