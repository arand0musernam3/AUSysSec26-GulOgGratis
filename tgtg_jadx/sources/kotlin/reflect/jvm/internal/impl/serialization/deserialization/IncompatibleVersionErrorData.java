package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;

    @NotNull
    private final ClassId classId;
    private final T compilerVersion;
    private final T expectedVersion;

    @NotNull
    private final String filePath;
    private final T languageVersion;

    public IncompatibleVersionErrorData(T t9, T t11, T t12, T t13, @NotNull String str, @NotNull ClassId classId) {
        str.getClass();
        classId.getClass();
        this.actualVersion = t9;
        this.compilerVersion = t11;
        this.languageVersion = t12;
        this.expectedVersion = t13;
        this.filePath = str;
        this.classId = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.areEqual(this.actualVersion, incompatibleVersionErrorData.actualVersion) && Intrinsics.areEqual(this.compilerVersion, incompatibleVersionErrorData.compilerVersion) && Intrinsics.areEqual(this.languageVersion, incompatibleVersionErrorData.languageVersion) && Intrinsics.areEqual(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && Intrinsics.areEqual(this.filePath, incompatibleVersionErrorData.filePath) && Intrinsics.areEqual(this.classId, incompatibleVersionErrorData.classId);
    }

    public int hashCode() {
        T t9 = this.actualVersion;
        int iHashCode = (t9 == null ? 0 : t9.hashCode()) * 31;
        T t11 = this.compilerVersion;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.languageVersion;
        int iHashCode3 = (iHashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.expectedVersion;
        return this.classId.hashCode() + l1.b((iHashCode3 + (t13 != null ? t13.hashCode() : 0)) * 31, 31, this.filePath);
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", compilerVersion=" + this.compilerVersion + ", languageVersion=" + this.languageVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ", classId=" + this.classId + ')';
    }
}
