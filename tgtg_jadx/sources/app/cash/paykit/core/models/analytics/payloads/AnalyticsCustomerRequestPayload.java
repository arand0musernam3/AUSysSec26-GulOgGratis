package app.cash.paykit.core.models.analytics.payloads;

import a60.i;
import a60.l;
import dc.a;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@l(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0003\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)Jª\u0003\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lapp/cash/paykit/core/models/analytics/payloads/AnalyticsCustomerRequestPayload;", "Ldc/a;", "", "sdkVersion", "clientUserAgent", "requestPlatform", Bayeux.KEY_CLIENT_ID, "environment", "action", "createActions", "createChannel", "Lfc/a;", "createRedirectUrl", "createReferenceId", "createMetadata", "status", "requestChannel", "requestId", "actions", "authMobileUrl", "redirectUrl", "", "createdAt", "updatedAt", "originId", "originType", "requestGrants", "referenceId", "requesterName", "customerId", "customerCashTag", "metadata", "updateActions", "updateReferenceId", "updateMetadata", "approvedGrants", "errorCategory", "errorCode", "errorDetail", "errorField", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;Lfc/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;Lfc/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/String;Ljava/lang/String;Lfc/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lapp/cash/paykit/core/models/analytics/payloads/AnalyticsCustomerRequestPayload;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AnalyticsCustomerRequestPayload extends a {
    public final fc.a A;
    public final String B;
    public final String C;
    public final fc.a D;
    public final String E;
    public final String F;
    public final fc.a G;
    public final String H;
    public final String I;
    public final String J;
    public final String K;
    public final String L;
    public final String M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f4607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4608k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fc.a f4609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fc.a f4610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f4611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f4612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f4613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f4614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f4616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final fc.a f4617u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Long f4618v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Long f4619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f4620x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f4621y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f4622z;

    public /* synthetic */ AnalyticsCustomerRequestPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, fc.a aVar, fc.a aVar2, String str9, String str10, String str11, String str12, String str13, String str14, fc.a aVar3, Long l, Long l7, String str15, String str16, String str17, fc.a aVar4, String str18, String str19, fc.a aVar5, String str20, String str21, fc.a aVar6, String str22, String str23, String str24, String str25, String str26, String str27, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : aVar, (i11 & 512) != 0 ? null : aVar2, (i11 & 1024) != 0 ? null : str9, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str10, (i11 & 4096) != 0 ? null : str11, (i11 & 8192) != 0 ? null : str12, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : str13, (32768 & i11) != 0 ? null : str14, (65536 & i11) != 0 ? null : aVar3, (131072 & i11) != 0 ? null : l, (262144 & i11) != 0 ? null : l7, (524288 & i11) != 0 ? null : str15, (1048576 & i11) != 0 ? null : str16, (2097152 & i11) != 0 ? null : str17, (4194304 & i11) != 0 ? null : aVar4, (8388608 & i11) != 0 ? null : str18, (16777216 & i11) != 0 ? null : str19, (33554432 & i11) != 0 ? null : aVar5, (67108864 & i11) != 0 ? null : str20, (134217728 & i11) != 0 ? null : str21, (268435456 & i11) != 0 ? null : aVar6, (536870912 & i11) != 0 ? null : str22, (1073741824 & i11) != 0 ? null : str23, (i11 & Integer.MIN_VALUE) != 0 ? null : str24, (i12 & 1) != 0 ? null : str25, (i12 & 2) != 0 ? null : str26, (i12 & 4) != 0 ? null : str27);
    }

    public static /* synthetic */ AnalyticsCustomerRequestPayload a(AnalyticsCustomerRequestPayload analyticsCustomerRequestPayload, String str, String str2, String str3, String str4, String str5, int i11, int i12) {
        String str6;
        String str7;
        String str8 = analyticsCustomerRequestPayload.f4602e;
        String str9 = analyticsCustomerRequestPayload.f4603f;
        String str10 = analyticsCustomerRequestPayload.f4604g;
        String str11 = analyticsCustomerRequestPayload.f4605h;
        String str12 = analyticsCustomerRequestPayload.f4606i;
        String str13 = (i11 & 32) != 0 ? analyticsCustomerRequestPayload.f4607j : str;
        String str14 = analyticsCustomerRequestPayload.f4608k;
        String str15 = analyticsCustomerRequestPayload.l;
        fc.a aVar = analyticsCustomerRequestPayload.f4609m;
        fc.a aVar2 = analyticsCustomerRequestPayload.f4610n;
        String str16 = analyticsCustomerRequestPayload.f4611o;
        String str17 = analyticsCustomerRequestPayload.f4612p;
        String str18 = analyticsCustomerRequestPayload.f4613q;
        String str19 = analyticsCustomerRequestPayload.f4614r;
        String str20 = analyticsCustomerRequestPayload.f4615s;
        String str21 = analyticsCustomerRequestPayload.f4616t;
        fc.a aVar3 = analyticsCustomerRequestPayload.f4617u;
        Long l = analyticsCustomerRequestPayload.f4618v;
        Long l7 = analyticsCustomerRequestPayload.f4619w;
        String str22 = analyticsCustomerRequestPayload.f4620x;
        String str23 = analyticsCustomerRequestPayload.f4621y;
        String str24 = analyticsCustomerRequestPayload.f4622z;
        fc.a aVar4 = analyticsCustomerRequestPayload.A;
        String str25 = analyticsCustomerRequestPayload.B;
        String str26 = analyticsCustomerRequestPayload.C;
        fc.a aVar5 = analyticsCustomerRequestPayload.D;
        String str27 = analyticsCustomerRequestPayload.E;
        String str28 = analyticsCustomerRequestPayload.F;
        fc.a aVar6 = analyticsCustomerRequestPayload.G;
        String str29 = analyticsCustomerRequestPayload.H;
        String str30 = analyticsCustomerRequestPayload.I;
        if ((i11 & Integer.MIN_VALUE) != 0) {
            str6 = str30;
            str7 = analyticsCustomerRequestPayload.J;
        } else {
            str6 = str30;
            str7 = str2;
        }
        return analyticsCustomerRequestPayload.copy(str8, str9, str10, str11, str12, str13, str14, str15, aVar, aVar2, str16, str17, str18, str19, str20, str21, aVar3, l, l7, str22, str23, str24, aVar4, str25, str26, aVar5, str27, str28, aVar6, str29, str6, str7, (i12 & 1) != 0 ? analyticsCustomerRequestPayload.K : str3, (i12 & 2) != 0 ? analyticsCustomerRequestPayload.L : str4, (i12 & 4) != 0 ? analyticsCustomerRequestPayload.M : str5);
    }

    @NotNull
    public final AnalyticsCustomerRequestPayload copy(@i(name = "mobile_cap_pk_customer_request_sdk_version") @NotNull String sdkVersion, @i(name = "mobile_cap_pk_customer_request_client_ua") @NotNull String clientUserAgent, @i(name = "mobile_cap_pk_customer_request_platform") @NotNull String requestPlatform, @i(name = "mobile_cap_pk_customer_request_client_id") @NotNull String clientId, @i(name = "mobile_cap_pk_customer_request_environment") @NotNull String environment, @i(name = "mobile_cap_pk_customer_request_action") @Nullable String action, @i(name = "mobile_cap_pk_customer_request_create_actions") @Nullable String createActions, @i(name = "mobile_cap_pk_customer_request_create_channel") @Nullable String createChannel, @i(name = "mobile_cap_pk_customer_request_create_redirect_url") @Nullable fc.a createRedirectUrl, @i(name = "mobile_cap_pk_customer_request_create_reference_id") @Nullable fc.a createReferenceId, @i(name = "mobile_cap_pk_customer_request_create_metadata") @Nullable String createMetadata, @i(name = "mobile_cap_pk_customer_request_status") @Nullable String status, @i(name = "mobile_cap_pk_customer_request_channel") @Nullable String requestChannel, @i(name = "mobile_cap_pk_customer_request_customer_request_id") @Nullable String requestId, @i(name = "mobile_cap_pk_customer_request_actions") @Nullable String actions, @i(name = "mobile_cap_pk_customer_request_auth_mobile_url") @Nullable String authMobileUrl, @i(name = "mobile_cap_pk_customer_request_redirect_url") @Nullable fc.a redirectUrl, @i(name = "mobile_cap_pk_customer_request_created_at") @Nullable Long createdAt, @i(name = "mobile_cap_pk_customer_request_updated_at") @Nullable Long updatedAt, @i(name = "mobile_cap_pk_customer_request_origin_id") @Nullable String originId, @i(name = "mobile_cap_pk_customer_request_origin_type") @Nullable String originType, @i(name = "mobile_cap_pk_customer_request_grants") @Nullable String requestGrants, @i(name = "mobile_cap_pk_customer_request_reference_id") @Nullable fc.a referenceId, @i(name = "mobile_cap_pk_customer_request_requester_name") @Nullable String requesterName, @i(name = "mobile_cap_pk_customer_request_customer_id") @Nullable String customerId, @i(name = "mobile_cap_pk_customer_request_customer_cashtag") @Nullable fc.a customerCashTag, @i(name = "mobile_cap_pk_customer_request_metadata") @Nullable String metadata, @i(name = "mobile_cap_pk_customer_request_update_actions") @Nullable String updateActions, @i(name = "mobile_cap_pk_customer_request_update_reference_id") @Nullable fc.a updateReferenceId, @i(name = "mobile_cap_pk_customer_request_update_metadata") @Nullable String updateMetadata, @i(name = "mobile_cap_pk_customer_request_approved_grants") @Nullable String approvedGrants, @i(name = "mobile_cap_pk_customer_request_error_category") @Nullable String errorCategory, @i(name = "mobile_cap_pk_customer_request_error_code") @Nullable String errorCode, @i(name = "mobile_cap_pk_customer_request_error_detail") @Nullable String errorDetail, @i(name = "mobile_cap_pk_customer_request_error_field") @Nullable String errorField) {
        sdkVersion.getClass();
        clientUserAgent.getClass();
        requestPlatform.getClass();
        clientId.getClass();
        environment.getClass();
        return new AnalyticsCustomerRequestPayload(sdkVersion, clientUserAgent, requestPlatform, clientId, environment, action, createActions, createChannel, createRedirectUrl, createReferenceId, createMetadata, status, requestChannel, requestId, actions, authMobileUrl, redirectUrl, createdAt, updatedAt, originId, originType, requestGrants, referenceId, requesterName, customerId, customerCashTag, metadata, updateActions, updateReferenceId, updateMetadata, approvedGrants, errorCategory, errorCode, errorDetail, errorField);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsCustomerRequestPayload)) {
            return false;
        }
        AnalyticsCustomerRequestPayload analyticsCustomerRequestPayload = (AnalyticsCustomerRequestPayload) obj;
        return Intrinsics.areEqual(this.f4602e, analyticsCustomerRequestPayload.f4602e) && Intrinsics.areEqual(this.f4603f, analyticsCustomerRequestPayload.f4603f) && Intrinsics.areEqual(this.f4604g, analyticsCustomerRequestPayload.f4604g) && Intrinsics.areEqual(this.f4605h, analyticsCustomerRequestPayload.f4605h) && Intrinsics.areEqual(this.f4606i, analyticsCustomerRequestPayload.f4606i) && Intrinsics.areEqual(this.f4607j, analyticsCustomerRequestPayload.f4607j) && Intrinsics.areEqual(this.f4608k, analyticsCustomerRequestPayload.f4608k) && Intrinsics.areEqual(this.l, analyticsCustomerRequestPayload.l) && Intrinsics.areEqual(this.f4609m, analyticsCustomerRequestPayload.f4609m) && Intrinsics.areEqual(this.f4610n, analyticsCustomerRequestPayload.f4610n) && Intrinsics.areEqual(this.f4611o, analyticsCustomerRequestPayload.f4611o) && Intrinsics.areEqual(this.f4612p, analyticsCustomerRequestPayload.f4612p) && Intrinsics.areEqual(this.f4613q, analyticsCustomerRequestPayload.f4613q) && Intrinsics.areEqual(this.f4614r, analyticsCustomerRequestPayload.f4614r) && Intrinsics.areEqual(this.f4615s, analyticsCustomerRequestPayload.f4615s) && Intrinsics.areEqual(this.f4616t, analyticsCustomerRequestPayload.f4616t) && Intrinsics.areEqual(this.f4617u, analyticsCustomerRequestPayload.f4617u) && Intrinsics.areEqual(this.f4618v, analyticsCustomerRequestPayload.f4618v) && Intrinsics.areEqual(this.f4619w, analyticsCustomerRequestPayload.f4619w) && Intrinsics.areEqual(this.f4620x, analyticsCustomerRequestPayload.f4620x) && Intrinsics.areEqual(this.f4621y, analyticsCustomerRequestPayload.f4621y) && Intrinsics.areEqual(this.f4622z, analyticsCustomerRequestPayload.f4622z) && Intrinsics.areEqual(this.A, analyticsCustomerRequestPayload.A) && Intrinsics.areEqual(this.B, analyticsCustomerRequestPayload.B) && Intrinsics.areEqual(this.C, analyticsCustomerRequestPayload.C) && Intrinsics.areEqual(this.D, analyticsCustomerRequestPayload.D) && Intrinsics.areEqual(this.E, analyticsCustomerRequestPayload.E) && Intrinsics.areEqual(this.F, analyticsCustomerRequestPayload.F) && Intrinsics.areEqual(this.G, analyticsCustomerRequestPayload.G) && Intrinsics.areEqual(this.H, analyticsCustomerRequestPayload.H) && Intrinsics.areEqual(this.I, analyticsCustomerRequestPayload.I) && Intrinsics.areEqual(this.J, analyticsCustomerRequestPayload.J) && Intrinsics.areEqual(this.K, analyticsCustomerRequestPayload.K) && Intrinsics.areEqual(this.L, analyticsCustomerRequestPayload.L) && Intrinsics.areEqual(this.M, analyticsCustomerRequestPayload.M);
    }

    public final int hashCode() {
        int iB = l1.b(l1.b(l1.b(l1.b(this.f4602e.hashCode() * 31, 31, this.f4603f), 31, this.f4604g), 31, this.f4605h), 31, this.f4606i);
        String str = this.f4607j;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4608k;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        fc.a aVar = this.f4609m;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        fc.a aVar2 = this.f4610n;
        int iHashCode5 = (iHashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str4 = this.f4611o;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f4612p;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f4613q;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f4614r;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f4615s;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f4616t;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        fc.a aVar3 = this.f4617u;
        int iHashCode12 = (iHashCode11 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Long l = this.f4618v;
        int iHashCode13 = (iHashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Long l7 = this.f4619w;
        int iHashCode14 = (iHashCode13 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str10 = this.f4620x;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f4621y;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f4622z;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        fc.a aVar4 = this.A;
        int iHashCode18 = (iHashCode17 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        String str13 = this.B;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.C;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        fc.a aVar5 = this.D;
        int iHashCode21 = (iHashCode20 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        String str15 = this.E;
        int iHashCode22 = (iHashCode21 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.F;
        int iHashCode23 = (iHashCode22 + (str16 == null ? 0 : str16.hashCode())) * 31;
        fc.a aVar6 = this.G;
        int iHashCode24 = (iHashCode23 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        String str17 = this.H;
        int iHashCode25 = (iHashCode24 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.I;
        int iHashCode26 = (iHashCode25 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.J;
        int iHashCode27 = (iHashCode26 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.K;
        int iHashCode28 = (iHashCode27 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.L;
        int iHashCode29 = (iHashCode28 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.M;
        return iHashCode29 + (str22 != null ? str22.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = f.t("AnalyticsCustomerRequestPayload(sdkVersion=", this.f4602e, ", clientUserAgent=", this.f4603f, ", requestPlatform=");
        s.A(sbT, this.f4604g, ", clientId=", this.f4605h, ", environment=");
        s.A(sbT, this.f4606i, ", action=", this.f4607j, ", createActions=");
        s.A(sbT, this.f4608k, ", createChannel=", this.l, ", createRedirectUrl=");
        sbT.append(this.f4609m);
        sbT.append(", createReferenceId=");
        sbT.append(this.f4610n);
        sbT.append(", createMetadata=");
        s.A(sbT, this.f4611o, ", status=", this.f4612p, ", requestChannel=");
        s.A(sbT, this.f4613q, ", requestId=", this.f4614r, ", actions=");
        s.A(sbT, this.f4615s, ", authMobileUrl=", this.f4616t, ", redirectUrl=");
        sbT.append(this.f4617u);
        sbT.append(", createdAt=");
        sbT.append(this.f4618v);
        sbT.append(", updatedAt=");
        sbT.append(this.f4619w);
        sbT.append(", originId=");
        sbT.append(this.f4620x);
        sbT.append(", originType=");
        s.A(sbT, this.f4621y, ", requestGrants=", this.f4622z, ", referenceId=");
        sbT.append(this.A);
        sbT.append(", requesterName=");
        sbT.append(this.B);
        sbT.append(", customerId=");
        sbT.append(this.C);
        sbT.append(", customerCashTag=");
        sbT.append(this.D);
        sbT.append(", metadata=");
        s.A(sbT, this.E, ", updateActions=", this.F, ", updateReferenceId=");
        sbT.append(this.G);
        sbT.append(", updateMetadata=");
        sbT.append(this.H);
        sbT.append(", approvedGrants=");
        s.A(sbT, this.I, ", errorCategory=", this.J, ", errorCode=");
        s.A(sbT, this.K, ", errorDetail=", this.L, ", errorField=");
        return k.p(sbT, this.M, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsCustomerRequestPayload(@i(name = "mobile_cap_pk_customer_request_sdk_version") @NotNull String str, @i(name = "mobile_cap_pk_customer_request_client_ua") @NotNull String str2, @i(name = "mobile_cap_pk_customer_request_platform") @NotNull String str3, @i(name = "mobile_cap_pk_customer_request_client_id") @NotNull String str4, @i(name = "mobile_cap_pk_customer_request_environment") @NotNull String str5, @i(name = "mobile_cap_pk_customer_request_action") @Nullable String str6, @i(name = "mobile_cap_pk_customer_request_create_actions") @Nullable String str7, @i(name = "mobile_cap_pk_customer_request_create_channel") @Nullable String str8, @i(name = "mobile_cap_pk_customer_request_create_redirect_url") @Nullable fc.a aVar, @i(name = "mobile_cap_pk_customer_request_create_reference_id") @Nullable fc.a aVar2, @i(name = "mobile_cap_pk_customer_request_create_metadata") @Nullable String str9, @i(name = "mobile_cap_pk_customer_request_status") @Nullable String str10, @i(name = "mobile_cap_pk_customer_request_channel") @Nullable String str11, @i(name = "mobile_cap_pk_customer_request_customer_request_id") @Nullable String str12, @i(name = "mobile_cap_pk_customer_request_actions") @Nullable String str13, @i(name = "mobile_cap_pk_customer_request_auth_mobile_url") @Nullable String str14, @i(name = "mobile_cap_pk_customer_request_redirect_url") @Nullable fc.a aVar3, @i(name = "mobile_cap_pk_customer_request_created_at") @Nullable Long l, @i(name = "mobile_cap_pk_customer_request_updated_at") @Nullable Long l7, @i(name = "mobile_cap_pk_customer_request_origin_id") @Nullable String str15, @i(name = "mobile_cap_pk_customer_request_origin_type") @Nullable String str16, @i(name = "mobile_cap_pk_customer_request_grants") @Nullable String str17, @i(name = "mobile_cap_pk_customer_request_reference_id") @Nullable fc.a aVar4, @i(name = "mobile_cap_pk_customer_request_requester_name") @Nullable String str18, @i(name = "mobile_cap_pk_customer_request_customer_id") @Nullable String str19, @i(name = "mobile_cap_pk_customer_request_customer_cashtag") @Nullable fc.a aVar5, @i(name = "mobile_cap_pk_customer_request_metadata") @Nullable String str20, @i(name = "mobile_cap_pk_customer_request_update_actions") @Nullable String str21, @i(name = "mobile_cap_pk_customer_request_update_reference_id") @Nullable fc.a aVar6, @i(name = "mobile_cap_pk_customer_request_update_metadata") @Nullable String str22, @i(name = "mobile_cap_pk_customer_request_approved_grants") @Nullable String str23, @i(name = "mobile_cap_pk_customer_request_error_category") @Nullable String str24, @i(name = "mobile_cap_pk_customer_request_error_code") @Nullable String str25, @i(name = "mobile_cap_pk_customer_request_error_detail") @Nullable String str26, @i(name = "mobile_cap_pk_customer_request_error_field") @Nullable String str27) {
        super(str, str2, str3, str4, str5);
        b3.i.B(str, str2, str3, str4, str5);
        this.f4602e = str;
        this.f4603f = str2;
        this.f4604g = str3;
        this.f4605h = str4;
        this.f4606i = str5;
        this.f4607j = str6;
        this.f4608k = str7;
        this.l = str8;
        this.f4609m = aVar;
        this.f4610n = aVar2;
        this.f4611o = str9;
        this.f4612p = str10;
        this.f4613q = str11;
        this.f4614r = str12;
        this.f4615s = str13;
        this.f4616t = str14;
        this.f4617u = aVar3;
        this.f4618v = l;
        this.f4619w = l7;
        this.f4620x = str15;
        this.f4621y = str16;
        this.f4622z = str17;
        this.A = aVar4;
        this.B = str18;
        this.C = str19;
        this.D = aVar5;
        this.E = str20;
        this.F = str21;
        this.G = aVar6;
        this.H = str22;
        this.I = str23;
        this.J = str24;
        this.K = str25;
        this.L = str26;
        this.M = str27;
    }
}
