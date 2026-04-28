package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nJavaNullabilityAnnotationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaNullabilityAnnotationSettings.kt\norg/jetbrains/kotlin/load/java/JavaNullabilityAnnotationSettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public final class JavaNullabilityAnnotationSettingsKt {

    @NotNull
    private static final FqName CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final FqName JSPECIFY_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final FqName JSPECIFY_OLD_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final JavaNullabilityAnnotationsStatus JSR_305_DEFAULT_SETTINGS;

    @NotNull
    private static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> NULLABILITY_ANNOTATION_SETTINGS;

    @NotNull
    private static final FqName[] RXJAVA3_ANNOTATIONS;

    @NotNull
    private static final FqName RXJAVA3_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final String RXJAVA3_ANNOTATIONS_PACKAGE_NAME;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        JSPECIFY_OLD_ANNOTATIONS_PACKAGE = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        JSPECIFY_ANNOTATIONS_PACKAGE = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        RXJAVA3_ANNOTATIONS_PACKAGE = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE = fqName4;
        String strAsString = fqName3.asString();
        strAsString.getClass();
        RXJAVA3_ANNOTATIONS_PACKAGE_NAME = strAsString;
        RXJAVA3_ANNOTATIONS = new FqName[]{new FqName(k.l(strAsString, ".Nullable")), new FqName(k.l(strAsString, ".NonNull"))};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        Pair pair = new Pair(fqName5, companion.getDEFAULT());
        Pair pair2 = new Pair(new FqName("androidx.annotation"), companion.getDEFAULT());
        Pair pair3 = new Pair(new FqName("android.support.annotation"), companion.getDEFAULT());
        Pair pair4 = new Pair(new FqName("android.annotation"), companion.getDEFAULT());
        Pair pair5 = new Pair(new FqName("com.android.annotations"), companion.getDEFAULT());
        Pair pair6 = new Pair(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        Pair pair7 = new Pair(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        Pair pair8 = new Pair(fqName4, companion.getDEFAULT());
        Pair pair9 = new Pair(new FqName("javax.annotation"), companion.getDEFAULT());
        Pair pair10 = new Pair(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        Pair pair11 = new Pair(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pair12 = new Pair(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pair13 = new Pair(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        Pair pair14 = new Pair(new FqName("lombok"), companion.getDEFAULT());
        i iVar = new i(1, 9, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        NULLABILITY_ANNOTATION_SETTINGS = new NullabilityAnnotationStatesImpl(x0.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, iVar, reportLevel2)), new Pair(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new i(1, 9, 0), reportLevel2)), new Pair(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new i(1, 8, 0), reportLevel2))));
        JSR_305_DEFAULT_SETTINGS = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings getDefaultJsr305Settings(@org.jetbrains.annotations.NotNull u70.i r6) {
        /*
            r6.getClass()
            kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus r0 = kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.JSR_305_DEFAULT_SETTINGS
            u70.i r1 = r0.getSinceVersion()
            if (r1 == 0) goto L1f
            u70.i r1 = r0.getSinceVersion()
            r1.getClass()
            int r1 = r1.f40846d
            int r6 = r6.f40846d
            int r1 = r1 - r6
            if (r1 > 0) goto L1f
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.getReportLevelAfter()
        L1d:
            r1 = r6
            goto L24
        L1f:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.getReportLevelBefore()
            goto L1d
        L24:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = getDefaultMigrationJsr305ReportLevelForGivenGlobal(r1)
            kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings r0 = new kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings(u70.i):kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings");
    }

    public static /* synthetic */ Jsr305Settings getDefaultJsr305Settings$default(i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f40842f;
        }
        return getDefaultJsr305Settings(iVar);
    }

    @Nullable
    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel reportLevel) {
        reportLevel.getClass();
        if (reportLevel == ReportLevel.WARN) {
            return null;
        }
        return reportLevel;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName fqName) {
        fqName.getClass();
        return getReportLevelForAnnotation$default(fqName, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return JSPECIFY_ANNOTATIONS_PACKAGE;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return RXJAVA3_ANNOTATIONS;
    }

    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName fqName, @NotNull NullabilityAnnotationStates<? extends ReportLevel> nullabilityAnnotationStates, @NotNull i iVar) {
        fqName.getClass();
        nullabilityAnnotationStates.getClass();
        iVar.getClass();
        ReportLevel reportLevel = nullabilityAnnotationStates.get(fqName);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = NULLABILITY_ANNOTATION_SETTINGS.get(fqName);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null) {
            i sinceVersion = javaNullabilityAnnotationsStatus.getSinceVersion();
            sinceVersion.getClass();
            if (sinceVersion.f40846d - iVar.f40846d <= 0) {
                return javaNullabilityAnnotationsStatus.getReportLevelAfter();
            }
        }
        return javaNullabilityAnnotationsStatus.getReportLevelBefore();
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, i iVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            iVar = new i(1, 7, 20);
        }
        return getReportLevelForAnnotation(fqName, nullabilityAnnotationStates, iVar);
    }
}
