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
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lzendesk/conversationkit/android/model/AuthorSubtype;", "", "<init>", "(Ljava/lang/String;I)V", "AI", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AuthorSubtype {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthorSubtype[] $VALUES;

    @NotNull
    private static final j $cachedSerializer$delegate;

    @g("AI")
    public static final AuthorSubtype AI = new AuthorSubtype("AI", 0);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    private static final /* synthetic */ AuthorSubtype[] $values() {
        return new AuthorSubtype[]{AI};
    }

    static {
        AuthorSubtype[] authorSubtypeArr$values = $values();
        $VALUES = authorSubtypeArr$values;
        $ENTRIES = n.w(authorSubtypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = l.a(m.PUBLICATION, new cu.a(20));
    }

    private AuthorSubtype(String str, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return c1.e("zendesk.conversationkit.android.model.AuthorSubtype", values(), new String[]{"AI"}, new Annotation[][]{null});
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthorSubtype valueOf(String str) {
        return (AuthorSubtype) Enum.valueOf(AuthorSubtype.class, str);
    }

    public static AuthorSubtype[] values() {
        return (AuthorSubtype[]) $VALUES.clone();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/model/AuthorSubtype$Companion;", "", "<init>", "()V", "findByValue", "Lzendesk/conversationkit/android/model/AuthorSubtype;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAuthor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Author.kt\nzendesk/conversationkit/android/model/AuthorSubtype$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AuthorSubtype.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final AuthorSubtype findByValue(@NotNull String value) {
            Object next;
            value.getClass();
            Iterator<E> it = AuthorSubtype.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((AuthorSubtype) next).name(), value)) {
                    break;
                }
            }
            return (AuthorSubtype) next;
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
