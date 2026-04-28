package zendesk.conversationkit.android.model;

import cu.a;
import e0.f;
import i90.h;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import m90.r1;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b2\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u001c¨\u00066"}, d2 = {"Lzendesk/conversationkit/android/model/Author;", "", "", "userId", "Lzendesk/conversationkit/android/model/AuthorType;", "type", "", "Lzendesk/conversationkit/android/model/AuthorSubtype;", "subtypes", "displayName", "avatarUrl", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/AuthorType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lzendesk/conversationkit/android/model/AuthorType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/Author;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lzendesk/conversationkit/android/model/AuthorType;", "component3", "()Ljava/util/List;", "component4", "component5", "copy", "(Ljava/lang/String;Lzendesk/conversationkit/android/model/AuthorType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/model/Author;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "Lzendesk/conversationkit/android/model/AuthorType;", "getType", "Ljava/util/List;", "getSubtypes", "getDisplayName", "getAvatarUrl", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Author {

    @NotNull
    private static final j[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String avatarUrl;

    @NotNull
    private final String displayName;

    @NotNull
    private final List<AuthorSubtype> subtypes;

    @NotNull
    private final AuthorType type;

    @NotNull
    private final String userId;

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, l.a(mVar, new a(18)), l.a(mVar, new a(19)), null, null};
    }

    public Author(int i11, String str, AuthorType authorType, List list, String str2, String str3, m1 m1Var) {
        this.userId = (i11 & 1) == 0 ? UUID.randomUUID().toString() : str;
        if ((i11 & 2) == 0) {
            this.type = AuthorType.USER;
        } else {
            this.type = authorType;
        }
        if ((i11 & 4) == 0) {
            this.subtypes = n0.f26529a;
        } else {
            this.subtypes = list;
        }
        if ((i11 & 8) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str2;
        }
        if ((i11 & 16) == 0) {
            this.avatarUrl = null;
        } else {
            this.avatarUrl = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return AuthorType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(AuthorSubtype.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Author copy$default(Author author, String str, AuthorType authorType, List list, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = author.userId;
        }
        if ((i11 & 2) != 0) {
            authorType = author.type;
        }
        if ((i11 & 4) != 0) {
            list = author.subtypes;
        }
        if ((i11 & 8) != 0) {
            str2 = author.displayName;
        }
        if ((i11 & 16) != 0) {
            str3 = author.avatarUrl;
        }
        String str4 = str3;
        List list2 = list;
        return author.copy(str, authorType, list2, str2, str4);
    }

    public static final void write$Self$zendesk_conversationkit_conversationkit_android(Author self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.userId, UUID.randomUUID().toString())) {
            output.q(serialDesc, 0, self.userId);
        }
        if (output.C(serialDesc) || self.type != AuthorType.USER) {
            output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.type);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.subtypes, n0.f26529a)) {
            output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.subtypes);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.displayName, "")) {
            output.q(serialDesc, 3, self.displayName);
        }
        if (!output.C(serialDesc) && self.avatarUrl == null) {
            return;
        }
        output.r(serialDesc, 4, r1.f29848a, self.avatarUrl);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AuthorType getType() {
        return this.type;
    }

    @NotNull
    public final List<AuthorSubtype> component3() {
        return this.subtypes;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final Author copy(@NotNull String userId, @NotNull AuthorType type, @NotNull List<? extends AuthorSubtype> subtypes, @NotNull String displayName, @Nullable String avatarUrl) {
        userId.getClass();
        type.getClass();
        subtypes.getClass();
        displayName.getClass();
        return new Author(userId, type, subtypes, displayName, avatarUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Author)) {
            return false;
        }
        Author author = (Author) other;
        return Intrinsics.areEqual(this.userId, author.userId) && this.type == author.type && Intrinsics.areEqual(this.subtypes, author.subtypes) && Intrinsics.areEqual(this.displayName, author.displayName) && Intrinsics.areEqual(this.avatarUrl, author.avatarUrl);
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @NotNull
    public final String getDisplayName() {
        return this.displayName;
    }

    @NotNull
    public final List<AuthorSubtype> getSubtypes() {
        return this.subtypes;
    }

    @NotNull
    public final AuthorType getType() {
        return this.type;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iB = l1.b(f.c(this.subtypes, (this.type.hashCode() + (this.userId.hashCode() * 31)) * 31, 31), 31, this.displayName);
        String str = this.avatarUrl;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.userId;
        AuthorType authorType = this.type;
        List<AuthorSubtype> list = this.subtypes;
        String str2 = this.displayName;
        String str3 = this.avatarUrl;
        StringBuilder sb2 = new StringBuilder("Author(userId=");
        sb2.append(str);
        sb2.append(", type=");
        sb2.append(authorType);
        sb2.append(", subtypes=");
        sb2.append(list);
        sb2.append(", displayName=");
        sb2.append(str2);
        sb2.append(", avatarUrl=");
        return k.p(sb2, str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/Author$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/Author;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Author$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Author() {
        this((String) null, (AuthorType) null, (List) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Author(@NotNull String str, @NotNull AuthorType authorType, @NotNull List<? extends AuthorSubtype> list, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        authorType.getClass();
        list.getClass();
        str2.getClass();
        this.userId = str;
        this.type = authorType;
        this.subtypes = list;
        this.displayName = str2;
        this.avatarUrl = str3;
    }

    public Author(String str, AuthorType authorType, List list, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? UUID.randomUUID().toString() : str, (i11 & 2) != 0 ? AuthorType.USER : authorType, (i11 & 4) != 0 ? n0.f26529a : list, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? null : str3);
    }
}
