package com.braze.ui;

import android.webkit.ConsoleMessage;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConsoleMessage f10899b;

    public /* synthetic */ a(ConsoleMessage consoleMessage, int i11) {
        this.f10898a = i11;
        this.f10899b = consoleMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10898a) {
            case 0:
                return BrazeWebViewActivity.AnonymousClass1.onConsoleMessage$lambda$0(this.f10899b);
            default:
                return InAppMessageHtmlBaseView$messageWebView$6.onConsoleMessage$lambda$0(this.f10899b);
        }
    }
}
