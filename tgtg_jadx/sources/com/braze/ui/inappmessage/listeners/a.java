package com.braze.ui.inappmessage.listeners;

import android.net.Uri;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f10937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10938c;

    public /* synthetic */ a(Uri uri, String str, int i11) {
        this.f10936a = i11;
        this.f10937b = uri;
        this.f10938c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10936a) {
            case 0:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$9(this.f10937b, this.f10938c);
            case 1:
                return com.braze.triggers.managers.b.a(this.f10937b, this.f10938c);
            default:
                return DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$4(this.f10937b, this.f10938c);
        }
    }
}
