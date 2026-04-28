package zendesk.messaging.android.internal.conversationscreen.cache;

import e0.f;
import i90.h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.f0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;
import zendesk.messaging.android.internal.conversationscreen.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002,+B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;", "", "", "conversationId", "composerText", "", "Lzendesk/messaging/android/internal/conversationscreen/cache/StoredForm;", "forms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConversationId", "getComposerText", "Ljava/util/Map;", "getForms", "Companion", "$serializer", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MessagingUIPersistence {

    @NotNull
    private final String composerText;

    @NotNull
    private final String conversationId;

    @NotNull
    private final Map<String, StoredForm> forms;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new n(8))};

    public /* synthetic */ MessagingUIPersistence(int i11, String str, String str2, Map map, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, MessagingUIPersistence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.conversationId = str;
        if ((i11 & 2) == 0) {
            this.composerText = "";
        } else {
            this.composerText = str2;
        }
        if ((i11 & 4) == 0) {
            this.forms = new LinkedHashMap();
        } else {
            this.forms = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new f0(r1.f29848a, StoredForm$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessagingUIPersistence copy$default(MessagingUIPersistence messagingUIPersistence, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messagingUIPersistence.conversationId;
        }
        if ((i11 & 2) != 0) {
            str2 = messagingUIPersistence.composerText;
        }
        if ((i11 & 4) != 0) {
            map = messagingUIPersistence.forms;
        }
        return messagingUIPersistence.copy(str, str2, map);
    }

    public static final /* synthetic */ void write$Self$zendesk_messaging_messaging_android(MessagingUIPersistence self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.conversationId);
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.composerText, "")) {
            output.q(serialDesc, 1, self.composerText);
        }
        if (!output.C(serialDesc) && Intrinsics.areEqual(self.forms, new LinkedHashMap())) {
            return;
        }
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.forms);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getComposerText() {
        return this.composerText;
    }

    @NotNull
    public final Map<String, StoredForm> component3() {
        return this.forms;
    }

    @NotNull
    public final MessagingUIPersistence copy(@NotNull String conversationId, @NotNull String composerText, @NotNull Map<String, StoredForm> forms) {
        conversationId.getClass();
        composerText.getClass();
        forms.getClass();
        return new MessagingUIPersistence(conversationId, composerText, forms);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessagingUIPersistence)) {
            return false;
        }
        MessagingUIPersistence messagingUIPersistence = (MessagingUIPersistence) other;
        return Intrinsics.areEqual(this.conversationId, messagingUIPersistence.conversationId) && Intrinsics.areEqual(this.composerText, messagingUIPersistence.composerText) && Intrinsics.areEqual(this.forms, messagingUIPersistence.forms);
    }

    @NotNull
    public final String getComposerText() {
        return this.composerText;
    }

    @NotNull
    public final String getConversationId() {
        return this.conversationId;
    }

    @NotNull
    public final Map<String, StoredForm> getForms() {
        return this.forms;
    }

    public int hashCode() {
        return this.forms.hashCode() + l1.b(this.conversationId.hashCode() * 31, 31, this.composerText);
    }

    @NotNull
    public String toString() {
        String str = this.conversationId;
        String str2 = this.composerText;
        Map<String, StoredForm> map = this.forms;
        StringBuilder sbT = f.t("MessagingUIPersistence(conversationId=", str, ", composerText=", str2, ", forms=");
        sbT.append(map);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/messaging/android/internal/conversationscreen/cache/MessagingUIPersistence;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return MessagingUIPersistence$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MessagingUIPersistence(@NotNull String str, @NotNull String str2, @NotNull Map<String, StoredForm> map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.conversationId = str;
        this.composerText = str2;
        this.forms = map;
    }

    public /* synthetic */ MessagingUIPersistence(String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? new LinkedHashMap() : map);
    }
}
