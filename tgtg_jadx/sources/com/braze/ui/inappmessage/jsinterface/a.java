package com.braze.ui.inappmessage.jsinterface;

import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10935a;

    public /* synthetic */ a(int i11) {
        this.f10935a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10935a) {
            case 0:
                return InAppMessageJavascriptInterface.AnonymousClass1.invokeSuspend$lambda$0();
            default:
                return InAppMessageJavascriptInterface.AnonymousClass1.C00241.invokeSuspend$lambda$0();
        }
    }
}
