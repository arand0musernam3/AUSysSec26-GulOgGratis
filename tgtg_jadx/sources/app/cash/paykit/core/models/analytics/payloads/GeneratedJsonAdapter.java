package app.cash.paykit.core.models.analytics.payloads;

import a60.b0;
import a60.k;
import a60.n;
import a60.p;
import a60.q;
import b60.f;
import c50.w;
import com.squareup.moshi.JsonEncodingException;
import fc.a;
import java.io.EOFException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.p0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;
import org.jetbrains.annotations.NotNull;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: renamed from: app.cash.paykit.core.models.analytics.payloads.AnalyticsCustomerRequestPayloadJsonAdapter, reason: from toString */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/cash/paykit/core/models/analytics/payloads/AnalyticsCustomerRequestPayloadJsonAdapter;", "La60/k;", "Lapp/cash/paykit/core/models/analytics/payloads/AnalyticsCustomerRequestPayload;", "La60/b0;", "moshi", "<init>", "(La60/b0;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GeneratedJsonAdapter extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f4623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f4624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f4625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f4626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f4627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Constructor f4628f;

    public GeneratedJsonAdapter(@NotNull b0 b0Var) {
        b0Var.getClass();
        this.f4623a = n.a("mobile_cap_pk_customer_request_sdk_version", "mobile_cap_pk_customer_request_client_ua", "mobile_cap_pk_customer_request_platform", "mobile_cap_pk_customer_request_client_id", "mobile_cap_pk_customer_request_environment", "mobile_cap_pk_customer_request_action", "mobile_cap_pk_customer_request_create_actions", "mobile_cap_pk_customer_request_create_channel", "mobile_cap_pk_customer_request_create_redirect_url", "mobile_cap_pk_customer_request_create_reference_id", "mobile_cap_pk_customer_request_create_metadata", "mobile_cap_pk_customer_request_status", "mobile_cap_pk_customer_request_channel", "mobile_cap_pk_customer_request_customer_request_id", "mobile_cap_pk_customer_request_actions", "mobile_cap_pk_customer_request_auth_mobile_url", "mobile_cap_pk_customer_request_redirect_url", "mobile_cap_pk_customer_request_created_at", "mobile_cap_pk_customer_request_updated_at", "mobile_cap_pk_customer_request_origin_id", "mobile_cap_pk_customer_request_origin_type", "mobile_cap_pk_customer_request_grants", "mobile_cap_pk_customer_request_reference_id", "mobile_cap_pk_customer_request_requester_name", "mobile_cap_pk_customer_request_customer_id", "mobile_cap_pk_customer_request_customer_cashtag", "mobile_cap_pk_customer_request_metadata", "mobile_cap_pk_customer_request_update_actions", "mobile_cap_pk_customer_request_update_reference_id", "mobile_cap_pk_customer_request_update_metadata", "mobile_cap_pk_customer_request_approved_grants", "mobile_cap_pk_customer_request_error_category", "mobile_cap_pk_customer_request_error_code", "mobile_cap_pk_customer_request_error_detail", "mobile_cap_pk_customer_request_error_field");
        p0 p0Var = p0.f26531a;
        this.f4624b = b0Var.a(String.class, p0Var, "sdkVersion");
        this.f4625c = b0Var.a(String.class, p0Var, "action");
        this.f4626d = b0Var.a(a.class, p0Var, "createRedirectUrl");
        this.f4627e = b0Var.a(Long.class, p0Var, "createdAt");
    }

    @Override // a60.k
    public final Object a(p pVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, EOFException, JsonEncodingException, InvocationTargetException {
        int i11;
        int i12;
        pVar.getClass();
        pVar.e();
        int i13 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        a aVar = null;
        a aVar2 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        a aVar3 = null;
        Long l = null;
        Long l7 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        a aVar4 = null;
        String str18 = null;
        String str19 = null;
        a aVar5 = null;
        String str20 = null;
        String str21 = null;
        a aVar6 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        int i14 = -1;
        while (true) {
            String str28 = str;
            String str29 = str2;
            String str30 = str3;
            String str31 = str4;
            String str32 = str5;
            String str33 = str6;
            String str34 = str7;
            String str35 = str8;
            a aVar7 = aVar;
            if (!pVar.G()) {
                a aVar8 = aVar2;
                pVar.t();
                if (i13 == 31 && i14 == -8) {
                    if (str28 == null) {
                        throw f.e("sdkVersion", "mobile_cap_pk_customer_request_sdk_version", pVar);
                    }
                    if (str29 == null) {
                        throw f.e("clientUserAgent", "mobile_cap_pk_customer_request_client_ua", pVar);
                    }
                    if (str30 == null) {
                        throw f.e("requestPlatform", "mobile_cap_pk_customer_request_platform", pVar);
                    }
                    if (str31 == null) {
                        throw f.e(Bayeux.KEY_CLIENT_ID, "mobile_cap_pk_customer_request_client_id", pVar);
                    }
                    if (str32 != null) {
                        return new AnalyticsCustomerRequestPayload(str28, str29, str30, str31, str32, str33, str34, str35, aVar7, aVar8, str9, str10, str11, str12, str13, str14, aVar3, l, l7, str15, str16, str17, aVar4, str18, str19, aVar5, str20, str21, aVar6, str22, str23, str24, str25, str26, str27);
                    }
                    throw f.e("environment", "mobile_cap_pk_customer_request_environment", pVar);
                }
                int i15 = i14;
                Constructor declaredConstructor = this.f4628f;
                if (declaredConstructor == null) {
                    Class cls = Integer.TYPE;
                    i11 = i13;
                    declaredConstructor = AnalyticsCustomerRequestPayload.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, a.class, a.class, String.class, String.class, String.class, String.class, String.class, String.class, a.class, Long.class, Long.class, String.class, String.class, String.class, a.class, String.class, String.class, a.class, String.class, String.class, a.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, f.f6051c);
                    this.f4628f = declaredConstructor;
                    declaredConstructor.getClass();
                } else {
                    i11 = i13;
                }
                if (str28 == null) {
                    throw f.e("sdkVersion", "mobile_cap_pk_customer_request_sdk_version", pVar);
                }
                if (str29 == null) {
                    throw f.e("clientUserAgent", "mobile_cap_pk_customer_request_client_ua", pVar);
                }
                if (str30 == null) {
                    throw f.e("requestPlatform", "mobile_cap_pk_customer_request_platform", pVar);
                }
                if (str31 == null) {
                    throw f.e(Bayeux.KEY_CLIENT_ID, "mobile_cap_pk_customer_request_client_id", pVar);
                }
                if (str32 == null) {
                    throw f.e("environment", "mobile_cap_pk_customer_request_environment", pVar);
                }
                Object objNewInstance = declaredConstructor.newInstance(str28, str29, str30, str31, str32, str33, str34, str35, aVar7, aVar8, str9, str10, str11, str12, str13, str14, aVar3, l, l7, str15, str16, str17, aVar4, str18, str19, aVar5, str20, str21, aVar6, str22, str23, str24, str25, str26, str27, Integer.valueOf(i11), Integer.valueOf(i15), null);
                objNewInstance.getClass();
                return (AnalyticsCustomerRequestPayload) objNewInstance;
            }
            a aVar9 = aVar2;
            switch (pVar.y0(this.f4623a)) {
                case -1:
                    pVar.z0();
                    pVar.B0();
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 0:
                    String str36 = (String) this.f4624b.a(pVar);
                    if (str36 == null) {
                        throw f.j("sdkVersion", "mobile_cap_pk_customer_request_sdk_version", pVar);
                    }
                    str = str36;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                    break;
                case 1:
                    str2 = (String) this.f4624b.a(pVar);
                    if (str2 == null) {
                        throw f.j("clientUserAgent", "mobile_cap_pk_customer_request_client_ua", pVar);
                    }
                    str = str28;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                    break;
                case 2:
                    str3 = (String) this.f4624b.a(pVar);
                    if (str3 == null) {
                        throw f.j("requestPlatform", "mobile_cap_pk_customer_request_platform", pVar);
                    }
                    str = str28;
                    str2 = str29;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                    break;
                case 3:
                    str4 = (String) this.f4624b.a(pVar);
                    if (str4 == null) {
                        throw f.j(Bayeux.KEY_CLIENT_ID, "mobile_cap_pk_customer_request_client_id", pVar);
                    }
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                    break;
                case 4:
                    str5 = (String) this.f4624b.a(pVar);
                    if (str5 == null) {
                        throw f.j("environment", "mobile_cap_pk_customer_request_environment", pVar);
                    }
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                    break;
                case 5:
                    str6 = (String) this.f4625c.a(pVar);
                    i13 &= -33;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 6:
                    str7 = (String) this.f4625c.a(pVar);
                    i13 &= -65;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 7:
                    str8 = (String) this.f4625c.a(pVar);
                    i13 &= -129;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 8:
                    aVar = (a) this.f4626d.a(pVar);
                    i13 &= -257;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar2 = aVar9;
                    break;
                case 9:
                    aVar2 = (a) this.f4626d.a(pVar);
                    i13 &= -513;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    break;
                case 10:
                    str9 = (String) this.f4625c.a(pVar);
                    i13 &= -1025;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 11:
                    str10 = (String) this.f4625c.a(pVar);
                    i13 &= -2049;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 12:
                    str11 = (String) this.f4625c.a(pVar);
                    i13 &= -4097;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 13:
                    str12 = (String) this.f4625c.a(pVar);
                    i13 &= -8193;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 14:
                    str13 = (String) this.f4625c.a(pVar);
                    i13 &= -16385;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str14 = (String) this.f4625c.a(pVar);
                    i12 = -32769;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 16:
                    aVar3 = (a) this.f4626d.a(pVar);
                    i12 = -65537;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 17:
                    l = (Long) this.f4627e.a(pVar);
                    i12 = -131073;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 18:
                    l7 = (Long) this.f4627e.a(pVar);
                    i12 = -262145;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 19:
                    str15 = (String) this.f4625c.a(pVar);
                    i12 = -524289;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 20:
                    str16 = (String) this.f4625c.a(pVar);
                    i12 = -1048577;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 21:
                    str17 = (String) this.f4625c.a(pVar);
                    i12 = -2097153;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 22:
                    aVar4 = (a) this.f4626d.a(pVar);
                    i12 = -4194305;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 23:
                    str18 = (String) this.f4625c.a(pVar);
                    i12 = -8388609;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 24:
                    str19 = (String) this.f4625c.a(pVar);
                    i12 = -16777217;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 25:
                    aVar5 = (a) this.f4626d.a(pVar);
                    i12 = -33554433;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 26:
                    str20 = (String) this.f4625c.a(pVar);
                    i12 = -67108865;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 27:
                    str21 = (String) this.f4625c.a(pVar);
                    i12 = -134217729;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 28:
                    aVar6 = (a) this.f4626d.a(pVar);
                    i12 = -268435457;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 29:
                    str22 = (String) this.f4625c.a(pVar);
                    i12 = -536870913;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 30:
                    str23 = (String) this.f4625c.a(pVar);
                    i12 = -1073741825;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case BERTags.DATE /* 31 */:
                    str24 = (String) this.f4625c.a(pVar);
                    i12 = Integer.MAX_VALUE;
                    i13 &= i12;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 32:
                    str25 = (String) this.f4625c.a(pVar);
                    i14 &= -2;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case 33:
                    str26 = (String) this.f4625c.a(pVar);
                    i14 &= -3;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                case BERTags.DURATION /* 34 */:
                    str27 = (String) this.f4625c.a(pVar);
                    i14 &= -5;
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
                default:
                    str = str28;
                    str2 = str29;
                    str3 = str30;
                    str4 = str31;
                    str5 = str32;
                    str6 = str33;
                    str7 = str34;
                    str8 = str35;
                    aVar = aVar7;
                    aVar2 = aVar9;
                    break;
            }
        }
    }

    @Override // a60.k
    public final void e(q qVar, Object obj) {
        AnalyticsCustomerRequestPayload analyticsCustomerRequestPayload = (AnalyticsCustomerRequestPayload) obj;
        qVar.getClass();
        if (analyticsCustomerRequestPayload == null) {
            w.l("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        qVar.g();
        qVar.u("mobile_cap_pk_customer_request_sdk_version");
        String str = analyticsCustomerRequestPayload.f4602e;
        k kVar = this.f4624b;
        kVar.e(qVar, str);
        qVar.u("mobile_cap_pk_customer_request_client_ua");
        kVar.e(qVar, analyticsCustomerRequestPayload.f4603f);
        qVar.u("mobile_cap_pk_customer_request_platform");
        kVar.e(qVar, analyticsCustomerRequestPayload.f4604g);
        qVar.u("mobile_cap_pk_customer_request_client_id");
        kVar.e(qVar, analyticsCustomerRequestPayload.f4605h);
        qVar.u("mobile_cap_pk_customer_request_environment");
        kVar.e(qVar, analyticsCustomerRequestPayload.f4606i);
        qVar.u("mobile_cap_pk_customer_request_action");
        String str2 = analyticsCustomerRequestPayload.f4607j;
        k kVar2 = this.f4625c;
        kVar2.e(qVar, str2);
        qVar.u("mobile_cap_pk_customer_request_create_actions");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4608k);
        qVar.u("mobile_cap_pk_customer_request_create_channel");
        kVar2.e(qVar, analyticsCustomerRequestPayload.l);
        qVar.u("mobile_cap_pk_customer_request_create_redirect_url");
        a aVar = analyticsCustomerRequestPayload.f4609m;
        k kVar3 = this.f4626d;
        kVar3.e(qVar, aVar);
        qVar.u("mobile_cap_pk_customer_request_create_reference_id");
        kVar3.e(qVar, analyticsCustomerRequestPayload.f4610n);
        qVar.u("mobile_cap_pk_customer_request_create_metadata");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4611o);
        qVar.u("mobile_cap_pk_customer_request_status");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4612p);
        qVar.u("mobile_cap_pk_customer_request_channel");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4613q);
        qVar.u("mobile_cap_pk_customer_request_customer_request_id");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4614r);
        qVar.u("mobile_cap_pk_customer_request_actions");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4615s);
        qVar.u("mobile_cap_pk_customer_request_auth_mobile_url");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4616t);
        qVar.u("mobile_cap_pk_customer_request_redirect_url");
        kVar3.e(qVar, analyticsCustomerRequestPayload.f4617u);
        qVar.u("mobile_cap_pk_customer_request_created_at");
        Long l = analyticsCustomerRequestPayload.f4618v;
        k kVar4 = this.f4627e;
        kVar4.e(qVar, l);
        qVar.u("mobile_cap_pk_customer_request_updated_at");
        kVar4.e(qVar, analyticsCustomerRequestPayload.f4619w);
        qVar.u("mobile_cap_pk_customer_request_origin_id");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4620x);
        qVar.u("mobile_cap_pk_customer_request_origin_type");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4621y);
        qVar.u("mobile_cap_pk_customer_request_grants");
        kVar2.e(qVar, analyticsCustomerRequestPayload.f4622z);
        qVar.u("mobile_cap_pk_customer_request_reference_id");
        kVar3.e(qVar, analyticsCustomerRequestPayload.A);
        qVar.u("mobile_cap_pk_customer_request_requester_name");
        kVar2.e(qVar, analyticsCustomerRequestPayload.B);
        qVar.u("mobile_cap_pk_customer_request_customer_id");
        kVar2.e(qVar, analyticsCustomerRequestPayload.C);
        qVar.u("mobile_cap_pk_customer_request_customer_cashtag");
        kVar3.e(qVar, analyticsCustomerRequestPayload.D);
        qVar.u("mobile_cap_pk_customer_request_metadata");
        kVar2.e(qVar, analyticsCustomerRequestPayload.E);
        qVar.u("mobile_cap_pk_customer_request_update_actions");
        kVar2.e(qVar, analyticsCustomerRequestPayload.F);
        qVar.u("mobile_cap_pk_customer_request_update_reference_id");
        kVar3.e(qVar, analyticsCustomerRequestPayload.G);
        qVar.u("mobile_cap_pk_customer_request_update_metadata");
        kVar2.e(qVar, analyticsCustomerRequestPayload.H);
        qVar.u("mobile_cap_pk_customer_request_approved_grants");
        kVar2.e(qVar, analyticsCustomerRequestPayload.I);
        qVar.u("mobile_cap_pk_customer_request_error_category");
        kVar2.e(qVar, analyticsCustomerRequestPayload.J);
        qVar.u("mobile_cap_pk_customer_request_error_code");
        kVar2.e(qVar, analyticsCustomerRequestPayload.K);
        qVar.u("mobile_cap_pk_customer_request_error_detail");
        kVar2.e(qVar, analyticsCustomerRequestPayload.L);
        qVar.u("mobile_cap_pk_customer_request_error_field");
        kVar2.e(qVar, analyticsCustomerRequestPayload.M);
        qVar.r();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("GeneratedJsonAdapter(AnalyticsCustomerRequestPayload)");
        return sb2.toString();
    }
}
