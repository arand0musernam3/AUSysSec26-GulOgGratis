package db0;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageActionBuyState;
import zendesk.conversationkit.android.model.MessageActionSize;
import zendesk.conversationkit.android.model.MessageActionType;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageItem;
import zendesk.conversationkit.android.model.MessageItemSize;
import zendesk.conversationkit.android.model.MessageList;
import zendesk.conversationkit.android.model.MessageSourceType;
import zendesk.conversationkit.android.model.MessageStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14863a;

    public /* synthetic */ b(int i11) {
        this.f14863a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14863a) {
            case 0:
                return MessageAction.Share._childSerializers$_anonymous_();
            case 1:
                return MessageAction.Share._childSerializers$_anonymous_$0();
            case 2:
                return MessageAction.WebView._childSerializers$_anonymous_();
            case 3:
                return MessageAction.WebView._childSerializers$_anonymous_$0();
            case 4:
                return MessageAction.WebView._childSerializers$_anonymous_$1();
            case 5:
                return MessageAction.WebView._childSerializers$_anonymous_$2();
            case 6:
                return MessageActionBuyState._init_$_anonymous_();
            case 7:
                return MessageActionSize._init_$_anonymous_();
            case 8:
                return MessageActionType._init_$_anonymous_();
            case 9:
                return MessageContent._init_$_anonymous_();
            case 10:
                return MessageContent.Carousel._childSerializers$_anonymous_();
            case 11:
                return MessageContent.Carousel._childSerializers$_anonymous_$0();
            case 12:
                return MessageContent.File._childSerializers$_anonymous_();
            case 13:
                return MessageContent.FileUpload._childSerializers$_anonymous_();
            case 14:
                return MessageContent.Form._childSerializers$_anonymous_();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return MessageContent.FormResponse._childSerializers$_anonymous_();
            case 16:
                return MessageContent.Image._childSerializers$_anonymous_();
            case 17:
                return MessageContent.Image._childSerializers$_anonymous_$0();
            case 18:
                return MessageContent.Text._childSerializers$_anonymous_();
            case 19:
                return MessageContent.Text._childSerializers$_anonymous_$0();
            case 20:
                return MessageItem._childSerializers$_anonymous_();
            case 21:
                return MessageItem._childSerializers$_anonymous_$0();
            case 22:
                return MessageItem._childSerializers$_anonymous_$1();
            case 23:
                return MessageItemSize._init_$_anonymous_();
            case 24:
                return MessageList._childSerializers$_anonymous_();
            case 25:
                return MessageSourceType._init_$_anonymous_();
            case 26:
                return MessageStatus._childSerializers$_anonymous_();
            case 27:
                return MessageStatus._init_$_anonymous_$0();
            case 28:
                return MessageStatus.DownloadFailed._childSerializers$_anonymous_();
            default:
                return MessageStatus.Downloading._childSerializers$_anonymous_();
        }
    }
}
