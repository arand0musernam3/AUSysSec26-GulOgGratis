package com.braze.ui.inappmessage;

import com.braze.models.inappmessage.IInAppMessage;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IInAppMessage f10925b;

    public /* synthetic */ a(IInAppMessage iInAppMessage, int i11) {
        this.f10924a = i11;
        this.f10925b = iInAppMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10924a) {
            case 0:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$33(this.f10925b);
            case 1:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$37(this.f10925b);
            case 2:
                return BrazeInAppMessageManager.displayInAppMessage$lambda$52(this.f10925b);
            default:
                return InAppMessageManagerBase.getDefaultInAppMessageViewFactory$lambda$1(this.f10925b);
        }
    }
}
