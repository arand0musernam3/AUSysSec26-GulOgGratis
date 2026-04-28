package zendesk.conversationkit.android.model;

import a80.a;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import db0.b;
import db0.c;
import i90.f;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import v0.n;
import w.a0;
import zendesk.conversationkit.android.internal.ErrorKtxKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0005\u001e\u001f !\"¨\u0006#"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus;", "", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "statusType", "<init>", "(Lzendesk/conversationkit/android/model/MessageStatus$StatusType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageStatus$StatusType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lzendesk/conversationkit/android/model/MessageStatus;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "getStatusType", "()Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "Companion", "Pending", "Sent", "Failed", "Downloading", "DownloadFailed", "StatusType", "Failure", "Lzendesk/conversationkit/android/model/MessageStatus$DownloadFailed;", "Lzendesk/conversationkit/android/model/MessageStatus$Downloading;", "Lzendesk/conversationkit/android/model/MessageStatus$Failed;", "Lzendesk/conversationkit/android/model/MessageStatus$Pending;", "Lzendesk/conversationkit/android/model/MessageStatus$Sent;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MessageStatus {

    @NotNull
    private static final j $cachedSerializer$delegate;

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final StatusType statusType;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new b(26))};
        $cachedSerializer$delegate = l.a(mVar, new b(27));
    }

    public /* synthetic */ MessageStatus(int i11, StatusType statusType, m1 m1Var) {
        this.statusType = statusType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return StatusType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_$0() {
        return new f("zendesk.conversationkit.android.model.MessageStatus", Reflection.getOrCreateKotlinClass(MessageStatus.class), new KClass[]{Reflection.getOrCreateKotlinClass(DownloadFailed.class), Reflection.getOrCreateKotlinClass(Downloading.class), Reflection.getOrCreateKotlinClass(Failed.class), Reflection.getOrCreateKotlinClass(Pending.class), Reflection.getOrCreateKotlinClass(Sent.class)}, new KSerializer[]{MessageStatus$DownloadFailed$$serializer.INSTANCE, MessageStatus$Downloading$$serializer.INSTANCE, MessageStatus$Failed$$serializer.INSTANCE, MessageStatus$Pending$$serializer.INSTANCE, MessageStatus$Sent$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(MessageStatus self, l90.b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.statusType);
    }

    @NotNull
    public final StatusType getStatusType() {
        return this.statusType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$DownloadFailed;", "Lzendesk/conversationkit/android/model/MessageStatus;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "statusType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageStatus$StatusType;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageStatus$DownloadFailed;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lzendesk/conversationkit/android/model/MessageStatus$DownloadFailed;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("download_failed")
    public static final /* data */ class DownloadFailed extends MessageStatus {

        @NotNull
        private final String id;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new b(28)), null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DownloadFailed(int i11, StatusType statusType, String str, m1 m1Var) {
            super(i11, statusType, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, MessageStatus$DownloadFailed$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i11 & 2) == 0) {
                this.id = "DOWNLOAD_FAILED";
            } else {
                this.id = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return StatusType.INSTANCE.serializer();
        }

        public static /* synthetic */ DownloadFailed copy$default(DownloadFailed downloadFailed, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = downloadFailed.id;
            }
            return downloadFailed.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(DownloadFailed self, l90.b output, SerialDescriptor serialDesc) {
            MessageStatus.write$Self(self, output, serialDesc);
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.id, "DOWNLOAD_FAILED")) {
                return;
            }
            output.q(serialDesc, 1, self.id);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final DownloadFailed copy(@NotNull String id2) {
            id2.getClass();
            return new DownloadFailed(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DownloadFailed) && Intrinsics.areEqual(this.id, ((DownloadFailed) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("DownloadFailed(id=", this.id, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$DownloadFailed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus$DownloadFailed;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageStatus$DownloadFailed$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DownloadFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ DownloadFailed(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "DOWNLOAD_FAILED" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DownloadFailed(@NotNull String str) {
            super(StatusType.DOWNLOAD_FAILED, null);
            str.getClass();
            this.id = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Downloading;", "Lzendesk/conversationkit/android/model/MessageStatus;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "statusType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageStatus$StatusType;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageStatus$Downloading;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lzendesk/conversationkit/android/model/MessageStatus$Downloading;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("downloading")
    public static final /* data */ class Downloading extends MessageStatus {

        @NotNull
        private final String id;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new b(29)), null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Downloading(int i11, StatusType statusType, String str, m1 m1Var) {
            super(i11, statusType, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, MessageStatus$Downloading$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i11 & 2) == 0) {
                this.id = "DOWNLOADING";
            } else {
                this.id = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return StatusType.INSTANCE.serializer();
        }

        public static /* synthetic */ Downloading copy$default(Downloading downloading, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = downloading.id;
            }
            return downloading.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Downloading self, l90.b output, SerialDescriptor serialDesc) {
            MessageStatus.write$Self(self, output, serialDesc);
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.id, "DOWNLOADING")) {
                return;
            }
            output.q(serialDesc, 1, self.id);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Downloading copy(@NotNull String id2) {
            id2.getClass();
            return new Downloading(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Downloading) && Intrinsics.areEqual(this.id, ((Downloading) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Downloading(id=", this.id, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Downloading$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus$Downloading;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageStatus$Downloading$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Downloading() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Downloading(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "DOWNLOADING" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloading(@NotNull String str) {
            super(StatusType.DOWNLOADING, null);
            str.getClass();
            this.id = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017¨\u0006("}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Failed;", "Lzendesk/conversationkit/android/model/MessageStatus;", "Lzendesk/conversationkit/android/model/MessageStatus$Failure;", "failure", "<init>", "(Lzendesk/conversationkit/android/model/MessageStatus$Failure;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "statusType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageStatus$StatusType;Lzendesk/conversationkit/android/model/MessageStatus$Failure;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageStatus$Failed;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/conversationkit/android/model/MessageStatus$Failure;", "copy", "(Lzendesk/conversationkit/android/model/MessageStatus$Failure;)Lzendesk/conversationkit/android/model/MessageStatus$Failed;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/conversationkit/android/model/MessageStatus$Failure;", "getFailure", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("failed")
    public static final /* data */ class Failed extends MessageStatus {

        @NotNull
        private static final j[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Failure failure;

        static {
            m mVar = m.PUBLICATION;
            $childSerializers = new j[]{l.a(mVar, new c(0)), l.a(mVar, new c(1))};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failed(int i11, StatusType statusType, Failure failure, m1 m1Var) {
            super(i11, statusType, m1Var);
            if (3 != (i11 & 3)) {
                c1.j(i11, 3, MessageStatus$Failed$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.failure = failure;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return StatusType.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return Failure.INSTANCE.serializer();
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Failure failure, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                failure = failed.failure;
            }
            return failed.copy(failure);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Failed self, l90.b output, SerialDescriptor serialDesc) {
            MessageStatus.write$Self(self, output, serialDesc);
            output.i(serialDesc, 1, (KSerializer) $childSerializers[1].getValue(), self.failure);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Failure getFailure() {
            return this.failure;
        }

        @NotNull
        public final Failed copy(@NotNull Failure failure) {
            failure.getClass();
            return new Failed(failure);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && this.failure == ((Failed) other).failure;
        }

        @NotNull
        public final Failure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failed(failure=" + this.failure + ")";
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Failed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus$Failed;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageStatus$Failed$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(@NotNull Failure failure) {
            super(StatusType.FAILED, null);
            failure.getClass();
            this.failure = failure;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Failure;", "", "<init>", "(Ljava/lang/String;I)V", "GENERAL", "CONTENT_TOO_LARGE", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final class Failure {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Failure[] $VALUES;

        @NotNull
        private static final j $cachedSerializer$delegate;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Failure GENERAL = new Failure("GENERAL", 0);
        public static final Failure CONTENT_TOO_LARGE = new Failure("CONTENT_TOO_LARGE", 1);

        private static final /* synthetic */ Failure[] $values() {
            return new Failure[]{GENERAL, CONTENT_TOO_LARGE};
        }

        static {
            Failure[] failureArr$values = $values();
            $VALUES = failureArr$values;
            $ENTRIES = n.w(failureArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = l.a(m.PUBLICATION, new c(2));
        }

        private Failure(String str, int i11) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            Failure[] failureArrValues = values();
            failureArrValues.getClass();
            return new i90.a("zendesk.conversationkit.android.model.MessageStatus.Failure", (Enum[]) failureArrValues);
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static Failure valueOf(String str) {
            return (Failure) Enum.valueOf(Failure.class, str);
        }

        public static Failure[] values() {
            return (Failure[]) $VALUES.clone();
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Failure$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus$Failure;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) Failure.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Pending;", "Lzendesk/conversationkit/android/model/MessageStatus;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "statusType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageStatus$StatusType;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageStatus$Pending;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lzendesk/conversationkit/android/model/MessageStatus$Pending;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g(StatusResponseUtils.RESULT_PENDING)
    public static final /* data */ class Pending extends MessageStatus {

        @NotNull
        private final String id;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new c(3)), null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Pending(int i11, StatusType statusType, String str, m1 m1Var) {
            super(i11, statusType, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, MessageStatus$Pending$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i11 & 2) == 0) {
                this.id = "PENDING";
            } else {
                this.id = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return StatusType.INSTANCE.serializer();
        }

        public static /* synthetic */ Pending copy$default(Pending pending, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = pending.id;
            }
            return pending.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Pending self, l90.b output, SerialDescriptor serialDesc) {
            MessageStatus.write$Self(self, output, serialDesc);
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.id, "PENDING")) {
                return;
            }
            output.q(serialDesc, 1, self.id);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Pending copy(@NotNull String id2) {
            id2.getClass();
            return new Pending(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pending) && Intrinsics.areEqual(this.id, ((Pending) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Pending(id=", this.id, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Pending$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus$Pending;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageStatus$Pending$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Pending() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Pending(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "PENDING" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pending(@NotNull String str) {
            super(StatusType.PENDING, null);
            str.getClass();
            this.id = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Sent;", "Lzendesk/conversationkit/android/model/MessageStatus;", "", "id", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "statusType", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/conversationkit/android/model/MessageStatus$StatusType;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/MessageStatus$Sent;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lzendesk/conversationkit/android/model/MessageStatus$Sent;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    @g("sent")
    public static final /* data */ class Sent extends MessageStatus {

        @NotNull
        private final String id;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final j[] $childSerializers = {l.a(m.PUBLICATION, new c(4)), null};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Sent(int i11, StatusType statusType, String str, m1 m1Var) {
            super(i11, statusType, m1Var);
            if (1 != (i11 & 1)) {
                c1.j(i11, 1, MessageStatus$Sent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i11 & 2) == 0) {
                this.id = "SENT";
            } else {
                this.id = str;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return StatusType.INSTANCE.serializer();
        }

        public static /* synthetic */ Sent copy$default(Sent sent, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sent.id;
            }
            return sent.copy(str);
        }

        public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Sent self, l90.b output, SerialDescriptor serialDesc) {
            MessageStatus.write$Self(self, output, serialDesc);
            if (!output.C(serialDesc) && Intrinsics.areEqual(self.id, "SENT")) {
                return;
            }
            output.q(serialDesc, 1, self.id);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Sent copy(@NotNull String id2) {
            id2.getClass();
            return new Sent(id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Sent) && Intrinsics.areEqual(this.id, ((Sent) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Sent(id=", this.id, ")");
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Sent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus$Sent;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return MessageStatus$Sent$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sent() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Sent(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "SENT" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sent(@NotNull String str) {
            super(StatusType.SENT, null);
            str.getClass();
            this.id = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PENDING", "SENT", "FAILED", "DOWNLOADING", "DOWNLOAD_FAILED", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @h
    public static final class StatusType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StatusType[] $VALUES;

        @NotNull
        private static final j $cachedSerializer$delegate;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String value;
        public static final StatusType PENDING = new StatusType("PENDING", 0, StatusResponseUtils.RESULT_PENDING);
        public static final StatusType SENT = new StatusType("SENT", 1, "sent");
        public static final StatusType FAILED = new StatusType("FAILED", 2, "failed");
        public static final StatusType DOWNLOADING = new StatusType("DOWNLOADING", 3, "downloading");
        public static final StatusType DOWNLOAD_FAILED = new StatusType("DOWNLOAD_FAILED", 4, "download_failed");

        private static final /* synthetic */ StatusType[] $values() {
            return new StatusType[]{PENDING, SENT, FAILED, DOWNLOADING, DOWNLOAD_FAILED};
        }

        static {
            StatusType[] statusTypeArr$values = $values();
            $VALUES = statusTypeArr$values;
            $ENTRIES = n.w(statusTypeArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = l.a(m.PUBLICATION, new c(5));
        }

        private StatusType(String str, int i11, String str2) {
            this.value = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            StatusType[] statusTypeArrValues = values();
            statusTypeArrValues.getClass();
            return new i90.a("zendesk.conversationkit.android.model.MessageStatus.StatusType", (Enum[]) statusTypeArrValues);
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static StatusType valueOf(String str) {
            return (StatusType) Enum.valueOf(StatusType.class, str);
        }

        public static StatusType[] values() {
            return (StatusType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$StatusType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus$StatusType;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) StatusType.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lzendesk/conversationkit/android/model/MessageStatus$Companion;", "", "<init>", "()V", "failed", "Lzendesk/conversationkit/android/model/MessageStatus$Failed;", "throwable", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/MessageStatus;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MessageStatus.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final Failed failed(@NotNull Throwable throwable) {
            throwable.getClass();
            return ErrorKtxKt.isContentTooLargeException(throwable) ? new Failed(Failure.CONTENT_TOO_LARGE) : new Failed(Failure.GENERAL);
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MessageStatus(StatusType statusType, DefaultConstructorMarker defaultConstructorMarker) {
        this(statusType);
    }

    private MessageStatus(StatusType statusType) {
        this.statusType = statusType;
    }
}
