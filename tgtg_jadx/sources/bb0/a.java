package bb0;

import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.conversationkit.android.internal.rest.model.ConversationsResponseDto;
import zendesk.conversationkit.android.internal.rest.model.CreateConversationRequestDto;
import zendesk.conversationkit.android.internal.rest.model.Intent;
import zendesk.conversationkit.android.internal.rest.model.MessageActionDto;
import zendesk.conversationkit.android.internal.rest.model.MessageDto;
import zendesk.conversationkit.android.internal.rest.model.MessageFieldDto;
import zendesk.conversationkit.android.internal.rest.model.MessageItemDto;
import zendesk.conversationkit.android.internal.rest.model.MessageListResponseDto;
import zendesk.conversationkit.android.internal.rest.model.MetadataDto;
import zendesk.conversationkit.android.internal.rest.model.ProactiveMessageReferralDto;
import zendesk.conversationkit.android.internal.rest.model.SendFieldResponseDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageRequestDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageResponseDto;
import zendesk.conversationkit.android.internal.rest.model.UpdateConversationRequestDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6103a;

    public /* synthetic */ a(int i11) {
        this.f6103a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6103a) {
            case 0:
                return ConversationsResponseDto._childSerializers$_anonymous_$0();
            case 1:
                return CreateConversationRequestDto._childSerializers$_anonymous_();
            case 2:
                return CreateConversationRequestDto._childSerializers$_anonymous_$0();
            case 3:
                return CreateConversationRequestDto._childSerializers$_anonymous_$1();
            case 4:
                return CreateConversationRequestDto._childSerializers$_anonymous_$2();
            case 5:
                return Intent._init_$_anonymous_();
            case 6:
                return MessageActionDto._childSerializers$_anonymous_();
            case 7:
                return MessageDto._childSerializers$_anonymous_();
            case 8:
                return MessageDto._childSerializers$_anonymous_$0();
            case 9:
                return MessageDto._childSerializers$_anonymous_$1();
            case 10:
                return MessageDto._childSerializers$_anonymous_$2();
            case 11:
                return MessageDto._childSerializers$_anonymous_$3();
            case 12:
                return MessageFieldDto._childSerializers$_anonymous_();
            case 13:
                return MessageFieldDto._childSerializers$_anonymous_$0();
            case 14:
                return MessageFieldDto._childSerializers$_anonymous_$1();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return MessageItemDto._childSerializers$_anonymous_();
            case 16:
                return MessageItemDto._childSerializers$_anonymous_$0();
            case 17:
                return MessageListResponseDto._childSerializers$_anonymous_();
            case 18:
                return MetadataDto._childSerializers$_anonymous_();
            case 19:
                return ProactiveMessageReferralDto._childSerializers$_anonymous_();
            case 20:
                return ProactiveMessageReferralDto._childSerializers$_anonymous_$0();
            case 21:
                return SendFieldResponseDto._init_$_anonymous_();
            case 22:
                return SendFieldResponseDto.Select._childSerializers$_anonymous_();
            case 23:
                return SendMessageDto._init_$_anonymous_();
            case 24:
                return SendMessageDto.FormResponse._childSerializers$_anonymous_();
            case 25:
                return SendMessageDto.FormResponse._childSerializers$_anonymous_$0();
            case 26:
                return SendMessageDto.Text._childSerializers$_anonymous_();
            case 27:
                return SendMessageRequestDto._childSerializers$_anonymous_();
            case 28:
                return SendMessageResponseDto._childSerializers$_anonymous_();
            default:
                return UpdateConversationRequestDto._childSerializers$_anonymous_();
        }
    }
}
