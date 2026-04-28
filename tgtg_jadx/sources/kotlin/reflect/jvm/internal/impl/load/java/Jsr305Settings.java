package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.collections.c0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import v70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class Jsr305Settings {

    @NotNull
    private final j description$delegate;

    @NotNull
    private final ReportLevel globalLevel;
    private final boolean isDisabled;

    @Nullable
    private final ReportLevel migrationLevel;

    @NotNull
    private final Map<FqName, ReportLevel> userDefinedLevelForSpecificAnnotation;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(@NotNull ReportLevel reportLevel, @Nullable ReportLevel reportLevel2, @NotNull Map<FqName, ? extends ReportLevel> map) {
        reportLevel.getClass();
        map.getClass();
        this.globalLevel = reportLevel;
        this.migrationLevel = reportLevel2;
        this.userDefinedLevelForSpecificAnnotation = map;
        this.description$delegate = l.b(new Function0<String[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings$description$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String[] invoke() {
                Jsr305Settings jsr305Settings = this.this$0;
                e eVarB = c0.b();
                eVarB.add(jsr305Settings.getGlobalLevel().getDescription());
                ReportLevel migrationLevel = jsr305Settings.getMigrationLevel();
                if (migrationLevel != null) {
                    eVarB.add("under-migration:" + migrationLevel.getDescription());
                }
                for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.getUserDefinedLevelForSpecificAnnotation().entrySet()) {
                    eVarB.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
                }
                return (String[]) c0.a(eVarB).toArray(new String[0]);
            }
        });
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.isDisabled = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.globalLevel == jsr305Settings.globalLevel && this.migrationLevel == jsr305Settings.migrationLevel && Intrinsics.areEqual(this.userDefinedLevelForSpecificAnnotation, jsr305Settings.userDefinedLevelForSpecificAnnotation);
    }

    @NotNull
    public final ReportLevel getGlobalLevel() {
        return this.globalLevel;
    }

    @Nullable
    public final ReportLevel getMigrationLevel() {
        return this.migrationLevel;
    }

    @NotNull
    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.userDefinedLevelForSpecificAnnotation;
    }

    public int hashCode() {
        int iHashCode = this.globalLevel.hashCode() * 31;
        ReportLevel reportLevel = this.migrationLevel;
        return this.userDefinedLevelForSpecificAnnotation.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    @NotNull
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.globalLevel + ", migrationLevel=" + this.migrationLevel + ", userDefinedLevelForSpecificAnnotation=" + this.userDefinedLevelForSpecificAnnotation + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        reportLevel2 = (i11 & 2) != 0 ? null : reportLevel2;
        if ((i11 & 4) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        this(reportLevel, reportLevel2, map);
    }
}
