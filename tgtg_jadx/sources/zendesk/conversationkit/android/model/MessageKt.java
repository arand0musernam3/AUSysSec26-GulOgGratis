package zendesk.conversationkit.android.model;

import com.braze.models.inappmessage.InAppMessageBase;
import e40.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import m0.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.conversationkit.android.internal.rest.model.MessageActionDto;
import zendesk.conversationkit.android.internal.rest.model.MessageDto;
import zendesk.conversationkit.android.internal.rest.model.MessageFieldDto;
import zendesk.conversationkit.android.internal.rest.model.MessageItemDto;
import zendesk.conversationkit.android.internal.rest.model.MessageListResponseDto;
import zendesk.conversationkit.android.internal.rest.model.MessageSourceDto;
import zendesk.conversationkit.android.internal.rest.model.SendMessageDto;
import zendesk.conversationkit.android.model.Field;
import zendesk.conversationkit.android.model.MessageAction;
import zendesk.conversationkit.android.model.MessageContent;
import zendesk.conversationkit.android.model.MessageSourceType;
import zendesk.conversationkit.android.model.MessageStatus;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.core.android.internal.NullabilityKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000\u001a\n\u0010\t\u001a\u00020\n*\u00020\b\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0001H\u0000\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0000\u001a\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\bH\u0000\u001a\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000\u001a\u0012\u0010\u001b\u001a\u00020\n*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\bH\u0002\u001a\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u0006*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0006¨\u0006 "}, d2 = {"toMessage", "Lzendesk/conversationkit/android/model/Message;", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "created", "Ljava/util/Date;", "localId", "", "toMessageContent", "Lzendesk/conversationkit/android/model/MessageContent;", "isPrivateAttachment", "", "toSendMessageDto", "Lzendesk/conversationkit/android/internal/rest/model/SendMessageDto;", "enrichFormResponseFields", MessagingScreenViewModel.MESSAGING_SCREEN_CONVERSATION, "Lzendesk/conversationkit/android/model/Conversation;", "remoteOrLocalIdsAreEqual", InAppMessageBase.MESSAGE, "shouldLocalIdBeUpdated", "toMessageList", "Lzendesk/conversationkit/android/model/MessageList;", "Lzendesk/conversationkit/android/internal/rest/model/MessageListResponseDto;", "checkMessageIsAWebViewWithOpenOnReceive", "Lzendesk/conversationkit/android/model/MessageAction$WebView;", "findWebViewActionWithOpenOnReceive", "", "Lzendesk/conversationkit/android/model/MessageAction;", "isFromSourceType", "messageSourceType", "Lzendesk/conversationkit/android/model/MessageSourceType;", "agentIdFromMetadata", "key", "zendesk.conversationkit_conversationkit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Message.kt\nzendesk/conversationkit/android/model/MessageKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,917:1\n1617#2,9:918\n1869#2:927\n1870#2:929\n1626#2:930\n1617#2,9:931\n1869#2:940\n1870#2:942\n1626#2:943\n1617#2,9:944\n1869#2:953\n1870#2:955\n1626#2:956\n1617#2,9:957\n1869#2:966\n1870#2:968\n1626#2:969\n1563#2:970\n1634#2,3:971\n1617#2,9:974\n1869#2:983\n1870#2:985\n1626#2:986\n1563#2:987\n1634#2,3:988\n295#2,2:991\n1563#2:993\n1634#2,2:994\n295#2,2:996\n295#2,2:998\n295#2,2:1000\n1636#2:1002\n1563#2:1003\n1634#2,3:1004\n1869#2:1007\n1869#2,2:1008\n1870#2:1010\n1869#2,2:1011\n1#3:928\n1#3:941\n1#3:954\n1#3:967\n1#3:984\n*S KotlinDebug\n*F\n+ 1 Message.kt\nzendesk/conversationkit/android/model/MessageKt\n*L\n595#1:918,9\n595#1:927\n595#1:929\n595#1:930\n625#1:931,9\n625#1:940\n625#1:942\n625#1:943\n642#1:944,9\n642#1:953\n642#1:955\n642#1:956\n647#1:957,9\n647#1:966\n647#1:968\n647#1:969\n651#1:970\n651#1:971,3\n661#1:974,9\n661#1:983\n661#1:985\n661#1:986\n726#1:987\n726#1:988,3\n747#1:991,2\n752#1:993\n752#1:994,2\n755#1:996,2\n766#1:998,2\n775#1:1000,2\n752#1:1002\n815#1:1003\n815#1:1004,3\n846#1:1007\n847#1:1008,2\n846#1:1010\n868#1:1011,2\n595#1:928\n625#1:941\n642#1:954\n647#1:967\n661#1:984\n*E\n"})
public final class MessageKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FORM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.FORM_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.CAROUSEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageType.IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final String agentIdFromMetadata(@NotNull Message message, @NotNull String str) {
        message.getClass();
        str.getClass();
        Map<String, Object> metadata = message.getMetadata();
        Object obj = metadata != null ? metadata.get(str) : null;
        if (obj instanceof Long) {
            return String.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @Nullable
    public static final MessageAction.WebView checkMessageIsAWebViewWithOpenOnReceive(@NotNull MessageContent messageContent) {
        messageContent.getClass();
        MessageAction messageActionFindWebViewActionWithOpenOnReceive = null;
        if (messageContent instanceof MessageContent.Text) {
            List<MessageAction> actions = ((MessageContent.Text) messageContent).getActions();
            if (actions != null) {
                messageActionFindWebViewActionWithOpenOnReceive = findWebViewActionWithOpenOnReceive(actions);
            }
        } else if (messageContent instanceof MessageContent.Image) {
            List<MessageAction> actions2 = ((MessageContent.Image) messageContent).getActions();
            if (actions2 != null) {
                messageActionFindWebViewActionWithOpenOnReceive = findWebViewActionWithOpenOnReceive(actions2);
            }
        } else if (messageContent instanceof MessageContent.Carousel) {
            Iterator<T> it = ((MessageContent.Carousel) messageContent).getItems().iterator();
            while (it.hasNext()) {
                for (MessageAction messageAction : ((MessageItem) it.next()).getActions()) {
                    if ((messageAction instanceof MessageAction.WebView) && ((MessageAction.WebView) messageAction).getOpenOnReceive()) {
                        messageActionFindWebViewActionWithOpenOnReceive = messageAction;
                    }
                }
            }
        }
        return (MessageAction.WebView) messageActionFindWebViewActionWithOpenOnReceive;
    }

    @NotNull
    public static final Message enrichFormResponseFields(@NotNull Message message, @NotNull Conversation conversation) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        message.getClass();
        conversation.getClass();
        if (message.getContent() instanceof MessageContent.FormResponse) {
            Iterator<T> it = conversation.getMessages().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Message) next).getId(), ((MessageContent.FormResponse) message.getContent()).getQuotedMessageId())) {
                    break;
                }
            }
            Message message2 = (Message) next;
            MessageContent content = message2 != null ? message2.getContent() : null;
            if (content instanceof MessageContent.Form) {
                MessageContent.FormResponse formResponse = (MessageContent.FormResponse) message.getContent();
                List<Field> fields = ((MessageContent.FormResponse) message.getContent()).getFields();
                ArrayList arrayList = new ArrayList(e0.o(fields, 10));
                for (Object objCopy$default : fields) {
                    if (objCopy$default instanceof Field.Text) {
                        Iterator<T> it2 = ((MessageContent.Form) content).getFields().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it2.next();
                            if (Intrinsics.areEqual(((Field) next4).getId(), ((Field.Text) objCopy$default).getId())) {
                                break;
                            }
                        }
                        Field field = (Field) next4;
                        if (field instanceof Field.Text) {
                            Field.Text text = (Field.Text) field;
                            objCopy$default = Field.Text.copy$default((Field.Text) objCopy$default, null, null, null, text.getPlaceholder(), text.getMinSize(), text.getMaxSize(), null, 71, null);
                        }
                    } else if (objCopy$default instanceof Field.Email) {
                        Iterator<T> it3 = ((MessageContent.Form) content).getFields().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                            if (Intrinsics.areEqual(((Field) next3).getId(), ((Field.Email) objCopy$default).getId())) {
                                break;
                            }
                        }
                        Field field2 = (Field) next3;
                        if (field2 instanceof Field.Email) {
                            objCopy$default = Field.Email.copy$default((Field.Email) objCopy$default, null, null, null, ((Field.Email) field2).getPlaceholder(), null, 23, null);
                        }
                    } else {
                        if (!(objCopy$default instanceof Field.Select)) {
                            a.f();
                            return null;
                        }
                        Iterator<T> it4 = ((MessageContent.Form) content).getFields().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it4.next();
                            if (Intrinsics.areEqual(((Field) next2).getId(), ((Field.Select) objCopy$default).getId())) {
                                break;
                            }
                        }
                        Field field3 = (Field) next2;
                        if (field3 instanceof Field.Select) {
                            Field.Select select = (Field.Select) field3;
                            objCopy$default = Field.Select.copy$default((Field.Select) objCopy$default, null, null, null, select.getPlaceholder(), select.getOptions(), select.getSelectSize(), null, 71, null);
                        }
                    }
                    arrayList.add(objCopy$default);
                }
                return Message.copy$default(message, null, null, null, null, null, 0.0d, MessageContent.FormResponse.copy$default(formResponse, null, arrayList, 1, null), null, null, null, null, 1983, null);
            }
        }
        return message;
    }

    @Nullable
    public static final MessageAction.WebView findWebViewActionWithOpenOnReceive(@NotNull List<? extends MessageAction> list) {
        list.getClass();
        for (MessageAction messageAction : list) {
            if (messageAction instanceof MessageAction.WebView) {
                MessageAction.WebView webView = (MessageAction.WebView) messageAction;
                if (webView.getOpenOnReceive()) {
                    return webView;
                }
            }
        }
        return null;
    }

    public static final boolean isFromSourceType(@NotNull MessageContent messageContent, @NotNull MessageSourceType messageSourceType) {
        messageContent.getClass();
        messageSourceType.getClass();
        return messageSourceType(messageContent) == messageSourceType;
    }

    public static final boolean isPrivateAttachment(@NotNull MessageContent messageContent) {
        messageContent.getClass();
        if (messageContent instanceof MessageContent.File) {
            return NullabilityKtxKt.isNotNullOrEmpty(((MessageContent.File) messageContent).getAttachmentId());
        }
        if (messageContent instanceof MessageContent.Image) {
            return NullabilityKtxKt.isNotNullOrEmpty(((MessageContent.Image) messageContent).getAttachmentId());
        }
        return false;
    }

    private static final MessageSourceType messageSourceType(MessageContent messageContent) {
        if (messageContent instanceof MessageContent.Text) {
            return ((MessageContent.Text) messageContent).getSourceType();
        }
        if (messageContent instanceof MessageContent.File) {
            return ((MessageContent.File) messageContent).getSourceType();
        }
        if (messageContent instanceof MessageContent.Image) {
            return ((MessageContent.Image) messageContent).getSourceType();
        }
        if (messageContent instanceof MessageContent.Carousel) {
            return ((MessageContent.Carousel) messageContent).getSourceType();
        }
        return null;
    }

    public static final boolean remoteOrLocalIdsAreEqual(@NotNull Message message, @NotNull Message message2) {
        message.getClass();
        message2.getClass();
        return Intrinsics.areEqual(message.getLocalId(), message2.getLocalId()) || Intrinsics.areEqual(message.getId(), message2.getId());
    }

    public static final boolean shouldLocalIdBeUpdated(@NotNull Message message, @NotNull Message message2) {
        message.getClass();
        message2.getClass();
        return (Intrinsics.areEqual(message.getId(), message.getLocalId()) || !Intrinsics.areEqual(message.getLocalId(), message2.getLocalId()) || Intrinsics.areEqual(message.getId(), message2.getId())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Message toMessage(@NotNull MessageDto messageDto, @Nullable Date date, @NotNull String str) {
        String id2;
        messageDto.getClass();
        str.getClass();
        String id3 = messageDto.getId();
        String authorId = messageDto.getAuthorId();
        AuthorType authorTypeFindByValue = AuthorType.INSTANCE.findByValue(messageDto.getRole());
        List<String> subroles = messageDto.getSubroles();
        if (subroles == null) {
            subroles = n0.f26529a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = subroles.iterator();
        while (it.hasNext()) {
            AuthorSubtype authorSubtypeFindByValue = AuthorSubtype.INSTANCE.findByValue((String) it.next());
            if (authorSubtypeFindByValue != null) {
                arrayList.add(authorSubtypeFindByValue);
            }
        }
        String name = messageDto.getName();
        Author author = new Author(authorId, authorTypeFindByValue, arrayList, name == null ? "" : name, messageDto.getAvatarUrl());
        MessageStatus.Sent sent = new MessageStatus.Sent(null, 1, 0 == true ? 1 : 0);
        Date date2 = DateKtxKt.toDate(messageDto.getReceived());
        double received = messageDto.getReceived();
        MessageContent messageContent = toMessageContent(messageDto);
        Map<String, Object> metadata = messageDto.getMetadata();
        MessageSourceDto source = messageDto.getSource();
        return new Message(id3, author, sent, date, date2, received, messageContent, metadata, (source == null || (id2 = source.getId()) == null) ? "" : id2, str, messageDto.getPayload());
    }

    public static /* synthetic */ Message toMessage$default(MessageDto messageDto, Date date, String str, int i11, Object obj) {
        MessageSourceDto source;
        if ((i11 & 1) != 0) {
            date = null;
        }
        if ((i11 & 2) != 0 && ((source = messageDto.getSource()) == null || (str = source.getSessionId()) == null)) {
            str = messageDto.getId();
        }
        return toMessage(messageDto, date, str);
    }

    @NotNull
    public static final MessageContent toMessageContent(@NotNull MessageDto messageDto) {
        String type;
        String str;
        messageDto.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[MessageType.INSTANCE.findByValue(messageDto.getType()).ordinal()]) {
            case 1:
                String text = messageDto.getText();
                String str2 = text == null ? "" : text;
                List<MessageActionDto> actions = messageDto.getActions();
                if (actions == null) {
                    actions = n0.f26529a;
                }
                ArrayList arrayList = new ArrayList();
                for (MessageActionDto messageActionDto : actions) {
                    MessageSourceDto source = messageDto.getSource();
                    String type2 = source != null ? source.getType() : null;
                    if (type2 == null) {
                        type2 = "";
                    }
                    MessageAction action = MessageActionKt.toAction(messageActionDto, type2);
                    if (action != null) {
                        arrayList.add(action);
                    }
                }
                String htmlText = messageDto.getHtmlText();
                MessageSourceType.Companion companion = MessageSourceType.INSTANCE;
                MessageSourceDto source2 = messageDto.getSource();
                type = source2 != null ? source2.getType() : null;
                return new MessageContent.Text(str2, arrayList, htmlText, companion.findByValue(type == null ? "" : type), messageDto.getBlockChatInput());
            case 2:
                str = "";
                String text2 = messageDto.getText();
                if (text2 == null) {
                    text2 = str;
                }
                String altText = messageDto.getAltText();
                if (altText == null) {
                    altText = str;
                }
                String mediaUrl = messageDto.getMediaUrl();
                if (mediaUrl == null) {
                    mediaUrl = str;
                }
                String mediaType = messageDto.getMediaType();
                if (mediaType == null) {
                    mediaType = str;
                }
                Long mediaSize = messageDto.getMediaSize();
                long jLongValue = mediaSize != null ? mediaSize.longValue() : 0L;
                String attachmentId = messageDto.getAttachmentId();
                MessageSourceType.Companion companion2 = MessageSourceType.INSTANCE;
                MessageSourceDto source3 = messageDto.getSource();
                type = source3 != null ? source3.getType() : null;
                return new MessageContent.File(text2, altText, mediaUrl, mediaType, jLongValue, attachmentId, companion2.findByValue(type != null ? type : ""), messageDto.getBlockChatInput());
            case 3:
                List<MessageFieldDto> fields = messageDto.getFields();
                if (fields == null) {
                    fields = n0.f26529a;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = fields.iterator();
                while (it.hasNext()) {
                    Field field = FieldKt.toField((MessageFieldDto) it.next());
                    if (field != null) {
                        arrayList2.add(field);
                    }
                }
                return new MessageContent.Form(messageDto.getId(), arrayList2, messageDto.getBlockChatInput());
            case 4:
                List<MessageFieldDto> fields2 = messageDto.getFields();
                if (fields2 == null) {
                    fields2 = n0.f26529a;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = fields2.iterator();
                while (it2.hasNext()) {
                    Field field2 = FieldKt.toField((MessageFieldDto) it2.next());
                    if (field2 != null) {
                        arrayList3.add(field2);
                    }
                }
                String quotedMessageId = messageDto.getQuotedMessageId();
                return new MessageContent.FormResponse(quotedMessageId != null ? quotedMessageId : "", arrayList3);
            case 5:
                List<MessageItemDto> items = messageDto.getItems();
                if (items == null) {
                    items = n0.f26529a;
                }
                ArrayList arrayList4 = new ArrayList(e0.o(items, 10));
                for (MessageItemDto messageItemDto : items) {
                    MessageSourceDto source4 = messageDto.getSource();
                    String type3 = source4 != null ? source4.getType() : null;
                    if (type3 == null) {
                        type3 = "";
                    }
                    arrayList4.add(MessageItemKt.toItem(messageItemDto, type3));
                }
                MessageSourceType.Companion companion3 = MessageSourceType.INSTANCE;
                MessageSourceDto source5 = messageDto.getSource();
                type = source5 != null ? source5.getType() : null;
                return new MessageContent.Carousel(arrayList4, companion3.findByValue(type != null ? type : ""), messageDto.getBlockChatInput());
            case 6:
                String text3 = messageDto.getText();
                String str3 = text3 == null ? "" : text3;
                String mediaUrl2 = messageDto.getMediaUrl();
                String str4 = mediaUrl2 == null ? "" : mediaUrl2;
                String mediaType2 = messageDto.getMediaType();
                String str5 = mediaType2 == null ? "" : mediaType2;
                Long mediaSize2 = messageDto.getMediaSize();
                long jLongValue2 = mediaSize2 != null ? mediaSize2.longValue() : 0L;
                List<MessageActionDto> actions2 = messageDto.getActions();
                if (actions2 == null) {
                    actions2 = n0.f26529a;
                }
                ArrayList arrayList5 = new ArrayList();
                for (MessageActionDto messageActionDto2 : actions2) {
                    MessageSourceDto source6 = messageDto.getSource();
                    String type4 = source6 != null ? source6.getType() : null;
                    if (type4 == null) {
                        type4 = "";
                    }
                    MessageAction action2 = MessageActionKt.toAction(messageActionDto2, type4);
                    if (action2 != null) {
                        arrayList5.add(action2);
                    }
                }
                String attachmentId2 = messageDto.getAttachmentId();
                String htmlText2 = messageDto.getHtmlText();
                String altText2 = messageDto.getAltText();
                String str6 = altText2 == null ? "" : altText2;
                MessageSourceType.Companion companion4 = MessageSourceType.INSTANCE;
                MessageSourceDto source7 = messageDto.getSource();
                type = source7 != null ? source7.getType() : null;
                return new MessageContent.Image(str3, str4, null, str5, jLongValue2, arrayList5, attachmentId2, htmlText2, str6, companion4.findByValue(type != null ? type : ""), messageDto.getBlockChatInput());
            default:
                String textFallback = messageDto.getTextFallback();
                if (textFallback == null || StringsKt.H(textFallback)) {
                    return new MessageContent.Unsupported((String) null, 1, (DefaultConstructorMarker) null);
                }
                String textFallback2 = messageDto.getTextFallback();
                String htmlText3 = messageDto.getHtmlText();
                MessageSourceType.Companion companion5 = MessageSourceType.INSTANCE;
                MessageSourceDto source8 = messageDto.getSource();
                type = source8 != null ? source8.getType() : null;
                return new MessageContent.Text(textFallback2, (List) null, htmlText3, companion5.findByValue(type != null ? type : ""), messageDto.getBlockChatInput(), 2, (DefaultConstructorMarker) null);
        }
    }

    @NotNull
    public static final MessageList toMessageList(@NotNull MessageListResponseDto messageListResponseDto) {
        messageListResponseDto.getClass();
        List<MessageDto> messages = messageListResponseDto.getMessages();
        ArrayList arrayList = new ArrayList(e0.o(messages, 10));
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            arrayList.add(toMessage$default((MessageDto) it.next(), null, null, 3, null));
        }
        return new MessageList(arrayList, messageListResponseDto.getHasPrevious(), messageListResponseDto.getHasNext());
    }

    @NotNull
    public static final SendMessageDto toSendMessageDto(@NotNull Message message) throws IllegalArgumentException {
        message.getClass();
        MessageContent content = message.getContent();
        if (content instanceof MessageContent.Text) {
            return new SendMessageDto.Text(message.getAuthor().getType().getValue(), message.getMetadata(), message.getPayload(), ((MessageContent.Text) message.getContent()).getText());
        }
        if (!(content instanceof MessageContent.FormResponse)) {
            i1.j("Message with the ", message.getContent().getMessageContentType(), " content type cannot be sent by this SDK");
            return null;
        }
        String value = message.getAuthor().getType().getValue();
        Map<String, Object> metadata = message.getMetadata();
        String payload = message.getPayload();
        List<Field> fields = ((MessageContent.FormResponse) message.getContent()).getFields();
        ArrayList arrayList = new ArrayList(e0.o(fields, 10));
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            arrayList.add(FieldKt.toSendFieldResponseDto((Field) it.next()));
        }
        return new SendMessageDto.FormResponse(value, metadata, payload, arrayList, ((MessageContent.FormResponse) message.getContent()).getQuotedMessageId());
    }
}
