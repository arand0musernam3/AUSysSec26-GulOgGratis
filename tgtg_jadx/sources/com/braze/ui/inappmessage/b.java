package com.braze.ui.inappmessage;

import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements IEventSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeInAppMessageManager f10927b;

    public /* synthetic */ b(BrazeInAppMessageManager brazeInAppMessageManager, int i11) {
        this.f10926a = i11;
        this.f10927b = brazeInAppMessageManager;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        switch (this.f10926a) {
            case 0:
                BrazeInAppMessageManager.createBrazeUserChangeEventSubscriber$lambda$57(this.f10927b, (BrazeUserChangeEvent) obj);
                break;
            case 1:
                BrazeInAppMessageManager.createInAppMessageEventSubscriber$lambda$53(this.f10927b, (InAppMessageEvent) obj);
                break;
            default:
                BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$5(this.f10927b, (SdkDataWipeEvent) obj);
                break;
        }
    }
}
