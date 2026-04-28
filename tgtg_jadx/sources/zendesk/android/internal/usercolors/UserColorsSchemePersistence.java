package zendesk.android.internal.usercolors;

import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;", "", "Lzendesk/android/internal/usercolors/UserColorsPersistence;", "light", "dark", "<init>", "(Lzendesk/android/internal/usercolors/UserColorsPersistence;Lzendesk/android/internal/usercolors/UserColorsPersistence;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/internal/usercolors/UserColorsPersistence;Lzendesk/android/internal/usercolors/UserColorsPersistence;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/internal/usercolors/UserColorsPersistence;", "component2", "copy", "(Lzendesk/android/internal/usercolors/UserColorsPersistence;Lzendesk/android/internal/usercolors/UserColorsPersistence;)Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/internal/usercolors/UserColorsPersistence;", "getLight", "getDark", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UserColorsSchemePersistence {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final UserColorsPersistence dark;

    @Nullable
    private final UserColorsPersistence light;

    public /* synthetic */ UserColorsSchemePersistence(int i11, UserColorsPersistence userColorsPersistence, UserColorsPersistence userColorsPersistence2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, UserColorsSchemePersistence$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.light = userColorsPersistence;
        this.dark = userColorsPersistence2;
    }

    public static /* synthetic */ UserColorsSchemePersistence copy$default(UserColorsSchemePersistence userColorsSchemePersistence, UserColorsPersistence userColorsPersistence, UserColorsPersistence userColorsPersistence2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userColorsPersistence = userColorsSchemePersistence.light;
        }
        if ((i11 & 2) != 0) {
            userColorsPersistence2 = userColorsSchemePersistence.dark;
        }
        return userColorsSchemePersistence.copy(userColorsPersistence, userColorsPersistence2);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(UserColorsSchemePersistence self, b output, SerialDescriptor serialDesc) {
        UserColorsPersistence$$serializer userColorsPersistence$$serializer = UserColorsPersistence$$serializer.INSTANCE;
        output.r(serialDesc, 0, userColorsPersistence$$serializer, self.light);
        output.r(serialDesc, 1, userColorsPersistence$$serializer, self.dark);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserColorsPersistence getLight() {
        return this.light;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserColorsPersistence getDark() {
        return this.dark;
    }

    @NotNull
    public final UserColorsSchemePersistence copy(@Nullable UserColorsPersistence light, @Nullable UserColorsPersistence dark) {
        return new UserColorsSchemePersistence(light, dark);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserColorsSchemePersistence)) {
            return false;
        }
        UserColorsSchemePersistence userColorsSchemePersistence = (UserColorsSchemePersistence) other;
        return Intrinsics.areEqual(this.light, userColorsSchemePersistence.light) && Intrinsics.areEqual(this.dark, userColorsSchemePersistence.dark);
    }

    @Nullable
    public final UserColorsPersistence getDark() {
        return this.dark;
    }

    @Nullable
    public final UserColorsPersistence getLight() {
        return this.light;
    }

    public int hashCode() {
        UserColorsPersistence userColorsPersistence = this.light;
        int iHashCode = (userColorsPersistence == null ? 0 : userColorsPersistence.hashCode()) * 31;
        UserColorsPersistence userColorsPersistence2 = this.dark;
        return iHashCode + (userColorsPersistence2 != null ? userColorsPersistence2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserColorsSchemePersistence(light=" + this.light + ", dark=" + this.dark + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/usercolors/UserColorsSchemePersistence$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/usercolors/UserColorsSchemePersistence;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return UserColorsSchemePersistence$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserColorsSchemePersistence(@Nullable UserColorsPersistence userColorsPersistence, @Nullable UserColorsPersistence userColorsPersistence2) {
        this.light = userColorsPersistence;
        this.dark = userColorsPersistence2;
    }
}
