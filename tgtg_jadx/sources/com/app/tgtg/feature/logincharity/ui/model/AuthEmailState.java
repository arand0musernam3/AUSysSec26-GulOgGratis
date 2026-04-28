package com.app.tgtg.feature.logincharity.ui.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState;", "", "<init>", "()V", "Partner", "Wait", "Terms", "Authenticated", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Authenticated;", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Partner;", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Terms;", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Wait;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class AuthEmailState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Authenticated;", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Authenticated extends AuthEmailState {
        public static final int $stable = 0;

        @NotNull
        public static final Authenticated INSTANCE = new Authenticated();

        private Authenticated() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Authenticated);
        }

        public int hashCode() {
            return -296548668;
        }

        @NotNull
        public String toString() {
            return "Authenticated";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Partner;", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState;", "email", "", "partnerUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPartnerUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Partner extends AuthEmailState {
        public static final int $stable = 0;

        @NotNull
        private final String email;

        @NotNull
        private final String partnerUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Partner(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.email = str;
            this.partnerUrl = str2;
        }

        public static /* synthetic */ Partner copy$default(Partner partner, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = partner.email;
            }
            if ((i11 & 2) != 0) {
                str2 = partner.partnerUrl;
            }
            return partner.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPartnerUrl() {
            return this.partnerUrl;
        }

        @NotNull
        public final Partner copy(@NotNull String email, @NotNull String partnerUrl) {
            email.getClass();
            partnerUrl.getClass();
            return new Partner(email, partnerUrl);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Partner)) {
                return false;
            }
            Partner partner = (Partner) other;
            return Intrinsics.areEqual(this.email, partner.email) && Intrinsics.areEqual(this.partnerUrl, partner.partnerUrl);
        }

        @NotNull
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        public final String getPartnerUrl() {
            return this.partnerUrl;
        }

        public int hashCode() {
            return this.partnerUrl.hashCode() + (this.email.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("Partner(email=", this.email, ", partnerUrl=", this.partnerUrl, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Terms;", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Terms extends AuthEmailState {
        public static final int $stable = 0;

        @NotNull
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Terms(@NotNull String str) {
            super(null);
            str.getClass();
            this.email = str;
        }

        public static /* synthetic */ Terms copy$default(Terms terms, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = terms.email;
            }
            return terms.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        public final Terms copy(@NotNull String email) {
            email.getClass();
            return new Terms(email);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Terms) && Intrinsics.areEqual(this.email, ((Terms) other).email);
        }

        @NotNull
        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Terms(email=", this.email, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState$Wait;", "Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState;", "email", "", "pollingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPollingId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Wait extends AuthEmailState {
        public static final int $stable = 0;

        @NotNull
        private final String email;

        @NotNull
        private final String pollingId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wait(@NotNull String str, @NotNull String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.email = str;
            this.pollingId = str2;
        }

        public static /* synthetic */ Wait copy$default(Wait wait, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = wait.email;
            }
            if ((i11 & 2) != 0) {
                str2 = wait.pollingId;
            }
            return wait.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPollingId() {
            return this.pollingId;
        }

        @NotNull
        public final Wait copy(@NotNull String email, @NotNull String pollingId) {
            email.getClass();
            pollingId.getClass();
            return new Wait(email, pollingId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wait)) {
                return false;
            }
            Wait wait = (Wait) other;
            return Intrinsics.areEqual(this.email, wait.email) && Intrinsics.areEqual(this.pollingId, wait.pollingId);
        }

        @NotNull
        public final String getEmail() {
            return this.email;
        }

        @NotNull
        public final String getPollingId() {
            return this.pollingId;
        }

        public int hashCode() {
            return this.pollingId.hashCode() + (this.email.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.d("Wait(email=", this.email, ", pollingId=", this.pollingId, ")");
        }
    }

    public /* synthetic */ AuthEmailState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AuthEmailState() {
    }
}
