package db0;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.model.ConversationStatus;
import zendesk.conversationkit.android.model.ConversationType;
import zendesk.conversationkit.android.model.ConversationsPagination;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.FieldType;
import zendesk.conversationkit.android.model.Message;
import zendesk.conversationkit.android.model.MessageAction;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14862a;

    public /* synthetic */ a(int i11) {
        this.f14862a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f14862a) {
            case 0:
                return ConversationStatus._init_$_anonymous_();
            case 1:
                return ConversationType._init_$_anonymous_();
            case 2:
                return ConversationsPagination._childSerializers$_anonymous_();
            case 3:
                return Field._childSerializers$_anonymous_();
            case 4:
                return Field._init_$_anonymous_$0();
            case 5:
                return Field.Email._childSerializers$_anonymous_();
            case 6:
                return Field.Select._childSerializers$_anonymous_();
            case 7:
                return Field.Select._childSerializers$_anonymous_$0();
            case 8:
                return Field.Select._childSerializers$_anonymous_$1();
            case 9:
                return Field.Text._childSerializers$_anonymous_();
            case 10:
                return FieldType._init_$_anonymous_();
            case 11:
                return Message._childSerializers$_anonymous_();
            case 12:
                return Message._childSerializers$_anonymous_$0();
            case 13:
                return Message._childSerializers$_anonymous_$1();
            case 14:
                return Message._childSerializers$_anonymous_$2();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Message._childSerializers$_anonymous_$3();
            case 16:
                return MessageAction._childSerializers$_anonymous_();
            case 17:
                return MessageAction._init_$_anonymous_$0();
            case 18:
                return MessageAction.Buy._childSerializers$_anonymous_();
            case 19:
                return MessageAction.Buy._childSerializers$_anonymous_$0();
            case 20:
                return MessageAction.Buy._childSerializers$_anonymous_$1();
            case 21:
                return MessageAction.Link._childSerializers$_anonymous_();
            case 22:
                return MessageAction.Link._childSerializers$_anonymous_$0();
            case 23:
                return MessageAction.Link._childSerializers$_anonymous_$1();
            case 24:
                return MessageAction.LocationRequest._childSerializers$_anonymous_();
            case 25:
                return MessageAction.LocationRequest._childSerializers$_anonymous_$0();
            case 26:
                return MessageAction.Postback._childSerializers$_anonymous_();
            case 27:
                return MessageAction.Postback._childSerializers$_anonymous_$0();
            case 28:
                return MessageAction.Reply._childSerializers$_anonymous_();
            default:
                return MessageAction.Reply._childSerializers$_anonymous_$0();
        }
    }
}
