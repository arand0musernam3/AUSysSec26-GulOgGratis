package com.braze.ui.contentcards.adapters;

import com.braze.requests.util.g;
import com.braze.support.BrazeImageUtils;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import f2.c0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10916c;

    public /* synthetic */ b(int i11, int i12, int i13) {
        this.f10914a = i13;
        this.f10915b = i11;
        this.f10916c = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10914a) {
            case 0:
                return ContentCardAdapter.markOnScreenCardsAsRead$lambda$5(this.f10915b, this.f10916c);
            case 1:
                return DefaultInAppMessageViewWrapper.ViewOnLayoutChangeListenerC01502.onLayoutChange$lambda$0(this.f10915b, this.f10916c);
            case 2:
                return new c0(this.f10915b, this.f10916c);
            case 3:
                return g.b(this.f10915b, this.f10916c);
            case 4:
                return BrazeImageUtils.getDestinationHeightAndWidthPixels$lambda$23(this.f10915b, this.f10916c);
            case 5:
                return BrazeImageUtils.getRemoteBitmap$lambda$19(this.f10915b, this.f10916c);
            default:
                return BrazeImageUtils.getLocalBitmap$lambda$12(this.f10915b, this.f10916c);
        }
    }
}
