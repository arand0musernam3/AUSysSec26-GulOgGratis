package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaNullabilityAnnotationsStatus {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final JavaNullabilityAnnotationsStatus DEFAULT = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, null, null, 6, null);

    @NotNull
    private final ReportLevel reportLevelAfter;

    @NotNull
    private final ReportLevel reportLevelBefore;

    @Nullable
    private final i sinceVersion;

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, i iVar, ReportLevel reportLevel2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i11 & 2) != 0 ? new i(1, 0, 0) : iVar, (i11 & 4) != 0 ? reportLevel : reportLevel2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.reportLevelBefore == javaNullabilityAnnotationsStatus.reportLevelBefore && Intrinsics.areEqual(this.sinceVersion, javaNullabilityAnnotationsStatus.sinceVersion) && this.reportLevelAfter == javaNullabilityAnnotationsStatus.reportLevelAfter;
    }

    @NotNull
    public final ReportLevel getReportLevelAfter() {
        return this.reportLevelAfter;
    }

    @NotNull
    public final ReportLevel getReportLevelBefore() {
        return this.reportLevelBefore;
    }

    @Nullable
    public final i getSinceVersion() {
        return this.sinceVersion;
    }

    public int hashCode() {
        int iHashCode = this.reportLevelBefore.hashCode() * 31;
        i iVar = this.sinceVersion;
        return this.reportLevelAfter.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.f40846d)) * 31);
    }

    @NotNull
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.reportLevelBefore + ", sinceVersion=" + this.sinceVersion + ", reportLevelAfter=" + this.reportLevelAfter + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JavaNullabilityAnnotationsStatus getDEFAULT() {
            return JavaNullabilityAnnotationsStatus.DEFAULT;
        }

        private Companion() {
        }
    }

    public JavaNullabilityAnnotationsStatus(@NotNull ReportLevel reportLevel, @Nullable i iVar, @NotNull ReportLevel reportLevel2) {
        reportLevel.getClass();
        reportLevel2.getClass();
        this.reportLevelBefore = reportLevel;
        this.sinceVersion = iVar;
        this.reportLevelAfter = reportLevel2;
    }
}
