package zendesk.conversationkit.android.internal.metadata;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bJ \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¨\u0006\r"}, d2 = {"Lzendesk/conversationkit/android/internal/metadata/MetadataFormatter;", "", "<init>", "()V", "formatConversationFields", "", "", "fields", "", "formatConversationTags", "tags", "", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMetadataFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataFormatter.kt\nzendesk/conversationkit/android/internal/metadata/MetadataFormatter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,43:1\n216#2,2:44\n*S KotlinDebug\n*F\n+ 1 MetadataFormatter.kt\nzendesk/conversationkit/android/internal/metadata/MetadataFormatter\n*L\n17#1:44,2\n*E\n"})
public final class MetadataFormatter {

    @Deprecated
    @NotNull
    public static final String CUSTOM_FIELD_ZRN_FORMAT = "zen:ticket_field:%s";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAGS_ZRN_FORMAT = "zen:ticket:tags";

    @NotNull
    public final Map<String, Object> formatConversationFields(@NotNull Map<String, ? extends Object> fields) {
        fields.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : fields.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            linkedHashMap.put(String.format(CUSTOM_FIELD_ZRN_FORMAT, Arrays.copyOf(new Object[]{key}, 1)), value);
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<String, String> formatConversationTags(@NotNull List<String> tags) {
        tags.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (tags.isEmpty()) {
            return linkedHashMap;
        }
        linkedHashMap.put(TAGS_ZRN_FORMAT, CollectionsKt.U(tags, MessageLogView.COMMA_SEPARATOR, null, null, null, 62));
        return linkedHashMap;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/metadata/MetadataFormatter$Companion;", "", "<init>", "()V", "CUSTOM_FIELD_ZRN_FORMAT", "", "TAGS_ZRN_FORMAT", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
