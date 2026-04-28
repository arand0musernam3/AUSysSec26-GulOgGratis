package kotlin.reflect.jvm.internal.impl.name;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableId {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Name LOCAL_NAME;

    @NotNull
    private static final FqName PACKAGE_FQ_NAME_FOR_LOCAL;

    @NotNull
    private final Name callableName;

    @Nullable
    private final FqName className;

    @NotNull
    private final FqName packageName;

    @Nullable
    private final FqName pathToLocal;

    static {
        Name name = SpecialNames.LOCAL;
        LOCAL_NAME = name;
        FqName fqName = FqName.topLevel(name);
        fqName.getClass();
        PACKAGE_FQ_NAME_FOR_LOCAL = fqName;
    }

    public CallableId(@NotNull FqName fqName, @Nullable FqName fqName2, @NotNull Name name, @Nullable FqName fqName3) {
        fqName.getClass();
        name.getClass();
        this.packageName = fqName;
        this.className = fqName2;
        this.callableName = name;
        this.pathToLocal = fqName3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.areEqual(this.packageName, callableId.packageName) && Intrinsics.areEqual(this.className, callableId.className) && Intrinsics.areEqual(this.callableName, callableId.callableName) && Intrinsics.areEqual(this.pathToLocal, callableId.pathToLocal);
    }

    public int hashCode() {
        int iHashCode = this.packageName.hashCode() * 31;
        FqName fqName = this.className;
        int iHashCode2 = (this.callableName.hashCode() + ((iHashCode + (fqName == null ? 0 : fqName.hashCode())) * 31)) * 31;
        FqName fqName2 = this.pathToLocal;
        return iHashCode2 + (fqName2 != null ? fqName2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String strAsString = this.packageName.asString();
        strAsString.getClass();
        String strReplace = strAsString.replace('.', '/');
        strReplace.getClass();
        sb2.append(strReplace);
        sb2.append(ExpiryDateInput.SEPARATOR);
        FqName fqName = this.className;
        if (fqName != null) {
            sb2.append(fqName);
            sb2.append(".");
        }
        sb2.append(this.callableName);
        return sb2.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CallableId(FqName fqName, FqName fqName2, Name name, FqName fqName3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, fqName2, name, (i11 & 8) != 0 ? null : fqName3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, null, name, null, 8, null);
        fqName.getClass();
        name.getClass();
    }
}
