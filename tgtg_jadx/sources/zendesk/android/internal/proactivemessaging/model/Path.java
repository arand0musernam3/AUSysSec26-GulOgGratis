package zendesk.android.internal.proactivemessaging.model;

import e0.f;
import i90.g;
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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001b¨\u0006/"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Path;", "", "", "pathId", "zrlVersion", "Lzendesk/android/internal/proactivemessaging/model/Condition;", "condition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/proactivemessaging/model/Condition;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lzendesk/android/internal/proactivemessaging/model/Condition;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/model/Path;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lzendesk/android/internal/proactivemessaging/model/Condition;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lzendesk/android/internal/proactivemessaging/model/Condition;)Lzendesk/android/internal/proactivemessaging/model/Path;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPathId", "getPathId$annotations", "()V", "getZrlVersion", "getZrlVersion$annotations", "Lzendesk/android/internal/proactivemessaging/model/Condition;", "getCondition", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Path {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Condition condition;

    @NotNull
    private final String pathId;

    @NotNull
    private final String zrlVersion;

    public /* synthetic */ Path(int i11, String str, String str2, Condition condition, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, Path$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pathId = str;
        this.zrlVersion = str2;
        this.condition = condition;
    }

    public static /* synthetic */ Path copy$default(Path path, String str, String str2, Condition condition, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = path.pathId;
        }
        if ((i11 & 2) != 0) {
            str2 = path.zrlVersion;
        }
        if ((i11 & 4) != 0) {
            condition = path.condition;
        }
        return path.copy(str, str2, condition);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(Path self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.pathId);
        output.q(serialDesc, 1, self.zrlVersion);
        output.i(serialDesc, 2, Condition$$serializer.INSTANCE, self.condition);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPathId() {
        return this.pathId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getZrlVersion() {
        return this.zrlVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    @NotNull
    public final Path copy(@NotNull String pathId, @NotNull String zrlVersion, @NotNull Condition condition) {
        pathId.getClass();
        zrlVersion.getClass();
        condition.getClass();
        return new Path(pathId, zrlVersion, condition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Path)) {
            return false;
        }
        Path path = (Path) other;
        return Intrinsics.areEqual(this.pathId, path.pathId) && Intrinsics.areEqual(this.zrlVersion, path.zrlVersion) && Intrinsics.areEqual(this.condition, path.condition);
    }

    @NotNull
    public final Condition getCondition() {
        return this.condition;
    }

    @NotNull
    public final String getPathId() {
        return this.pathId;
    }

    @NotNull
    public final String getZrlVersion() {
        return this.zrlVersion;
    }

    public int hashCode() {
        return this.condition.hashCode() + l1.b(this.pathId.hashCode() * 31, 31, this.zrlVersion);
    }

    @NotNull
    public String toString() {
        String str = this.pathId;
        String str2 = this.zrlVersion;
        Condition condition = this.condition;
        StringBuilder sbT = f.t("Path(pathId=", str, ", zrlVersion=", str2, ", condition=");
        sbT.append(condition);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Path$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Path;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Path$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g("path_id")
    public static /* synthetic */ void getPathId$annotations() {
    }

    @g("zrl_version")
    public static /* synthetic */ void getZrlVersion$annotations() {
    }

    public Path(@NotNull String str, @NotNull String str2, @NotNull Condition condition) {
        str.getClass();
        str2.getClass();
        condition.getClass();
        this.pathId = str;
        this.zrlVersion = str2;
        this.condition = condition;
    }
}
