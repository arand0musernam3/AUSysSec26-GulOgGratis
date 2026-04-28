package zendesk.conversationkit.android.model;

import a80.a;
import i90.g;
import i90.h;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import u70.j;
import u70.l;
import u70.m;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lzendesk/conversationkit/android/model/AuthorType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$zendesk_conversationkit_conversationkit_android", "()Ljava/lang/String;", "USER", "BUSINESS", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthorType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthorType[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;

    @g("appUser")
    public static final AuthorType USER = new AuthorType("USER", 0, "appUser");

    @g("appMaker")
    public static final AuthorType BUSINESS = new AuthorType("BUSINESS", 1, "appMaker");

    private static final /* synthetic */ AuthorType[] $values() {
        return new AuthorType[]{USER, BUSINESS};
    }

    static {
        AuthorType[] authorTypeArr$values = $values();
        $VALUES = authorTypeArr$values;
        $ENTRIES = n.w(authorTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new cu.a(21));
    }

    private AuthorType(String str, int i11, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return c1.e("zendesk.conversationkit.android.model.AuthorType", values(), new String[]{"appUser", "appMaker"}, new Annotation[][]{null, null});
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthorType valueOf(String str) {
        return (AuthorType) Enum.valueOf(AuthorType.class, str);
    }

    public static AuthorType[] values() {
        return (AuthorType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/model/AuthorType$Companion;", "", "<init>", "()V", "findByValue", "Lzendesk/conversationkit/android/model/AuthorType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAuthor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Author.kt\nzendesk/conversationkit/android/model/AuthorType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AuthorType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final AuthorType findByValue(@NotNull String value) {
            Object next;
            value.getClass();
            Iterator<E> it = AuthorType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((AuthorType) next).getValue(), value)) {
                    break;
                }
            }
            AuthorType authorType = (AuthorType) next;
            return authorType == null ? AuthorType.USER : authorType;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
