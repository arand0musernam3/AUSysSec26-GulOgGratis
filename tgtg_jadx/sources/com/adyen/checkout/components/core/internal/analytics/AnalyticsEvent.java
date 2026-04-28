package com.adyen.checkout.components.core.internal.analytics;

import a80.a;
import b3.i;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.braze.models.inappmessage.InAppMessageBase;
import e0.f;
import j4.s;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import v0.n;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "", "component", "", "getComponent", "()Ljava/lang/String;", "id", "getId", "shouldForceSend", "", "getShouldForceSend", "()Z", "timestamp", "", "getTimestamp", "()J", "Error", "Info", "Log", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnalyticsEvent {
    @NotNull
    String getComponent();

    @NotNull
    String getId();

    boolean getShouldForceSend();

    long getTimestamp();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B]\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "id", "", "timestamp", "", "shouldForceSend", "", "component", "errorType", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error$Type;", "code", "target", InAppMessageBase.MESSAGE, "(Ljava/lang/String;JZLjava/lang/String;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getComponent", "getErrorType", "()Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error$Type;", "getId", "getMessage", "getShouldForceSend", "()Z", "getTarget", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "Type", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AnalyticsEvent {

        @Nullable
        private final String code;

        @NotNull
        private final String component;

        @Nullable
        private final Type errorType;

        @NotNull
        private final String id;

        @Nullable
        private final String message;
        private final boolean shouldForceSend;

        @Nullable
        private final String target;
        private final long timestamp;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Error$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REDIRECT", "INTERNAL", "THIRD_PARTY", "API_ERROR", "THREEDS2", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @NotNull
            private final String value;
            public static final Type REDIRECT = new Type("REDIRECT", 0, "Redirect");
            public static final Type INTERNAL = new Type("INTERNAL", 1, "Internal");
            public static final Type THIRD_PARTY = new Type("THIRD_PARTY", 2, "ThirdParty");
            public static final Type API_ERROR = new Type("API_ERROR", 3, "ApiError");
            public static final Type THREEDS2 = new Type("THREEDS2", 4, "ThreeDS2");

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{REDIRECT, INTERNAL, THIRD_PARTY, API_ERROR, THREEDS2};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = n.w(typeArr$values);
            }

            private Type(String str, int i11, String str2) {
                this.value = str2;
            }

            @NotNull
            public static a getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Error(String str, long j9, boolean z11, String str2, Type type, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            String str6;
            String str7;
            Type type2;
            String str8;
            boolean z12;
            String str9;
            str = (i11 & 1) != 0 ? s.e() : str;
            j9 = (i11 & 2) != 0 ? new Date().getTime() : j9;
            z11 = (i11 & 4) != 0 ? true : z11;
            type = (i11 & 16) != 0 ? null : type;
            str3 = (i11 & 32) != 0 ? null : str3;
            str4 = (i11 & 64) != 0 ? null : str4;
            if ((i11 & 128) != 0) {
                str6 = null;
                str8 = str3;
                str7 = str4;
                str9 = str2;
                type2 = type;
                z12 = z11;
            } else {
                str6 = str5;
                str7 = str4;
                type2 = type;
                str8 = str3;
                z12 = z11;
                str9 = str2;
            }
            this(str, j9, z12, str9, type2, str8, str7, str6);
        }

        public static /* synthetic */ Error copy$default(Error error, String str, long j9, boolean z11, String str2, Type type, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.id;
            }
            if ((i11 & 2) != 0) {
                j9 = error.timestamp;
            }
            if ((i11 & 4) != 0) {
                z11 = error.shouldForceSend;
            }
            if ((i11 & 8) != 0) {
                str2 = error.component;
            }
            if ((i11 & 16) != 0) {
                type = error.errorType;
            }
            if ((i11 & 32) != 0) {
                str3 = error.code;
            }
            if ((i11 & 64) != 0) {
                str4 = error.target;
            }
            if ((i11 & 128) != 0) {
                str5 = error.message;
            }
            String str6 = str4;
            String str7 = str5;
            return error.copy(str, j9, z11, str2, type, str3, str6, str7);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Type getErrorType() {
            return this.errorType;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Error copy(@NotNull String id2, long timestamp, boolean shouldForceSend, @NotNull String component, @Nullable Type errorType, @Nullable String code, @Nullable String target, @Nullable String message) {
            id2.getClass();
            component.getClass();
            return new Error(id2, timestamp, shouldForceSend, component, errorType, code, target, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.id, error.id) && this.timestamp == error.timestamp && this.shouldForceSend == error.shouldForceSend && Intrinsics.areEqual(this.component, error.component) && this.errorType == error.errorType && Intrinsics.areEqual(this.code, error.code) && Intrinsics.areEqual(this.target, error.target) && Intrinsics.areEqual(this.message, error.message);
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        @NotNull
        public String getComponent() {
            return this.component;
        }

        @Nullable
        public final Type getErrorType() {
            return this.errorType;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        public boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        @Nullable
        public final String getTarget() {
            return this.target;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iB = l1.b(k.e(f.b(this.id.hashCode() * 31, 31, this.timestamp), 31, this.shouldForceSend), 31, this.component);
            Type type = this.errorType;
            int iHashCode = (iB + (type == null ? 0 : type.hashCode())) * 31;
            String str = this.code;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.target;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.message;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            boolean z11 = this.shouldForceSend;
            String str2 = this.component;
            Type type = this.errorType;
            String str3 = this.code;
            String str4 = this.target;
            String str5 = this.message;
            StringBuilder sbN = i.n(j9, "Error(id=", str, ", timestamp=");
            sbN.append(", shouldForceSend=");
            sbN.append(z11);
            sbN.append(", component=");
            sbN.append(str2);
            sbN.append(", errorType=");
            sbN.append(type);
            sbN.append(", code=");
            sbN.append(str3);
            s.A(sbN, ", target=", str4, ", message=", str5);
            sbN.append(")");
            return sbN.toString();
        }

        @DirectAnalyticsEventCreation
        public Error(@NotNull String str, long j9, boolean z11, @NotNull String str2, @Nullable Type type, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.timestamp = j9;
            this.shouldForceSend = z11;
            this.component = str2;
            this.errorType = type;
            this.code = str3;
            this.target = str4;
            this.message = str5;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-Bi\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "id", "", "timestamp", "", "shouldForceSend", "", "component", "type", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log$Type;", "subType", "result", "target", InAppMessageBase.MESSAGE, "(Ljava/lang/String;JZLjava/lang/String;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "getId", "getMessage", "getResult", "getShouldForceSend", "()Z", "getSubType", "getTarget", "getTimestamp", "()J", "getType", "()Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "Type", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Log implements AnalyticsEvent {

        @NotNull
        private final String component;

        @NotNull
        private final String id;

        @Nullable
        private final String message;

        @Nullable
        private final String result;
        private final boolean shouldForceSend;

        @Nullable
        private final String subType;

        @Nullable
        private final String target;
        private final long timestamp;

        @Nullable
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Log$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACTION", "CARD_SCANNER", "SUBMIT", "CLOSED", "THREEDS2", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @NotNull
            private final String value;
            public static final Type ACTION = new Type("ACTION", 0, "action");
            public static final Type CARD_SCANNER = new Type("CARD_SCANNER", 1, "CardScanner");
            public static final Type SUBMIT = new Type("SUBMIT", 2, "submit");
            public static final Type CLOSED = new Type("CLOSED", 3, "closed");
            public static final Type THREEDS2 = new Type("THREEDS2", 4, "ThreeDS2");

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{ACTION, CARD_SCANNER, SUBMIT, CLOSED, THREEDS2};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = n.w(typeArr$values);
            }

            private Type(String str, int i11, String str2) {
                this.value = str2;
            }

            @NotNull
            public static a getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Log(String str, long j9, boolean z11, String str2, Type type, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            Type type2;
            boolean z12;
            str = (i11 & 1) != 0 ? s.e() : str;
            j9 = (i11 & 2) != 0 ? new Date().getTime() : j9;
            z11 = (i11 & 4) != 0 ? true : z11;
            type = (i11 & 16) != 0 ? null : type;
            str3 = (i11 & 32) != 0 ? null : str3;
            str4 = (i11 & 64) != 0 ? null : str4;
            str5 = (i11 & 128) != 0 ? null : str5;
            if ((i11 & 256) != 0) {
                str7 = null;
                str10 = str4;
                str8 = str5;
                type2 = type;
                str9 = str3;
                z12 = z11;
                str11 = str2;
            } else {
                str7 = str6;
                str8 = str5;
                str9 = str3;
                str10 = str4;
                str11 = str2;
                type2 = type;
                z12 = z11;
            }
            this(str, j9, z12, str11, type2, str9, str10, str8, str7);
        }

        public static /* synthetic */ Log copy$default(Log log, String str, long j9, boolean z11, String str2, Type type, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = log.id;
            }
            if ((i11 & 2) != 0) {
                j9 = log.timestamp;
            }
            if ((i11 & 4) != 0) {
                z11 = log.shouldForceSend;
            }
            if ((i11 & 8) != 0) {
                str2 = log.component;
            }
            if ((i11 & 16) != 0) {
                type = log.type;
            }
            if ((i11 & 32) != 0) {
                str3 = log.subType;
            }
            if ((i11 & 64) != 0) {
                str4 = log.result;
            }
            if ((i11 & 128) != 0) {
                str5 = log.target;
            }
            if ((i11 & 256) != 0) {
                str6 = log.message;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            Type type2 = type;
            boolean z12 = z11;
            return log.copy(str, j9, z12, str2, type2, str3, str9, str7, str8);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final Log copy(@NotNull String id2, long timestamp, boolean shouldForceSend, @NotNull String component, @Nullable Type type, @Nullable String subType, @Nullable String result, @Nullable String target, @Nullable String message) {
            id2.getClass();
            component.getClass();
            return new Log(id2, timestamp, shouldForceSend, component, type, subType, result, target, message);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Log)) {
                return false;
            }
            Log log = (Log) other;
            return Intrinsics.areEqual(this.id, log.id) && this.timestamp == log.timestamp && this.shouldForceSend == log.shouldForceSend && Intrinsics.areEqual(this.component, log.component) && this.type == log.type && Intrinsics.areEqual(this.subType, log.subType) && Intrinsics.areEqual(this.result, log.result) && Intrinsics.areEqual(this.target, log.target) && Intrinsics.areEqual(this.message, log.message);
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        @NotNull
        public String getComponent() {
            return this.component;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getResult() {
            return this.result;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        public boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        @Nullable
        public final String getSubType() {
            return this.subType;
        }

        @Nullable
        public final String getTarget() {
            return this.target;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Nullable
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int iB = l1.b(k.e(f.b(this.id.hashCode() * 31, 31, this.timestamp), 31, this.shouldForceSend), 31, this.component);
            Type type = this.type;
            int iHashCode = (iB + (type == null ? 0 : type.hashCode())) * 31;
            String str = this.subType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.result;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.target;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            boolean z11 = this.shouldForceSend;
            String str2 = this.component;
            Type type = this.type;
            String str3 = this.subType;
            String str4 = this.result;
            String str5 = this.target;
            String str6 = this.message;
            StringBuilder sbN = i.n(j9, "Log(id=", str, ", timestamp=");
            sbN.append(", shouldForceSend=");
            sbN.append(z11);
            sbN.append(", component=");
            sbN.append(str2);
            sbN.append(", type=");
            sbN.append(type);
            sbN.append(", subType=");
            sbN.append(str3);
            s.A(sbN, ", result=", str4, ", target=", str5);
            return f.n(sbN, ", message=", str6, ")");
        }

        @DirectAnalyticsEventCreation
        public Log(@NotNull String str, long j9, boolean z11, @NotNull String str2, @Nullable Type type, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.timestamp = j9;
            this.shouldForceSend = z11;
            this.component = str2;
            this.type = type;
            this.subType = str3;
            this.result = str4;
            this.target = str5;
            this.message = str6;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b#\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001:B\u0099\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\f\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015¨\u0006;"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent;", "id", "", "timestamp", "", "shouldForceSend", "", "component", "type", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info$Type;", "target", "isStoredPaymentMethod", "brand", IssuerListPaymentMethod.ISSUER, "validationErrorCode", "validationErrorMessage", "configData", "", "(Ljava/lang/String;JZLjava/lang/String;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info$Type;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBrand", "()Ljava/lang/String;", "getComponent", "getConfigData", "()Ljava/util/Map;", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIssuer", "getShouldForceSend", "()Z", "getTarget", "getTimestamp", "()J", "getType", "()Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info$Type;", "getValidationErrorCode", "getValidationErrorMessage", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;JZLjava/lang/String;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info$Type;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info;", "equals", "other", "", "hashCode", "", "toString", "Type", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Info implements AnalyticsEvent {

        @Nullable
        private final String brand;

        @NotNull
        private final String component;

        @Nullable
        private final Map<String, String> configData;

        @NotNull
        private final String id;

        @Nullable
        private final Boolean isStoredPaymentMethod;

        @Nullable
        private final String issuer;
        private final boolean shouldForceSend;

        @Nullable
        private final String target;
        private final long timestamp;

        @Nullable
        private final Type type;

        @Nullable
        private final String validationErrorCode;

        @Nullable
        private final String validationErrorMessage;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsEvent$Info$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DISPLAYED", "DOWNLOAD", "FOCUS", "INPUT", "RENDERED", "SELECTED", "UNFOCUS", "VALIDATION_ERROR", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type DISPLAYED = new Type("DISPLAYED", 0, "displayed");
            public static final Type DOWNLOAD = new Type("DOWNLOAD", 1, "download");
            public static final Type FOCUS = new Type("FOCUS", 2, "focus");
            public static final Type INPUT = new Type("INPUT", 3, "input");
            public static final Type RENDERED = new Type("RENDERED", 4, "rendered");
            public static final Type SELECTED = new Type("SELECTED", 5, "selected");
            public static final Type UNFOCUS = new Type("UNFOCUS", 6, "unfocus");
            public static final Type VALIDATION_ERROR = new Type("VALIDATION_ERROR", 7, "validationError");

            @NotNull
            private final String value;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{DISPLAYED, DOWNLOAD, FOCUS, INPUT, RENDERED, SELECTED, UNFOCUS, VALIDATION_ERROR};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = n.w(typeArr$values);
            }

            private Type(String str, int i11, String str2) {
                this.value = str2;
            }

            @NotNull
            public static a getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            @NotNull
            public final String getValue() {
                return this.value;
            }
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Info(java.lang.String r17, long r18, boolean r20, java.lang.String r21, com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent.Info.Type r22, java.lang.String r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.Map r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
            /*
                r16 = this;
                r0 = r30
                r1 = r0 & 1
                if (r1 == 0) goto Lc
                java.lang.String r1 = j4.s.e()
                r3 = r1
                goto Le
            Lc:
                r3 = r17
            Le:
                r1 = r0 & 2
                if (r1 == 0) goto L1d
                java.util.Date r1 = new java.util.Date
                r1.<init>()
                long r1 = r1.getTime()
                r4 = r1
                goto L1f
            L1d:
                r4 = r18
            L1f:
                r1 = r0 & 4
                if (r1 == 0) goto L26
                r1 = 0
                r6 = r1
                goto L28
            L26:
                r6 = r20
            L28:
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L2f
                r8 = r2
                goto L31
            L2f:
                r8 = r22
            L31:
                r1 = r0 & 32
                if (r1 == 0) goto L37
                r9 = r2
                goto L39
            L37:
                r9 = r23
            L39:
                r1 = r0 & 64
                if (r1 == 0) goto L3f
                r10 = r2
                goto L41
            L3f:
                r10 = r24
            L41:
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L47
                r11 = r2
                goto L49
            L47:
                r11 = r25
            L49:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L4f
                r12 = r2
                goto L51
            L4f:
                r12 = r26
            L51:
                r1 = r0 & 512(0x200, float:7.17E-43)
                if (r1 == 0) goto L57
                r13 = r2
                goto L59
            L57:
                r13 = r27
            L59:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L5f
                r14 = r2
                goto L61
            L5f:
                r14 = r28
            L61:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L6b
                r15 = r2
                r7 = r21
                r2 = r16
                goto L71
            L6b:
                r15 = r29
                r2 = r16
                r7 = r21
            L71:
                r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent.Info.<init>(java.lang.String, long, boolean, java.lang.String, com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent$Info$Type, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Info copy$default(Info info, String str, long j9, boolean z11, String str2, Type type, String str3, Boolean bool, String str4, String str5, String str6, String str7, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = info.id;
            }
            return info.copy(str, (i11 & 2) != 0 ? info.timestamp : j9, (i11 & 4) != 0 ? info.shouldForceSend : z11, (i11 & 8) != 0 ? info.component : str2, (i11 & 16) != 0 ? info.type : type, (i11 & 32) != 0 ? info.target : str3, (i11 & 64) != 0 ? info.isStoredPaymentMethod : bool, (i11 & 128) != 0 ? info.brand : str4, (i11 & 256) != 0 ? info.issuer : str5, (i11 & 512) != 0 ? info.validationErrorCode : str6, (i11 & 1024) != 0 ? info.validationErrorMessage : str7, (i11 & NewHope.SENDB_BYTES) != 0 ? info.configData : map);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getValidationErrorCode() {
            return this.validationErrorCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getValidationErrorMessage() {
            return this.validationErrorMessage;
        }

        @Nullable
        public final Map<String, String> component12() {
            return this.configData;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getComponent() {
            return this.component;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Boolean getIsStoredPaymentMethod() {
            return this.isStoredPaymentMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getIssuer() {
            return this.issuer;
        }

        @NotNull
        public final Info copy(@NotNull String id2, long timestamp, boolean shouldForceSend, @NotNull String component, @Nullable Type type, @Nullable String target, @Nullable Boolean isStoredPaymentMethod, @Nullable String brand, @Nullable String issuer, @Nullable String validationErrorCode, @Nullable String validationErrorMessage, @Nullable Map<String, String> configData) {
            id2.getClass();
            component.getClass();
            return new Info(id2, timestamp, shouldForceSend, component, type, target, isStoredPaymentMethod, brand, issuer, validationErrorCode, validationErrorMessage, configData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.areEqual(this.id, info.id) && this.timestamp == info.timestamp && this.shouldForceSend == info.shouldForceSend && Intrinsics.areEqual(this.component, info.component) && this.type == info.type && Intrinsics.areEqual(this.target, info.target) && Intrinsics.areEqual(this.isStoredPaymentMethod, info.isStoredPaymentMethod) && Intrinsics.areEqual(this.brand, info.brand) && Intrinsics.areEqual(this.issuer, info.issuer) && Intrinsics.areEqual(this.validationErrorCode, info.validationErrorCode) && Intrinsics.areEqual(this.validationErrorMessage, info.validationErrorMessage) && Intrinsics.areEqual(this.configData, info.configData);
        }

        @Nullable
        public final String getBrand() {
            return this.brand;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        @NotNull
        public String getComponent() {
            return this.component;
        }

        @Nullable
        public final Map<String, String> getConfigData() {
            return this.configData;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        @NotNull
        public String getId() {
            return this.id;
        }

        @Nullable
        public final String getIssuer() {
            return this.issuer;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        public boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        @Nullable
        public final String getTarget() {
            return this.target;
        }

        @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        @Nullable
        public final Type getType() {
            return this.type;
        }

        @Nullable
        public final String getValidationErrorCode() {
            return this.validationErrorCode;
        }

        @Nullable
        public final String getValidationErrorMessage() {
            return this.validationErrorMessage;
        }

        public int hashCode() {
            int iB = l1.b(k.e(f.b(this.id.hashCode() * 31, 31, this.timestamp), 31, this.shouldForceSend), 31, this.component);
            Type type = this.type;
            int iHashCode = (iB + (type == null ? 0 : type.hashCode())) * 31;
            String str = this.target;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isStoredPaymentMethod;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.brand;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.issuer;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.validationErrorCode;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.validationErrorMessage;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, String> map = this.configData;
            return iHashCode7 + (map != null ? map.hashCode() : 0);
        }

        @Nullable
        public final Boolean isStoredPaymentMethod() {
            return this.isStoredPaymentMethod;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            long j9 = this.timestamp;
            boolean z11 = this.shouldForceSend;
            String str2 = this.component;
            Type type = this.type;
            String str3 = this.target;
            Boolean bool = this.isStoredPaymentMethod;
            String str4 = this.brand;
            String str5 = this.issuer;
            String str6 = this.validationErrorCode;
            String str7 = this.validationErrorMessage;
            Map<String, String> map = this.configData;
            StringBuilder sbN = i.n(j9, "Info(id=", str, ", timestamp=");
            sbN.append(", shouldForceSend=");
            sbN.append(z11);
            sbN.append(", component=");
            sbN.append(str2);
            sbN.append(", type=");
            sbN.append(type);
            sbN.append(", target=");
            sbN.append(str3);
            sbN.append(", isStoredPaymentMethod=");
            sbN.append(bool);
            sbN.append(", brand=");
            sbN.append(str4);
            s.A(sbN, ", issuer=", str5, ", validationErrorCode=", str6);
            sbN.append(", validationErrorMessage=");
            sbN.append(str7);
            sbN.append(", configData=");
            sbN.append(map);
            sbN.append(")");
            return sbN.toString();
        }

        @DirectAnalyticsEventCreation
        public Info(@NotNull String str, long j9, boolean z11, @NotNull String str2, @Nullable Type type, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Map<String, String> map) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.timestamp = j9;
            this.shouldForceSend = z11;
            this.component = str2;
            this.type = type;
            this.target = str3;
            this.isStoredPaymentMethod = bool;
            this.brand = str4;
            this.issuer = str5;
            this.validationErrorCode = str6;
            this.validationErrorMessage = str7;
            this.configData = map;
        }
    }
}
