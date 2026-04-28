package zendesk.conversationkit.android.model;

import db0.c;
import e0.f;
import i90.a;
import i90.h;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001e¨\u00062"}, d2 = {"Lzendesk/conversationkit/android/model/Participant;", "", "", "id", "userId", "", "unreadCount", "Ljava/util/Date;", "lastRead", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/Date;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/Participant;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;)Lzendesk/conversationkit/android/model/Participant;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getUserId", "I", "getUnreadCount", "Ljava/util/Date;", "getLastRead", "getLastRead$annotations", "()V", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Participant {

    @NotNull
    private final String id;

    @Nullable
    private final Date lastRead;
    private final int unreadCount;

    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, l.a(m.PUBLICATION, new c(7))};

    public /* synthetic */ Participant(int i11, String str, String str2, int i12, Date date, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, Participant$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.userId = str2;
        this.unreadCount = i12;
        this.lastRead = date;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new a(Reflection.getOrCreateKotlinClass(Date.class), new KSerializer[0]);
    }

    public static /* synthetic */ Participant copy$default(Participant participant, String str, String str2, int i11, Date date, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = participant.id;
        }
        if ((i12 & 2) != 0) {
            str2 = participant.userId;
        }
        if ((i12 & 4) != 0) {
            i11 = participant.unreadCount;
        }
        if ((i12 & 8) != 0) {
            date = participant.lastRead;
        }
        return participant.copy(str, str2, i11, date);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(Participant self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.userId);
        output.m(2, self.unreadCount, serialDesc);
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.lastRead);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getLastRead() {
        return this.lastRead;
    }

    @NotNull
    public final Participant copy(@NotNull String id2, @NotNull String userId, int unreadCount, @Nullable Date lastRead) {
        id2.getClass();
        userId.getClass();
        return new Participant(id2, userId, unreadCount, lastRead);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) other;
        return Intrinsics.areEqual(this.id, participant.id) && Intrinsics.areEqual(this.userId, participant.userId) && this.unreadCount == participant.unreadCount && Intrinsics.areEqual(this.lastRead, participant.lastRead);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Date getLastRead() {
        return this.lastRead;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iB = k.b(this.unreadCount, l1.b(this.id.hashCode() * 31, 31, this.userId), 31);
        Date date = this.lastRead;
        return iB + (date == null ? 0 : date.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        int i11 = this.unreadCount;
        Date date = this.lastRead;
        StringBuilder sbT = f.t("Participant(id=", str, ", userId=", str2, ", unreadCount=");
        sbT.append(i11);
        sbT.append(", lastRead=");
        sbT.append(date);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/Participant$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/Participant;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Participant$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void getLastRead$annotations() {
    }

    public Participant(@NotNull String str, @NotNull String str2, int i11, @Nullable Date date) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.userId = str2;
        this.unreadCount = i11;
        this.lastRead = date;
    }
}
