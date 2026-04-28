package zendesk.android;

import e0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lzendesk/android/ZendeskCredentials;", "", "channelKey", "", "<init>", "(Ljava/lang/String;)V", "getChannelKey", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "Companion", "Builder", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZendeskCredentials {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ZendeskCredentials";

    @NotNull
    private final String channelKey;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lzendesk/android/ZendeskCredentials$Builder;", "", "channelKey", "", "<init>", "(Ljava/lang/String;)V", "build", "Lzendesk/android/ZendeskCredentials;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final String channelKey;

        public Builder(@NotNull String str) {
            str.getClass();
            this.channelKey = str;
        }

        @NotNull
        public final ZendeskCredentials build() {
            return new ZendeskCredentials(this.channelKey, null);
        }
    }

    private ZendeskCredentials(String str) {
        this.channelKey = str;
    }

    @NotNull
    public static final Builder builder(@NotNull String str) {
        return INSTANCE.builder(str);
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof ZendeskCredentials) && Intrinsics.areEqual(this.channelKey, ((ZendeskCredentials) other).channelKey);
    }

    @NotNull
    public final String getChannelKey() {
        return this.channelKey;
    }

    public int hashCode() {
        return Objects.hash(this.channelKey);
    }

    @NotNull
    public String toString() {
        return a0.p("ZendeskCredentials(channelKey='", this.channelKey, "')");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\n\u0010\t\u001a\u00020\u0005*\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lzendesk/android/ZendeskCredentials$Companion;", "", "<init>", "()V", "LOG_TAG", "", "builder", "Lzendesk/android/ZendeskCredentials$Builder;", "channelKey", "toQuery", "Lzendesk/android/ZendeskCredentials;", "fromQuery", "query", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nZendeskCredentials.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZendeskCredentials.kt\nzendesk/android/ZendeskCredentials$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1617#2,9:151\n1869#2:160\n1870#2:162\n1626#2:163\n1#3:161\n*S KotlinDebug\n*F\n+ 1 ZendeskCredentials.kt\nzendesk/android/ZendeskCredentials$Companion\n*L\n74#1:151,9\n74#1:160\n74#1:162\n74#1:163\n74#1:161\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder(@NotNull String channelKey) {
            channelKey.getClass();
            return new Builder(channelKey);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final ZendeskCredentials fromQuery(@NotNull String query) {
            Object[] objArr;
            query.getClass();
            List listSplit$default = StringsKt__StringsKt.split$default(query, new String[]{"&"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = listSplit$default.iterator();
            while (true) {
                Pair pair = null;
                objArr = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (StringsKt.z(str, "=", false)) {
                    List listSplit$default2 = StringsKt__StringsKt.split$default(str, new String[]{"="}, false, 2, 2, null);
                    pair = new Pair((String) listSplit$default2.get(0), (String) listSplit$default2.get(1));
                }
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            String str2 = (String) x0.j(arrayList).get("channelKey");
            if (str2 != null) {
                return new ZendeskCredentials(str2, objArr == true ? 1 : 0);
            }
            Logger.w(ZendeskCredentials.LOG_TAG, "Invalid query provided, unable to obtain an instance of MessagingCredentials.", new Object[0]);
            return null;
        }

        @NotNull
        public final String toQuery(@NotNull ZendeskCredentials zendeskCredentials) {
            zendeskCredentials.getClass();
            return f.k("channelKey=", zendeskCredentials.getChannelKey());
        }

        private Companion() {
        }
    }

    public /* synthetic */ ZendeskCredentials(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
