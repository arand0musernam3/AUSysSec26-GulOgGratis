package hb0;

import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i80.o f21724b;

    public /* synthetic */ h(int i11, i80.o oVar) {
        this.f21723a = i11;
        this.f21724b = oVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        MessageActionSize messageActionSize = (MessageActionSize) obj2;
        String str2 = (String) obj3;
        MessageSourceType messageSourceType = (MessageSourceType) obj4;
        switch (this.f21723a) {
            case 0:
                return ImageMessageContainerAdapterDelegate.ViewHolder.createImageCell$lambda$11$lambda$10$lambda$8(this.f21724b, str, messageActionSize, str2, messageSourceType);
            default:
                return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17$lambda$14(this.f21724b, str, messageActionSize, str2, messageSourceType);
        }
    }
}
