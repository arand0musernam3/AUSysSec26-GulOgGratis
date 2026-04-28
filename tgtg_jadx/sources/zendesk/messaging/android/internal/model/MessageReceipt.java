package zendesk.messaging.android.internal.model;

import com.braze.models.inappmessage.InAppMessageBase;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lzendesk/messaging/android/internal/model/MessageReceipt;", "", AnnotatedPrivateKey.LABEL, "", InAppMessageBase.ICON, "Lzendesk/messaging/android/internal/model/MessageStatusIcon;", "shouldAnimateReceipt", "", "<init>", "(Ljava/lang/String;Lzendesk/messaging/android/internal/model/MessageStatusIcon;Z)V", "getLabel", "()Ljava/lang/String;", "getIcon", "()Lzendesk/messaging/android/internal/model/MessageStatusIcon;", "getShouldAnimateReceipt", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessageReceipt {

    @NotNull
    private final MessageStatusIcon icon;

    @NotNull
    private final String label;
    private final boolean shouldAnimateReceipt;

    public MessageReceipt(@NotNull String str, @NotNull MessageStatusIcon messageStatusIcon, boolean z11) {
        str.getClass();
        messageStatusIcon.getClass();
        this.label = str;
        this.icon = messageStatusIcon;
        this.shouldAnimateReceipt = z11;
    }

    public static /* synthetic */ MessageReceipt copy$default(MessageReceipt messageReceipt, String str, MessageStatusIcon messageStatusIcon, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageReceipt.label;
        }
        if ((i11 & 2) != 0) {
            messageStatusIcon = messageReceipt.icon;
        }
        if ((i11 & 4) != 0) {
            z11 = messageReceipt.shouldAnimateReceipt;
        }
        return messageReceipt.copy(str, messageStatusIcon, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageStatusIcon getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldAnimateReceipt() {
        return this.shouldAnimateReceipt;
    }

    @NotNull
    public final MessageReceipt copy(@NotNull String label, @NotNull MessageStatusIcon icon, boolean shouldAnimateReceipt) {
        label.getClass();
        icon.getClass();
        return new MessageReceipt(label, icon, shouldAnimateReceipt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReceipt)) {
            return false;
        }
        MessageReceipt messageReceipt = (MessageReceipt) other;
        return Intrinsics.areEqual(this.label, messageReceipt.label) && this.icon == messageReceipt.icon && this.shouldAnimateReceipt == messageReceipt.shouldAnimateReceipt;
    }

    @NotNull
    public final MessageStatusIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final boolean getShouldAnimateReceipt() {
        return this.shouldAnimateReceipt;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldAnimateReceipt) + ((this.icon.hashCode() + (this.label.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.label;
        MessageStatusIcon messageStatusIcon = this.icon;
        boolean z11 = this.shouldAnimateReceipt;
        StringBuilder sb2 = new StringBuilder("MessageReceipt(label=");
        sb2.append(str);
        sb2.append(", icon=");
        sb2.append(messageStatusIcon);
        sb2.append(", shouldAnimateReceipt=");
        return s.o(sb2, z11, ")");
    }

    public /* synthetic */ MessageReceipt(String str, MessageStatusIcon messageStatusIcon, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? MessageStatusIcon.NO_ICON : messageStatusIcon, (i11 & 4) != 0 ? false : z11);
    }
}
