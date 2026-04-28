package wy;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about.ManufacturerAboutActivity;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import m0.h1;
import m0.r0;
import zendesk.analyticskit.android.internal.di.AnalyticsKitNetworkModule;
import zendesk.conversationkit.android.internal.rest.RestClientFactory;
import zendesk.guidekit.android.internal.di.module.NetworkModule;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements ty.g, t40.a, r0, ha0.b, s20.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43587a;

    public /* synthetic */ o(int i11) {
        this.f43587a = i11;
    }

    public static /* synthetic */ void e(int i11, String str) throws IOException {
        throw new IOException(str + i11);
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) throws SVGParseException {
        throw new SVGParseException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void k(String str, Throwable th2) {
        throw new IllegalStateException(str, th2);
    }

    public static /* synthetic */ void l(int i11, String str) {
        throw new IllegalArgumentException(str + i11);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void n(int i11, String str) {
        throw new IllegalStateException((str + i11).toString());
    }

    public static /* synthetic */ void o(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // s20.l
    public void b(s20.g gVar, int i11) {
        int i12 = ManufacturerAboutActivity.f9117i;
    }

    @Override // m0.r0
    public void c(h1 h1Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(h1Var.f28515b.getWidth(), h1Var.f28515b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        h1Var.a(surface, w.b.F(), new bs.c(9, surface, surfaceTexture));
    }

    @Override // ha0.b
    public void d(String str) {
        switch (this.f43587a) {
            case 19:
                AnalyticsKitNetworkModule.providesHttpLoggingInterceptor$lambda$0(str);
                break;
            case 20:
                RestClientFactory.createEndUserExpectationsApi$lambda$2(str);
                break;
            case 21:
                RestClientFactory.createSunshineConversationsApi$lambda$0(str);
                break;
            default:
                NetworkModule.providesHttpLoggingInterceptor$lambda$0(str);
                break;
        }
    }

    @Override // t40.a
    public void f(t40.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // ty.g
    public void a(Exception exc) {
    }
}
