package com.braze.ui.inappmessage;

import com.braze.events.BrazeUserChangeEvent;
import com.braze.managers.j;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeUserChangeEvent f10932b;

    public /* synthetic */ e(BrazeUserChangeEvent brazeUserChangeEvent, int i11) {
        this.f10931a = i11;
        this.f10932b = brazeUserChangeEvent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10931a) {
            case 0:
                return BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(this.f10932b);
            case 1:
                return j.a(this.f10932b);
            default:
                return j.b(this.f10932b);
        }
    }
}
