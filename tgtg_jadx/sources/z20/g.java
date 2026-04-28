package z20;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends a30.d implements IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a30.j f46954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d10.g f46955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f46956j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, a30.j jVar2, d10.g gVar) {
        super(0);
        this.f46956j = jVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f46954h = jVar2;
        this.f46955i = gVar;
    }

    public void A(Bundle bundle) {
        this.f46956j.f46960a.c(this.f46955i);
        this.f46954h.d("onCompleteUpdate", new Object[0]);
    }

    public void U(Bundle bundle) {
        this.f46956j.f46960a.c(this.f46955i);
        this.f46954h.d("onRequestInfo", new Object[0]);
    }
}
