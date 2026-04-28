package zendesk.messaging.android.internal.validation;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzendesk/messaging/android/internal/validation/ValidationError;", "", "<init>", "()V", "FieldValidationFailed", "FieldRetrievalFailed", "Lzendesk/messaging/android/internal/validation/ValidationError$FieldRetrievalFailed;", "Lzendesk/messaging/android/internal/validation/ValidationError$FieldValidationFailed;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ValidationError extends Throwable {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lzendesk/messaging/android/internal/validation/ValidationError$FieldRetrievalFailed;", "Lzendesk/messaging/android/internal/validation/ValidationError;", InAppMessageBase.MESSAGE, "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FieldRetrievalFailed extends ValidationError {

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldRetrievalFailed(@NotNull String str) {
            super(null);
            str.getClass();
            this.message = str;
        }

        public static /* synthetic */ FieldRetrievalFailed copy$default(FieldRetrievalFailed fieldRetrievalFailed, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fieldRetrievalFailed.message;
            }
            return fieldRetrievalFailed.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final FieldRetrievalFailed copy(@NotNull String message) {
            message.getClass();
            return new FieldRetrievalFailed(message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FieldRetrievalFailed) && Intrinsics.areEqual(this.message, ((FieldRetrievalFailed) other).message);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a0.p("FieldRetrievalFailed(message=", this.message, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/validation/ValidationError$FieldValidationFailed;", "Lzendesk/messaging/android/internal/validation/ValidationError;", "id", "", InAppMessageBase.MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FieldValidationFailed extends ValidationError {

        @NotNull
        private final String id;

        @NotNull
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldValidationFailed(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.id = str;
            this.message = str2;
        }

        public static /* synthetic */ FieldValidationFailed copy$default(FieldValidationFailed fieldValidationFailed, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fieldValidationFailed.id;
            }
            if ((i11 & 2) != 0) {
                str2 = fieldValidationFailed.message;
            }
            return fieldValidationFailed.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final FieldValidationFailed copy(@NotNull String id2, @NotNull String message) {
            id2.getClass();
            message.getClass();
            return new FieldValidationFailed(id2, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldValidationFailed)) {
                return false;
            }
            FieldValidationFailed fieldValidationFailed = (FieldValidationFailed) other;
            return Intrinsics.areEqual(this.id, fieldValidationFailed.id) && Intrinsics.areEqual(this.message, fieldValidationFailed.message);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Override // java.lang.Throwable
        @NotNull
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.id.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        @NotNull
        public String toString() {
            return a.d("FieldValidationFailed(id=", this.id, ", message=", this.message, ")");
        }
    }

    public /* synthetic */ ValidationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ValidationError() {
    }
}
