package com.adyen.checkout.core.internal.data.api;

import androidx.lifecycle.n1;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.HttpException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.ErrorResponseBody;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.o0;
import kotlin.collections.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import q90.d0;
import q90.g0;
import q90.m0;
import q90.n0;
import q90.p0;
import q90.r0;
import q90.t;
import q90.u;
import q90.v;
import q90.y;
import q90.z;
import r8.k;
import u90.n;
import x70.c;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u0013*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJH\u0010\u001e\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"¨\u0006$"}, d2 = {"Lcom/adyen/checkout/core/internal/data/api/OkHttpClient;", "Lcom/adyen/checkout/core/internal/data/api/HttpClient;", "Lq90/d0;", "client", "", "baseUrl", "", "defaultHeaders", "<init>", "(Lq90/d0;Ljava/lang/String;Ljava/util/Map;)V", "path", "queryParameters", "buildURL", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lq90/g0;", "request", "Lcom/adyen/checkout/core/internal/data/api/AdyenApiResponse;", "executeRequest", "(Lq90/g0;Ljava/lang/String;)Lcom/adyen/checkout/core/internal/data/api/AdyenApiResponse;", "Lq90/t;", "combineToHeaders", "(Ljava/util/Map;)Lq90/t;", "Lq90/p0;", "Lcom/adyen/checkout/core/exception/HttpException;", "getHttpException", "(Lq90/p0;)Lcom/adyen/checkout/core/exception/HttpException;", "headers", "get", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "jsonBody", "post", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "Lq90/d0;", "Ljava/lang/String;", "Ljava/util/Map;", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\ncom/adyen/checkout/core/internal/data/api/OkHttpClient\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n216#2,2:134\n1#3:136\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\ncom/adyen/checkout/core/internal/data/api/OkHttpClient\n*L\n66#1:134,2\n*E\n"})
public final class OkHttpClient implements HttpClient {

    @NotNull
    private static final z MEDIA_TYPE_JSON;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final d0 client;

    @NotNull
    private final Map<String, String> defaultHeaders;

    static {
        Regex regex = z.f36633e;
        MEDIA_TYPE_JSON = y.a("application/json; charset=utf-8");
    }

    public OkHttpClient(@NotNull d0 d0Var, @NotNull String str, @NotNull Map<String, String> map) {
        d0Var.getClass();
        str.getClass();
        map.getClass();
        this.client = d0Var;
        this.baseUrl = str;
        this.defaultHeaders = map;
    }

    private final String buildURL(String path, Map<String, String> queryParameters) {
        v vVarB;
        String strL = k.l(this.baseUrl, path);
        try {
            u uVar = new u();
            uVar.e(null, strL);
            vVarB = uVar.b();
        } catch (IllegalArgumentException unused) {
            vVarB = null;
        }
        if (vVarB == null) {
            throw new CheckoutException("Failed to parse URL.", null, 2, null);
        }
        u uVarG = vVarB.g();
        for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
            uVarG.a(entry.getKey(), entry.getValue());
        }
        return uVarG.toString();
    }

    private final t combineToHeaders(Map<String, String> map) {
        t tVar = t.f36613b;
        LinkedHashMap linkedHashMapG = x0.g(this.defaultHeaders, map);
        String[] strArr = new String[linkedHashMapG.size() * 2];
        int i11 = 0;
        for (Map.Entry entry : linkedHashMapG.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = StringsKt.e0(str).toString();
            String string2 = StringsKt.e0(str2).toString();
            f.u(string);
            f.v(string2, string);
            strArr[i11] = string;
            strArr[i11 + 1] = string2;
            i11 += 2;
        }
        return new t(strArr);
    }

    private final AdyenApiResponse executeRequest(g0 request, String path) {
        d0 d0Var = this.client;
        d0Var.getClass();
        request.getClass();
        n nVar = new n(d0Var, request, false);
        try {
            p0 p0VarF = nVar.f();
            r0 r0Var = p0VarF.f36588g;
            if (p0VarF.f36597q) {
                byte[] bArrA = r0Var != null ? r0Var.a() : new byte[0];
                if (r0Var != null) {
                    r0Var.close();
                }
                return new AdyenApiResponse(path, p0VarF.f36585d, x0.j(p0VarF.f36587f), new String(bArrA, Charsets.UTF_8));
            }
            HttpException httpException = getHttpException(p0VarF);
            if (r0Var == null) {
                throw httpException;
            }
            r0Var.close();
            throw httpException;
        } catch (CancellationException e5) {
            nVar.cancel();
            throw e5;
        }
    }

    private final HttpException getHttpException(p0 p0Var) {
        ErrorResponseBody errorResponseBody;
        String message;
        Integer status;
        r0 r0Var;
        String str = null;
        try {
            r0Var = p0Var.f36588g;
        } catch (IOException unused) {
        }
        String strP = r0Var != null ? r0Var.p() : null;
        if (strP != null) {
            try {
                errorResponseBody = (ErrorResponseBody) ErrorResponseBody.SERIALIZER.deserialize(new JSONObject(strP));
            } catch (ModelSerializationException | JSONException unused2) {
                errorResponseBody = null;
            }
        } else {
            errorResponseBody = null;
        }
        int iIntValue = (errorResponseBody == null || (status = errorResponseBody.getStatus()) == null) ? p0Var.f36585d : status.intValue();
        if (errorResponseBody == null || (message = errorResponseBody.getMessage()) == null) {
            if (strP != null && !StringsKt.H(strP)) {
                str = strP;
            }
            message = str == null ? p0Var.f36584c : str;
        }
        return new HttpException(iIntValue, message, errorResponseBody);
    }

    @Override // com.adyen.checkout.core.internal.data.api.HttpClient
    @Nullable
    public Object get(@NotNull String str, @NotNull Map<String, String> map, @NotNull Map<String, String> map2, @NotNull c<? super AdyenApiResponse> cVar) {
        n1 n1Var = new n1();
        t tVarCombineToHeaders = combineToHeaders(map2);
        tVarCombineToHeaders.getClass();
        n1Var.f3501c = tVarCombineToHeaders.e();
        n1Var.D(buildURL(str, map));
        n1Var.p();
        return executeRequest(new g0(n1Var), str);
    }

    @Override // com.adyen.checkout.core.internal.data.api.HttpClient
    @Nullable
    public Object post(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @NotNull Map<String, String> map2, @NotNull c<? super AdyenApiResponse> cVar) {
        n1 n1Var = new n1();
        t tVarCombineToHeaders = combineToHeaders(map2);
        tVarCombineToHeaders.getClass();
        n1Var.f3501c = tVarCombineToHeaders.e();
        n1Var.D(buildURL(str, map));
        m0 m0Var = n0.Companion;
        z zVar = MEDIA_TYPE_JSON;
        m0Var.getClass();
        n1Var.w("POST", m0.a(str2, zVar));
        return executeRequest(new g0(n1Var), str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OkHttpClient(d0 d0Var, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 4) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        this(d0Var, str, map);
    }
}
