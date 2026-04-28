package zendesk.ui.android.conversation.textcell;

import b3.i;
import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.ui.android.conversation.actionbutton.ActionButton;
import zendesk.ui.android.internal.ContextualMenuOption;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\bL\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u00101\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b2J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b4J\u0016\u00105\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b6J\u0016\u00107\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÀ\u0003¢\u0006\u0002\b8J\u000e\u00109\u001a\u00020\u000bHÀ\u0003¢\u0006\u0002\b:J\u0012\u0010;\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\b<\u0010$J\u0012\u0010=\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\b>\u0010$J\u0012\u0010?\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\b@\u0010$J\u0012\u0010A\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bB\u0010$J\u0012\u0010C\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bD\u0010$J\u0012\u0010E\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bF\u0010$J\u0012\u0010G\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bH\u0010$J\u0012\u0010I\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bJ\u0010$J\u0012\u0010K\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bL\u0010$J\u0012\u0010M\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bN\u0010$J\u0012\u0010O\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bP\u0010$J\u0012\u0010Q\u001a\u0004\u0018\u00010\rHÀ\u0003¢\u0006\u0004\bR\u0010$Jâ\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\u000b2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\rHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b&\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b'\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b(\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b)\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b*\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b+\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b,\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b-\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b.\u0010$R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b/\u0010$R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0080\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b0\u0010$¨\u0006Y"}, d2 = {"Lzendesk/ui/android/conversation/textcell/TextCellState;", "", "messageText", "", "richTextMessage", "actions", "", "Lzendesk/ui/android/conversation/actionbutton/ActionButton;", "contextualMenuOptions", "Lzendesk/ui/android/internal/ContextualMenuOption;", "aiGenerated", "", "aiDisclaimerTextColor", "", "aiDisclaimerImageColor", "aiDisclaimerBorderColor", "textColor", "backgroundColor", "backgroundDrawable", "actionColor", "actionTextColor", "disabledColor", "disabledTextColor", "codeBlockTextColor", "codeBlockBackgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMessageText$zendesk_ui_ui_android", "()Ljava/lang/String;", "getRichTextMessage$zendesk_ui_ui_android", "getActions$zendesk_ui_ui_android", "()Ljava/util/List;", "getContextualMenuOptions$zendesk_ui_ui_android", "getAiGenerated$zendesk_ui_ui_android", "()Z", "getAiDisclaimerTextColor$zendesk_ui_ui_android", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAiDisclaimerImageColor$zendesk_ui_ui_android", "getAiDisclaimerBorderColor$zendesk_ui_ui_android", "getTextColor$zendesk_ui_ui_android", "getBackgroundColor$zendesk_ui_ui_android", "getBackgroundDrawable$zendesk_ui_ui_android", "getActionColor$zendesk_ui_ui_android", "getActionTextColor$zendesk_ui_ui_android", "getDisabledColor$zendesk_ui_ui_android", "getDisabledTextColor$zendesk_ui_ui_android", "getCodeBlockTextColor$zendesk_ui_ui_android", "getCodeBlockBackgroundColor$zendesk_ui_ui_android", "component1", "component1$zendesk_ui_ui_android", "component2", "component2$zendesk_ui_ui_android", "component3", "component3$zendesk_ui_ui_android", "component4", "component4$zendesk_ui_ui_android", "component5", "component5$zendesk_ui_ui_android", "component6", "component6$zendesk_ui_ui_android", "component7", "component7$zendesk_ui_ui_android", "component8", "component8$zendesk_ui_ui_android", "component9", "component9$zendesk_ui_ui_android", "component10", "component10$zendesk_ui_ui_android", "component11", "component11$zendesk_ui_ui_android", "component12", "component12$zendesk_ui_ui_android", "component13", "component13$zendesk_ui_ui_android", "component14", "component14$zendesk_ui_ui_android", "component15", "component15$zendesk_ui_ui_android", "component16", "component16$zendesk_ui_ui_android", "component17", "component17$zendesk_ui_ui_android", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lzendesk/ui/android/conversation/textcell/TextCellState;", "equals", "other", "hashCode", "toString", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TextCellState {
    public static final int $stable = 8;

    @Nullable
    private final Integer actionColor;

    @Nullable
    private final Integer actionTextColor;

    @Nullable
    private final List<ActionButton> actions;

    @Nullable
    private final Integer aiDisclaimerBorderColor;

    @Nullable
    private final Integer aiDisclaimerImageColor;

    @Nullable
    private final Integer aiDisclaimerTextColor;
    private final boolean aiGenerated;

    @Nullable
    private final Integer backgroundColor;

    @Nullable
    private final Integer backgroundDrawable;

    @Nullable
    private final Integer codeBlockBackgroundColor;

    @Nullable
    private final Integer codeBlockTextColor;

    @Nullable
    private final List<ContextualMenuOption> contextualMenuOptions;

    @Nullable
    private final Integer disabledColor;

    @Nullable
    private final Integer disabledTextColor;

    @NotNull
    private final String messageText;

    @Nullable
    private final String richTextMessage;

    @Nullable
    private final Integer textColor;

    public /* synthetic */ TextCellState(String str, String str2, List list, List list2, boolean z11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : num3, (i11 & 256) != 0 ? null : num4, (i11 & 512) != 0 ? null : num5, (i11 & 1024) != 0 ? null : num6, (i11 & NewHope.SENDB_BYTES) != 0 ? null : num7, (i11 & 4096) != 0 ? null : num8, (i11 & 8192) != 0 ? null : num9, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : num10, (i11 & 32768) != 0 ? null : num11, (i11 & 65536) != 0 ? null : num12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextCellState copy$default(TextCellState textCellState, String str, String str2, List list, List list2, boolean z11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i11, Object obj) {
        Integer num13;
        Integer num14;
        String str3;
        TextCellState textCellState2;
        Integer num15;
        String str4;
        List list3;
        List list4;
        boolean z12;
        Integer num16;
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        Integer num21;
        Integer num22;
        Integer num23;
        Integer num24;
        String str5 = (i11 & 1) != 0 ? textCellState.messageText : str;
        String str6 = (i11 & 2) != 0 ? textCellState.richTextMessage : str2;
        List list5 = (i11 & 4) != 0 ? textCellState.actions : list;
        List list6 = (i11 & 8) != 0 ? textCellState.contextualMenuOptions : list2;
        boolean z13 = (i11 & 16) != 0 ? textCellState.aiGenerated : z11;
        Integer num25 = (i11 & 32) != 0 ? textCellState.aiDisclaimerTextColor : num;
        Integer num26 = (i11 & 64) != 0 ? textCellState.aiDisclaimerImageColor : num2;
        Integer num27 = (i11 & 128) != 0 ? textCellState.aiDisclaimerBorderColor : num3;
        Integer num28 = (i11 & 256) != 0 ? textCellState.textColor : num4;
        Integer num29 = (i11 & 512) != 0 ? textCellState.backgroundColor : num5;
        Integer num30 = (i11 & 1024) != 0 ? textCellState.backgroundDrawable : num6;
        Integer num31 = (i11 & NewHope.SENDB_BYTES) != 0 ? textCellState.actionColor : num7;
        Integer num32 = (i11 & 4096) != 0 ? textCellState.actionTextColor : num8;
        Integer num33 = (i11 & 8192) != 0 ? textCellState.disabledColor : num9;
        String str7 = str5;
        Integer num34 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? textCellState.disabledTextColor : num10;
        Integer num35 = (i11 & 32768) != 0 ? textCellState.codeBlockTextColor : num11;
        if ((i11 & 65536) != 0) {
            num14 = num35;
            num13 = textCellState.codeBlockBackgroundColor;
            num15 = num34;
            str4 = str6;
            list3 = list5;
            list4 = list6;
            z12 = z13;
            num16 = num25;
            num17 = num26;
            num18 = num27;
            num19 = num28;
            num20 = num29;
            num21 = num30;
            num22 = num31;
            num23 = num32;
            num24 = num33;
            str3 = str7;
            textCellState2 = textCellState;
        } else {
            num13 = num12;
            num14 = num35;
            str3 = str7;
            textCellState2 = textCellState;
            num15 = num34;
            str4 = str6;
            list3 = list5;
            list4 = list6;
            z12 = z13;
            num16 = num25;
            num17 = num26;
            num18 = num27;
            num19 = num28;
            num20 = num29;
            num21 = num30;
            num22 = num31;
            num23 = num32;
            num24 = num33;
        }
        return textCellState2.copy(str3, str4, list3, list4, z12, num16, num17, num18, num19, num20, num21, num22, num23, num24, num15, num14, num13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1$zendesk_ui_ui_android, reason: from getter */
    public final String getMessageText() {
        return this.messageText;
    }

    @Nullable
    /* JADX INFO: renamed from: component10$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component11$zendesk_ui_ui_android, reason: from getter */
    public final Integer getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @Nullable
    /* JADX INFO: renamed from: component12$zendesk_ui_ui_android, reason: from getter */
    public final Integer getActionColor() {
        return this.actionColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component13$zendesk_ui_ui_android, reason: from getter */
    public final Integer getActionTextColor() {
        return this.actionTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component14$zendesk_ui_ui_android, reason: from getter */
    public final Integer getDisabledColor() {
        return this.disabledColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component15$zendesk_ui_ui_android, reason: from getter */
    public final Integer getDisabledTextColor() {
        return this.disabledTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component16$zendesk_ui_ui_android, reason: from getter */
    public final Integer getCodeBlockTextColor() {
        return this.codeBlockTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component17$zendesk_ui_ui_android, reason: from getter */
    public final Integer getCodeBlockBackgroundColor() {
        return this.codeBlockBackgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2$zendesk_ui_ui_android, reason: from getter */
    public final String getRichTextMessage() {
        return this.richTextMessage;
    }

    @Nullable
    public final List<ActionButton> component3$zendesk_ui_ui_android() {
        return this.actions;
    }

    @Nullable
    public final List<ContextualMenuOption> component4$zendesk_ui_ui_android() {
        return this.contextualMenuOptions;
    }

    /* JADX INFO: renamed from: component5$zendesk_ui_ui_android, reason: from getter */
    public final boolean getAiGenerated() {
        return this.aiGenerated;
    }

    @Nullable
    /* JADX INFO: renamed from: component6$zendesk_ui_ui_android, reason: from getter */
    public final Integer getAiDisclaimerTextColor() {
        return this.aiDisclaimerTextColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7$zendesk_ui_ui_android, reason: from getter */
    public final Integer getAiDisclaimerImageColor() {
        return this.aiDisclaimerImageColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component8$zendesk_ui_ui_android, reason: from getter */
    public final Integer getAiDisclaimerBorderColor() {
        return this.aiDisclaimerBorderColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component9$zendesk_ui_ui_android, reason: from getter */
    public final Integer getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final TextCellState copy(@NotNull String messageText, @Nullable String richTextMessage, @Nullable List<ActionButton> actions, @Nullable List<ContextualMenuOption> contextualMenuOptions, boolean aiGenerated, @Nullable Integer aiDisclaimerTextColor, @Nullable Integer aiDisclaimerImageColor, @Nullable Integer aiDisclaimerBorderColor, @Nullable Integer textColor, @Nullable Integer backgroundColor, @Nullable Integer backgroundDrawable, @Nullable Integer actionColor, @Nullable Integer actionTextColor, @Nullable Integer disabledColor, @Nullable Integer disabledTextColor, @Nullable Integer codeBlockTextColor, @Nullable Integer codeBlockBackgroundColor) {
        messageText.getClass();
        return new TextCellState(messageText, richTextMessage, actions, contextualMenuOptions, aiGenerated, aiDisclaimerTextColor, aiDisclaimerImageColor, aiDisclaimerBorderColor, textColor, backgroundColor, backgroundDrawable, actionColor, actionTextColor, disabledColor, disabledTextColor, codeBlockTextColor, codeBlockBackgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextCellState)) {
            return false;
        }
        TextCellState textCellState = (TextCellState) other;
        return Intrinsics.areEqual(this.messageText, textCellState.messageText) && Intrinsics.areEqual(this.richTextMessage, textCellState.richTextMessage) && Intrinsics.areEqual(this.actions, textCellState.actions) && Intrinsics.areEqual(this.contextualMenuOptions, textCellState.contextualMenuOptions) && this.aiGenerated == textCellState.aiGenerated && Intrinsics.areEqual(this.aiDisclaimerTextColor, textCellState.aiDisclaimerTextColor) && Intrinsics.areEqual(this.aiDisclaimerImageColor, textCellState.aiDisclaimerImageColor) && Intrinsics.areEqual(this.aiDisclaimerBorderColor, textCellState.aiDisclaimerBorderColor) && Intrinsics.areEqual(this.textColor, textCellState.textColor) && Intrinsics.areEqual(this.backgroundColor, textCellState.backgroundColor) && Intrinsics.areEqual(this.backgroundDrawable, textCellState.backgroundDrawable) && Intrinsics.areEqual(this.actionColor, textCellState.actionColor) && Intrinsics.areEqual(this.actionTextColor, textCellState.actionTextColor) && Intrinsics.areEqual(this.disabledColor, textCellState.disabledColor) && Intrinsics.areEqual(this.disabledTextColor, textCellState.disabledTextColor) && Intrinsics.areEqual(this.codeBlockTextColor, textCellState.codeBlockTextColor) && Intrinsics.areEqual(this.codeBlockBackgroundColor, textCellState.codeBlockBackgroundColor);
    }

    @Nullable
    public final Integer getActionColor$zendesk_ui_ui_android() {
        return this.actionColor;
    }

    @Nullable
    public final Integer getActionTextColor$zendesk_ui_ui_android() {
        return this.actionTextColor;
    }

    @Nullable
    public final List<ActionButton> getActions$zendesk_ui_ui_android() {
        return this.actions;
    }

    @Nullable
    public final Integer getAiDisclaimerBorderColor$zendesk_ui_ui_android() {
        return this.aiDisclaimerBorderColor;
    }

    @Nullable
    public final Integer getAiDisclaimerImageColor$zendesk_ui_ui_android() {
        return this.aiDisclaimerImageColor;
    }

    @Nullable
    public final Integer getAiDisclaimerTextColor$zendesk_ui_ui_android() {
        return this.aiDisclaimerTextColor;
    }

    public final boolean getAiGenerated$zendesk_ui_ui_android() {
        return this.aiGenerated;
    }

    @Nullable
    public final Integer getBackgroundColor$zendesk_ui_ui_android() {
        return this.backgroundColor;
    }

    @Nullable
    public final Integer getBackgroundDrawable$zendesk_ui_ui_android() {
        return this.backgroundDrawable;
    }

    @Nullable
    public final Integer getCodeBlockBackgroundColor$zendesk_ui_ui_android() {
        return this.codeBlockBackgroundColor;
    }

    @Nullable
    public final Integer getCodeBlockTextColor$zendesk_ui_ui_android() {
        return this.codeBlockTextColor;
    }

    @Nullable
    public final List<ContextualMenuOption> getContextualMenuOptions$zendesk_ui_ui_android() {
        return this.contextualMenuOptions;
    }

    @Nullable
    public final Integer getDisabledColor$zendesk_ui_ui_android() {
        return this.disabledColor;
    }

    @Nullable
    public final Integer getDisabledTextColor$zendesk_ui_ui_android() {
        return this.disabledTextColor;
    }

    @NotNull
    public final String getMessageText$zendesk_ui_ui_android() {
        return this.messageText;
    }

    @Nullable
    public final String getRichTextMessage$zendesk_ui_ui_android() {
        return this.richTextMessage;
    }

    @Nullable
    public final Integer getTextColor$zendesk_ui_ui_android() {
        return this.textColor;
    }

    public int hashCode() {
        int iHashCode = this.messageText.hashCode() * 31;
        String str = this.richTextMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<ActionButton> list = this.actions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ContextualMenuOption> list2 = this.contextualMenuOptions;
        int iE = k.e((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.aiGenerated);
        Integer num = this.aiDisclaimerTextColor;
        int iHashCode4 = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.aiDisclaimerImageColor;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.aiDisclaimerBorderColor;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.textColor;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.backgroundColor;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.backgroundDrawable;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.actionColor;
        int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.actionTextColor;
        int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.disabledColor;
        int iHashCode12 = (iHashCode11 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.disabledTextColor;
        int iHashCode13 = (iHashCode12 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.codeBlockTextColor;
        int iHashCode14 = (iHashCode13 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.codeBlockBackgroundColor;
        return iHashCode14 + (num12 != null ? num12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.messageText;
        String str2 = this.richTextMessage;
        List<ActionButton> list = this.actions;
        List<ContextualMenuOption> list2 = this.contextualMenuOptions;
        boolean z11 = this.aiGenerated;
        Integer num = this.aiDisclaimerTextColor;
        Integer num2 = this.aiDisclaimerImageColor;
        Integer num3 = this.aiDisclaimerBorderColor;
        Integer num4 = this.textColor;
        Integer num5 = this.backgroundColor;
        Integer num6 = this.backgroundDrawable;
        Integer num7 = this.actionColor;
        Integer num8 = this.actionTextColor;
        Integer num9 = this.disabledColor;
        Integer num10 = this.disabledTextColor;
        Integer num11 = this.codeBlockTextColor;
        Integer num12 = this.codeBlockBackgroundColor;
        StringBuilder sbT = f.t("TextCellState(messageText=", str, ", richTextMessage=", str2, ", actions=");
        sbT.append(list);
        sbT.append(", contextualMenuOptions=");
        sbT.append(list2);
        sbT.append(", aiGenerated=");
        sbT.append(z11);
        sbT.append(", aiDisclaimerTextColor=");
        sbT.append(num);
        sbT.append(", aiDisclaimerImageColor=");
        s.z(sbT, num2, ", aiDisclaimerBorderColor=", num3, ", textColor=");
        s.z(sbT, num4, ", backgroundColor=", num5, ", backgroundDrawable=");
        s.z(sbT, num6, ", actionColor=", num7, ", actionTextColor=");
        s.z(sbT, num8, ", disabledColor=", num9, ", disabledTextColor=");
        s.z(sbT, num10, ", codeBlockTextColor=", num11, ", codeBlockBackgroundColor=");
        return i.m(sbT, num12, ")");
    }

    public TextCellState(@NotNull String str, @Nullable String str2, @Nullable List<ActionButton> list, @Nullable List<ContextualMenuOption> list2, boolean z11, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12) {
        str.getClass();
        this.messageText = str;
        this.richTextMessage = str2;
        this.actions = list;
        this.contextualMenuOptions = list2;
        this.aiGenerated = z11;
        this.aiDisclaimerTextColor = num;
        this.aiDisclaimerImageColor = num2;
        this.aiDisclaimerBorderColor = num3;
        this.textColor = num4;
        this.backgroundColor = num5;
        this.backgroundDrawable = num6;
        this.actionColor = num7;
        this.actionTextColor = num8;
        this.disabledColor = num9;
        this.disabledTextColor = num10;
        this.codeBlockTextColor = num11;
        this.codeBlockBackgroundColor = num12;
    }

    public TextCellState() {
        this(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }
}
